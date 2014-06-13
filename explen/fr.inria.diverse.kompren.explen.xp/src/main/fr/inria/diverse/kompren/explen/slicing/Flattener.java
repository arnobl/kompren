package fr.inria.diverse.kompren.explen.slicing;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import org.kermeta.kompren.diagram.view.interfaces.IComponentView;
import org.kermeta.kompren.diagram.view.interfaces.IComponentView.Visibility;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IModelView;
import org.kermeta.kompren.org.kermeta.kompren.gwelet.slicer.org.kermeta.language.structure.RichClass;
import org.kermeta.kompren.org.kermeta.kompren.gwelet.slicer.org.kermeta.language.structure.RichClassDefinition;
import org.kermeta.kompren.org.kermeta.kompren.gwelet.slicer.org.kermeta.language.structure.RichOperation;
import org.kermeta.kompren.org.kermeta.kompren.gwelet.slicer.org.kermeta.language.structure.RichProperty;
import org.kermeta.kompren.org.kermeta.kompren.gwelet.slicer.org.kermeta.language.structure.RichVisualiserKermetaModel;
import org.kermeta.language.structure.Class;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.TypeDefinition;

import scala.Tuple2;
import fr.inria.diverse.kompren.explen.model.ModelUtils;
import fr.inria.diverse.kompren.explen.view.AttributeView;
import fr.inria.diverse.kompren.explen.view.ClassView;
import fr.inria.diverse.kompren.explen.view.InheritanceView;
import fr.inria.diverse.kompren.explen.view.ModelViewMapper;
import fr.inria.diverse.kompren.explen.view.OperationView;
import fr.inria.diverse.kompren.explen.view.RelationClassView;

public class Flattener extends RichVisualiserKermetaModel {
	protected IModelView view;
	protected ClassDefinition cdRef;
	
//	private final Map<ClassView, List<AttributeView>> attrs;
//	private final Map<ClassView, List<OperationView>> ops;
//	private final Map<ClassDefinition, List<Property>> attrsKm;
//	private final Map<ClassDefinition, List<Operation>> opsKm;
//	private final List<IRelationView> relationsAdded;
//	private final List<Type> superTypes;
	
	private final Set<Property> props;
	private final Set<ClassDefinition> supers;

	
	public Flattener(final IModelView view, ClassDefinition cdRef) {
		super();
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
	public void onClazzsuperClassesAdded(TypeDefinition srcClass, TypeDefinition tgtClass) {
		InheritanceView iv = ModelViewMapper.getMapper().getInheritanceView((ClassDefinition)srcClass, (ClassDefinition)tgtClass);
		ClassView cdv = ModelViewMapper.getMapper().getClassView((ClassDefinition)tgtClass);
		if(iv!=null) iv.setVisibility(IComponentView.Visibility.NONE);
		if(cdv!=null) {
			cdv.setVisibility(IComponentView.Visibility.NONE);
			supers.add((ClassDefinition) tgtClass);
		}
	}


	@Override
	public void onPropertyAdded(final Property prop) {
		// Nothing to do.
		if(prop.getType() instanceof org.kermeta.language.structure.Class) {
			org.kermeta.language.structure.Class cl = (Class) prop.getType();
			ClassDefinition cd = (ClassDefinition) cl.getTypeDefinition();
			String qname = ModelUtils.INSTANCE.getQualifiedName(cd);// EVAL
			
			if(!qname.startsWith("org.kermeta") && !qname.startsWith("kermeta") && !qname.startsWith("org.Dummy")){
				props.add(prop);
			}
		}
	}


	@Override
	public void onClassDefinitionAdded(final ClassDefinition cl) { /* Nothing to do. */ }


	private Map<Property, Tuple2<ClassDefinition,ClassDefinition>> movedProps = new IdentityHashMap<>();
	

	@Override
	public void onEnd() {
//		for(IEntityView ent : view.getEntities())
//			if(ent.getVisibility()==IComponentView.Visibility.HIDE_START)
//				ent.setVisibility(IComponentView.Visibility.STANDARD);
//		for(IRelationView rel : view.getRelations())
//			if(rel.getVisibility()==IComponentView.Visibility.HIDE_START)
//				rel.setVisibility(IComponentView.Visibility.STANDARD);
		
		final ClassView cvRef = ModelViewMapper.getMapper().getClassView(cdRef);
		
		for(Property prop : props) {
			final ClassDefinition cdSrc = (ClassDefinition) prop.eContainer();
			final RelationClassView rcv = ModelViewMapper.getMapper().getRelationClassView(prop);
			final Class cl = (Class) prop.getType();
			final ClassDefinition cdTgt = (ClassDefinition) cl.getTypeDefinition();
			boolean changed = false;
			Property opp = (Property) prop.getOpposite();
			
			if(supers.contains(cdSrc)) {
				movedProps.put(prop, new Tuple2<ClassDefinition, ClassDefinition>(cdSrc, cdTgt));
				prop.setOwningClass(cdRef);
				if(cdSrc==ModelViewMapper.getMapper().getClassDefinition(rcv.getEntitySrc()))
					rcv.setEntitySrc(cvRef);
				else
					rcv.setEntityTar(cvRef);
				changed = true;
			}
			
			if(supers.contains(cdTgt)) {// Must be recursive reference now.
				final Class newCl = new RichClass();
				newCl.setTypeDefinition(cdRef);
				prop.setType(newCl);
				if(cdTgt==ModelViewMapper.getMapper().getClassDefinition(rcv.getEntitySrc()))
					rcv.setEntitySrc(cvRef);
				else
					rcv.setEntityTar(cvRef);
				changed = true;
			}

			if(changed && opp!=null) {
				final Class newCl = new RichClass();
				newCl.setTypeDefinition(cdRef);
				opp.setType(newCl);
			}
			
			if(changed) {
				rcv.reinitRoles();
				rcv.update();
				ModelViewMapper.getMapper().removeRelationClassView(prop);
				ModelViewMapper.getMapper().addReference(rcv, prop);
			}
		}

		for(ClassDefinition cd : supers) {//FIXME undo
			cd.getSuperType().clear();
			
			List<Operation> opCop = new CopyOnWriteArrayList<>(cd.getOwnedOperation());
			for(Operation op : opCop) {
				op.setOwningClass(cdRef);
			}
			List<Property> prCop = new CopyOnWriteArrayList<>(cd.getOwnedAttribute());
			for(Property prop : prCop) {
				prop.setOwningClass(cdRef);
			}
			
			final ClassView cv = ModelViewMapper.getMapper().getClassView(cd);
			for(AttributeView av : cv.getAttributes()) {
				cvRef.getAttributes().add(av);
				av.setEntity(cvRef);
				av.setVisibility(Visibility.STANDARD);
			}
			for(OperationView op : cv.getOperations()) {
				cvRef.getOperations().add(op);
				op.setEntity(cvRef);
				op.setVisibility(Visibility.STANDARD);
			}
			cv.getOperations().clear();
			cv.getAttributes().clear();
		}
		
		for(IEntityView ent : view.getEntities()) {
			ClassView cv = (ClassView) ent;
			ClassDefinition cd = ModelViewMapper.getMapper().getClassDefinition(cv);
			if(!supers.contains(cd) && cd!=cdRef)
				for(Property prop : cd.getOwnedAttribute()) {
					if(prop.getType() instanceof Class && supers.contains(((Class)prop.getType()).getTypeDefinition()) && prop.getOpposite()==null) {
						final RelationClassView rcv = ModelViewMapper.getMapper().getRelationClassView(prop);
						final Class newCl = new RichClass();
						newCl.setTypeDefinition(cdRef);
						prop.setType(newCl);
						rcv.setEntityTar(cvRef);
					
						rcv.update();
						ModelViewMapper.getMapper().removeRelationClassView(prop);
						ModelViewMapper.getMapper().addReference(rcv, prop);
					}
				}
		}
		
		cdRef.getSuperType().clear();
		
		cvRef.update();
		view.updateLayout();
		view.update();
	}



	@Override
	public void onStart() {
		//FIXME in the model slicer
		for(IEntityView ent : view.getEntities()) {
			RichClassDefinition rcd = (RichClassDefinition) ModelViewMapper.getMapper().getClassDefinition((ClassView) ent);
			rcd.sliced_$eq(false);
			rcd.visitedForRelations_$eq(false);
			rcd.visitedPass_$eq(false);
			for(Property prop : rcd.getOwnedAttribute()) {
				RichProperty rp = (RichProperty)prop;
				rp.sliced_$eq(false);
				rp.visitedForRelations_$eq(false);
				rp.visitedPass_$eq(false);
			}
			for(Operation op : rcd.getOwnedOperation()) {
				RichOperation rp = (RichOperation)op;
				rp.sliced_$eq(false);
				rp.visitedForRelations_$eq(false);
				rp.visitedPass_$eq(false);
			}
		}
		
//		for(IEntityView ent : view.getEntities())
//			if(ent.getVisibility()==IComponentView.Visibility.STANDARD)
//				ent.setVisibility(IComponentView.Visibility.HIDE_START);
//		for(IRelationView rel : view.getRelations())
//			if(rel.getVisibility()==IComponentView.Visibility.STANDARD)
//				rel.setVisibility(IComponentView.Visibility.HIDE_START);
	}
}
