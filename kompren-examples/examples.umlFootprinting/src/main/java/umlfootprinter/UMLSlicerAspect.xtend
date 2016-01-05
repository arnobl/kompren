package umlfootprinter
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import static extension umlfootprinter.__SlicerAspect__.*
//import static extension umlfootprinter.orgeclipseuml2umlAbstractionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlAcceptCallActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlAcceptEventActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlActionExecutionSpecificationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlActionInputPinAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlActivityAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlActivityEdgeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlActivityFinalNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlActivityGroupAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlActivityNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlActivityParameterNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlActivityPartitionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlActorAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlAddStructuralFeatureValueActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlAddVariableValueActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlAnyReceiveEventAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlArtifactAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlAssociationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlAssociationClassAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlBehaviorAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlBehaviorExecutionSpecificationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlBehavioralFeatureAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlBehavioredClassifierAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlBroadcastSignalActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlCallActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlCallBehaviorActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlCallEventAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlCallOperationActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlCentralBufferNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlChangeEventAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlClassAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlClassifierAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlClassifierTemplateParameterAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlClauseAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlClearAssociationActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlClearStructuralFeatureActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlClearVariableActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlCollaborationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlCollaborationUseAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlCombinedFragmentAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlCommentAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlCommunicationPathAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlComponentAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlComponentRealizationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlConditionalNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlConnectableElementAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlConnectableElementTemplateParameterAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlConnectionPointReferenceAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlConnectorAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlConnectorEndAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlConsiderIgnoreFragmentAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlConstraintAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlContinuationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlControlFlowAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlControlNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlCreateLinkActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlCreateLinkObjectActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlCreateObjectActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlDataStoreNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlDataTypeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlDecisionNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlDependencyAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlDeployedArtifactAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlDeploymentAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlDeploymentSpecificationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlDeploymentTargetAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlDestroyLinkActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlDestroyObjectActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlDestructionOccurrenceSpecificationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlDeviceAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlDirectedRelationshipAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlDurationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlDurationConstraintAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlDurationIntervalAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlDurationObservationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlElementAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlElementImportAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlEncapsulatedClassifierAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlEnumerationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlEnumerationLiteralAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlEventAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlExceptionHandlerAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlExecutableNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlExecutionEnvironmentAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlExecutionOccurrenceSpecificationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlExecutionSpecificationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlExpansionNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlExpansionRegionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlExpressionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlExtendAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlExtensionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlExtensionEndAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlExtensionPointAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlFeatureAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlFinalNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlFinalStateAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlFlowFinalNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlForkNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlFunctionBehaviorAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlGateAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlGeneralOrderingAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlGeneralizationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlGeneralizationSetAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlImageAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlIncludeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlInformationFlowAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlInformationItemAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlInitialNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlInputPinAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlInstanceSpecificationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlInstanceValueAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlInteractionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlInteractionConstraintAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlInteractionFragmentAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlInteractionOperandAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlInteractionUseAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlInterfaceAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlInterfaceRealizationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlInterruptibleActivityRegionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlIntervalAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlIntervalConstraintAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlInvocationActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlJoinNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlLifelineAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlLinkActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlLinkEndCreationDataAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlLinkEndDataAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlLinkEndDestructionDataAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlLiteralBooleanAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlLiteralIntegerAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlLiteralNullAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlLiteralRealAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlLiteralSpecificationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlLiteralStringAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlLiteralUnlimitedNaturalAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlLoopNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlManifestationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlMergeNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlMessageAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlMessageEndAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlMessageEventAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlMessageOccurrenceSpecificationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlModelAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlMultiplicityElementAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlNamedElementAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlNamespaceAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlObjectFlowAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlObjectNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlObservationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlOccurrenceSpecificationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlOpaqueActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlOpaqueBehaviorAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlOpaqueExpressionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlOperationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlOperationTemplateParameterAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlOutputPinAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlPackageAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlPackageImportAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlPackageMergeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlPackageableElementAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlParameterAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlParameterSetAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlParameterableElementAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlPartDecompositionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlPinAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlPortAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlPrimitiveTypeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlProfileAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlProfileApplicationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlPropertyAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlProtocolConformanceAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlProtocolStateMachineAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlProtocolTransitionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlPseudostateAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlQualifierValueAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlRaiseExceptionActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlReadExtentActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlReadIsClassifiedObjectActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlReadLinkActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlReadLinkObjectEndActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlReadLinkObjectEndQualifierActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlReadSelfActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlReadStructuralFeatureActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlReadVariableActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlRealizationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlReceptionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlReclassifyObjectActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlRedefinableElementAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlRedefinableTemplateSignatureAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlReduceActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlRegionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlRelationshipAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlRemoveStructuralFeatureValueActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlRemoveVariableValueActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlReplyActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlSendObjectActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlSendSignalActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlSequenceNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlSignalAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlSignalEventAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlSlotAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlStartClassifierBehaviorActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlStartObjectBehaviorActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlStateAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlStateInvariantAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlStateMachineAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlStereotypeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlStringExpressionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlStructuralFeatureAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlStructuralFeatureActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlStructuredActivityNodeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlStructuredClassifierAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlSubstitutionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlTemplateBindingAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlTemplateParameterAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlTemplateParameterSubstitutionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlTemplateSignatureAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlTemplateableElementAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlTestIdentityActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlTimeConstraintAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlTimeEventAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlTimeExpressionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlTimeIntervalAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlTimeObservationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlTransitionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlTriggerAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlTypeAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlTypedElementAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlUnmarshallActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlUsageAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlUseCaseAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlValuePinAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlValueSpecificationAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlValueSpecificationActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlVariableAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlVariableActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlVertexAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlWriteLinkActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlWriteStructuralFeatureActionAspect.*
//import static extension umlfootprinter.orgeclipseuml2umlWriteVariableActionAspect.*

@Aspect(className=typeof(java.lang.Object))
abstract class __SlicerAspect__ {
	protected var boolean visitedForRelations = false
	protected var boolean sliced = false
	protected var org.eclipse.emf.ecore.EObject clonedElt = null

	def void visitToAddClasses(Umlfootprinter theSlicer){
		if(!_self.sliced) {
			_self.sliced = true
			_self._visitToAddClasses(theSlicer)
		}
	}
	
	protected def void _visitToAddClasses(Umlfootprinter theSlicer){}

	def void visitToAddRelations(Umlfootprinter theSlicer){
		if(!_self.visitedForRelations) {
			_self.visitedForRelations = true
			_self._visitToAddRelations(theSlicer)
		}
	}
	
	protected def void _visitToAddRelations(Umlfootprinter theSlicer){}

	def void feedOpposites(){}

	def void reinit(){
		_self.visitedForRelations = false
		_self.sliced = false
		_self.clonedElt = null
	}
}

@Aspect(className=typeof(org.eclipse.uml2.uml.Abstraction), with=#[typeof(orgeclipseuml2umlDependencyAspect)])
class orgeclipseuml2umlAbstractionAspect extends orgeclipseuml2umlDependencyAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^mapping?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onAbstractionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^mapping?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^mapping!==null){
		_self.^mapping.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^mapping.sliced) 		theSlicer.onmappingSliced(_self, _self.^mapping)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.AcceptCallAction), with=#[typeof(orgeclipseuml2umlAcceptEventActionAspect)])
class orgeclipseuml2umlAcceptCallActionAspect extends orgeclipseuml2umlAcceptEventActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^returnInformation?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onAcceptCallActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^returnInformation?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^returnInformation!==null){
		_self.^returnInformation.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^returnInformation.sliced) 		theSlicer.onreturnInformationSliced(_self, _self.^returnInformation)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.AcceptEventAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
class orgeclipseuml2umlAcceptEventActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^results.forEach[reinit]
_self.^triggers.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onAcceptEventActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^results.forEach[visitToAddClasses(theSlicer)]
		_self.^triggers.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^results.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onresultSliced(_self, _elt)
		]
		_self.^triggers.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.ontriggerSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Action), with=#[typeof(orgeclipseuml2umlExecutableNodeAspect)])
abstract class orgeclipseuml2umlActionAspect extends orgeclipseuml2umlExecutableNodeAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^localPostconditions.forEach[reinit]
_self.^localPreconditions.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^localPostconditions.forEach[visitToAddClasses(theSlicer)]
		_self.^localPreconditions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^localPostconditions.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onlocalPostconditionSliced(_self, _elt)
		]
		_self.^localPreconditions.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onlocalPreconditionSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ActionExecutionSpecification), with=#[typeof(orgeclipseuml2umlExecutionSpecificationAspect)])
class orgeclipseuml2umlActionExecutionSpecificationAspect extends orgeclipseuml2umlExecutionSpecificationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onActionExecutionSpecificationSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ActionInputPin), with=#[typeof(orgeclipseuml2umlInputPinAspect)])
class orgeclipseuml2umlActionInputPinAspect extends orgeclipseuml2umlInputPinAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^fromAction?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onActionInputPinSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^fromAction?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^fromAction!==null){
		_self.^fromAction.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^fromAction.sliced) 		theSlicer.onfromActionSliced(_self, _self.^fromAction)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Activity), with=#[typeof(orgeclipseuml2umlBehaviorAspect)])
class orgeclipseuml2umlActivityAspect extends orgeclipseuml2umlBehaviorAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^groups.forEach[reinit]
_self.^edges.forEach[reinit]
_self.^variables.forEach[reinit]
_self.^nodes.forEach[reinit]
_self.^structuredNodes.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onActivitySliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^edges.forEach[visitToAddClasses(theSlicer)]
		_self.^groups.forEach[visitToAddClasses(theSlicer)]
		_self.^nodes.forEach[visitToAddClasses(theSlicer)]
		_self.^structuredNodes.forEach[visitToAddClasses(theSlicer)]
		_self.^variables.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^edges.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onedgeSliced(_self, _elt)
		]
		_self.^groups.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedGroupSliced(_self, _elt)
		]
		_self.^nodes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedNodeSliced(_self, _elt)
		]
		_self.^structuredNodes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onstructuredNodeSliced(_self, _elt)
		]
		_self.^variables.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onvariableSliced(_self, _elt)
		]

	}
}


//FIXME
//@Aspect(className=typeof(org.eclipse.uml2.uml.ActivityContent), with=#[typeof(__SlicerAspect__)])
//abstract class orgeclipseuml2umlActivityContentAspect extends __SlicerAspect__{
//	@OverrideAspectMethod
//	def void _visitToAddClasses(Umlfootprinter theSlicer){
//		_self.super__visitToAddClasses(theSlicer)

//	}
//	@OverrideAspectMethod
//	def void _visitToAddRelations(Umlfootprinter theSlicer){
//		_self.super__visitToAddRelations(theSlicer)

//	}
//}


@Aspect(className=typeof(org.eclipse.uml2.uml.ActivityEdge), with=#[typeof(orgeclipseuml2umlRedefinableElementAspect)])
abstract class orgeclipseuml2umlActivityEdgeAspect extends orgeclipseuml2umlRedefinableElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^guard?.reinit
_self.^weight?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onActivityEdgeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^guard?.visitToAddClasses(theSlicer)
		_self.^weight?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^guard!==null){
		_self.^guard.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^guard.sliced) 		theSlicer.onguardSliced(_self, _self.^guard)
		}
		if(_self.^weight!==null){
		_self.^weight.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^weight.sliced) 		theSlicer.onweightSliced(_self, _self.^weight)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ActivityFinalNode), with=#[typeof(orgeclipseuml2umlFinalNodeAspect)])
class orgeclipseuml2umlActivityFinalNodeAspect extends orgeclipseuml2umlFinalNodeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onActivityFinalNodeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ActivityGroup), with=#[typeof(orgeclipseuml2umlElementAspect)])//, typeof(orgeclipseuml2umlActivityContentAspect)
abstract class orgeclipseuml2umlActivityGroupAspect extends orgeclipseuml2umlElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onActivityGroupSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
//		_self.super_ActivityContent__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
//		_self.super_ActivityContent__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ActivityNode), with=#[typeof(orgeclipseuml2umlRedefinableElementAspect)])//, typeof(orgeclipseuml2umlActivityContentAspect)
abstract class orgeclipseuml2umlActivityNodeAspect extends orgeclipseuml2umlRedefinableElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onActivityNodeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
//		_self.super_ActivityContent__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
//		_self.super_ActivityContent__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ActivityParameterNode), with=#[typeof(orgeclipseuml2umlObjectNodeAspect)])
class orgeclipseuml2umlActivityParameterNodeAspect extends orgeclipseuml2umlObjectNodeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onActivityParameterNodeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ActivityPartition), with=#[typeof(orgeclipseuml2umlActivityGroupAspect)])
class orgeclipseuml2umlActivityPartitionAspect extends orgeclipseuml2umlActivityGroupAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^subpartitions.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onActivityPartitionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^subpartitions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^subpartitions.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onsubpartitionSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Actor), with=#[typeof(orgeclipseuml2umlBehavioredClassifierAspect)])
class orgeclipseuml2umlActorAspect extends orgeclipseuml2umlBehavioredClassifierAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onActorSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.AddStructuralFeatureValueAction), with=#[typeof(orgeclipseuml2umlWriteStructuralFeatureActionAspect)])
class orgeclipseuml2umlAddStructuralFeatureValueActionAspect extends orgeclipseuml2umlWriteStructuralFeatureActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^insertAt?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onAddStructuralFeatureValueActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^insertAt?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^insertAt!==null){
		_self.^insertAt.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^insertAt.sliced) 		theSlicer.oninsertAtSliced(_self, _self.^insertAt)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.AddVariableValueAction), with=#[typeof(orgeclipseuml2umlWriteVariableActionAspect)])
class orgeclipseuml2umlAddVariableValueActionAspect extends orgeclipseuml2umlWriteVariableActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^insertAt?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onAddVariableValueActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^insertAt?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^insertAt!==null){
		_self.^insertAt.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^insertAt.sliced) 		theSlicer.oninsertAtSliced(_self, _self.^insertAt)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.AnyReceiveEvent), with=#[typeof(orgeclipseuml2umlMessageEventAspect)])
class orgeclipseuml2umlAnyReceiveEventAspect extends orgeclipseuml2umlMessageEventAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onAnyReceiveEventSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Artifact), with=#[typeof(orgeclipseuml2umlClassifierAspect), typeof(orgeclipseuml2umlDeployedArtifactAspect)])
class orgeclipseuml2umlArtifactAspect extends orgeclipseuml2umlClassifierAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_Classifier_reinit
//		_self.super_DeployedArtifact_reinit
_self.^manifestations.forEach[reinit]
_self.^nestedArtifacts.forEach[reinit]
_self.^ownedAttributes.forEach[reinit]
_self.^ownedOperations.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onArtifactSliced(_self)
		_self.super_Classifier__visitToAddClasses(theSlicer)
		_self.super_DeployedArtifact__visitToAddClasses(theSlicer)
		_self.^manifestations.forEach[visitToAddClasses(theSlicer)]
		_self.^nestedArtifacts.forEach[visitToAddClasses(theSlicer)]
		_self.^ownedAttributes.forEach[visitToAddClasses(theSlicer)]
		_self.^ownedOperations.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_Classifier__visitToAddRelations(theSlicer)
		_self.super_DeployedArtifact__visitToAddRelations(theSlicer)
		_self.^manifestations.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onmanifestationSliced(_self, _elt)
		]
		_self.^nestedArtifacts.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onnestedArtifactSliced(_self, _elt)
		]
		_self.^ownedAttributes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedAttributeSliced(_self, _elt)
		]
		_self.^ownedOperations.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedOperationSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Association), with=#[typeof(orgeclipseuml2umlClassifierAspect), typeof(orgeclipseuml2umlRelationshipAspect)])
class orgeclipseuml2umlAssociationAspect extends orgeclipseuml2umlClassifierAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_Classifier_reinit
//		_self.super_Relationship_reinit
_self.^ownedEnds.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onAssociationSliced(_self)
		_self.super_Classifier__visitToAddClasses(theSlicer)
		_self.super_Relationship__visitToAddClasses(theSlicer)
		_self.^ownedEnds.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_Classifier__visitToAddRelations(theSlicer)
		_self.super_Relationship__visitToAddRelations(theSlicer)
		_self.^ownedEnds.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedEndSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.AssociationClass), with=#[typeof(orgeclipseuml2umlClassAspect), typeof(orgeclipseuml2umlAssociationAspect)])
class orgeclipseuml2umlAssociationClassAspect extends orgeclipseuml2umlClassAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onAssociationClassSliced(_self)
		_self.super_Class__visitToAddClasses(theSlicer)
		_self.super_Association__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_Class__visitToAddRelations(theSlicer)
		_self.super_Association__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.BehavioralFeature), with=#[typeof(orgeclipseuml2umlNamespaceAspect), typeof(orgeclipseuml2umlFeatureAspect)])
abstract class orgeclipseuml2umlBehavioralFeatureAspect extends orgeclipseuml2umlNamespaceAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_Namespace_reinit
		_self.super_Feature_reinit
_self.^ownedParameters.forEach[reinit]
_self.^ownedParameterSets.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onBehavioralFeatureSliced(_self)
		_self.super_Namespace__visitToAddClasses(theSlicer)
		_self.super_Feature__visitToAddClasses(theSlicer)
		_self.^ownedParameters.forEach[visitToAddClasses(theSlicer)]
		_self.^ownedParameterSets.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_Namespace__visitToAddRelations(theSlicer)
		_self.super_Feature__visitToAddRelations(theSlicer)
		_self.^ownedParameters.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedParameterSliced(_self, _elt)
		]
		_self.^ownedParameterSets.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedParameterSetSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Behavior), with=#[typeof(orgeclipseuml2umlClassAspect)])
abstract class orgeclipseuml2umlBehaviorAspect extends orgeclipseuml2umlClassAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^ownedParameters.forEach[reinit]
_self.^ownedParameterSets.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onBehaviorSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^ownedParameters.forEach[visitToAddClasses(theSlicer)]
		_self.^ownedParameterSets.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^ownedParameters.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedParameterSliced(_self, _elt)
		]
		_self.^ownedParameterSets.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedParameterSetSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.BehavioredClassifier), with=#[typeof(orgeclipseuml2umlClassifierAspect)])
abstract class orgeclipseuml2umlBehavioredClassifierAspect extends orgeclipseuml2umlClassifierAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^interfaceRealizations.forEach[reinit]
_self.^ownedBehaviors.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onBehavioredClassifierSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^interfaceRealizations.forEach[visitToAddClasses(theSlicer)]
		_self.^ownedBehaviors.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^interfaceRealizations.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.oninterfaceRealizationSliced(_self, _elt)
		]
		_self.^ownedBehaviors.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedBehaviorSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.BehaviorExecutionSpecification), with=#[typeof(orgeclipseuml2umlExecutionSpecificationAspect)])
class orgeclipseuml2umlBehaviorExecutionSpecificationAspect extends orgeclipseuml2umlExecutionSpecificationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onBehaviorExecutionSpecificationSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.BroadcastSignalAction), with=#[typeof(orgeclipseuml2umlInvocationActionAspect)])
class orgeclipseuml2umlBroadcastSignalActionAspect extends orgeclipseuml2umlInvocationActionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onBroadcastSignalActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.CallAction), with=#[typeof(orgeclipseuml2umlInvocationActionAspect)])
abstract class orgeclipseuml2umlCallActionAspect extends orgeclipseuml2umlInvocationActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^results.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onCallActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^results.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^results.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onresultSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.CallBehaviorAction), with=#[typeof(orgeclipseuml2umlCallActionAspect)])
class orgeclipseuml2umlCallBehaviorActionAspect extends orgeclipseuml2umlCallActionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onCallBehaviorActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.CallEvent), with=#[typeof(orgeclipseuml2umlMessageEventAspect)])
class orgeclipseuml2umlCallEventAspect extends orgeclipseuml2umlMessageEventAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onCallEventSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.CallOperationAction), with=#[typeof(orgeclipseuml2umlCallActionAspect)])
class orgeclipseuml2umlCallOperationActionAspect extends orgeclipseuml2umlCallActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^target?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onCallOperationActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^target?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^target!==null){
		_self.^target.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^target.sliced) 		theSlicer.ontargetSliced(_self, _self.^target)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.CentralBufferNode), with=#[typeof(orgeclipseuml2umlObjectNodeAspect)])
class orgeclipseuml2umlCentralBufferNodeAspect extends orgeclipseuml2umlObjectNodeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onCentralBufferNodeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ChangeEvent), with=#[typeof(orgeclipseuml2umlEventAspect)])
class orgeclipseuml2umlChangeEventAspect extends orgeclipseuml2umlEventAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^changeExpression?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onChangeEventSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^changeExpression?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^changeExpression!==null){
		_self.^changeExpression.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^changeExpression.sliced) 		theSlicer.onchangeExpressionSliced(_self, _self.^changeExpression)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Class), with=#[typeof(orgeclipseuml2umlEncapsulatedClassifierAspect), typeof(orgeclipseuml2umlBehavioredClassifierAspect)])
class orgeclipseuml2umlClassAspect extends orgeclipseuml2umlEncapsulatedClassifierAspect{
	@OverrideAspectMethod
	def void reinit(){
//		_self.super_EncapsulatedClassifier_reinit
		_self.super_BehavioredClassifier_reinit
_self.^ownedOperations.forEach[reinit]
_self.^nestedClassifiers.forEach[reinit]
_self.^ownedReceptions.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onClassSliced(_self)
		_self.super_EncapsulatedClassifier__visitToAddClasses(theSlicer)
		_self.super_BehavioredClassifier__visitToAddClasses(theSlicer)
		_self.^nestedClassifiers.forEach[visitToAddClasses(theSlicer)]
		_self.^ownedOperations.forEach[visitToAddClasses(theSlicer)]
		_self.^ownedReceptions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_EncapsulatedClassifier__visitToAddRelations(theSlicer)
		_self.super_BehavioredClassifier__visitToAddRelations(theSlicer)
		_self.^nestedClassifiers.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onnestedClassifierSliced(_self, _elt)
		]
		_self.^ownedOperations.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedOperationSliced(_self, _elt)
		]
		_self.^ownedReceptions.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedReceptionSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Classifier), with=#[typeof(orgeclipseuml2umlNamespaceAspect), typeof(orgeclipseuml2umlRedefinableElementAspect), typeof(orgeclipseuml2umlTypeAspect), typeof(orgeclipseuml2umlTemplateableElementAspect)])
abstract class orgeclipseuml2umlClassifierAspect extends orgeclipseuml2umlNamespaceAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_Namespace_reinit
		_self.super_RedefinableElement_reinit
//		_self.super_Type_reinit
		_self.super_TemplateableElement_reinit
_self.^collaborationUses.forEach[reinit]
_self.^generalizations.forEach[reinit]
_self.^ownedUseCases.forEach[reinit]
_self.^substitutions.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onClassifierSliced(_self)
		_self.super_Namespace__visitToAddClasses(theSlicer)
		_self.super_RedefinableElement__visitToAddClasses(theSlicer)
		_self.super_Type__visitToAddClasses(theSlicer)
		_self.super_TemplateableElement__visitToAddClasses(theSlicer)
		_self.^collaborationUses.forEach[visitToAddClasses(theSlicer)]
		_self.^generalizations.forEach[visitToAddClasses(theSlicer)]
		_self.^ownedUseCases.forEach[visitToAddClasses(theSlicer)]
		_self.^substitutions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_Namespace__visitToAddRelations(theSlicer)
		_self.super_RedefinableElement__visitToAddRelations(theSlicer)
		_self.super_Type__visitToAddRelations(theSlicer)
		_self.super_TemplateableElement__visitToAddRelations(theSlicer)
		_self.^collaborationUses.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.oncollaborationUseSliced(_self, _elt)
		]
		_self.^generalizations.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.ongeneralizationSliced(_self, _elt)
		]
		_self.^ownedUseCases.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedUseCaseSliced(_self, _elt)
		]
		_self.^substitutions.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onsubstitutionSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ClassifierTemplateParameter), with=#[typeof(orgeclipseuml2umlTemplateParameterAspect)])
class orgeclipseuml2umlClassifierTemplateParameterAspect extends orgeclipseuml2umlTemplateParameterAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onClassifierTemplateParameterSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Clause), with=#[typeof(orgeclipseuml2umlElementAspect)])
class orgeclipseuml2umlClauseAspect extends orgeclipseuml2umlElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onClauseSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ClearAssociationAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
class orgeclipseuml2umlClearAssociationActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^object?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onClearAssociationActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^object?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^object!==null){
		_self.^object.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^object.sliced) 		theSlicer.onobjectSliced(_self, _self.^object)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ClearStructuralFeatureAction), with=#[typeof(orgeclipseuml2umlStructuralFeatureActionAspect)])
class orgeclipseuml2umlClearStructuralFeatureActionAspect extends orgeclipseuml2umlStructuralFeatureActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^result?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onClearStructuralFeatureActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^result?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^result!==null){
		_self.^result.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^result.sliced) 		theSlicer.onresultSliced(_self, _self.^result)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ClearVariableAction), with=#[typeof(orgeclipseuml2umlVariableActionAspect)])
class orgeclipseuml2umlClearVariableActionAspect extends orgeclipseuml2umlVariableActionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onClearVariableActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Collaboration), with=#[typeof(orgeclipseuml2umlStructuredClassifierAspect), typeof(orgeclipseuml2umlBehavioredClassifierAspect)])
class orgeclipseuml2umlCollaborationAspect extends orgeclipseuml2umlStructuredClassifierAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onCollaborationSliced(_self)
		_self.super_StructuredClassifier__visitToAddClasses(theSlicer)
		_self.super_BehavioredClassifier__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_StructuredClassifier__visitToAddRelations(theSlicer)
		_self.super_BehavioredClassifier__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.CollaborationUse), with=#[typeof(orgeclipseuml2umlNamedElementAspect)])
class orgeclipseuml2umlCollaborationUseAspect extends orgeclipseuml2umlNamedElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^roleBindings.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onCollaborationUseSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^roleBindings.forEach[visitToAddClasses(theSlicer)]
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^roleBindings.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onroleBindingSliced(_self, _elt)
		]
	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.CombinedFragment), with=#[typeof(orgeclipseuml2umlInteractionFragmentAspect)])
class orgeclipseuml2umlCombinedFragmentAspect extends orgeclipseuml2umlInteractionFragmentAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^cfragmentGates.forEach[reinit]
_self.^operands.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onCombinedFragmentSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^cfragmentGates.forEach[visitToAddClasses(theSlicer)]
		_self.^operands.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^cfragmentGates.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.oncfragmentGateSliced(_self, _elt)
		]
		_self.^operands.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onoperandSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Comment), with=#[typeof(orgeclipseuml2umlElementAspect)])
class orgeclipseuml2umlCommentAspect extends orgeclipseuml2umlElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onCommentSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.CommunicationPath), with=#[typeof(orgeclipseuml2umlAssociationAspect)])
class orgeclipseuml2umlCommunicationPathAspect extends orgeclipseuml2umlAssociationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onCommunicationPathSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Component), with=#[typeof(orgeclipseuml2umlClassAspect)])
class orgeclipseuml2umlComponentAspect extends orgeclipseuml2umlClassAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^packagedElements.forEach[reinit]
_self.^realizations.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onComponentSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^packagedElements.forEach[visitToAddClasses(theSlicer)]
		_self.^realizations.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^packagedElements.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onpackagedElementSliced(_self, _elt)
		]
		_self.^realizations.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onrealizationSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ComponentRealization), with=#[typeof(orgeclipseuml2umlRealizationAspect)])
class orgeclipseuml2umlComponentRealizationAspect extends orgeclipseuml2umlRealizationAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onComponentRealizationSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ConditionalNode), with=#[typeof(orgeclipseuml2umlStructuredActivityNodeAspect)])
class orgeclipseuml2umlConditionalNodeAspect extends orgeclipseuml2umlStructuredActivityNodeAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^clauses.forEach[reinit]
_self.^results.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onConditionalNodeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^clauses.forEach[visitToAddClasses(theSlicer)]
		_self.^results.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^clauses.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onclauseSliced(_self, _elt)
		]
		_self.^results.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onresultSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ConnectableElement), with=#[typeof(orgeclipseuml2umlTypedElementAspect), typeof(orgeclipseuml2umlParameterableElementAspect)])
abstract class orgeclipseuml2umlConnectableElementAspect extends orgeclipseuml2umlTypedElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_TypedElement_reinit
		_self.super_ParameterableElement_reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onConnectableElementSliced(_self)
		_self.super_TypedElement__visitToAddClasses(theSlicer)
		_self.super_ParameterableElement__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_TypedElement__visitToAddRelations(theSlicer)
		_self.super_ParameterableElement__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ConnectableElementTemplateParameter), with=#[typeof(orgeclipseuml2umlTemplateParameterAspect)])
class orgeclipseuml2umlConnectableElementTemplateParameterAspect extends orgeclipseuml2umlTemplateParameterAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onConnectableElementTemplateParameterSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ConnectionPointReference), with=#[typeof(orgeclipseuml2umlVertexAspect)])
class orgeclipseuml2umlConnectionPointReferenceAspect extends orgeclipseuml2umlVertexAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onConnectionPointReferenceSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Connector), with=#[typeof(orgeclipseuml2umlFeatureAspect)])
class orgeclipseuml2umlConnectorAspect extends orgeclipseuml2umlFeatureAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^ends.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onConnectorSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^ends.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^ends.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onendSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ConnectorEnd), with=#[typeof(orgeclipseuml2umlMultiplicityElementAspect)])
class orgeclipseuml2umlConnectorEndAspect extends orgeclipseuml2umlMultiplicityElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onConnectorEndSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ConsiderIgnoreFragment), with=#[typeof(orgeclipseuml2umlCombinedFragmentAspect)])
class orgeclipseuml2umlConsiderIgnoreFragmentAspect extends orgeclipseuml2umlCombinedFragmentAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onConsiderIgnoreFragmentSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Constraint), with=#[typeof(orgeclipseuml2umlPackageableElementAspect)])
class orgeclipseuml2umlConstraintAspect extends orgeclipseuml2umlPackageableElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^specification?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onConstraintSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^specification?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^specification!==null){
		_self.^specification.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^specification.sliced) 		theSlicer.onspecificationSliced(_self, _self.^specification)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Continuation), with=#[typeof(orgeclipseuml2umlInteractionFragmentAspect)])
class orgeclipseuml2umlContinuationAspect extends orgeclipseuml2umlInteractionFragmentAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onContinuationSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ControlFlow), with=#[typeof(orgeclipseuml2umlActivityEdgeAspect)])
class orgeclipseuml2umlControlFlowAspect extends orgeclipseuml2umlActivityEdgeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onControlFlowSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ControlNode), with=#[typeof(orgeclipseuml2umlActivityNodeAspect)])
abstract class orgeclipseuml2umlControlNodeAspect extends orgeclipseuml2umlActivityNodeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onControlNodeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.CreateLinkAction), with=#[typeof(orgeclipseuml2umlWriteLinkActionAspect)])
class orgeclipseuml2umlCreateLinkActionAspect extends orgeclipseuml2umlWriteLinkActionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onCreateLinkActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.CreateLinkObjectAction), with=#[typeof(orgeclipseuml2umlCreateLinkActionAspect)])
class orgeclipseuml2umlCreateLinkObjectActionAspect extends orgeclipseuml2umlCreateLinkActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^result?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onCreateLinkObjectActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^result?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^result!==null){
		_self.^result.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^result.sliced) 		theSlicer.onresultSliced(_self, _self.^result)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.CreateObjectAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
class orgeclipseuml2umlCreateObjectActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^result?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onCreateObjectActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^result?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^result!==null){
		_self.^result.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^result.sliced) 		theSlicer.onresultSliced(_self, _self.^result)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.DataStoreNode), with=#[typeof(orgeclipseuml2umlCentralBufferNodeAspect)])
class orgeclipseuml2umlDataStoreNodeAspect extends orgeclipseuml2umlCentralBufferNodeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onDataStoreNodeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.DataType), with=#[typeof(orgeclipseuml2umlClassifierAspect)])
class orgeclipseuml2umlDataTypeAspect extends orgeclipseuml2umlClassifierAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^ownedAttributes.forEach[reinit]
_self.^ownedOperations.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onDataTypeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^ownedAttributes.forEach[visitToAddClasses(theSlicer)]
		_self.^ownedOperations.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^ownedAttributes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedAttributeSliced(_self, _elt)
		]
		_self.^ownedOperations.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedOperationSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.DecisionNode), with=#[typeof(orgeclipseuml2umlControlNodeAspect)])
class orgeclipseuml2umlDecisionNodeAspect extends orgeclipseuml2umlControlNodeAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onDecisionNodeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Dependency), with=#[typeof(orgeclipseuml2umlPackageableElementAspect), typeof(orgeclipseuml2umlDirectedRelationshipAspect)])
class orgeclipseuml2umlDependencyAspect extends orgeclipseuml2umlPackageableElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_PackageableElement_reinit
		_self.super_DirectedRelationship_reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onDependencySliced(_self)
		_self.super_PackageableElement__visitToAddClasses(theSlicer)
		_self.super_DirectedRelationship__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_PackageableElement__visitToAddRelations(theSlicer)
		_self.super_DirectedRelationship__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.DeployedArtifact), with=#[typeof(orgeclipseuml2umlNamedElementAspect)])
abstract class orgeclipseuml2umlDeployedArtifactAspect extends orgeclipseuml2umlNamedElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onDeployedArtifactSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Deployment), with=#[typeof(orgeclipseuml2umlDependencyAspect)])
class orgeclipseuml2umlDeploymentAspect extends orgeclipseuml2umlDependencyAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^configurations.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onDeploymentSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^configurations.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^configurations.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onconfigurationSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.DeploymentSpecification), with=#[typeof(orgeclipseuml2umlArtifactAspect)])
class orgeclipseuml2umlDeploymentSpecificationAspect extends orgeclipseuml2umlArtifactAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onDeploymentSpecificationSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.DeploymentTarget), with=#[typeof(orgeclipseuml2umlNamedElementAspect)])
abstract class orgeclipseuml2umlDeploymentTargetAspect extends orgeclipseuml2umlNamedElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^deployments.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onDeploymentTargetSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^deployments.forEach[visitToAddClasses(theSlicer)]
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^deployments.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.ondeploymentSliced(_self, _elt)
		]
	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.DestroyLinkAction), with=#[typeof(orgeclipseuml2umlWriteLinkActionAspect)])
class orgeclipseuml2umlDestroyLinkActionAspect extends orgeclipseuml2umlWriteLinkActionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onDestroyLinkActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.DestroyObjectAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
class orgeclipseuml2umlDestroyObjectActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^target?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onDestroyObjectActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^target?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^target!==null){
		_self.^target.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^target.sliced) 		theSlicer.ontargetSliced(_self, _self.^target)
		}

	}
}


//@Aspect(className=typeof(org.eclipse.uml2.uml.DestructionOccurrenceSpecification), with=#[typeof(orgeclipseuml2umlMessageOccurrenceSpecificationAspect)])
//class orgeclipseuml2umlDestructionOccurrenceSpecificationAspect extends orgeclipseuml2umlMessageOccurrenceSpecificationAspect{
//	@OverrideAspectMethod
//	def void _visitToAddClasses(Umlfootprinter theSlicer){
//		theSlicer.onDestructionOccurrenceSpecificationSliced(_self)
//		_self.super__visitToAddClasses(theSlicer)

//	}
//	@OverrideAspectMethod
//	def void _visitToAddRelations(Umlfootprinter theSlicer){
//		_self.super__visitToAddRelations(theSlicer)

//	}
//}


@Aspect(className=typeof(org.eclipse.uml2.uml.Device), with=#[typeof(orgeclipseuml2umlNodeAspect)])
class orgeclipseuml2umlDeviceAspect extends orgeclipseuml2umlNodeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onDeviceSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.DirectedRelationship), with=#[typeof(orgeclipseuml2umlRelationshipAspect)])
abstract class orgeclipseuml2umlDirectedRelationshipAspect extends orgeclipseuml2umlRelationshipAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onDirectedRelationshipSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Duration), with=#[typeof(orgeclipseuml2umlValueSpecificationAspect)])
class orgeclipseuml2umlDurationAspect extends orgeclipseuml2umlValueSpecificationAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^expr?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onDurationSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^expr?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^expr!==null){
		_self.^expr.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^expr.sliced) 		theSlicer.onexprSliced(_self, _self.^expr)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.DurationConstraint), with=#[typeof(orgeclipseuml2umlIntervalConstraintAspect)])
class orgeclipseuml2umlDurationConstraintAspect extends orgeclipseuml2umlIntervalConstraintAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onDurationConstraintSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.DurationInterval), with=#[typeof(orgeclipseuml2umlIntervalAspect)])
class orgeclipseuml2umlDurationIntervalAspect extends orgeclipseuml2umlIntervalAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onDurationIntervalSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.DurationObservation), with=#[typeof(orgeclipseuml2umlObservationAspect)])
class orgeclipseuml2umlDurationObservationAspect extends orgeclipseuml2umlObservationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onDurationObservationSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Element), with=#[typeof(__SlicerAspect__)])
abstract class orgeclipseuml2umlElementAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^ownedComments.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onElementSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^ownedComments.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^ownedComments.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedCommentSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ElementImport), with=#[typeof(orgeclipseuml2umlDirectedRelationshipAspect)])
class orgeclipseuml2umlElementImportAspect extends orgeclipseuml2umlDirectedRelationshipAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onElementImportSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.EncapsulatedClassifier), with=#[typeof(orgeclipseuml2umlStructuredClassifierAspect)])
abstract class orgeclipseuml2umlEncapsulatedClassifierAspect extends orgeclipseuml2umlStructuredClassifierAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onEncapsulatedClassifierSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Enumeration), with=#[typeof(orgeclipseuml2umlDataTypeAspect)])
class orgeclipseuml2umlEnumerationAspect extends orgeclipseuml2umlDataTypeAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^ownedLiterals.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onEnumerationSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^ownedLiterals.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^ownedLiterals.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedLiteralSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.EnumerationLiteral), with=#[typeof(orgeclipseuml2umlInstanceSpecificationAspect)])
class orgeclipseuml2umlEnumerationLiteralAspect extends orgeclipseuml2umlInstanceSpecificationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onEnumerationLiteralSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Event), with=#[typeof(orgeclipseuml2umlPackageableElementAspect)])
abstract class orgeclipseuml2umlEventAspect extends orgeclipseuml2umlPackageableElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onEventSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ExceptionHandler), with=#[typeof(orgeclipseuml2umlElementAspect)])
class orgeclipseuml2umlExceptionHandlerAspect extends orgeclipseuml2umlElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onExceptionHandlerSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ExecutableNode), with=#[typeof(orgeclipseuml2umlActivityNodeAspect)])
abstract class orgeclipseuml2umlExecutableNodeAspect extends orgeclipseuml2umlActivityNodeAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^handlers.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onExecutableNodeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^handlers.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^handlers.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onhandlerSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ExecutionEnvironment), with=#[typeof(orgeclipseuml2umlNodeAspect)])
class orgeclipseuml2umlExecutionEnvironmentAspect extends orgeclipseuml2umlNodeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onExecutionEnvironmentSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ExecutionOccurrenceSpecification), with=#[typeof(orgeclipseuml2umlOccurrenceSpecificationAspect)])
class orgeclipseuml2umlExecutionOccurrenceSpecificationAspect extends orgeclipseuml2umlOccurrenceSpecificationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onExecutionOccurrenceSpecificationSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ExecutionSpecification), with=#[typeof(orgeclipseuml2umlInteractionFragmentAspect)])
abstract class orgeclipseuml2umlExecutionSpecificationAspect extends orgeclipseuml2umlInteractionFragmentAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onExecutionSpecificationSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ExpansionNode), with=#[typeof(orgeclipseuml2umlObjectNodeAspect)])
class orgeclipseuml2umlExpansionNodeAspect extends orgeclipseuml2umlObjectNodeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onExpansionNodeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ExpansionRegion), with=#[typeof(orgeclipseuml2umlStructuredActivityNodeAspect)])
class orgeclipseuml2umlExpansionRegionAspect extends orgeclipseuml2umlStructuredActivityNodeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onExpansionRegionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Expression), with=#[typeof(orgeclipseuml2umlValueSpecificationAspect)])
class orgeclipseuml2umlExpressionAspect extends orgeclipseuml2umlValueSpecificationAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^operands.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onExpressionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^operands.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^operands.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onoperandSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Extend), with=#[typeof(orgeclipseuml2umlNamedElementAspect), typeof(orgeclipseuml2umlDirectedRelationshipAspect)])
class orgeclipseuml2umlExtendAspect extends orgeclipseuml2umlNamedElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_NamedElement_reinit
//		_self.super_DirectedRelationship_reinit
_self.^condition?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onExtendSliced(_self)
		_self.super_NamedElement__visitToAddClasses(theSlicer)
		_self.super_DirectedRelationship__visitToAddClasses(theSlicer)
		_self.^condition?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_NamedElement__visitToAddRelations(theSlicer)
		_self.super_DirectedRelationship__visitToAddRelations(theSlicer)
		if(_self.^condition!==null){
		_self.^condition.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^condition.sliced) 		theSlicer.onconditionSliced(_self, _self.^condition)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Extension), with=#[typeof(orgeclipseuml2umlAssociationAspect)])
class orgeclipseuml2umlExtensionAspect extends orgeclipseuml2umlAssociationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onExtensionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ExtensionEnd), with=#[typeof(orgeclipseuml2umlPropertyAspect)])
class orgeclipseuml2umlExtensionEndAspect extends orgeclipseuml2umlPropertyAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onExtensionEndSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ExtensionPoint), with=#[typeof(orgeclipseuml2umlRedefinableElementAspect)])
class orgeclipseuml2umlExtensionPointAspect extends orgeclipseuml2umlRedefinableElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onExtensionPointSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Feature), with=#[typeof(orgeclipseuml2umlRedefinableElementAspect)])
abstract class orgeclipseuml2umlFeatureAspect extends orgeclipseuml2umlRedefinableElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onFeatureSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.FinalNode), with=#[typeof(orgeclipseuml2umlControlNodeAspect)])
abstract class orgeclipseuml2umlFinalNodeAspect extends orgeclipseuml2umlControlNodeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onFinalNodeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.FinalState), with=#[typeof(orgeclipseuml2umlStateAspect)])
class orgeclipseuml2umlFinalStateAspect extends orgeclipseuml2umlStateAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onFinalStateSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.FlowFinalNode), with=#[typeof(orgeclipseuml2umlFinalNodeAspect)])
class orgeclipseuml2umlFlowFinalNodeAspect extends orgeclipseuml2umlFinalNodeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onFlowFinalNodeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ForkNode), with=#[typeof(orgeclipseuml2umlControlNodeAspect)])
class orgeclipseuml2umlForkNodeAspect extends orgeclipseuml2umlControlNodeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onForkNodeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.FunctionBehavior), with=#[typeof(orgeclipseuml2umlOpaqueBehaviorAspect)])
class orgeclipseuml2umlFunctionBehaviorAspect extends orgeclipseuml2umlOpaqueBehaviorAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onFunctionBehaviorSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Gate), with=#[typeof(orgeclipseuml2umlMessageEndAspect)])
class orgeclipseuml2umlGateAspect extends orgeclipseuml2umlMessageEndAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onGateSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Generalization), with=#[typeof(orgeclipseuml2umlDirectedRelationshipAspect)])
class orgeclipseuml2umlGeneralizationAspect extends orgeclipseuml2umlDirectedRelationshipAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onGeneralizationSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.GeneralizationSet), with=#[typeof(orgeclipseuml2umlPackageableElementAspect)])
class orgeclipseuml2umlGeneralizationSetAspect extends orgeclipseuml2umlPackageableElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onGeneralizationSetSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.GeneralOrdering), with=#[typeof(orgeclipseuml2umlNamedElementAspect)])
class orgeclipseuml2umlGeneralOrderingAspect extends orgeclipseuml2umlNamedElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onGeneralOrderingSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Image), with=#[typeof(orgeclipseuml2umlElementAspect)])
class orgeclipseuml2umlImageAspect extends orgeclipseuml2umlElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onImageSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Include), with=#[typeof(orgeclipseuml2umlNamedElementAspect), typeof(orgeclipseuml2umlDirectedRelationshipAspect)])
class orgeclipseuml2umlIncludeAspect extends orgeclipseuml2umlNamedElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onIncludeSliced(_self)
		_self.super_NamedElement__visitToAddClasses(theSlicer)
		_self.super_DirectedRelationship__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_NamedElement__visitToAddRelations(theSlicer)
		_self.super_DirectedRelationship__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.InformationFlow), with=#[typeof(orgeclipseuml2umlPackageableElementAspect), typeof(orgeclipseuml2umlDirectedRelationshipAspect)])
class orgeclipseuml2umlInformationFlowAspect extends orgeclipseuml2umlPackageableElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onInformationFlowSliced(_self)
		_self.super_PackageableElement__visitToAddClasses(theSlicer)
		_self.super_DirectedRelationship__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_PackageableElement__visitToAddRelations(theSlicer)
		_self.super_DirectedRelationship__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.InformationItem), with=#[typeof(orgeclipseuml2umlClassifierAspect)])
class orgeclipseuml2umlInformationItemAspect extends orgeclipseuml2umlClassifierAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onInformationItemSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.InitialNode), with=#[typeof(orgeclipseuml2umlControlNodeAspect)])
class orgeclipseuml2umlInitialNodeAspect extends orgeclipseuml2umlControlNodeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onInitialNodeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.InputPin), with=#[typeof(orgeclipseuml2umlPinAspect)])
class orgeclipseuml2umlInputPinAspect extends orgeclipseuml2umlPinAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onInputPinSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.InstanceSpecification), with=#[typeof(orgeclipseuml2umlDeploymentTargetAspect), typeof(orgeclipseuml2umlPackageableElementAspect), typeof(orgeclipseuml2umlDeployedArtifactAspect)])
class orgeclipseuml2umlInstanceSpecificationAspect extends orgeclipseuml2umlDeploymentTargetAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_DeploymentTarget_reinit
		_self.super_PackageableElement_reinit
_self.^slots.forEach[reinit]
_self.^specification?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onInstanceSpecificationSliced(_self)
		_self.super_DeploymentTarget__visitToAddClasses(theSlicer)
		_self.super_PackageableElement__visitToAddClasses(theSlicer)
		_self.super_DeployedArtifact__visitToAddClasses(theSlicer)
		_self.^slots.forEach[visitToAddClasses(theSlicer)]
		_self.^specification?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_DeploymentTarget__visitToAddRelations(theSlicer)
		_self.super_PackageableElement__visitToAddRelations(theSlicer)
		_self.super_DeployedArtifact__visitToAddRelations(theSlicer)
		_self.^slots.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onslotSliced(_self, _elt)
		]
		if(_self.^specification!==null){
		_self.^specification.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^specification.sliced) 		theSlicer.onspecificationSliced(_self, _self.^specification)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.InstanceValue), with=#[typeof(orgeclipseuml2umlValueSpecificationAspect)])
class orgeclipseuml2umlInstanceValueAspect extends orgeclipseuml2umlValueSpecificationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onInstanceValueSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Interaction), with=#[typeof(orgeclipseuml2umlBehaviorAspect), typeof(orgeclipseuml2umlInteractionFragmentAspect)])
class orgeclipseuml2umlInteractionAspect extends orgeclipseuml2umlBehaviorAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_Behavior_reinit
		_self.super_InteractionFragment_reinit
_self.^lifelines.forEach[reinit]
_self.^fragments.forEach[reinit]
_self.^actions.forEach[reinit]
_self.^formalGates.forEach[reinit]
_self.^messages.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onInteractionSliced(_self)
		_self.super_Behavior__visitToAddClasses(theSlicer)
		_self.super_InteractionFragment__visitToAddClasses(theSlicer)
		_self.^actions.forEach[visitToAddClasses(theSlicer)]
		_self.^formalGates.forEach[visitToAddClasses(theSlicer)]
		_self.^fragments.forEach[visitToAddClasses(theSlicer)]
		_self.^lifelines.forEach[visitToAddClasses(theSlicer)]
		_self.^messages.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_Behavior__visitToAddRelations(theSlicer)
		_self.super_InteractionFragment__visitToAddRelations(theSlicer)
		_self.^actions.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onactionSliced(_self, _elt)
		]
		_self.^formalGates.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onformalGateSliced(_self, _elt)
		]
		_self.^fragments.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onfragmentSliced(_self, _elt)
		]
		_self.^lifelines.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onlifelineSliced(_self, _elt)
		]
		_self.^messages.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onmessageSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.InteractionConstraint), with=#[typeof(orgeclipseuml2umlConstraintAspect)])
class orgeclipseuml2umlInteractionConstraintAspect extends orgeclipseuml2umlConstraintAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^maxint?.reinit
_self.^minint?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onInteractionConstraintSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^maxint?.visitToAddClasses(theSlicer)
		_self.^minint?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^maxint!==null){
		_self.^maxint.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^maxint.sliced) 		theSlicer.onmaxintSliced(_self, _self.^maxint)
		}
		if(_self.^minint!==null){
		_self.^minint.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^minint.sliced) 		theSlicer.onminintSliced(_self, _self.^minint)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.InteractionFragment), with=#[typeof(orgeclipseuml2umlNamedElementAspect)])
abstract class orgeclipseuml2umlInteractionFragmentAspect extends orgeclipseuml2umlNamedElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^generalOrderings.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onInteractionFragmentSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^generalOrderings.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^generalOrderings.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.ongeneralOrderingSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.InteractionOperand), with=#[typeof(orgeclipseuml2umlNamespaceAspect), typeof(orgeclipseuml2umlInteractionFragmentAspect)])
class orgeclipseuml2umlInteractionOperandAspect extends orgeclipseuml2umlNamespaceAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_Namespace_reinit
		_self.super_InteractionFragment_reinit
_self.^fragments.forEach[reinit]
_self.^guard?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onInteractionOperandSliced(_self)
		_self.super_Namespace__visitToAddClasses(theSlicer)
		_self.super_InteractionFragment__visitToAddClasses(theSlicer)
		_self.^fragments.forEach[visitToAddClasses(theSlicer)]
		_self.^guard?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_Namespace__visitToAddRelations(theSlicer)
		_self.super_InteractionFragment__visitToAddRelations(theSlicer)
		_self.^fragments.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onfragmentSliced(_self, _elt)
		]
		if(_self.^guard!==null){
		_self.^guard.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^guard.sliced) 		theSlicer.onguardSliced(_self, _self.^guard)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.InteractionUse), with=#[typeof(orgeclipseuml2umlInteractionFragmentAspect)])
class orgeclipseuml2umlInteractionUseAspect extends orgeclipseuml2umlInteractionFragmentAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^actualGates.forEach[reinit]
_self.^arguments.forEach[reinit]
//_self.^returnValue?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onInteractionUseSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^actualGates.forEach[visitToAddClasses(theSlicer)]
		_self.^arguments.forEach[visitToAddClasses(theSlicer)]
//		_self.^returnValue?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^actualGates.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onactualGateSliced(_self, _elt)
		]
		_self.^arguments.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onargumentSliced(_self, _elt)
		]
//		if(_self.^returnValue!==null){
//		_self.^returnValue.visitToAddRelations(theSlicer)

//		if(_self.sliced && _self.^returnValue.sliced) 		theSlicer.onreturnValueSliced(_self, _self.^returnValue)
//		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Interface), with=#[typeof(orgeclipseuml2umlClassifierAspect)])
class orgeclipseuml2umlInterfaceAspect extends orgeclipseuml2umlClassifierAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^nestedClassifiers.forEach[reinit]
_self.^ownedAttributes.forEach[reinit]
_self.^ownedReceptions.forEach[reinit]
_self.^protocol?.reinit
_self.^ownedOperations.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onInterfaceSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^nestedClassifiers.forEach[visitToAddClasses(theSlicer)]
		_self.^ownedAttributes.forEach[visitToAddClasses(theSlicer)]
		_self.^ownedOperations.forEach[visitToAddClasses(theSlicer)]
		_self.^ownedReceptions.forEach[visitToAddClasses(theSlicer)]
		_self.^protocol?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^nestedClassifiers.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onnestedClassifierSliced(_self, _elt)
		]
		_self.^ownedAttributes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedAttributeSliced(_self, _elt)
		]
		_self.^ownedOperations.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedOperationSliced(_self, _elt)
		]
		_self.^ownedReceptions.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedReceptionSliced(_self, _elt)
		]
		if(_self.^protocol!==null){
		_self.^protocol.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^protocol.sliced) 		theSlicer.onprotocolSliced(_self, _self.^protocol)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.InterfaceRealization), with=#[typeof(orgeclipseuml2umlRealizationAspect)])
class orgeclipseuml2umlInterfaceRealizationAspect extends orgeclipseuml2umlRealizationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onInterfaceRealizationSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.InterruptibleActivityRegion), with=#[typeof(orgeclipseuml2umlActivityGroupAspect)])
class orgeclipseuml2umlInterruptibleActivityRegionAspect extends orgeclipseuml2umlActivityGroupAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onInterruptibleActivityRegionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Interval), with=#[typeof(orgeclipseuml2umlValueSpecificationAspect)])
class orgeclipseuml2umlIntervalAspect extends orgeclipseuml2umlValueSpecificationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onIntervalSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.IntervalConstraint), with=#[typeof(orgeclipseuml2umlConstraintAspect)])
class orgeclipseuml2umlIntervalConstraintAspect extends orgeclipseuml2umlConstraintAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onIntervalConstraintSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.InvocationAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
abstract class orgeclipseuml2umlInvocationActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^arguments.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onInvocationActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^arguments.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^arguments.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onargumentSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.JoinNode), with=#[typeof(orgeclipseuml2umlControlNodeAspect)])
class orgeclipseuml2umlJoinNodeAspect extends orgeclipseuml2umlControlNodeAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^joinSpec?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onJoinNodeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^joinSpec?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^joinSpec!==null){
		_self.^joinSpec.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^joinSpec.sliced) 		theSlicer.onjoinSpecSliced(_self, _self.^joinSpec)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Lifeline), with=#[typeof(orgeclipseuml2umlNamedElementAspect)])
class orgeclipseuml2umlLifelineAspect extends orgeclipseuml2umlNamedElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^selector?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onLifelineSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^selector?.visitToAddClasses(theSlicer)
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^selector!==null){
		_self.^selector.visitToAddRelations(theSlicer)
		if(_self.sliced && _self.^selector.sliced) 		theSlicer.onselectorSliced(_self, _self.^selector)
		}
	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.LinkAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
abstract class orgeclipseuml2umlLinkActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^endData.forEach[reinit]
_self.^inputValues.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onLinkActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^endData.forEach[visitToAddClasses(theSlicer)]
		_self.^inputValues.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^endData.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onendDataSliced(_self, _elt)
		]
		_self.^inputValues.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.oninputValueSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.LinkEndCreationData), with=#[typeof(orgeclipseuml2umlLinkEndDataAspect)])
class orgeclipseuml2umlLinkEndCreationDataAspect extends orgeclipseuml2umlLinkEndDataAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onLinkEndCreationDataSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.LinkEndData), with=#[typeof(orgeclipseuml2umlElementAspect)])
class orgeclipseuml2umlLinkEndDataAspect extends orgeclipseuml2umlElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^qualifiers.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onLinkEndDataSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^qualifiers.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^qualifiers.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onqualifierSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.LinkEndDestructionData), with=#[typeof(orgeclipseuml2umlLinkEndDataAspect)])
class orgeclipseuml2umlLinkEndDestructionDataAspect extends orgeclipseuml2umlLinkEndDataAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onLinkEndDestructionDataSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.LiteralBoolean), with=#[typeof(orgeclipseuml2umlLiteralSpecificationAspect)])
class orgeclipseuml2umlLiteralBooleanAspect extends orgeclipseuml2umlLiteralSpecificationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onLiteralBooleanSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.LiteralInteger), with=#[typeof(orgeclipseuml2umlLiteralSpecificationAspect)])
class orgeclipseuml2umlLiteralIntegerAspect extends orgeclipseuml2umlLiteralSpecificationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onLiteralIntegerSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.LiteralNull), with=#[typeof(orgeclipseuml2umlLiteralSpecificationAspect)])
class orgeclipseuml2umlLiteralNullAspect extends orgeclipseuml2umlLiteralSpecificationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onLiteralNullSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


//FIXME
//@Aspect(className=typeof(org.eclipse.uml2.uml.LiteralReal), with=#[typeof(orgeclipseuml2umlLiteralSpecificationAspect)])
//class orgeclipseuml2umlLiteralRealAspect extends orgeclipseuml2umlLiteralSpecificationAspect{
//	@OverrideAspectMethod
//	def void _visitToAddClasses(Umlfootprinter theSlicer){
//		theSlicer.onLiteralRealSliced(_self)
//		_self.super__visitToAddClasses(theSlicer)

//	}
//	@OverrideAspectMethod
//	def void _visitToAddRelations(Umlfootprinter theSlicer){
//		_self.super__visitToAddRelations(theSlicer)

//	}
//}


@Aspect(className=typeof(org.eclipse.uml2.uml.LiteralSpecification), with=#[typeof(orgeclipseuml2umlValueSpecificationAspect)])
abstract class orgeclipseuml2umlLiteralSpecificationAspect extends orgeclipseuml2umlValueSpecificationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onLiteralSpecificationSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.LiteralString), with=#[typeof(orgeclipseuml2umlLiteralSpecificationAspect)])
class orgeclipseuml2umlLiteralStringAspect extends orgeclipseuml2umlLiteralSpecificationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onLiteralStringSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.LiteralUnlimitedNatural), with=#[typeof(orgeclipseuml2umlLiteralSpecificationAspect)])
class orgeclipseuml2umlLiteralUnlimitedNaturalAspect extends orgeclipseuml2umlLiteralSpecificationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onLiteralUnlimitedNaturalSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.LoopNode), with=#[typeof(orgeclipseuml2umlStructuredActivityNodeAspect)])
class orgeclipseuml2umlLoopNodeAspect extends orgeclipseuml2umlStructuredActivityNodeAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^loopVariables.forEach[reinit]
_self.^loopVariableInputs.forEach[reinit]
_self.^results.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onLoopNodeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^loopVariableInputs.forEach[visitToAddClasses(theSlicer)]
		_self.^results.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^loopVariableInputs.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onloopVariableInputSliced(_self, _elt)
		]
		_self.^results.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onresultSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Manifestation), with=#[typeof(orgeclipseuml2umlAbstractionAspect)])
class orgeclipseuml2umlManifestationAspect extends orgeclipseuml2umlAbstractionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onManifestationSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.MergeNode), with=#[typeof(orgeclipseuml2umlControlNodeAspect)])
class orgeclipseuml2umlMergeNodeAspect extends orgeclipseuml2umlControlNodeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onMergeNodeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Message), with=#[typeof(orgeclipseuml2umlNamedElementAspect)])
class orgeclipseuml2umlMessageAspect extends orgeclipseuml2umlNamedElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^arguments.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onMessageSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^arguments.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^arguments.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onargumentSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.MessageEnd), with=#[typeof(orgeclipseuml2umlNamedElementAspect)])
abstract class orgeclipseuml2umlMessageEndAspect extends orgeclipseuml2umlNamedElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onMessageEndSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.MessageEvent), with=#[typeof(orgeclipseuml2umlEventAspect)])
abstract class orgeclipseuml2umlMessageEventAspect extends orgeclipseuml2umlEventAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onMessageEventSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.MessageOccurrenceSpecification), with=#[typeof(orgeclipseuml2umlOccurrenceSpecificationAspect), typeof(orgeclipseuml2umlMessageEndAspect)])
class orgeclipseuml2umlMessageOccurrenceSpecificationAspect extends orgeclipseuml2umlOccurrenceSpecificationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onMessageOccurrenceSpecificationSliced(_self)
		_self.super_OccurrenceSpecification__visitToAddClasses(theSlicer)
		_self.super_MessageEnd__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_OccurrenceSpecification__visitToAddRelations(theSlicer)
		_self.super_MessageEnd__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Model), with=#[typeof(orgeclipseuml2umlPackageAspect)])
class orgeclipseuml2umlModelAspect extends orgeclipseuml2umlPackageAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onModelSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.MultiplicityElement), with=#[typeof(orgeclipseuml2umlElementAspect)])
abstract class orgeclipseuml2umlMultiplicityElementAspect extends orgeclipseuml2umlElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^lowerValue?.reinit
_self.^upperValue?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onMultiplicityElementSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^lowerValue?.visitToAddClasses(theSlicer)
		_self.^upperValue?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^lowerValue!==null){
		_self.^lowerValue.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^lowerValue.sliced) 		theSlicer.onlowerValueSliced(_self, _self.^lowerValue)
		}
		if(_self.^upperValue!==null){
		_self.^upperValue.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^upperValue.sliced) 		theSlicer.onupperValueSliced(_self, _self.^upperValue)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.NamedElement), with=#[typeof(orgeclipseuml2umlElementAspect)])
abstract class orgeclipseuml2umlNamedElementAspect extends orgeclipseuml2umlElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^nameExpression?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onNamedElementSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^nameExpression?.visitToAddClasses(theSlicer)
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^nameExpression!==null){
		_self.^nameExpression.visitToAddRelations(theSlicer)
		if(_self.sliced && _self.^nameExpression.sliced) 		theSlicer.onnameExpressionSliced(_self, _self.^nameExpression)
		}
	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Namespace), with=#[typeof(orgeclipseuml2umlNamedElementAspect)])
abstract class orgeclipseuml2umlNamespaceAspect extends orgeclipseuml2umlNamedElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^ownedRules.forEach[reinit]
_self.^elementImports.forEach[reinit]
_self.^packageImports.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onNamespaceSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^elementImports.forEach[visitToAddClasses(theSlicer)]
		_self.^ownedRules.forEach[visitToAddClasses(theSlicer)]
		_self.^packageImports.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^elementImports.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onelementImportSliced(_self, _elt)
		]
		_self.^ownedRules.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedRuleSliced(_self, _elt)
		]
		_self.^packageImports.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onpackageImportSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Node), with=#[typeof(orgeclipseuml2umlClassAspect), typeof(orgeclipseuml2umlDeploymentTargetAspect)])
class orgeclipseuml2umlNodeAspect extends orgeclipseuml2umlClassAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_Class_reinit
		_self.super_DeploymentTarget_reinit
_self.^nestedNodes.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onNodeSliced(_self)
		_self.super_Class__visitToAddClasses(theSlicer)
		_self.super_DeploymentTarget__visitToAddClasses(theSlicer)
		_self.^nestedNodes.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_Class__visitToAddRelations(theSlicer)
		_self.super_DeploymentTarget__visitToAddRelations(theSlicer)
		_self.^nestedNodes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onnestedNodeSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ObjectFlow), with=#[typeof(orgeclipseuml2umlActivityEdgeAspect)])
class orgeclipseuml2umlObjectFlowAspect extends orgeclipseuml2umlActivityEdgeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onObjectFlowSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ObjectNode), with=#[typeof(orgeclipseuml2umlActivityNodeAspect), typeof(orgeclipseuml2umlTypedElementAspect)])
abstract class orgeclipseuml2umlObjectNodeAspect extends orgeclipseuml2umlActivityNodeAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_ActivityNode_reinit
		_self.super_TypedElement_reinit
_self.^upperBound?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onObjectNodeSliced(_self)
		_self.super_ActivityNode__visitToAddClasses(theSlicer)
		_self.super_TypedElement__visitToAddClasses(theSlicer)
		_self.^upperBound?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_ActivityNode__visitToAddRelations(theSlicer)
		_self.super_TypedElement__visitToAddRelations(theSlicer)
		if(_self.^upperBound!==null){
		_self.^upperBound.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^upperBound.sliced) 		theSlicer.onupperBoundSliced(_self, _self.^upperBound)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Observation), with=#[typeof(orgeclipseuml2umlPackageableElementAspect)])
abstract class orgeclipseuml2umlObservationAspect extends orgeclipseuml2umlPackageableElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onObservationSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.OccurrenceSpecification), with=#[typeof(orgeclipseuml2umlInteractionFragmentAspect)])
class orgeclipseuml2umlOccurrenceSpecificationAspect extends orgeclipseuml2umlInteractionFragmentAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onOccurrenceSpecificationSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.OpaqueAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
class orgeclipseuml2umlOpaqueActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^inputValues.forEach[reinit]
_self.^outputValues.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onOpaqueActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^inputValues.forEach[visitToAddClasses(theSlicer)]
		_self.^outputValues.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^inputValues.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.oninputValueSliced(_self, _elt)
		]
		_self.^outputValues.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onoutputValueSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.OpaqueBehavior), with=#[typeof(orgeclipseuml2umlBehaviorAspect)])
class orgeclipseuml2umlOpaqueBehaviorAspect extends orgeclipseuml2umlBehaviorAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onOpaqueBehaviorSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.OpaqueExpression), with=#[typeof(orgeclipseuml2umlValueSpecificationAspect)])
class orgeclipseuml2umlOpaqueExpressionAspect extends orgeclipseuml2umlValueSpecificationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onOpaqueExpressionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Operation), with=#[typeof(orgeclipseuml2umlBehavioralFeatureAspect), typeof(orgeclipseuml2umlParameterableElementAspect), typeof(orgeclipseuml2umlTemplateableElementAspect)])
class orgeclipseuml2umlOperationAspect extends orgeclipseuml2umlBehavioralFeatureAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onOperationSliced(_self)
		_self.super_BehavioralFeature__visitToAddClasses(theSlicer)
		_self.super_ParameterableElement__visitToAddClasses(theSlicer)
		_self.super_TemplateableElement__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_BehavioralFeature__visitToAddRelations(theSlicer)
		_self.super_ParameterableElement__visitToAddRelations(theSlicer)
		_self.super_TemplateableElement__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.OperationTemplateParameter), with=#[typeof(orgeclipseuml2umlTemplateParameterAspect)])
class orgeclipseuml2umlOperationTemplateParameterAspect extends orgeclipseuml2umlTemplateParameterAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onOperationTemplateParameterSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.OutputPin), with=#[typeof(orgeclipseuml2umlPinAspect)])
class orgeclipseuml2umlOutputPinAspect extends orgeclipseuml2umlPinAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onOutputPinSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.PackageableElement), with=#[typeof(orgeclipseuml2umlNamedElementAspect), typeof(orgeclipseuml2umlParameterableElementAspect)])
abstract class orgeclipseuml2umlPackageableElementAspect extends orgeclipseuml2umlNamedElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_NamedElement_reinit
		_self.super_ParameterableElement_reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onPackageableElementSliced(_self)
		_self.super_NamedElement__visitToAddClasses(theSlicer)
		_self.super_ParameterableElement__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_NamedElement__visitToAddRelations(theSlicer)
		_self.super_ParameterableElement__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Package), with=#[typeof(orgeclipseuml2umlNamespaceAspect), typeof(orgeclipseuml2umlPackageableElementAspect), typeof(orgeclipseuml2umlTemplateableElementAspect)])
class orgeclipseuml2umlPackageAspect extends orgeclipseuml2umlNamespaceAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_Namespace_reinit
		_self.super_PackageableElement_reinit
		_self.super_TemplateableElement_reinit
//		_self.super_Package_reinit
_self.^packageMerges.forEach[reinit]
_self.^packagedElements.forEach[reinit]
_self.^profileApplications.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onPackageSliced(_self)
		_self.super_Namespace__visitToAddClasses(theSlicer)
		_self.super_PackageableElement__visitToAddClasses(theSlicer)
		_self.super_TemplateableElement__visitToAddClasses(theSlicer)
		_self.^packageMerges.forEach[visitToAddClasses(theSlicer)]
		_self.^packagedElements.forEach[visitToAddClasses(theSlicer)]
		_self.^profileApplications.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_Namespace__visitToAddRelations(theSlicer)
		_self.super_PackageableElement__visitToAddRelations(theSlicer)
		_self.super_TemplateableElement__visitToAddRelations(theSlicer)
		_self.^packageMerges.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onpackageMergeSliced(_self, _elt)
		]
		_self.^packagedElements.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onpackagedElementSliced(_self, _elt)
		]
		_self.^profileApplications.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onprofileApplicationSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.PackageImport), with=#[typeof(orgeclipseuml2umlDirectedRelationshipAspect)])
class orgeclipseuml2umlPackageImportAspect extends orgeclipseuml2umlDirectedRelationshipAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onPackageImportSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.PackageMerge), with=#[typeof(orgeclipseuml2umlDirectedRelationshipAspect)])
class orgeclipseuml2umlPackageMergeAspect extends orgeclipseuml2umlDirectedRelationshipAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onPackageMergeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ParameterableElement), with=#[typeof(orgeclipseuml2umlElementAspect)])
abstract class orgeclipseuml2umlParameterableElementAspect extends orgeclipseuml2umlElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onParameterableElementSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Parameter), with=#[typeof(orgeclipseuml2umlConnectableElementAspect), typeof(orgeclipseuml2umlMultiplicityElementAspect)])
class orgeclipseuml2umlParameterAspect extends orgeclipseuml2umlConnectableElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_ConnectableElement_reinit
		_self.super_MultiplicityElement_reinit
_self.^defaultValue?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onParameterSliced(_self)
		_self.super_ConnectableElement__visitToAddClasses(theSlicer)
		_self.super_MultiplicityElement__visitToAddClasses(theSlicer)
		_self.^defaultValue?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_ConnectableElement__visitToAddRelations(theSlicer)
		_self.super_MultiplicityElement__visitToAddRelations(theSlicer)
		if(_self.^defaultValue!==null){
		_self.^defaultValue.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^defaultValue.sliced) 		theSlicer.ondefaultValueSliced(_self, _self.^defaultValue)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ParameterSet), with=#[typeof(orgeclipseuml2umlNamedElementAspect)])
class orgeclipseuml2umlParameterSetAspect extends orgeclipseuml2umlNamedElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^conditions.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onParameterSetSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^conditions.forEach[visitToAddClasses(theSlicer)]
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^conditions.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onconditionSliced(_self, _elt)
		]
	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.PartDecomposition), with=#[typeof(orgeclipseuml2umlInteractionUseAspect)])
class orgeclipseuml2umlPartDecompositionAspect extends orgeclipseuml2umlInteractionUseAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onPartDecompositionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Pin), with=#[typeof(orgeclipseuml2umlObjectNodeAspect), typeof(orgeclipseuml2umlMultiplicityElementAspect)])
abstract class orgeclipseuml2umlPinAspect extends orgeclipseuml2umlObjectNodeAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_ObjectNode_reinit
		_self.super_MultiplicityElement_reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onPinSliced(_self)
		_self.super_ObjectNode__visitToAddClasses(theSlicer)
		_self.super_MultiplicityElement__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_ObjectNode__visitToAddRelations(theSlicer)
		_self.super_MultiplicityElement__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Port), with=#[typeof(orgeclipseuml2umlPropertyAspect)])
class orgeclipseuml2umlPortAspect extends orgeclipseuml2umlPropertyAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onPortSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.PrimitiveType), with=#[typeof(orgeclipseuml2umlDataTypeAspect)])
class orgeclipseuml2umlPrimitiveTypeAspect extends orgeclipseuml2umlDataTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onPrimitiveTypeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ProfileApplication), with=#[typeof(orgeclipseuml2umlDirectedRelationshipAspect)])
class orgeclipseuml2umlProfileApplicationAspect extends orgeclipseuml2umlDirectedRelationshipAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onProfileApplicationSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Profile), with=#[typeof(orgeclipseuml2umlPackageAspect)])
class orgeclipseuml2umlProfileAspect extends orgeclipseuml2umlPackageAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onProfileSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Property), with=#[typeof(orgeclipseuml2umlStructuralFeatureAspect), typeof(orgeclipseuml2umlConnectableElementAspect), typeof(orgeclipseuml2umlDeploymentTargetAspect)])
class orgeclipseuml2umlPropertyAspect extends orgeclipseuml2umlStructuralFeatureAspect{
	@OverrideAspectMethod
	def void reinit(){
//		_self.super_StructuralFeature_reinit
		_self.super_ConnectableElement_reinit
		_self.super_DeploymentTarget_reinit
_self.^qualifiers.forEach[reinit]
_self.^defaultValue?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onPropertySliced(_self)
		_self.super_StructuralFeature__visitToAddClasses(theSlicer)
		_self.super_ConnectableElement__visitToAddClasses(theSlicer)
		_self.super_DeploymentTarget__visitToAddClasses(theSlicer)
		_self.^defaultValue?.visitToAddClasses(theSlicer)
		_self.^qualifiers.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_StructuralFeature__visitToAddRelations(theSlicer)
		_self.super_ConnectableElement__visitToAddRelations(theSlicer)
		_self.super_DeploymentTarget__visitToAddRelations(theSlicer)
		if(_self.^defaultValue!==null){
		_self.^defaultValue.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^defaultValue.sliced) 		theSlicer.ondefaultValueSliced(_self, _self.^defaultValue)
		}
		_self.^qualifiers.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onqualifierSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ProtocolConformance), with=#[typeof(orgeclipseuml2umlDirectedRelationshipAspect)])
class orgeclipseuml2umlProtocolConformanceAspect extends orgeclipseuml2umlDirectedRelationshipAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onProtocolConformanceSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ProtocolStateMachine), with=#[typeof(orgeclipseuml2umlStateMachineAspect)])
class orgeclipseuml2umlProtocolStateMachineAspect extends orgeclipseuml2umlStateMachineAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^conformances.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onProtocolStateMachineSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^conformances.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^conformances.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onconformanceSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ProtocolTransition), with=#[typeof(orgeclipseuml2umlTransitionAspect)])
class orgeclipseuml2umlProtocolTransitionAspect extends orgeclipseuml2umlTransitionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onProtocolTransitionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Pseudostate), with=#[typeof(orgeclipseuml2umlVertexAspect)])
class orgeclipseuml2umlPseudostateAspect extends orgeclipseuml2umlVertexAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onPseudostateSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.QualifierValue), with=#[typeof(orgeclipseuml2umlElementAspect)])
class orgeclipseuml2umlQualifierValueAspect extends orgeclipseuml2umlElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onQualifierValueSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.RaiseExceptionAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
class orgeclipseuml2umlRaiseExceptionActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^exception?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onRaiseExceptionActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^exception?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^exception!==null){
		_self.^exception.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^exception.sliced) 		theSlicer.onexceptionSliced(_self, _self.^exception)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ReadExtentAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
class orgeclipseuml2umlReadExtentActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^result?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onReadExtentActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^result?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^result!==null){
		_self.^result.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^result.sliced) 		theSlicer.onresultSliced(_self, _self.^result)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ReadIsClassifiedObjectAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
class orgeclipseuml2umlReadIsClassifiedObjectActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^object?.reinit
_self.^result?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onReadIsClassifiedObjectActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^object?.visitToAddClasses(theSlicer)
		_self.^result?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^object!==null){
		_self.^object.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^object.sliced) 		theSlicer.onobjectSliced(_self, _self.^object)
		}
		if(_self.^result!==null){
		_self.^result.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^result.sliced) 		theSlicer.onresultSliced(_self, _self.^result)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ReadLinkAction), with=#[typeof(orgeclipseuml2umlLinkActionAspect)])
class orgeclipseuml2umlReadLinkActionAspect extends orgeclipseuml2umlLinkActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^result?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onReadLinkActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^result?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^result!==null){
		_self.^result.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^result.sliced) 		theSlicer.onresultSliced(_self, _self.^result)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ReadLinkObjectEndAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
class orgeclipseuml2umlReadLinkObjectEndActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^object?.reinit
_self.^result?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onReadLinkObjectEndActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^object?.visitToAddClasses(theSlicer)
		_self.^result?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^object!==null){
		_self.^object.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^object.sliced) 		theSlicer.onobjectSliced(_self, _self.^object)
		}
		if(_self.^result!==null){
		_self.^result.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^result.sliced) 		theSlicer.onresultSliced(_self, _self.^result)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
class orgeclipseuml2umlReadLinkObjectEndQualifierActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^object?.reinit
_self.^result?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onReadLinkObjectEndQualifierActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^object?.visitToAddClasses(theSlicer)
		_self.^result?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^object!==null){
		_self.^object.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^object.sliced) 		theSlicer.onobjectSliced(_self, _self.^object)
		}
		if(_self.^result!==null){
		_self.^result.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^result.sliced) 		theSlicer.onresultSliced(_self, _self.^result)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ReadSelfAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
class orgeclipseuml2umlReadSelfActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^result?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onReadSelfActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^result?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^result!==null){
		_self.^result.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^result.sliced) 		theSlicer.onresultSliced(_self, _self.^result)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ReadStructuralFeatureAction), with=#[typeof(orgeclipseuml2umlStructuralFeatureActionAspect)])
class orgeclipseuml2umlReadStructuralFeatureActionAspect extends orgeclipseuml2umlStructuralFeatureActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^result?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onReadStructuralFeatureActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^result?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^result!==null){
		_self.^result.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^result.sliced) 		theSlicer.onresultSliced(_self, _self.^result)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ReadVariableAction), with=#[typeof(orgeclipseuml2umlVariableActionAspect)])
class orgeclipseuml2umlReadVariableActionAspect extends orgeclipseuml2umlVariableActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^result?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onReadVariableActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^result?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^result!==null){
		_self.^result.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^result.sliced) 		theSlicer.onresultSliced(_self, _self.^result)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Realization), with=#[typeof(orgeclipseuml2umlAbstractionAspect)])
class orgeclipseuml2umlRealizationAspect extends orgeclipseuml2umlAbstractionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onRealizationSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Reception), with=#[typeof(orgeclipseuml2umlBehavioralFeatureAspect)])
class orgeclipseuml2umlReceptionAspect extends orgeclipseuml2umlBehavioralFeatureAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onReceptionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ReclassifyObjectAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
class orgeclipseuml2umlReclassifyObjectActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^object?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onReclassifyObjectActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^object?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^object!==null){
		_self.^object.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^object.sliced) 		theSlicer.onobjectSliced(_self, _self.^object)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.RedefinableElement), with=#[typeof(orgeclipseuml2umlNamedElementAspect)])
abstract class orgeclipseuml2umlRedefinableElementAspect extends orgeclipseuml2umlNamedElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onRedefinableElementSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.RedefinableTemplateSignature), with=#[typeof(orgeclipseuml2umlRedefinableElementAspect), typeof(orgeclipseuml2umlTemplateSignatureAspect)])
class orgeclipseuml2umlRedefinableTemplateSignatureAspect extends orgeclipseuml2umlRedefinableElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onRedefinableTemplateSignatureSliced(_self)
		_self.super_RedefinableElement__visitToAddClasses(theSlicer)
		_self.super_TemplateSignature__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_RedefinableElement__visitToAddRelations(theSlicer)
		_self.super_TemplateSignature__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ReduceAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
class orgeclipseuml2umlReduceActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^collection?.reinit
_self.^result?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onReduceActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^collection?.visitToAddClasses(theSlicer)
		_self.^result?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^collection!==null){
		_self.^collection.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^collection.sliced) 		theSlicer.oncollectionSliced(_self, _self.^collection)
		}
		if(_self.^result!==null){
		_self.^result.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^result.sliced) 		theSlicer.onresultSliced(_self, _self.^result)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Region), with=#[typeof(orgeclipseuml2umlNamespaceAspect), typeof(orgeclipseuml2umlRedefinableElementAspect)])
class orgeclipseuml2umlRegionAspect extends orgeclipseuml2umlNamespaceAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_Namespace_reinit
		_self.super_RedefinableElement_reinit
_self.^transitions.forEach[reinit]
_self.^subvertices.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onRegionSliced(_self)
		_self.super_Namespace__visitToAddClasses(theSlicer)
		_self.super_RedefinableElement__visitToAddClasses(theSlicer)
		_self.^subvertices.forEach[visitToAddClasses(theSlicer)]
		_self.^transitions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_Namespace__visitToAddRelations(theSlicer)
		_self.super_RedefinableElement__visitToAddRelations(theSlicer)
		_self.^subvertices.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onsubvertexSliced(_self, _elt)
		]
		_self.^transitions.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.ontransitionSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Relationship), with=#[typeof(orgeclipseuml2umlElementAspect)])
abstract class orgeclipseuml2umlRelationshipAspect extends orgeclipseuml2umlElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onRelationshipSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction), with=#[typeof(orgeclipseuml2umlWriteStructuralFeatureActionAspect)])
class orgeclipseuml2umlRemoveStructuralFeatureValueActionAspect extends orgeclipseuml2umlWriteStructuralFeatureActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^removeAt?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onRemoveStructuralFeatureValueActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^removeAt?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^removeAt!==null){
		_self.^removeAt.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^removeAt.sliced) 		theSlicer.onremoveAtSliced(_self, _self.^removeAt)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.RemoveVariableValueAction), with=#[typeof(orgeclipseuml2umlWriteVariableActionAspect)])
class orgeclipseuml2umlRemoveVariableValueActionAspect extends orgeclipseuml2umlWriteVariableActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^removeAt?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onRemoveVariableValueActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^removeAt?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^removeAt!==null){
		_self.^removeAt.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^removeAt.sliced) 		theSlicer.onremoveAtSliced(_self, _self.^removeAt)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ReplyAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
class orgeclipseuml2umlReplyActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^replyValues.forEach[reinit]
_self.^returnInformation?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onReplyActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^replyValues.forEach[visitToAddClasses(theSlicer)]
		_self.^returnInformation?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^replyValues.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onreplyValueSliced(_self, _elt)
		]
		if(_self.^returnInformation!==null){
		_self.^returnInformation.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^returnInformation.sliced) 		theSlicer.onreturnInformationSliced(_self, _self.^returnInformation)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.SendObjectAction), with=#[typeof(orgeclipseuml2umlInvocationActionAspect)])
class orgeclipseuml2umlSendObjectActionAspect extends orgeclipseuml2umlInvocationActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^request?.reinit
_self.^target?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onSendObjectActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^request?.visitToAddClasses(theSlicer)
		_self.^target?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^request!==null){
		_self.^request.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^request.sliced) 		theSlicer.onrequestSliced(_self, _self.^request)
		}
		if(_self.^target!==null){
		_self.^target.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^target.sliced) 		theSlicer.ontargetSliced(_self, _self.^target)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.SendSignalAction), with=#[typeof(orgeclipseuml2umlInvocationActionAspect)])
class orgeclipseuml2umlSendSignalActionAspect extends orgeclipseuml2umlInvocationActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^target?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onSendSignalActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^target?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^target!==null){
		_self.^target.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^target.sliced) 		theSlicer.ontargetSliced(_self, _self.^target)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.SequenceNode), with=#[typeof(orgeclipseuml2umlStructuredActivityNodeAspect)])
class orgeclipseuml2umlSequenceNodeAspect extends orgeclipseuml2umlStructuredActivityNodeAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^executableNodes.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onSequenceNodeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^executableNodes.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^executableNodes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onexecutableNodeSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Signal), with=#[typeof(orgeclipseuml2umlClassifierAspect)])
class orgeclipseuml2umlSignalAspect extends orgeclipseuml2umlClassifierAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^ownedAttributes.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onSignalSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^ownedAttributes.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^ownedAttributes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedAttributeSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.SignalEvent), with=#[typeof(orgeclipseuml2umlMessageEventAspect)])
class orgeclipseuml2umlSignalEventAspect extends orgeclipseuml2umlMessageEventAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onSignalEventSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Slot), with=#[typeof(orgeclipseuml2umlElementAspect)])
class orgeclipseuml2umlSlotAspect extends orgeclipseuml2umlElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^values.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onSlotSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^values.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^values.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onvalueSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.StartClassifierBehaviorAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
class orgeclipseuml2umlStartClassifierBehaviorActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^object?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onStartClassifierBehaviorActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^object?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^object!==null){
		_self.^object.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^object.sliced) 		theSlicer.onobjectSliced(_self, _self.^object)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.StartObjectBehaviorAction), with=#[typeof(orgeclipseuml2umlCallActionAspect)])
class orgeclipseuml2umlStartObjectBehaviorActionAspect extends orgeclipseuml2umlCallActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^object?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onStartObjectBehaviorActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^object?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^object!==null){
		_self.^object.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^object.sliced) 		theSlicer.onobjectSliced(_self, _self.^object)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.State), with=#[typeof(orgeclipseuml2umlNamespaceAspect), typeof(orgeclipseuml2umlRedefinableElementAspect), typeof(orgeclipseuml2umlVertexAspect)])
class orgeclipseuml2umlStateAspect extends orgeclipseuml2umlNamespaceAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_Namespace_reinit
		_self.super_RedefinableElement_reinit
//		_self.super_Vertex_reinit
_self.^connections.forEach[reinit]
_self.^connectionPoints.forEach[reinit]
_self.^deferrableTriggers.forEach[reinit]
_self.^doActivity?.reinit
_self.^entry?.reinit
_self.^exit?.reinit
_self.^regions.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onStateSliced(_self)
		_self.super_Namespace__visitToAddClasses(theSlicer)
		_self.super_RedefinableElement__visitToAddClasses(theSlicer)
		_self.super_Vertex__visitToAddClasses(theSlicer)
		_self.^connections.forEach[visitToAddClasses(theSlicer)]
		_self.^connectionPoints.forEach[visitToAddClasses(theSlicer)]
		_self.^deferrableTriggers.forEach[visitToAddClasses(theSlicer)]
		_self.^doActivity?.visitToAddClasses(theSlicer)
		_self.^entry?.visitToAddClasses(theSlicer)
		_self.^exit?.visitToAddClasses(theSlicer)
		_self.^regions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_Namespace__visitToAddRelations(theSlicer)
		_self.super_RedefinableElement__visitToAddRelations(theSlicer)
		_self.super_Vertex__visitToAddRelations(theSlicer)
		_self.^connections.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onconnectionSliced(_self, _elt)
		]
		_self.^connectionPoints.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onconnectionPointSliced(_self, _elt)
		]
		_self.^deferrableTriggers.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.ondeferrableTriggerSliced(_self, _elt)
		]
		if(_self.^doActivity!==null){
		_self.^doActivity.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^doActivity.sliced) 		theSlicer.ondoActivitySliced(_self, _self.^doActivity)
		}
		if(_self.^entry!==null){
		_self.^entry.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^entry.sliced) 		theSlicer.onentrySliced(_self, _self.^entry)
		}
		if(_self.^exit!==null){
		_self.^exit.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^exit.sliced) 		theSlicer.onexitSliced(_self, _self.^exit)
		}
		_self.^regions.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onregionSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.StateInvariant), with=#[typeof(orgeclipseuml2umlInteractionFragmentAspect)])
class orgeclipseuml2umlStateInvariantAspect extends orgeclipseuml2umlInteractionFragmentAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^invariant?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onStateInvariantSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^invariant?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^invariant!==null){
		_self.^invariant.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^invariant.sliced) 		theSlicer.oninvariantSliced(_self, _self.^invariant)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.StateMachine), with=#[typeof(orgeclipseuml2umlBehaviorAspect)])
class orgeclipseuml2umlStateMachineAspect extends orgeclipseuml2umlBehaviorAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^connectionPoints.forEach[reinit]
_self.^regions.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onStateMachineSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^connectionPoints.forEach[visitToAddClasses(theSlicer)]
		_self.^regions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^connectionPoints.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onconnectionPointSliced(_self, _elt)
		]
		_self.^regions.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onregionSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Stereotype), with=#[typeof(orgeclipseuml2umlClassAspect)])
class orgeclipseuml2umlStereotypeAspect extends orgeclipseuml2umlClassAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^icons.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onStereotypeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^icons.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^icons.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.oniconSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.StringExpression), with=#[typeof(orgeclipseuml2umlExpressionAspect), typeof(orgeclipseuml2umlTemplateableElementAspect)])
class orgeclipseuml2umlStringExpressionAspect extends orgeclipseuml2umlExpressionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_Expression_reinit
		_self.super_TemplateableElement_reinit
_self.^subExpressions.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onStringExpressionSliced(_self)
		_self.super_Expression__visitToAddClasses(theSlicer)
		_self.super_TemplateableElement__visitToAddClasses(theSlicer)
		_self.^subExpressions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_Expression__visitToAddRelations(theSlicer)
		_self.super_TemplateableElement__visitToAddRelations(theSlicer)
		_self.^subExpressions.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onsubExpressionSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.StructuralFeatureAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
abstract class orgeclipseuml2umlStructuralFeatureActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^object?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onStructuralFeatureActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^object?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^object!==null){
		_self.^object.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^object.sliced) 		theSlicer.onobjectSliced(_self, _self.^object)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.StructuralFeature), with=#[typeof(orgeclipseuml2umlFeatureAspect), typeof(orgeclipseuml2umlTypedElementAspect), typeof(orgeclipseuml2umlMultiplicityElementAspect)])
abstract class orgeclipseuml2umlStructuralFeatureAspect extends orgeclipseuml2umlFeatureAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onStructuralFeatureSliced(_self)
		_self.super_Feature__visitToAddClasses(theSlicer)
		_self.super_TypedElement__visitToAddClasses(theSlicer)
		_self.super_MultiplicityElement__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_Feature__visitToAddRelations(theSlicer)
		_self.super_TypedElement__visitToAddRelations(theSlicer)
		_self.super_MultiplicityElement__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.StructuredActivityNode), with=#[typeof(orgeclipseuml2umlActionAspect), typeof(orgeclipseuml2umlNamespaceAspect), typeof(orgeclipseuml2umlActivityGroupAspect)])
class orgeclipseuml2umlStructuredActivityNodeAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_Action_reinit
		_self.super_Namespace_reinit
//		_self.super_ActivityGroup_reinit
_self.^edges.forEach[reinit]
_self.^nodes.forEach[reinit]
_self.^variables.forEach[reinit]
_self.^nodes.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onStructuredActivityNodeSliced(_self)
		_self.super_Action__visitToAddClasses(theSlicer)
		_self.super_Namespace__visitToAddClasses(theSlicer)
		_self.super_ActivityGroup__visitToAddClasses(theSlicer)
		_self.^edges.forEach[visitToAddClasses(theSlicer)]
		_self.^nodes.forEach[visitToAddClasses(theSlicer)]
		_self.^nodes.forEach[visitToAddClasses(theSlicer)]
		_self.^variables.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_Action__visitToAddRelations(theSlicer)
		_self.super_Namespace__visitToAddRelations(theSlicer)
		_self.super_ActivityGroup__visitToAddRelations(theSlicer)
		_self.^edges.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onedgeSliced(_self, _elt)
		]
		_self.^nodes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onnodeSliced(_self, _elt)
		]
		_self.^nodes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onstructuredNodeInputSliced(_self, _elt)
		]
		_self.^variables.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onvariableSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.StructuredClassifier), with=#[typeof(orgeclipseuml2umlClassifierAspect)])
abstract class orgeclipseuml2umlStructuredClassifierAspect extends orgeclipseuml2umlClassifierAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^ownedAttributes.forEach[reinit]
_self.^ownedConnectors.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onStructuredClassifierSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^ownedAttributes.forEach[visitToAddClasses(theSlicer)]
		_self.^ownedConnectors.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^ownedAttributes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedAttributeSliced(_self, _elt)
		]
		_self.^ownedConnectors.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedConnectorSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Substitution), with=#[typeof(orgeclipseuml2umlRealizationAspect)])
class orgeclipseuml2umlSubstitutionAspect extends orgeclipseuml2umlRealizationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onSubstitutionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.TemplateableElement), with=#[typeof(orgeclipseuml2umlElementAspect)])
abstract class orgeclipseuml2umlTemplateableElementAspect extends orgeclipseuml2umlElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^templateBindings.forEach[reinit]
_self.^ownedTemplateSignature?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onTemplateableElementSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^ownedTemplateSignature?.visitToAddClasses(theSlicer)
		_self.^templateBindings.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^ownedTemplateSignature!==null){
		_self.^ownedTemplateSignature.visitToAddRelations(theSlicer)
		if(_self.sliced && _self.^ownedTemplateSignature.sliced) 		theSlicer.onownedTemplateSignatureSliced(_self, _self.^ownedTemplateSignature)
		}
		_self.^templateBindings.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.ontemplateBindingSliced(_self, _elt)
		]
	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.TemplateBinding), with=#[typeof(orgeclipseuml2umlDirectedRelationshipAspect)])
class orgeclipseuml2umlTemplateBindingAspect extends orgeclipseuml2umlDirectedRelationshipAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^parameterSubstitutions.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onTemplateBindingSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^parameterSubstitutions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^parameterSubstitutions.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onparameterSubstitutionSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.TemplateParameter), with=#[typeof(orgeclipseuml2umlElementAspect)])
class orgeclipseuml2umlTemplateParameterAspect extends orgeclipseuml2umlElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^ownedDefault?.reinit
_self.^ownedParameteredElement?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onTemplateParameterSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^ownedDefault?.visitToAddClasses(theSlicer)
		_self.^ownedParameteredElement?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^ownedDefault!==null){
		_self.^ownedDefault.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^ownedDefault.sliced) 		theSlicer.onownedDefaultSliced(_self, _self.^ownedDefault)
		}
		if(_self.^ownedParameteredElement!==null){
		_self.^ownedParameteredElement.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^ownedParameteredElement.sliced) 		theSlicer.onownedParameteredElementSliced(_self, _self.^ownedParameteredElement)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.TemplateParameterSubstitution), with=#[typeof(orgeclipseuml2umlElementAspect)])
class orgeclipseuml2umlTemplateParameterSubstitutionAspect extends orgeclipseuml2umlElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^ownedActual?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onTemplateParameterSubstitutionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^ownedActual?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^ownedActual!==null){
		_self.^ownedActual.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^ownedActual.sliced) 		theSlicer.onownedActualSliced(_self, _self.^ownedActual)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.TemplateSignature), with=#[typeof(orgeclipseuml2umlElementAspect)])
class orgeclipseuml2umlTemplateSignatureAspect extends orgeclipseuml2umlElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^ownedParameters.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onTemplateSignatureSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^ownedParameters.forEach[visitToAddClasses(theSlicer)]
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^ownedParameters.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onownedParameterSliced(_self, _elt)
		]
	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.TestIdentityAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
class orgeclipseuml2umlTestIdentityActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^first?.reinit
_self.^result?.reinit
_self.^second?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onTestIdentityActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^first?.visitToAddClasses(theSlicer)
		_self.^result?.visitToAddClasses(theSlicer)
		_self.^second?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^first!==null){
		_self.^first.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^first.sliced) 		theSlicer.onfirstSliced(_self, _self.^first)
		}
		if(_self.^result!==null){
		_self.^result.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^result.sliced) 		theSlicer.onresultSliced(_self, _self.^result)
		}
		if(_self.^second!==null){
		_self.^second.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^second.sliced) 		theSlicer.onsecondSliced(_self, _self.^second)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.TimeConstraint), with=#[typeof(orgeclipseuml2umlIntervalConstraintAspect)])
class orgeclipseuml2umlTimeConstraintAspect extends orgeclipseuml2umlIntervalConstraintAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onTimeConstraintSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.TimeEvent), with=#[typeof(orgeclipseuml2umlEventAspect)])
class orgeclipseuml2umlTimeEventAspect extends orgeclipseuml2umlEventAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^when?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onTimeEventSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^when?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^when!==null){
		_self.^when.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^when.sliced) 		theSlicer.onwhenSliced(_self, _self.^when)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.TimeExpression), with=#[typeof(orgeclipseuml2umlValueSpecificationAspect)])
class orgeclipseuml2umlTimeExpressionAspect extends orgeclipseuml2umlValueSpecificationAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^expr?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onTimeExpressionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^expr?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^expr!==null){
		_self.^expr.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^expr.sliced) 		theSlicer.onexprSliced(_self, _self.^expr)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.TimeInterval), with=#[typeof(orgeclipseuml2umlIntervalAspect)])
class orgeclipseuml2umlTimeIntervalAspect extends orgeclipseuml2umlIntervalAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onTimeIntervalSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.TimeObservation), with=#[typeof(orgeclipseuml2umlObservationAspect)])
class orgeclipseuml2umlTimeObservationAspect extends orgeclipseuml2umlObservationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onTimeObservationSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Transition), with=#[typeof(orgeclipseuml2umlNamespaceAspect), typeof(orgeclipseuml2umlRedefinableElementAspect)])
class orgeclipseuml2umlTransitionAspect extends orgeclipseuml2umlNamespaceAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_Namespace_reinit
		_self.super_RedefinableElement_reinit
_self.^effect?.reinit
_self.^triggers.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onTransitionSliced(_self)
		_self.super_Namespace__visitToAddClasses(theSlicer)
		_self.super_RedefinableElement__visitToAddClasses(theSlicer)
		_self.^effect?.visitToAddClasses(theSlicer)
		_self.^triggers.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_Namespace__visitToAddRelations(theSlicer)
		_self.super_RedefinableElement__visitToAddRelations(theSlicer)
		if(_self.^effect!==null){
		_self.^effect.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^effect.sliced) 		theSlicer.oneffectSliced(_self, _self.^effect)
		}
		_self.^triggers.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.ontriggerSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Trigger), with=#[typeof(orgeclipseuml2umlNamedElementAspect)])
class orgeclipseuml2umlTriggerAspect extends orgeclipseuml2umlNamedElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onTriggerSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Type), with=#[typeof(orgeclipseuml2umlPackageableElementAspect)])
abstract class orgeclipseuml2umlTypeAspect extends orgeclipseuml2umlPackageableElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onTypeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.TypedElement), with=#[typeof(orgeclipseuml2umlNamedElementAspect)])
abstract class orgeclipseuml2umlTypedElementAspect extends orgeclipseuml2umlNamedElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onTypedElementSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.UnmarshallAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
class orgeclipseuml2umlUnmarshallActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^object?.reinit
_self.^results.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onUnmarshallActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^object?.visitToAddClasses(theSlicer)
		_self.^results.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^object!==null){
		_self.^object.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^object.sliced) 		theSlicer.onobjectSliced(_self, _self.^object)
		}
		_self.^results.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onresultSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Usage), with=#[typeof(orgeclipseuml2umlDependencyAspect)])
class orgeclipseuml2umlUsageAspect extends orgeclipseuml2umlDependencyAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onUsageSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.UseCase), with=#[typeof(orgeclipseuml2umlBehavioredClassifierAspect)])
class orgeclipseuml2umlUseCaseAspect extends orgeclipseuml2umlBehavioredClassifierAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^extends.forEach[reinit]
_self.^extensionPoints.forEach[reinit]
_self.^includes.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onUseCaseSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^extends.forEach[visitToAddClasses(theSlicer)]
		_self.^extensionPoints.forEach[visitToAddClasses(theSlicer)]
		_self.^includes.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^extends.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onextendSliced(_self, _elt)
		]
		_self.^extensionPoints.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onextensionPointSliced(_self, _elt)
		]
		_self.^includes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onincludeSliced(_self, _elt)
		]

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ValuePin), with=#[typeof(orgeclipseuml2umlInputPinAspect)])
class orgeclipseuml2umlValuePinAspect extends orgeclipseuml2umlInputPinAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^value?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onValuePinSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^value?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^value!==null){
		_self.^value.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^value.sliced) 		theSlicer.onvalueSliced(_self, _self.^value)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ValueSpecificationAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
class orgeclipseuml2umlValueSpecificationActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^result?.reinit
_self.^value?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onValueSpecificationActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^result?.visitToAddClasses(theSlicer)
		_self.^value?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^result!==null){
		_self.^result.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^result.sliced) 		theSlicer.onresultSliced(_self, _self.^result)
		}
		if(_self.^value!==null){
		_self.^value.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^value.sliced) 		theSlicer.onvalueSliced(_self, _self.^value)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.ValueSpecification), with=#[typeof(orgeclipseuml2umlPackageableElementAspect), typeof(orgeclipseuml2umlTypedElementAspect)])
abstract class orgeclipseuml2umlValueSpecificationAspect extends orgeclipseuml2umlPackageableElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onValueSpecificationSliced(_self)
		_self.super_PackageableElement__visitToAddClasses(theSlicer)
		_self.super_TypedElement__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_PackageableElement__visitToAddRelations(theSlicer)
		_self.super_TypedElement__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.VariableAction), with=#[typeof(orgeclipseuml2umlActionAspect)])
abstract class orgeclipseuml2umlVariableActionAspect extends orgeclipseuml2umlActionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onVariableActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Variable), with=#[typeof(orgeclipseuml2umlConnectableElementAspect), typeof(orgeclipseuml2umlMultiplicityElementAspect)])
class orgeclipseuml2umlVariableAspect extends orgeclipseuml2umlConnectableElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onVariableSliced(_self)
		_self.super_ConnectableElement__visitToAddClasses(theSlicer)
		_self.super_MultiplicityElement__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super_ConnectableElement__visitToAddRelations(theSlicer)
		_self.super_MultiplicityElement__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.Vertex), with=#[typeof(orgeclipseuml2umlNamedElementAspect)])
abstract class orgeclipseuml2umlVertexAspect extends orgeclipseuml2umlNamedElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onVertexSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.WriteLinkAction), with=#[typeof(orgeclipseuml2umlLinkActionAspect)])
abstract class orgeclipseuml2umlWriteLinkActionAspect extends orgeclipseuml2umlLinkActionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onWriteLinkActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.WriteStructuralFeatureAction), with=#[typeof(orgeclipseuml2umlStructuralFeatureActionAspect)])
abstract class orgeclipseuml2umlWriteStructuralFeatureActionAspect extends orgeclipseuml2umlStructuralFeatureActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^result?.reinit
_self.^value?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onWriteStructuralFeatureActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^result?.visitToAddClasses(theSlicer)
		_self.^value?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^result!==null){
		_self.^result.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^result.sliced) 		theSlicer.onresultSliced(_self, _self.^result)
		}
		if(_self.^value!==null){
		_self.^value.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^value.sliced) 		theSlicer.onvalueSliced(_self, _self.^value)
		}

	}
}


@Aspect(className=typeof(org.eclipse.uml2.uml.WriteVariableAction), with=#[typeof(orgeclipseuml2umlVariableActionAspect)])
abstract class orgeclipseuml2umlWriteVariableActionAspect extends orgeclipseuml2umlVariableActionAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^value?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(Umlfootprinter theSlicer){
		theSlicer.onWriteVariableActionSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^value?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Umlfootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^value!==null){
		_self.^value.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^value.sliced) 		theSlicer.onvalueSliced(_self, _self.^value)
		}

	}
}

