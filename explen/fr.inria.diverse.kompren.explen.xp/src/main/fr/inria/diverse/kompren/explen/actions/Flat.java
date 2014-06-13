package fr.inria.diverse.kompren.explen.actions;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.SwingUtilities;

import org.eclipse.emf.common.util.BasicEList;
import org.kermeta.kompren.diagram.view.interfaces.IComponentView.Visibility;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.Type;

import fr.inria.diverse.kompren.explen.instruments.Completioner;
import fr.inria.diverse.kompren.explen.slicing.Flattener;
import fr.inria.diverse.kompren.explen.view.AttributeView;
import fr.inria.diverse.kompren.explen.view.ClassView;
import fr.inria.diverse.kompren.explen.view.ModelViewMapper;
import fr.inria.diverse.kompren.explen.view.OperationView;

public class Flat extends SelectionBasedVisuAction {

	private final Map<ClassView, List<AttributeView>> attrs;
	private final Map<ClassView, List<OperationView>> ops;
	private final Map<ClassDefinition, List<Property>> attrsKm;
	private final Map<ClassDefinition, List<Operation>> opsKm;
	private final List<IRelationView> relationsAdded;
	private final List<Type> superTypes;
	private ClassDefinition cdRef;

	public Flat() {
		super();
		attrs = new IdentityHashMap<>();
		ops = new IdentityHashMap<>();
		attrsKm = new IdentityHashMap<>();
		opsKm = new IdentityHashMap<>();
		superTypes = new ArrayList<>();
		relationsAdded = new ArrayList<>();
	}


	@Override
	public String getUndoName() {
		return "Flattening";
	}


	@Override
	protected void doVisualisation() {
		super.doVisualisation();

		relationsAdded.clear();
		attrs.clear();
		ops.clear();
		attrsKm.clear();
		opsKm.clear();
		superTypes.clear();

		ModelViewMapper mapper = ModelViewMapper.getMapper();
		cdRef = mapper.getClassDefinition(classes.get(0));

//		for(Type type : cdRef.getSuperType())
//			superTypes.add(type);

//		flat();
		final BasicEList<ClassDefinition> cds = new BasicEList<>();
		cds.add(cdRef);
		Flattener f = new Flattener(canvas, cdRef);
		f.initialise(cds, new BasicEList<ModelingUnit>(), 0, true, true, false, false, false);
		f.launch();
		
//		cdRef.getSuperType().clear();
//		classes.get(0).update();
		
        Runnable moveScrollbars = new Runnable() {
            @Override
			public void run() {
            	final Point pt = Completioner.Interaction2MoveCamera.getMoveCameraToPoint(classes.get(0), canvas.getZoom(), canvas.getScrollpane());
            	getCanvas().getScrollpane().getHorizontalScrollBar().setValue((int)pt.getX());
            	getCanvas().getScrollpane().getVerticalScrollBar().setValue((int)pt.getY());
            }
        };

        SwingUtilities.invokeLater(moveScrollbars);
		
		canvas.update();
		done();
	}


	@Override
	public void undo() {
		ClassView cvRef = ModelViewMapper.getMapper().getClassView(cdRef);

		for(Map.Entry<ClassView, List<AttributeView>> entry : attrs.entrySet()) {
			ClassView cvCurr = entry.getKey();
			for(AttributeView attV : entry.getValue())
				if(cvRef.getAttributes().contains(attV)) {
					cvRef.getAttributes().remove(attV);
					cvCurr.getAttributes().add(attV);
					attV.setEntity(cvCurr);
					cvCurr.update();
				}
		}

		for(Map.Entry<ClassView, List<OperationView>> entry : ops.entrySet()) {
			ClassView cvCurr = entry.getKey();
			for(OperationView opV : entry.getValue()) {
				if(cvRef.getOperations().contains(opV)) {
					cvRef.getOperations().remove(opV);
					cvCurr.getOperations().add(opV);
					opV.setEntity(cvCurr);
					cvCurr.update();
				}
			}
		}

		for(Map.Entry<ClassDefinition, List<Property>> entry : attrsKm.entrySet()) {
			ClassDefinition cvCurr = entry.getKey();
			for(Property attrV : entry.getValue()) {
				cvCurr.getOwnedAttribute().add(attrV);
				attrV.setOwningClass(cvCurr);
			}
		}

		for(Map.Entry<ClassDefinition, List<Operation>> entry : opsKm.entrySet()) {
			ClassDefinition cvCurr = entry.getKey();
			for(Operation opV : entry.getValue()) {
				cvCurr.getOwnedOperation().add(opV);
				opV.setOwningClass(cvCurr);
			}
		}

		for(IRelationView irv : relationsAdded)
			canvas.removeRelation(irv);

		cdRef.getSuperType().addAll(superTypes);
		cvRef.update();
		
        Runnable moveScrollbars = new Runnable() {
            @Override
			public void run() {
            	final Point pt = Completioner.Interaction2MoveCamera.getMoveCameraToPoint(classes.get(0), canvas.getZoom(), canvas.getScrollpane());
            	getCanvas().getScrollpane().getHorizontalScrollBar().setValue((int)pt.getX());
            	getCanvas().getScrollpane().getVerticalScrollBar().setValue((int)pt.getY());
            }
        };

        SwingUtilities.invokeLater(moveScrollbars);
		
		canvas.update();

		super.undo();
	}

	
	public static Set<ClassDefinition> getAllSuperClasses(final ClassDefinition cdCurrent) {
		Set<ClassDefinition> res = new HashSet<>();
		ClassDefinition cdSup;
		
		for(Type superType : cdCurrent.getSuperType())
			if(superType instanceof org.kermeta.language.structure.Class) {
				cdSup = (ClassDefinition)((org.kermeta.language.structure.Class) superType).getTypeDefinition();
				res.add(cdSup);
				res.addAll(getAllSuperClasses(cdSup));
			}
		return res;
	}
	
	

	protected void flat() {
		ModelViewMapper mapper = ModelViewMapper.getMapper();
		final ClassView cvRef = mapper.getClassView(cdRef);
		ClassView clView;
		Set<ClassDefinition> scl = getAllSuperClasses(cdRef);
		
		for(ClassDefinition cl : scl) {
			clView = mapper.getClassView(cl);
			if(clView!=null) {
				clView.setVisibility(Visibility.NONE);
				List<AttributeView> avs = new ArrayList<>();
				List<Property> props = new ArrayList<>();
				
				for(AttributeView av : clView.getAttributes())
					if(!cvRef.getAttributes().contains(av)) {
						cvRef.getAttributes().add(av);
						avs.add(av);
						av.setEntity(cvRef);
					}
				
				if(!attrs.containsKey(clView))
					attrs.put(clView, avs);
				if(!attrsKm.containsKey(cl))
					attrsKm.put(cl, props);
				
				while(!cl.getOwnedAttribute().isEmpty()) {
					Property prop = cl.getOwnedAttribute().get(0);
					props.add(prop);
					if(cdRef.getOwnedAttribute().contains(prop))
						cl.getOwnedAttribute().remove(0);
					else {
						cdRef.getOwnedAttribute().add(prop);
						prop.setOwningClass(cdRef);
					}
				}
				
				List<OperationView> ovs = new ArrayList<>();
				List<Operation> opkms = new ArrayList<>();
	
				for(OperationView ov : clView.getOperations()) {
					if(!cvRef.getOperations().contains(ov)) {
						cvRef.getOperations().add(ov);
						ovs.add(ov);
						ov.setEntity(cvRef);
					}
				}
				
				if(!ops.containsKey(clView))
				ops.put(clView, ovs);
	
				if(!opsKm.containsKey(cl))
					opsKm.put(cl, opkms);
		
				while(!cl.getOwnedOperation().isEmpty()) {
					Operation op = cl.getOwnedOperation().get(0);
					opkms.add(op);
					if(cdRef.getOwnedOperation().contains(op))
						cl.getOwnedOperation().remove(0);
					else {
						cdRef.getOwnedOperation().add(op);
						op.setOwningClass(cdRef);
					}
				}
				
//				List<RelationClassView> cvSupRel = clView.getRelations();
//				for(RelationClassView rcv : cvSupRel) {
//					RoleView roleSrc = rcv.getRoleSrc();
//					RoleView roleTar = rcv.getRoleTar();
//					RelationClassView rcv2;
////					boolean notAdded = true;
//	
////					for(int i=0, size=cvRef.getRelations().size(); i<size && notAdded; i++) {
////						rcv2 = cvRef.getRelations().get(i);
////						notAdded = !rcv2.equalsValue(rcv);
////					}
//	
////					if(notAdded) {
//						IRelationView irv = new RelationClassView(cvRef, rcv.getEntityTar(), rcv.isComposition(), rcv.getSourceDecoration()!=null,
//											roleSrc==null?null:roleSrc.getName(), roleTar==null?null:roleTar.getName(),
//											roleSrc==null?null:roleSrc.getCardinality(), roleTar==null?null:roleTar.getCardinality());
//						canvas.removeRelation(rcv);
//						canvas.addRelation(irv);
//	
//						ModelViewMapper.getMapper().addReference(rcv, (roleSrc==null?"":roleSrc.getName())+cdRef.getName());
//						relationsAdded.add(irv);
////					}
//				}
//	
//				cvSupRel.clear();
				clView.getAttributes().clear();
				clView.getOperations().clear();
			}
		}

//		for(Type superType : cdCurrent.getSuperType())
//			if(superType instanceof org.kermeta.language.structure.Class) {
//				cdSup = (ClassDefinition)((org.kermeta.language.structure.Class) superType).getTypeDefinition();
//				System.out.println(">>>" + cdSup.getName());
//				cvSup = mapper.getClassView(cdSup);
//				if(cvSup!=null) {
//					cvSup.setVisibility(Visibility.NONE);
////FIXME to refactor
//					List<AttributeView> avs = new ArrayList<>();
//					List<Property> props = new ArrayList<>();
//
//					for(AttributeView av : cvSup.getAttributes()) {
//						if(!cvRef.getAttributes().contains(av)) {
//							cvRef.getAttributes().add(av);
//							avs.add(av);
//							av.setEntity(cvRef);
//						}
//					}
//
//					if(!attrs.containsKey(cvSup))
//						attrs.put(cvSup, avs);
//					if(!attrsKm.containsKey(cdSup))
//						attrsKm.put(cdSup, props);
//
//					while(!cdSup.getOwnedAttribute().isEmpty()) {
//						Property prop = cdSup.getOwnedAttribute().get(0);
//						props.add(prop);
//						if(cdRef.getOwnedAttribute().contains(prop))
//							cdSup.getOwnedAttribute().remove(0);
//						else {
//							cdRef.getOwnedAttribute().add(prop);
//							prop.setOwningClass(cdRef);
//						}
//					}
//
//					List<OperationView> ovs = new ArrayList<>();
//					List<Operation> opkms = new ArrayList<>();
//
//					for(OperationView ov : cvSup.getOperations()) {
//						if(!cvRef.getOperations().contains(ov)) {
//							cvRef.getOperations().add(ov);
//							ovs.add(ov);
//							ov.setEntity(cvRef);
//						}
//					}
//
//					if(!ops.containsKey(cvSup))
//						ops.put(cvSup, ovs);
//
//					if(!opsKm.containsKey(cdSup))
//						opsKm.put(cdSup, opkms);
//
//					while(!cdSup.getOwnedOperation().isEmpty()) {
//						Operation op = cdSup.getOwnedOperation().get(0);
//						opkms.add(op);
//						if(cdRef.getOwnedOperation().contains(op))
//							cdSup.getOwnedOperation().remove(0);
//						else {
//							cdRef.getOwnedOperation().add(op);
//							op.setOwningClass(cdRef);
//						}
//					}
//
//					List<RelationClassView> cvSupRel = cvSup.getRelations();
//					for(RelationClassView rcv : cvSupRel) {
//						RoleView roleSrc = rcv.getRoleSrc();
//						RoleView roleTar = rcv.getRoleTar();
//						RelationClassView rcv2;
//						boolean notAdded = true;
//
//						for(int i=0, size=cvRef.getRelations().size(); i<size && notAdded; i++) {
//							rcv2 = cvRef.getRelations().get(i);
//							notAdded = !rcv2.equalsValue(rcv);
//						}
//
//						if(notAdded) {
//							IRelationView irv = new RelationClassView(cvRef, rcv.getEntityTar(), rcv.isComposition(), rcv.getSourceDecoration()!=null,
//												roleSrc==null?null:roleSrc.getName(), roleTar==null?null:roleTar.getName(),
//												roleSrc==null?null:roleSrc.getCardinality(), roleTar==null?null:roleTar.getCardinality());
//							canvas.removeRelation(rcv);
//							canvas.addRelation(irv);
//							System.out.println((roleSrc==null?"":roleSrc.getName())+cdCurrent.getName());
//
//							ModelViewMapper.getMapper().addReference(rcv, (roleSrc==null?"":roleSrc.getName())+cdCurrent.getName());
//							relationsAdded.add(irv);
//						}
//					}
//
//					cvSupRel.clear();
//					cvSup.getAttributes().clear();
//					cvSup.getOperations().clear();
//
//					flat(cdSup);
//				}
//			}
	}



	@Override
	public boolean canDo() {
		return super.canDo() && !canvas.getSelection().isEmpty();
	}
}
