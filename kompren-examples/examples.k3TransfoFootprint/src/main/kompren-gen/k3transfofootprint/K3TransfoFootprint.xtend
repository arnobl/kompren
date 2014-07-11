package k3transfofootprint

import static extension k3transfofootprint.__SlicerAspect__.*
import static extension k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect.*
import static extension k3transfofootprint.orgeclipsextextcommontypesJvmIdentifiableElementAspect.*
class K3TransfoFootprint{

	public val java.util.Set<String> footprint = newHashSet
	private def addQN(String qn) {
		if(qn!=null && !qn.startsWith("java.") && !qn.startsWith("com.google.") && 
			!qn.startsWith("sun.") && !qn.startsWith("javax.") && !qn.startsWith("com.sun") &&
			!qn.startsWith("com.oracle") && !qn.startsWith("sunw."))
			footprint.add(qn)
	}
	
	val java.util.List<org.eclipse.xtext.common.types.JvmFormalParameter> inputJvmFormalParameter
	val java.util.List<org.eclipse.xtext.common.types.JvmTypeReference> inputJvmTypeReference
	val java.util.List<org.eclipse.xtext.xbase.XExpression> inputXExpression

	new(java.util.List<org.eclipse.xtext.common.types.JvmFormalParameter> inputJvmFormalParameter,java.util.List<org.eclipse.xtext.common.types.JvmTypeReference> inputJvmTypeReference,java.util.List<org.eclipse.xtext.xbase.XExpression> inputXExpression){
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

	def void onJvmTypeReferenceSliced(org.eclipse.xtext.common.types.JvmTypeReference type){
		addQN(type.getQualifiedName)
	}
	def void onJvmIdentifiableElementSliced(org.eclipse.xtext.common.types.JvmIdentifiableElement ident){
		addQN(ident.getQualifiedName)
	}

	protected def void onStart(){
	}

	protected def void onEnd(){
	}

}
