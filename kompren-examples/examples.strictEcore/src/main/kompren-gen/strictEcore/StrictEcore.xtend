package strictEcore
import org.eclipse.emf.ecore.*
import org.eclipse.emf.ecore.impl.*

import static extension strictEcore.__SlicerAspect__.*
import static extension strictEcore.ENamedElementAspect.*
import static extension strictEcore.EClassifierAspect.*
import static extension strictEcore.ETypeParameterAspect.*
import static extension strictEcore.ETypedElementAspect.*
import static extension strictEcore.EStructuralFeatureAspect.*
import static extension strictEcore.EClassAspect.*
import static extension strictEcore.EOperationAspect.*
import static extension strictEcore.EReferenceAspect.*
import static extension strictEcore.EAttributeAspect.*
import static extension strictEcore.EEnumLiteralAspect.*
import static extension strictEcore.EModelElementAspect.*
import static extension strictEcore.EAnnotationAspect.*
import static extension strictEcore.EFactoryAspect.*
import static extension strictEcore.EParameterAspect.*
import static extension strictEcore.EDataTypeAspect.*
import static extension strictEcore.EEnumAspect.*
import static extension strictEcore.EPackageAspect.*

import static extension strictEcore.__SlicerAspect__.*
import static extension strictEcore.ENamedElementAspect.*
import static extension strictEcore.EClassifierAspect.*
import static extension strictEcore.ETypeParameterAspect.*
import static extension strictEcore.ETypedElementAspect.*
import static extension strictEcore.EStructuralFeatureAspect.*
import static extension strictEcore.EClassAspect.*
import static extension strictEcore.EOperationAspect.*
import static extension strictEcore.EReferenceAspect.*
import static extension strictEcore.EAttributeAspect.*
import static extension strictEcore.EEnumLiteralAspect.*
import static extension strictEcore.EModelElementAspect.*
import static extension strictEcore.EAnnotationAspect.*
import static extension strictEcore.EFactoryAspect.*
import static extension strictEcore.EParameterAspect.*
import static extension strictEcore.EDataTypeAspect.*
import static extension strictEcore.EEnumAspect.*
import static extension strictEcore.EPackageAspect.*
import java.util.List

import org.eclipse.emf.ecore.EObject
class StrictEcore{
	val List<EClass> inputEClass
	private val List<EObject> clonedElts = new java.util.ArrayList

	new(List<EClass> inputEClass){
		this.inputEClass = inputEClass
	}

	def void slice(){
		inputEClass?.forEach[visitToAddClasses(this)]
		inputEClass?.forEach[visitToAddRelations(this)]
		save
	}

	def void objectCloned(EObject object){
		this.clonedElts.add(object)
	}

	def void save(){
		val objs = this.clonedElts.filter[eContainer==null]
		val resSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
		resSet.getResourceFactoryRegistry.getExtensionToFactoryMap.put("*", new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl)
		val res = resSet.createResource(org.eclipse.emf.common.util.URI.createURI("modelSlice.xmi"))
		res.getContents.addAll(objs)
	    res.save(java.util.Collections.emptyMap)
	    res.unload
	}

}
