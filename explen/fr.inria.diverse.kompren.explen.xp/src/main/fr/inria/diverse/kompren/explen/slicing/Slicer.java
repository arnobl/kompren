package fr.inria.diverse.kompren.explen.slicing;

import org.kermeta.kompren.diagram.view.interfaces.IComponentView;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IModelView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
import org.kermeta.kompren.org.kermeta.kompren.gwelet.slicer.org.kermeta.language.structure.RichClassDefinition;
import org.kermeta.kompren.org.kermeta.kompren.gwelet.slicer.org.kermeta.language.structure.RichOperation;
import org.kermeta.kompren.org.kermeta.kompren.gwelet.slicer.org.kermeta.language.structure.RichProperty;
import org.kermeta.kompren.org.kermeta.kompren.gwelet.slicer.org.kermeta.language.structure.RichVisualiserKermetaModel;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeDefinition;

import fr.inria.diverse.kompren.explen.model.ModelUtils;
import fr.inria.diverse.kompren.explen.view.ClassView;
import fr.inria.diverse.kompren.explen.view.InheritanceView;
import fr.inria.diverse.kompren.explen.view.ModelViewMapper;

public class Slicer extends RichVisualiserKermetaModel {
	protected IModelView view;

	public Slicer(final IModelView view) {
		super();
		this.view = view;
	}
	
	
	@Override
	public void onClazzsuperClassesAdded(TypeDefinition srcClass, TypeDefinition tgtClass) {
		InheritanceView iv = ModelViewMapper.getMapper().getInheritanceView(
				(ClassDefinition)srcClass, (ClassDefinition)tgtClass);
		if(iv!=null)
			iv.setVisibility(IComponentView.Visibility.STANDARD);
	}


	@Override
	public void onPropertyAdded(final Property prop) {
		Type type = prop.getType();
		if(type instanceof org.kermeta.language.structure.Class &&
				!ModelUtils.INSTANCE.isKermetaPrimitiveType(((org.kermeta.language.structure.Class)type).getName())) {
			ModelViewMapper.getMapper().getRelationClassView(prop).setVisibility(IComponentView.Visibility.STANDARD);
		}
	}


	@Override
	public void onClassDefinitionAdded(final ClassDefinition cl) {
		String qname = ModelUtils.INSTANCE.getQualifiedName(cl);// EVAL

		if(!qname.startsWith("org.kermeta") && !qname.startsWith("kermeta") && !qname.startsWith("org.Dummy") &&
			ModelViewMapper.getMapper().getClassView(cl).getVisibility()==IComponentView.Visibility.HIDE_START) {
				ModelViewMapper.getMapper().getClassView(cl).setVisibility(IComponentView.Visibility.STANDARD);
		}
	}



	@Override
	public void onEnd() {
		for(IEntityView ent : view.getEntities())
			if(ent.getVisibility()==IComponentView.Visibility.HIDE_START)
				ent.setVisibility(IComponentView.Visibility.NONE);
		for(IRelationView rel : view.getRelations())
			if(rel.getVisibility()==IComponentView.Visibility.HIDE_START)
				rel.setVisibility(IComponentView.Visibility.NONE);

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
		
		for(IEntityView ent : view.getEntities())
			if(ent.getVisibility()==IComponentView.Visibility.STANDARD)
				ent.setVisibility(IComponentView.Visibility.HIDE_START);
		for(IRelationView rel : view.getRelations())
			if(rel.getVisibility()==IComponentView.Visibility.STANDARD)
				rel.setVisibility(IComponentView.Visibility.HIDE_START);
	}
}
