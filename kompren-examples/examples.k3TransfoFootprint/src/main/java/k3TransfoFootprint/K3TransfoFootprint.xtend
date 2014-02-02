package k3TransfoFootprint
import org.eclipse.xtext.xbase.annotations.xAnnotations.*
import org.eclipse.xtext.xtype.*
import org.eclipse.xtext.xbase.*
import org.eclipse.xtext.common.types.*

import static extension k3TransfoFootprint.__SlicerAspect__.*

import static extension k3TransfoFootprint.__SlicerAspect__.*
import java.util.List

class K3TransfoFootprint{
	val List<JvmFormalParameter> inputJvmFormalParameter
	val List<JvmTypeReference> inputJvmTypeReference
	val List<XExpression> inputXExpression

	new(List<JvmFormalParameter> inputJvmFormalParameter,List<JvmTypeReference> inputJvmTypeReference,List<XExpression> inputXExpression){
		this.inputJvmFormalParameter = inputJvmFormalParameter
		this.inputJvmTypeReference = inputJvmTypeReference
		this.inputXExpression = inputXExpression
	}

	def void slice(){
		onStart
		inputJvmFormalParameter?.forEach[visitToAddClasses(this)]
		inputJvmTypeReference?.forEach[visitToAddClasses(this)]
		inputXExpression?.forEach[visitToAddClasses(this)]
		inputJvmFormalParameter?.forEach[visitToAddRelations(this)]
		inputJvmTypeReference?.forEach[visitToAddRelations(this)]
		inputXExpression?.forEach[visitToAddRelations(this)]
		onEnd
	}

	def void onJvmTypeReferenceSliced(JvmTypeReference type){
		println(type.getQualifiedName)

	}
	def void onJvmIdentifiableElementSliced(JvmIdentifiableElement ident){
		println(ident.getQualifiedName)
	}

	protected def void onStart(){
	}

	protected def void onEnd(){
	}

}

