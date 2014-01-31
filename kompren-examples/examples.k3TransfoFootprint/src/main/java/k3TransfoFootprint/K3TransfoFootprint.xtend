package k3TransfoFootprint

import java.util.List
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.XExpression

import static extension k3TransfoFootprint.__SlicerAspect__.*

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


	protected def void onStart(){
	}

	protected def void onEnd(){
	}

}

