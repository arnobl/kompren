package fr.inria.diverse.kompren.explen.slicing;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.kermeta.kompren.diagram.view.interfaces.IComponentView;
import org.kermeta.kompren.diagram.view.interfaces.IModelView;

import explenslicer.ExplenSlicer;
import fr.inria.diverse.kompren.explen.view.ClassView;
import fr.inria.diverse.kompren.explen.view.InheritanceView;
import fr.inria.diverse.kompren.explen.view.ModelViewMapper;
import fr.inria.diverse.kompren.explen.view.RelationClassView;

public class Flattener extends ExplenSlicer {
	private class Tuple<A,B> {
		public A val1;
		public B val2;
		public Tuple(A a, B b) {
			val1 = a;
			val2 = b;
		}
	}
	
	protected IModelView view;
	protected EClass cdRef;
	
//	private final Map<ClassView, List<AttributeView>> attrs;
//	private final Map<ClassView, List<OperationView>> ops;
//	private final Map<ClassDefinition, List<Property>> attrsKm;
//	private final Map<ClassDefinition, List<Operation>> opsKm;
//	private final List<IRelationView> relationsAdded;
//	private final List<Type> superTypes;
	
	private final Set<EReference> props;
	private final Set<EClass> supers;
	private final Map<EStructuralFeature, Tuple<EClass,EClass>> movedProps = new IdentityHashMap<>();
	
	public Flattener(IModelView view, EClass cdRef, List<EClass> inputEClass, EObject metamodelRoot){ //final IModelView view, EClass cdRef) {
		super(inputEClass, metamodelRoot, false, true, true, true, false, false);
		this.view = view;
		this.cdRef = cdRef;
		
//		attrs = new IdentityHashMap<>();
//		ops = new IdentityHashMap<>();
//		attrsKm = new IdentityHashMap<>();
//		opsKm = new IdentityHashMap<>();
//		superTypes = new ArrayList<>();
//		relationsAdded = new ArrayList<>();
		
		props = new HashSet<>();
		supers = new HashSet<>();
	}
	

	@Override
	public void onEClassSliced(EClass theVar) {
		super.onEClassSliced(theVar);
	}


	@Override
	public void onEOperationSliced(EOperation theVar) {
		super.onEOperationSliced(theVar);
	}


	@Override
	public void oneSuperTypesSliced(EClass clazz, EClass superClass) {
		final InheritanceView iv = ModelViewMapper.getMapper().getInheritanceView(clazz, superClass);
		final ClassView cdv = ModelViewMapper.getMapper().getClassView(superClass);
		if(iv!=null) iv.setVisibility(IComponentView.Visibility.NONE);
		if(cdv!=null) {
			cdv.setVisibility(IComponentView.Visibility.NONE);
			supers.add(superClass);
		}
	}


	@Override
	public void oneStructuralFeaturesSliced(EClass theSrc, EStructuralFeature theTgt) {
		if(theTgt instanceof EReference) {
			props.add((EReference)theTgt);
		}
	}


	@Override
	public void oneOperationsSliced(EClass theSrc, EOperation theTgt) {
		super.oneOperationsSliced(theSrc, theTgt);
	}

	@Override
	protected void onStart() {
		//FIXME in the model slicer
//		for(IEntityView ent : view.getEntities()) {
//			EClass rcd = ModelViewMapper.getMapper().getClassDefinition((ClassView) ent);
//			rcd.sliced_$eq(false);
//			rcd.visitedForRelations_$eq(false);
//			rcd.visitedPass_$eq(false);
//			for(Property prop : rcd.getOwnedAttribute()) {
//				RichProperty rp = (RichProperty)prop;
//				rp.sliced_$eq(false);
//				rp.visitedForRelations_$eq(false);
//				rp.visitedPass_$eq(false);
//			}
//			for(Operation op : rcd.getOwnedOperation()) {
//				RichOperation rp = (RichOperation)op;
//				rp.sliced_$eq(false);
//				rp.visitedForRelations_$eq(false);
//				rp.visitedPass_$eq(false);
//			}
//		}
	}


	@Override
	protected void onEnd() {
		final ClassView cvRef = ModelViewMapper.getMapper().getClassView(cdRef);
		
		for(EReference prop : props) {
			final EClass cdSrc = prop.getEContainingClass();
			final RelationClassView rcv = ModelViewMapper.getMapper().getRelationClassView(prop);
			final EClass cdTgt = (EClass) prop.getEType();
			boolean changed = false;
			EReference opp = prop.getEOpposite();
			
			if(supers.contains(cdSrc)) {
				movedProps.put(prop, new Tuple<>(cdSrc, cdTgt));
//				prop.setOwningClass(cdRef);
				if(cdSrc==ModelViewMapper.getMapper().getClassDefinition(rcv.getEntitySrc()))
					rcv.setEntitySrc(cvRef);
				else
					rcv.setEntityTar(cvRef);
				changed = true;
			}
			
			if(supers.contains(cdTgt)) {// Must be recursive reference now.
				prop.setEType(cdRef);
				if(cdTgt==ModelViewMapper.getMapper().getClassDefinition(rcv.getEntitySrc()))
					rcv.setEntitySrc(cvRef);
				else
					rcv.setEntityTar(cvRef);
				changed = true;
			}
		
			if(changed && opp!=null) {
				opp.setEType(cdRef);
			}
			
			if(changed) {
				rcv.reinitRoles();
				rcv.update();
				ModelViewMapper.getMapper().removeRelationClassView(prop);
				ModelViewMapper.getMapper().addReference(rcv, prop);
			}
		}
		
//		for(EClass cd : supers) {//FIXME undo
//			cd.getESuperTypes().clear();
//			
//			List<EOperation> opCop = new CopyOnWriteArrayList<>(cd.getEOperations());
//			for(EOperation op : opCop) {
//				op.setOwningClass(cdRef);
//			}
//			List<EAttribute> prCop = new CopyOnWriteArrayList<>(cd.getEAttributes());
//			for(EAttribute prop : prCop) {
//				prop.setOwningClass(cdRef);
//			}
//			
//			final ClassView cv = ModelViewMapper.getMapper().getClassView(cd);
//			for(AttributeView av : cv.getAttributes()) {
//				cvRef.getAttributes().add(av);
//				av.setEntity(cvRef);
//				av.setVisibility(Visibility.STANDARD);
//			}
//			for(OperationView op : cv.getOperations()) {
//				cvRef.getOperations().add(op);
//				op.setEntity(cvRef);
//				op.setVisibility(Visibility.STANDARD);
//			}
//			cv.getOperations().clear();
//			cv.getAttributes().clear();
//		}
//		
//		for(IEntityView ent : view.getEntities()) {
//			ClassView cv = (ClassView) ent;
//			EClass cd = ModelViewMapper.getMapper().getClassDefinition(cv);
//			if(!supers.contains(cd) && cd!=cdRef)
//				for(EAttribute prop : cd.getEAttributes()) {
//					if(prop.getEType() instanceof EClass && supers.contains(((Class)prop.getType()).getTypeDefinition()) && prop.getOpposite()==null) {
//						final RelationClassView rcv = ModelViewMapper.getMapper().getRelationClassView(prop);
//						final Class newCl = new RichClass();
//						newCl.setTypeDefinition(cdRef);
//						prop.setType(newCl);
//						rcv.setEntityTar(cvRef);
//					
//						rcv.update();
//						ModelViewMapper.getMapper().removeRelationClassView(prop);
//						ModelViewMapper.getMapper().addReference(rcv, prop);
//					}
//				}
//		}
		
		cdRef.getESuperTypes().clear();
		
		cvRef.update();
		view.updateLayout();
		view.update();
	}


	@Override
	public void onEReferenceSliced(EReference theVar) {
		super.onEReferenceSliced(theVar);
	}


	@Override
	public void onEAttributeSliced(EAttribute theVar) {
		super.onEAttributeSliced(theVar);
	}


	@Override
	public void onEStructuralFeatureSliced(EStructuralFeature feat) {
		super.onEStructuralFeatureSliced(feat);
	}
}
