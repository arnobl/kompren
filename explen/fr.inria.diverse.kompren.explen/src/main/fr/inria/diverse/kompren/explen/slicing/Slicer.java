package fr.inria.diverse.kompren.explen.slicing;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.kermeta.kompren.diagram.view.interfaces.IComponentView.Visibility;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IModelView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;

import explenslicer.ExplenSlicer;
import fr.inria.diverse.kompren.explen.view.ClassView;
import fr.inria.diverse.kompren.explen.view.InheritanceView;
import fr.inria.diverse.kompren.explen.view.ModelViewMapper;
import fr.inria.diverse.kompren.explen.view.RelationClassView;

public class Slicer extends ExplenSlicer {
	protected IModelView view;

	public Slicer(IModelView view, List<EClass> inputEClass, EObject metamodelRoot, boolean lowerType, boolean structFeat, boolean superType, boolean operations){
		super(inputEClass, metamodelRoot, lowerType, superType, structFeat, operations, false, false);//TODO composite and card1
		this.view = view;
	}

	@Override
	public void onEClassSliced(final EClass theVar) {
		super.onEClassSliced(theVar);
		if(theVar!=null && !theVar.eIsProxy()) {
			final ClassView cv = ModelViewMapper.getMapper().getClassView(theVar);
			if(cv!=null)
				ModelViewMapper.getMapper().getClassView(theVar).setVisibility(Visibility.STANDARD);
		}
	}


	@Override
	public void oneSuperTypesSliced(EClass clazz, EClass superClass) {
		super.oneSuperTypesSliced(clazz, superClass);
		InheritanceView iv = ModelViewMapper.getMapper().getInheritanceView(clazz, superClass);
		if(iv!=null)
			iv.setVisibility(Visibility.STANDARD);
	}


	@Override
	public void oneStructuralFeaturesSliced(EClass theSrc, EStructuralFeature theTgt) {
		super.oneStructuralFeaturesSliced(theSrc, theTgt);
		if(theTgt instanceof EReference) {
			final RelationClassView rv = ModelViewMapper.getMapper().getRelationClassView((EReference)theTgt);
			if(rv!=null) {
				ModelViewMapper.getMapper().getRelationClassView((EReference)theTgt).setVisibility(Visibility.STANDARD);
			}
		}
	}


	@Override
	protected void onStart() {
		super.onStart();
		//FIXME in the model slicer
//		for(IEntityView ent : view.getEntities()) {
//			RichClassDefinition rcd = (RichClassDefinition) ModelViewMapper.getMapper().getClassDefinition((ClassView) ent);
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
		
		for(IEntityView ent : view.getEntities())
			if(ent.getVisibility()==Visibility.STANDARD)
				ent.setVisibility(Visibility.HIDE_START);
		for(IRelationView rel : view.getRelations())
			if(rel.getVisibility()==Visibility.STANDARD)
				rel.setVisibility(Visibility.HIDE_START);
	}


	@Override
	protected void onEnd() {
		super.onEnd();
		for(IEntityView ent : view.getEntities())
		if(ent.getVisibility()==Visibility.HIDE_START)
			ent.setVisibility(Visibility.NONE);
		for(IRelationView rel : view.getRelations())
			if(rel.getVisibility()==Visibility.HIDE_START)
				rel.setVisibility(Visibility.NONE);
	
		view.updateLayout();
		view.update();
	}
}
