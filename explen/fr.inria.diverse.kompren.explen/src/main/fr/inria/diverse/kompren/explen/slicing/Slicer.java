package fr.inria.diverse.kompren.explen.slicing;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.kermeta.kompren.diagram.view.interfaces.IComponentView.Visibility;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IModelView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;

import explenslicer.ExplenSlicer;
import fr.inria.diverse.kompren.explen.view.InheritanceView;
import fr.inria.diverse.kompren.explen.view.ModelViewMapper;

public class Slicer extends ExplenSlicer {
	protected IModelView view;

	public Slicer(IModelView view, List<EClass> inputEClass, EObject metamodelRoot, boolean lowerType, boolean structFeat, boolean superType){
		super(inputEClass, metamodelRoot, lowerType, true, structFeat, superType);
		this.view = view;
	}

	@Override
	public void onEClassSliced(EClass theVar) {
		ModelViewMapper.getMapper().getClassView(theVar).setVisibility(Visibility.STANDARD);
	}

	@Override
	public void onEReferenceSliced(EReference theVar) {
		// TODO Auto-generated method stub
		super.onEReferenceSliced(theVar);
	}

	@Override
	public void onEAttributeSliced(EAttribute theVar) {
		// TODO Auto-generated method stub
		super.onEAttributeSliced(theVar);
	}

	@Override
	public void onEOperationSliced(EOperation theVar) {
		// TODO Auto-generated method stub
		super.onEOperationSliced(theVar);
	}

	@Override
	public void onEStructuralFeatureSliced(EStructuralFeature feat) {
		// TODO Auto-generated method stub
		super.onEStructuralFeatureSliced(feat);
	}

	@Override
	public void oneSuperTypesSliced(EClass clazz, EClass superClass) {
		InheritanceView iv = ModelViewMapper.getMapper().getInheritanceView(clazz, superClass);
		if(iv!=null)
			iv.setVisibility(Visibility.STANDARD);
	}

	@Override
	public void onlowerTypeSliced(EClass clazz, EClass lowerClass) {
		// TODO Auto-generated method stub
		super.onlowerTypeSliced(clazz, lowerClass);
	}

	@Override
	public void oneTypeSliced(ETypedElement theSrc, EClassifier theTgt) {
		// TODO Auto-generated method stub
		super.oneTypeSliced(theSrc, theTgt);
	}

	@Override
	public void oneStructuralFeaturesSliced(EClass theSrc, EStructuralFeature theTgt) {
		if(theTgt instanceof EReference) {
			ModelViewMapper.getMapper().getRelationClassView((EReference)theTgt).setVisibility(Visibility.STANDARD);
		}
	}

	@Override
	public void oneOperationsSliced(EClass theSrc, EOperation theTgt) {
		// TODO Auto-generated method stub
		super.oneOperationsSliced(theSrc, theTgt);
	}

	@Override
	protected void onStart() {
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
