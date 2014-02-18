package k3TransfoFootprint

import java.util.HashSet
import java.util.List
import java.util.Set
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmIdentifiableElement
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.XExpression

import static extension k3TransfoFootprint.__SlicerAspect__.*

class K3TransfoFootprint{

	public val Set<String> footprint = new HashSet
	
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
		footprint.add(type.getQualifiedName)
	}
	def void onJvmIdentifiableElementSliced(JvmIdentifiableElement ident){
		footprint.add(ident.getQualifiedName)
	}

	protected def void onStart(){
	}

	protected def void onEnd(){
	}

}
