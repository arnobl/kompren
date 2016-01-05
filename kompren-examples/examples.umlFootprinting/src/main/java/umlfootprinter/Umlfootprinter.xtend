package umlfootprinter

import static extension umlfootprinter.__SlicerAspect__.*

class Umlfootprinter{
	val java.util.List<org.eclipse.uml2.uml.Element> inputElement

	new(java.util.List<org.eclipse.uml2.uml.Element> inputElement){
		this.inputElement = inputElement
	}

	def void slice(){
		onStart
		inputElement?.forEach[visitToAddClasses(this)]
		inputElement?.forEach[visitToAddRelations(this)]
		onEnd
	}

	def void onAbstractionSliced(org.eclipse.uml2.uml.Abstraction theVar){
	}
	def void onAcceptCallActionSliced(org.eclipse.uml2.uml.AcceptCallAction theVar){
	}
	def void onAcceptEventActionSliced(org.eclipse.uml2.uml.AcceptEventAction theVar){
		 
	}
	def void onActionSliced(org.eclipse.uml2.uml.Action theVar){
		 
	}
	def void onActionExecutionSpecificationSliced(org.eclipse.uml2.uml.ActionExecutionSpecification theVar){
		 
	}
	def void onActionInputPinSliced(org.eclipse.uml2.uml.ActionInputPin theVar){
		 
	}
	def void onActivitySliced(org.eclipse.uml2.uml.Activity theVar){
		 
	}
	def void onActivityEdgeSliced(org.eclipse.uml2.uml.ActivityEdge theVar){
		 
	}
	def void onActivityFinalNodeSliced(org.eclipse.uml2.uml.ActivityFinalNode theVar){
		 
	}
	def void onActivityGroupSliced(org.eclipse.uml2.uml.ActivityGroup theVar){
		 
	}
	def void onActivityNodeSliced(org.eclipse.uml2.uml.ActivityNode theVar){
		 
	}
	def void onActivityParameterNodeSliced(org.eclipse.uml2.uml.ActivityParameterNode theVar){
		 
	}
	def void onActivityPartitionSliced(org.eclipse.uml2.uml.ActivityPartition theVar){
		 
	}
	def void onActorSliced(org.eclipse.uml2.uml.Actor theVar){
		 
	}
	def void onAddStructuralFeatureValueActionSliced(org.eclipse.uml2.uml.AddStructuralFeatureValueAction theVar){
		 
	}
	def void onAddVariableValueActionSliced(org.eclipse.uml2.uml.AddVariableValueAction theVar){
		 
	}
	def void onAnyReceiveEventSliced(org.eclipse.uml2.uml.AnyReceiveEvent theVar){
		 
	}
	def void onArtifactSliced(org.eclipse.uml2.uml.Artifact theVar){
		 
	}
	def void onAssociationSliced(org.eclipse.uml2.uml.Association theVar){
		 
	}
	def void onAssociationClassSliced(org.eclipse.uml2.uml.AssociationClass theVar){
		 
	}
	def void onBehaviorSliced(org.eclipse.uml2.uml.Behavior theVar){
		 
	}
	def void onBehaviorExecutionSpecificationSliced(org.eclipse.uml2.uml.BehaviorExecutionSpecification theVar){
		 
	}
	def void onBehavioralFeatureSliced(org.eclipse.uml2.uml.BehavioralFeature theVar){
		 
	}
	def void onBehavioredClassifierSliced(org.eclipse.uml2.uml.BehavioredClassifier theVar){
		 
	}
	def void onBroadcastSignalActionSliced(org.eclipse.uml2.uml.BroadcastSignalAction theVar){
		 
	}
	def void onCallActionSliced(org.eclipse.uml2.uml.CallAction theVar){
		 
	}
	def void onCallBehaviorActionSliced(org.eclipse.uml2.uml.CallBehaviorAction theVar){
		 
	}
	def void onCallEventSliced(org.eclipse.uml2.uml.CallEvent theVar){
		 
	}
	def void onCallOperationActionSliced(org.eclipse.uml2.uml.CallOperationAction theVar){
		 
	}
	def void onCentralBufferNodeSliced(org.eclipse.uml2.uml.CentralBufferNode theVar){
		 
	}
	def void onChangeEventSliced(org.eclipse.uml2.uml.ChangeEvent theVar){
		 
	}
	def void onClassSliced(org.eclipse.uml2.uml.Class theVar){
		 
	}
	def void onClassifierSliced(org.eclipse.uml2.uml.Classifier theVar){
		 
	}
	def void onClassifierTemplateParameterSliced(org.eclipse.uml2.uml.ClassifierTemplateParameter theVar){
		 
	}
	def void onClauseSliced(org.eclipse.uml2.uml.Clause theVar){
	}
	def void onClearAssociationActionSliced(org.eclipse.uml2.uml.ClearAssociationAction theVar){
		 
	}
	def void onClearStructuralFeatureActionSliced(org.eclipse.uml2.uml.ClearStructuralFeatureAction theVar){
		 
	}
	def void onClearVariableActionSliced(org.eclipse.uml2.uml.ClearVariableAction theVar){
		 
	}
	def void onCollaborationSliced(org.eclipse.uml2.uml.Collaboration theVar){
		 
	}
	def void onCollaborationUseSliced(org.eclipse.uml2.uml.CollaborationUse theVar){
	}
	def void onCombinedFragmentSliced(org.eclipse.uml2.uml.CombinedFragment theVar){
		 
	}
	def void onCommentSliced(org.eclipse.uml2.uml.Comment theVar){
	}
	def void onCommunicationPathSliced(org.eclipse.uml2.uml.CommunicationPath theVar){
		 
	}
	def void onComponentSliced(org.eclipse.uml2.uml.Component theVar){
		 
	}
	def void onComponentRealizationSliced(org.eclipse.uml2.uml.ComponentRealization theVar){
		 
	}
	def void onConditionalNodeSliced(org.eclipse.uml2.uml.ConditionalNode theVar){
		 
	}
	def void onConnectableElementSliced(org.eclipse.uml2.uml.ConnectableElement theVar){
		 
	}
	def void onConnectableElementTemplateParameterSliced(org.eclipse.uml2.uml.ConnectableElementTemplateParameter theVar){
		 
	}
	def void onConnectionPointReferenceSliced(org.eclipse.uml2.uml.ConnectionPointReference theVar){
		 
	}
	def void onConnectorSliced(org.eclipse.uml2.uml.Connector theVar){
		 
	}
	def void onConnectorEndSliced(org.eclipse.uml2.uml.ConnectorEnd theVar){
		 
	}
	def void onConsiderIgnoreFragmentSliced(org.eclipse.uml2.uml.ConsiderIgnoreFragment theVar){
		 
	}
	def void onConstraintSliced(org.eclipse.uml2.uml.Constraint theVar){
		 
	}
	def void onContinuationSliced(org.eclipse.uml2.uml.Continuation theVar){
		 
	}
	def void onControlFlowSliced(org.eclipse.uml2.uml.ControlFlow theVar){
		 
	}
	def void onControlNodeSliced(org.eclipse.uml2.uml.ControlNode theVar){
		 
	}
	def void onCreateLinkActionSliced(org.eclipse.uml2.uml.CreateLinkAction theVar){
		 
	}
	def void onCreateLinkObjectActionSliced(org.eclipse.uml2.uml.CreateLinkObjectAction theVar){
		 
	}
	def void onCreateObjectActionSliced(org.eclipse.uml2.uml.CreateObjectAction theVar){
		 
	}
	def void onDataStoreNodeSliced(org.eclipse.uml2.uml.DataStoreNode theVar){
		 
	}
	def void onDataTypeSliced(org.eclipse.uml2.uml.DataType theVar){
		 
	}
	def void onDecisionNodeSliced(org.eclipse.uml2.uml.DecisionNode theVar){
		 
	}
	def void onDependencySliced(org.eclipse.uml2.uml.Dependency theVar){
		 
	}
	def void onDeployedArtifactSliced(org.eclipse.uml2.uml.DeployedArtifact theVar){
		 
	}
	def void onDeploymentSliced(org.eclipse.uml2.uml.Deployment theVar){
		 
	}
	def void onDeploymentSpecificationSliced(org.eclipse.uml2.uml.DeploymentSpecification theVar){
		 
	}
	def void onDeploymentTargetSliced(org.eclipse.uml2.uml.DeploymentTarget theVar){
		 
	}
	def void onDestroyLinkActionSliced(org.eclipse.uml2.uml.DestroyLinkAction theVar){
		 
	}
	def void onDestroyObjectActionSliced(org.eclipse.uml2.uml.DestroyObjectAction theVar){
		 
	}
//	def void onDestructionOccurrenceSpecificationSliced(org.eclipse.uml2.uml.DestructionOccurrenceSpecification theVar){
//		 
//	}
	def void onDeviceSliced(org.eclipse.uml2.uml.Device theVar){
		 
	}
	def void onDirectedRelationshipSliced(org.eclipse.uml2.uml.DirectedRelationship theVar){
		 
	}
	def void onDurationSliced(org.eclipse.uml2.uml.Duration theVar){
		 
	}
	def void onDurationConstraintSliced(org.eclipse.uml2.uml.DurationConstraint theVar){
		 
	}
	def void onDurationIntervalSliced(org.eclipse.uml2.uml.DurationInterval theVar){
		 
	}
	def void onDurationObservationSliced(org.eclipse.uml2.uml.DurationObservation theVar){
		 
	}
	def void onElementSliced(org.eclipse.uml2.uml.Element theVar){
	}
	def void onElementImportSliced(org.eclipse.uml2.uml.ElementImport theVar){
		 
	}
	def void onEncapsulatedClassifierSliced(org.eclipse.uml2.uml.EncapsulatedClassifier theVar){
		 
	}
	def void onEnumerationSliced(org.eclipse.uml2.uml.Enumeration theVar){
		 
	}
	def void onEnumerationLiteralSliced(org.eclipse.uml2.uml.EnumerationLiteral theVar){
		 
	}
	def void onEventSliced(org.eclipse.uml2.uml.Event theVar){
		 
	}
	def void onExceptionHandlerSliced(org.eclipse.uml2.uml.ExceptionHandler theVar){
		 
	}
	def void onExecutableNodeSliced(org.eclipse.uml2.uml.ExecutableNode theVar){
		 
	}
	def void onExecutionEnvironmentSliced(org.eclipse.uml2.uml.ExecutionEnvironment theVar){
		 
	}
	def void onExecutionOccurrenceSpecificationSliced(org.eclipse.uml2.uml.ExecutionOccurrenceSpecification theVar){
		 
	}
	def void onExecutionSpecificationSliced(org.eclipse.uml2.uml.ExecutionSpecification theVar){
		 
	}
	def void onExpansionNodeSliced(org.eclipse.uml2.uml.ExpansionNode theVar){
		 
	}
	def void onExpansionRegionSliced(org.eclipse.uml2.uml.ExpansionRegion theVar){
		 
	}
	def void onExpressionSliced(org.eclipse.uml2.uml.Expression theVar){
		 
	}
	def void onExtendSliced(org.eclipse.uml2.uml.Extend theVar){
		 
	}
	def void onExtensionSliced(org.eclipse.uml2.uml.Extension theVar){
		 
	}
	def void onExtensionEndSliced(org.eclipse.uml2.uml.ExtensionEnd theVar){
		 
	}
	def void onExtensionPointSliced(org.eclipse.uml2.uml.ExtensionPoint theVar){
		 
	}
	def void onFeatureSliced(org.eclipse.uml2.uml.Feature theVar){
		 
	}
	def void onFinalNodeSliced(org.eclipse.uml2.uml.FinalNode theVar){
		 
	}
	def void onFinalStateSliced(org.eclipse.uml2.uml.FinalState theVar){
		 
	}
	def void onFlowFinalNodeSliced(org.eclipse.uml2.uml.FlowFinalNode theVar){
		 
	}
	def void onForkNodeSliced(org.eclipse.uml2.uml.ForkNode theVar){
		 
	}
	def void onFunctionBehaviorSliced(org.eclipse.uml2.uml.FunctionBehavior theVar){
		 
	}
	def void onGateSliced(org.eclipse.uml2.uml.Gate theVar){
		 
	}
	def void onGeneralOrderingSliced(org.eclipse.uml2.uml.GeneralOrdering theVar){
		 
	}
	def void onGeneralizationSliced(org.eclipse.uml2.uml.Generalization theVar){
		 
	}
	def void onGeneralizationSetSliced(org.eclipse.uml2.uml.GeneralizationSet theVar){
		 
	}
	def void onImageSliced(org.eclipse.uml2.uml.Image theVar){
		 
	}
	def void onIncludeSliced(org.eclipse.uml2.uml.Include theVar){
		 
	}
	def void onInformationFlowSliced(org.eclipse.uml2.uml.InformationFlow theVar){
		 
	}
	def void onInformationItemSliced(org.eclipse.uml2.uml.InformationItem theVar){
		 
	}
	def void onInitialNodeSliced(org.eclipse.uml2.uml.InitialNode theVar){
		 
	}
	def void onInputPinSliced(org.eclipse.uml2.uml.InputPin theVar){
		 
	}
	def void onInstanceSpecificationSliced(org.eclipse.uml2.uml.InstanceSpecification theVar){
		 
	}
	def void onInstanceValueSliced(org.eclipse.uml2.uml.InstanceValue theVar){
		 
	}
	def void onInteractionSliced(org.eclipse.uml2.uml.Interaction theVar){
		 
	}
	def void onInteractionConstraintSliced(org.eclipse.uml2.uml.InteractionConstraint theVar){
		 
	}
	def void onInteractionFragmentSliced(org.eclipse.uml2.uml.InteractionFragment theVar){
		 
	}
	def void onInteractionOperandSliced(org.eclipse.uml2.uml.InteractionOperand theVar){
		 
	}
	def void onInteractionUseSliced(org.eclipse.uml2.uml.InteractionUse theVar){
		 
	}
	def void onInterfaceSliced(org.eclipse.uml2.uml.Interface theVar){
		 
	}
	def void onInterfaceRealizationSliced(org.eclipse.uml2.uml.InterfaceRealization theVar){
		 
	}
	def void onInterruptibleActivityRegionSliced(org.eclipse.uml2.uml.InterruptibleActivityRegion theVar){
		 
	}
	def void onIntervalSliced(org.eclipse.uml2.uml.Interval theVar){
		 
	}
	def void onIntervalConstraintSliced(org.eclipse.uml2.uml.IntervalConstraint theVar){
		 
	}
	def void onInvocationActionSliced(org.eclipse.uml2.uml.InvocationAction theVar){
		 
	}
	def void onJoinNodeSliced(org.eclipse.uml2.uml.JoinNode theVar){
		 
	}
	def void onLifelineSliced(org.eclipse.uml2.uml.Lifeline theVar){
		 
	}
	def void onLinkActionSliced(org.eclipse.uml2.uml.LinkAction theVar){
		 
	}
	def void onLinkEndCreationDataSliced(org.eclipse.uml2.uml.LinkEndCreationData theVar){
		 
	}
	def void onLinkEndDataSliced(org.eclipse.uml2.uml.LinkEndData theVar){
		 
	}
	def void onLinkEndDestructionDataSliced(org.eclipse.uml2.uml.LinkEndDestructionData theVar){
		 
	}
	def void onLiteralBooleanSliced(org.eclipse.uml2.uml.LiteralBoolean theVar){
		 
	}
	def void onLiteralIntegerSliced(org.eclipse.uml2.uml.LiteralInteger theVar){
		 
	}
	def void onLiteralNullSliced(org.eclipse.uml2.uml.LiteralNull theVar){
		 
	}
//	def void onLiteralRealSliced(org.eclipse.uml2.uml.LiteralReal theVar){
//		 
//	}
	def void onLiteralSpecificationSliced(org.eclipse.uml2.uml.LiteralSpecification theVar){
		 
	}
	def void onLiteralStringSliced(org.eclipse.uml2.uml.LiteralString theVar){
		 
	}
	def void onLiteralUnlimitedNaturalSliced(org.eclipse.uml2.uml.LiteralUnlimitedNatural theVar){
		 
	}
	def void onLoopNodeSliced(org.eclipse.uml2.uml.LoopNode theVar){
		 
	}
	def void onManifestationSliced(org.eclipse.uml2.uml.Manifestation theVar){
		 
	}
	def void onMergeNodeSliced(org.eclipse.uml2.uml.MergeNode theVar){
		 
	}
	def void onMessageSliced(org.eclipse.uml2.uml.Message theVar){
		 
	}
	def void onMessageEndSliced(org.eclipse.uml2.uml.MessageEnd theVar){
		 
	}
	def void onMessageEventSliced(org.eclipse.uml2.uml.MessageEvent theVar){
		 
	}
	def void onMessageOccurrenceSpecificationSliced(org.eclipse.uml2.uml.MessageOccurrenceSpecification theVar){
		 
	}
	def void onModelSliced(org.eclipse.uml2.uml.Model theVar){
		 
	}
	def void onMultiplicityElementSliced(org.eclipse.uml2.uml.MultiplicityElement theVar){
		 
	}
	def void onNamedElementSliced(org.eclipse.uml2.uml.NamedElement theVar){
	}
	def void onNamespaceSliced(org.eclipse.uml2.uml.Namespace theVar){
	}
	def void onNodeSliced(org.eclipse.uml2.uml.Node theVar){
		 
	}
	def void onObjectFlowSliced(org.eclipse.uml2.uml.ObjectFlow theVar){
		 
	}
	def void onObjectNodeSliced(org.eclipse.uml2.uml.ObjectNode theVar){
		 
	}
	def void onObservationSliced(org.eclipse.uml2.uml.Observation theVar){
		 
	}
	def void onOccurrenceSpecificationSliced(org.eclipse.uml2.uml.OccurrenceSpecification theVar){
		 
	}
	def void onOpaqueActionSliced(org.eclipse.uml2.uml.OpaqueAction theVar){
		 
	}
	def void onOpaqueBehaviorSliced(org.eclipse.uml2.uml.OpaqueBehavior theVar){
		 
	}
	def void onOpaqueExpressionSliced(org.eclipse.uml2.uml.OpaqueExpression theVar){
		 
	}
	def void onOperationSliced(org.eclipse.uml2.uml.Operation theVar){
		 
	}
	def void onOperationTemplateParameterSliced(org.eclipse.uml2.uml.OperationTemplateParameter theVar){
		 
	}
	def void onOutputPinSliced(org.eclipse.uml2.uml.OutputPin theVar){
		 
	}
	def void onPackageSliced(org.eclipse.uml2.uml.Package theVar){
		 
	}
	def void onPackageImportSliced(org.eclipse.uml2.uml.PackageImport theVar){
		 
	}
	def void onPackageMergeSliced(org.eclipse.uml2.uml.PackageMerge theVar){
		 
	}
	def void onPackageableElementSliced(org.eclipse.uml2.uml.PackageableElement theVar){
		 
	}
	def void onParameterSliced(org.eclipse.uml2.uml.Parameter theVar){
		 
	}
	def void onParameterSetSliced(org.eclipse.uml2.uml.ParameterSet theVar){
	}
	def void onParameterableElementSliced(org.eclipse.uml2.uml.ParameterableElement theVar){
		 
	}
	def void onPartDecompositionSliced(org.eclipse.uml2.uml.PartDecomposition theVar){
		 
	}
	def void onPinSliced(org.eclipse.uml2.uml.Pin theVar){
		 
	}
	def void onPortSliced(org.eclipse.uml2.uml.Port theVar){
		 
	}
	def void onPrimitiveTypeSliced(org.eclipse.uml2.uml.PrimitiveType theVar){
		 
	}
	def void onProfileSliced(org.eclipse.uml2.uml.Profile theVar){
		 
	}
	def void onProfileApplicationSliced(org.eclipse.uml2.uml.ProfileApplication theVar){
		 
	}
	def void onPropertySliced(org.eclipse.uml2.uml.Property theVar){
		 
	}
	def void onProtocolConformanceSliced(org.eclipse.uml2.uml.ProtocolConformance theVar){
		 
	}
	def void onProtocolStateMachineSliced(org.eclipse.uml2.uml.ProtocolStateMachine theVar){
		 
	}
	def void onProtocolTransitionSliced(org.eclipse.uml2.uml.ProtocolTransition theVar){
		 
	}
	def void onPseudostateSliced(org.eclipse.uml2.uml.Pseudostate theVar){
		 
	}
	def void onQualifierValueSliced(org.eclipse.uml2.uml.QualifierValue theVar){
		 
	}
	def void onRaiseExceptionActionSliced(org.eclipse.uml2.uml.RaiseExceptionAction theVar){
		 
	}
	def void onReadExtentActionSliced(org.eclipse.uml2.uml.ReadExtentAction theVar){
		 
	}
	def void onReadIsClassifiedObjectActionSliced(org.eclipse.uml2.uml.ReadIsClassifiedObjectAction theVar){
		 
	}
	def void onReadLinkActionSliced(org.eclipse.uml2.uml.ReadLinkAction theVar){
		 
	}
	def void onReadLinkObjectEndActionSliced(org.eclipse.uml2.uml.ReadLinkObjectEndAction theVar){
		 
	}
	def void onReadLinkObjectEndQualifierActionSliced(org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction theVar){
		 
	}
	def void onReadSelfActionSliced(org.eclipse.uml2.uml.ReadSelfAction theVar){
		 
	}
	def void onReadStructuralFeatureActionSliced(org.eclipse.uml2.uml.ReadStructuralFeatureAction theVar){
		 
	}
	def void onReadVariableActionSliced(org.eclipse.uml2.uml.ReadVariableAction theVar){
		 
	}
	def void onRealizationSliced(org.eclipse.uml2.uml.Realization theVar){
		 
	}
	def void onReceptionSliced(org.eclipse.uml2.uml.Reception theVar){
		 
	}
	def void onReclassifyObjectActionSliced(org.eclipse.uml2.uml.ReclassifyObjectAction theVar){
		 
	}
	def void onRedefinableElementSliced(org.eclipse.uml2.uml.RedefinableElement theVar){
	}
	def void onRedefinableTemplateSignatureSliced(org.eclipse.uml2.uml.RedefinableTemplateSignature theVar){
		 
	}
	def void onReduceActionSliced(org.eclipse.uml2.uml.ReduceAction theVar){
		 
	}
	def void onRegionSliced(org.eclipse.uml2.uml.Region theVar){
		 
	}
	def void onRelationshipSliced(org.eclipse.uml2.uml.Relationship theVar){
		 
	}
	def void onRemoveStructuralFeatureValueActionSliced(org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction theVar){
		 
	}
	def void onRemoveVariableValueActionSliced(org.eclipse.uml2.uml.RemoveVariableValueAction theVar){
		 
	}
	def void onReplyActionSliced(org.eclipse.uml2.uml.ReplyAction theVar){
		 
	}
	def void onSendObjectActionSliced(org.eclipse.uml2.uml.SendObjectAction theVar){
		 
	}
	def void onSendSignalActionSliced(org.eclipse.uml2.uml.SendSignalAction theVar){
		 
	}
	def void onSequenceNodeSliced(org.eclipse.uml2.uml.SequenceNode theVar){
		 
	}
	def void onSignalSliced(org.eclipse.uml2.uml.Signal theVar){
		 
	}
	def void onSignalEventSliced(org.eclipse.uml2.uml.SignalEvent theVar){
		 
	}
	def void onSlotSliced(org.eclipse.uml2.uml.Slot theVar){
		 
	}
	def void onStartClassifierBehaviorActionSliced(org.eclipse.uml2.uml.StartClassifierBehaviorAction theVar){
		 
	}
	def void onStartObjectBehaviorActionSliced(org.eclipse.uml2.uml.StartObjectBehaviorAction theVar){
		 
	}
	def void onStateSliced(org.eclipse.uml2.uml.State theVar){
		 
	}
	def void onStateInvariantSliced(org.eclipse.uml2.uml.StateInvariant theVar){
		 
	}
	def void onStateMachineSliced(org.eclipse.uml2.uml.StateMachine theVar){
		 
	}
	def void onStereotypeSliced(org.eclipse.uml2.uml.Stereotype theVar){
		 
	}
	def void onStringExpressionSliced(org.eclipse.uml2.uml.StringExpression theVar){
		 
	}
	def void onStructuralFeatureSliced(org.eclipse.uml2.uml.StructuralFeature theVar){
		 
	}
	def void onStructuralFeatureActionSliced(org.eclipse.uml2.uml.StructuralFeatureAction theVar){
		 
	}
	def void onStructuredActivityNodeSliced(org.eclipse.uml2.uml.StructuredActivityNode theVar){
		 
	}
	def void onStructuredClassifierSliced(org.eclipse.uml2.uml.StructuredClassifier theVar){
		 
	}
	def void onSubstitutionSliced(org.eclipse.uml2.uml.Substitution theVar){
		 
	}
	def void onTemplateBindingSliced(org.eclipse.uml2.uml.TemplateBinding theVar){
		 
	}
	def void onTemplateParameterSliced(org.eclipse.uml2.uml.TemplateParameter theVar){
		 
	}
	def void onTemplateParameterSubstitutionSliced(org.eclipse.uml2.uml.TemplateParameterSubstitution theVar){
		 
	}
	def void onTemplateSignatureSliced(org.eclipse.uml2.uml.TemplateSignature theVar){
	}
	def void onTemplateableElementSliced(org.eclipse.uml2.uml.TemplateableElement theVar){
		 
	}
	def void onTestIdentityActionSliced(org.eclipse.uml2.uml.TestIdentityAction theVar){
		 
	}
	def void onTimeConstraintSliced(org.eclipse.uml2.uml.TimeConstraint theVar){
		 
	}
	def void onTimeEventSliced(org.eclipse.uml2.uml.TimeEvent theVar){
		 
	}
	def void onTimeExpressionSliced(org.eclipse.uml2.uml.TimeExpression theVar){
		 
	}
	def void onTimeIntervalSliced(org.eclipse.uml2.uml.TimeInterval theVar){
		 
	}
	def void onTimeObservationSliced(org.eclipse.uml2.uml.TimeObservation theVar){
		 
	}
	def void onTransitionSliced(org.eclipse.uml2.uml.Transition theVar){
		 
	}
	def void onTriggerSliced(org.eclipse.uml2.uml.Trigger theVar){
	}
	def void onTypeSliced(org.eclipse.uml2.uml.Type theVar){
		 
	}
	def void onTypedElementSliced(org.eclipse.uml2.uml.TypedElement theVar){
	}
	def void onUnmarshallActionSliced(org.eclipse.uml2.uml.UnmarshallAction theVar){
		 
	}
	def void onUsageSliced(org.eclipse.uml2.uml.Usage theVar){
		 
	}
	def void onUseCaseSliced(org.eclipse.uml2.uml.UseCase theVar){
		 
	}
	def void onValuePinSliced(org.eclipse.uml2.uml.ValuePin theVar){
		 
	}
	def void onValueSpecificationSliced(org.eclipse.uml2.uml.ValueSpecification theVar){
		 
	}
	def void onValueSpecificationActionSliced(org.eclipse.uml2.uml.ValueSpecificationAction theVar){
		 
	}
	def void onVariableSliced(org.eclipse.uml2.uml.Variable theVar){
		 
	}
	def void onVariableActionSliced(org.eclipse.uml2.uml.VariableAction theVar){
		 
	}
	def void onVertexSliced(org.eclipse.uml2.uml.Vertex theVar){
	}
	def void onWriteLinkActionSliced(org.eclipse.uml2.uml.WriteLinkAction theVar){
		 
	}
	def void onWriteStructuralFeatureActionSliced(org.eclipse.uml2.uml.WriteStructuralFeatureAction theVar){
		 
	}
	def void onWriteVariableActionSliced(org.eclipse.uml2.uml.WriteVariableAction theVar){
		 
	}
	def void onmappingSliced(org.eclipse.uml2.uml.Abstraction theSrc, org.eclipse.uml2.uml.OpaqueExpression theTgt){
		 
	}
	def void onreturnInformationSliced(org.eclipse.uml2.uml.AcceptCallAction theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void onresultSliced(org.eclipse.uml2.uml.AcceptEventAction theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void ontriggerSliced(org.eclipse.uml2.uml.AcceptEventAction theSrc, org.eclipse.uml2.uml.Trigger theTgt){
		 
	}
	def void onlocalPostconditionSliced(org.eclipse.uml2.uml.Action theSrc, org.eclipse.uml2.uml.Constraint theTgt){
		 
	}
	def void onlocalPreconditionSliced(org.eclipse.uml2.uml.Action theSrc, org.eclipse.uml2.uml.Constraint theTgt){
		 
	}
	def void onfromActionSliced(org.eclipse.uml2.uml.ActionInputPin theSrc, org.eclipse.uml2.uml.Action theTgt){
		 
	}
	def void onedgeSliced(org.eclipse.uml2.uml.Activity theSrc, org.eclipse.uml2.uml.ActivityEdge theTgt){
		 
	}
	def void onownedGroupSliced(org.eclipse.uml2.uml.Activity theSrc, org.eclipse.uml2.uml.ActivityGroup theTgt){
		 
	}
	def void onownedNodeSliced(org.eclipse.uml2.uml.Activity theSrc, org.eclipse.uml2.uml.ActivityNode theTgt){
		 
	}
	def void onstructuredNodeSliced(org.eclipse.uml2.uml.Activity theSrc, org.eclipse.uml2.uml.StructuredActivityNode theTgt){
		 
	}
	def void onvariableSliced(org.eclipse.uml2.uml.Activity theSrc, org.eclipse.uml2.uml.Variable theTgt){
		 
	}
	def void onguardSliced(org.eclipse.uml2.uml.ActivityEdge theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void onweightSliced(org.eclipse.uml2.uml.ActivityEdge theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void onsubpartitionSliced(org.eclipse.uml2.uml.ActivityPartition theSrc, org.eclipse.uml2.uml.ActivityPartition theTgt){
		 
	}
	def void oninsertAtSliced(org.eclipse.uml2.uml.AddStructuralFeatureValueAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void oninsertAtSliced(org.eclipse.uml2.uml.AddVariableValueAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onmanifestationSliced(org.eclipse.uml2.uml.Artifact theSrc, org.eclipse.uml2.uml.Manifestation theTgt){
		 
	}
	def void onnestedArtifactSliced(org.eclipse.uml2.uml.Artifact theSrc, org.eclipse.uml2.uml.Artifact theTgt){
		 
	}
	def void onownedAttributeSliced(org.eclipse.uml2.uml.Artifact theSrc, org.eclipse.uml2.uml.Property theTgt){
		 
	}
	def void onownedOperationSliced(org.eclipse.uml2.uml.Artifact theSrc, org.eclipse.uml2.uml.Operation theTgt){
		 
	}
	def void onownedEndSliced(org.eclipse.uml2.uml.Association theSrc, org.eclipse.uml2.uml.Property theTgt){
		 
	}
	def void onownedParameterSliced(org.eclipse.uml2.uml.Behavior theSrc, org.eclipse.uml2.uml.Parameter theTgt){
		 
	}
	def void onownedParameterSetSliced(org.eclipse.uml2.uml.Behavior theSrc, org.eclipse.uml2.uml.ParameterSet theTgt){
		 
	}
	def void onownedParameterSliced(org.eclipse.uml2.uml.BehavioralFeature theSrc, org.eclipse.uml2.uml.Parameter theTgt){
		 
	}
	def void onownedParameterSetSliced(org.eclipse.uml2.uml.BehavioralFeature theSrc, org.eclipse.uml2.uml.ParameterSet theTgt){
		 
	}
	def void oninterfaceRealizationSliced(org.eclipse.uml2.uml.BehavioredClassifier theSrc, org.eclipse.uml2.uml.InterfaceRealization theTgt){
		 
	}
	def void onownedBehaviorSliced(org.eclipse.uml2.uml.BehavioredClassifier theSrc, org.eclipse.uml2.uml.Behavior theTgt){
		 
	}
	def void onresultSliced(org.eclipse.uml2.uml.CallAction theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void ontargetSliced(org.eclipse.uml2.uml.CallOperationAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onchangeExpressionSliced(org.eclipse.uml2.uml.ChangeEvent theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void onnestedClassifierSliced(org.eclipse.uml2.uml.Class theSrc, org.eclipse.uml2.uml.Classifier theTgt){
		 
	}
	def void onownedOperationSliced(org.eclipse.uml2.uml.Class theSrc, org.eclipse.uml2.uml.Operation theTgt){
		 
	}
	def void onownedReceptionSliced(org.eclipse.uml2.uml.Class theSrc, org.eclipse.uml2.uml.Reception theTgt){
		 
	}
	def void oncollaborationUseSliced(org.eclipse.uml2.uml.Classifier theSrc, org.eclipse.uml2.uml.CollaborationUse theTgt){
	}
	def void ongeneralizationSliced(org.eclipse.uml2.uml.Classifier theSrc, org.eclipse.uml2.uml.Generalization theTgt){
		 
	}
	def void onownedUseCaseSliced(org.eclipse.uml2.uml.Classifier theSrc, org.eclipse.uml2.uml.UseCase theTgt){
		 
	}
	def void onsubstitutionSliced(org.eclipse.uml2.uml.Classifier theSrc, org.eclipse.uml2.uml.Substitution theTgt){
		 
	}
	def void onobjectSliced(org.eclipse.uml2.uml.ClearAssociationAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onresultSliced(org.eclipse.uml2.uml.ClearStructuralFeatureAction theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void onroleBindingSliced(org.eclipse.uml2.uml.CollaborationUse theSrc, org.eclipse.uml2.uml.Dependency theTgt){
	}
	def void oncfragmentGateSliced(org.eclipse.uml2.uml.CombinedFragment theSrc, org.eclipse.uml2.uml.Gate theTgt){
		 
	}
	def void onoperandSliced(org.eclipse.uml2.uml.CombinedFragment theSrc, org.eclipse.uml2.uml.InteractionOperand theTgt){
		 
	}
	def void onpackagedElementSliced(org.eclipse.uml2.uml.Component theSrc, org.eclipse.uml2.uml.PackageableElement theTgt){
		 
	}
	def void onrealizationSliced(org.eclipse.uml2.uml.Component theSrc, org.eclipse.uml2.uml.ComponentRealization theTgt){
		 
	}
	def void onclauseSliced(org.eclipse.uml2.uml.ConditionalNode theSrc, org.eclipse.uml2.uml.Clause theTgt){
	}
	def void onresultSliced(org.eclipse.uml2.uml.ConditionalNode theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void onendSliced(org.eclipse.uml2.uml.Connector theSrc, org.eclipse.uml2.uml.ConnectorEnd theTgt){
		 
	}
	def void onspecificationSliced(org.eclipse.uml2.uml.Constraint theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void onresultSliced(org.eclipse.uml2.uml.CreateLinkObjectAction theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void onresultSliced(org.eclipse.uml2.uml.CreateObjectAction theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void onownedAttributeSliced(org.eclipse.uml2.uml.DataType theSrc, org.eclipse.uml2.uml.Property theTgt){
		 
	}
	def void onownedOperationSliced(org.eclipse.uml2.uml.DataType theSrc, org.eclipse.uml2.uml.Operation theTgt){
		 
	}
	def void onconfigurationSliced(org.eclipse.uml2.uml.Deployment theSrc, org.eclipse.uml2.uml.DeploymentSpecification theTgt){
		 
	}
	def void ondeploymentSliced(org.eclipse.uml2.uml.DeploymentTarget theSrc, org.eclipse.uml2.uml.Deployment theTgt){
		 
	}
	def void ontargetSliced(org.eclipse.uml2.uml.DestroyObjectAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onexprSliced(org.eclipse.uml2.uml.Duration theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void onownedCommentSliced(org.eclipse.uml2.uml.Element theSrc, org.eclipse.uml2.uml.Comment theTgt){
		 
	}
	def void onownedLiteralSliced(org.eclipse.uml2.uml.Enumeration theSrc, org.eclipse.uml2.uml.EnumerationLiteral theTgt){
		 
	}
	def void onhandlerSliced(org.eclipse.uml2.uml.ExecutableNode theSrc, org.eclipse.uml2.uml.ExceptionHandler theTgt){
		 
	}
	def void onoperandSliced(org.eclipse.uml2.uml.Expression theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void onconditionSliced(org.eclipse.uml2.uml.Extend theSrc, org.eclipse.uml2.uml.Constraint theTgt){
		 
	}
	def void onslotSliced(org.eclipse.uml2.uml.InstanceSpecification theSrc, org.eclipse.uml2.uml.Slot theTgt){
		 
	}
	def void onspecificationSliced(org.eclipse.uml2.uml.InstanceSpecification theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void onactionSliced(org.eclipse.uml2.uml.Interaction theSrc, org.eclipse.uml2.uml.Action theTgt){
		 
	}
	def void onformalGateSliced(org.eclipse.uml2.uml.Interaction theSrc, org.eclipse.uml2.uml.Gate theTgt){
		 
	}
	def void onfragmentSliced(org.eclipse.uml2.uml.Interaction theSrc, org.eclipse.uml2.uml.InteractionFragment theTgt){
		 
	}
	def void onlifelineSliced(org.eclipse.uml2.uml.Interaction theSrc, org.eclipse.uml2.uml.Lifeline theTgt){
		 
	}
	def void onmessageSliced(org.eclipse.uml2.uml.Interaction theSrc, org.eclipse.uml2.uml.Message theTgt){
		 
	}
	def void onmaxintSliced(org.eclipse.uml2.uml.InteractionConstraint theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void onminintSliced(org.eclipse.uml2.uml.InteractionConstraint theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void ongeneralOrderingSliced(org.eclipse.uml2.uml.InteractionFragment theSrc, org.eclipse.uml2.uml.GeneralOrdering theTgt){
		 
	}
	def void onfragmentSliced(org.eclipse.uml2.uml.InteractionOperand theSrc, org.eclipse.uml2.uml.InteractionFragment theTgt){
		 
	}
	def void onguardSliced(org.eclipse.uml2.uml.InteractionOperand theSrc, org.eclipse.uml2.uml.InteractionConstraint theTgt){
		 
	}
	def void onactualGateSliced(org.eclipse.uml2.uml.InteractionUse theSrc, org.eclipse.uml2.uml.Gate theTgt){
		 
	}
	def void onargumentSliced(org.eclipse.uml2.uml.InteractionUse theSrc, org.eclipse.uml2.uml.Action theTgt){
		 
	}
	def void onreturnValueSliced(org.eclipse.uml2.uml.InteractionUse theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void onnestedClassifierSliced(org.eclipse.uml2.uml.Interface theSrc, org.eclipse.uml2.uml.Classifier theTgt){
		 
	}
	def void onownedAttributeSliced(org.eclipse.uml2.uml.Interface theSrc, org.eclipse.uml2.uml.Property theTgt){
		 
	}
	def void onownedOperationSliced(org.eclipse.uml2.uml.Interface theSrc, org.eclipse.uml2.uml.Operation theTgt){
		 
	}
	def void onownedReceptionSliced(org.eclipse.uml2.uml.Interface theSrc, org.eclipse.uml2.uml.Reception theTgt){
		 
	}
	def void onprotocolSliced(org.eclipse.uml2.uml.Interface theSrc, org.eclipse.uml2.uml.ProtocolStateMachine theTgt){
		 
	}
	def void onargumentSliced(org.eclipse.uml2.uml.InvocationAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onjoinSpecSliced(org.eclipse.uml2.uml.JoinNode theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void onselectorSliced(org.eclipse.uml2.uml.Lifeline theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void onendDataSliced(org.eclipse.uml2.uml.LinkAction theSrc, org.eclipse.uml2.uml.LinkEndData theTgt){
		 
	}
	def void oninputValueSliced(org.eclipse.uml2.uml.LinkAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onqualifierSliced(org.eclipse.uml2.uml.LinkEndData theSrc, org.eclipse.uml2.uml.QualifierValue theTgt){
		 
	}
	def void onloopVariableInputSliced(org.eclipse.uml2.uml.LoopNode theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onresultSliced(org.eclipse.uml2.uml.LoopNode theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void onargumentSliced(org.eclipse.uml2.uml.Message theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void onlowerValueSliced(org.eclipse.uml2.uml.MultiplicityElement theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void onupperValueSliced(org.eclipse.uml2.uml.MultiplicityElement theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void onnameExpressionSliced(org.eclipse.uml2.uml.NamedElement theSrc, org.eclipse.uml2.uml.StringExpression theTgt){
	}
	def void onelementImportSliced(org.eclipse.uml2.uml.Namespace theSrc, org.eclipse.uml2.uml.ElementImport theTgt){
	}
	def void onownedRuleSliced(org.eclipse.uml2.uml.Namespace theSrc, org.eclipse.uml2.uml.Constraint theTgt){
	}
	def void onpackageImportSliced(org.eclipse.uml2.uml.Namespace theSrc, org.eclipse.uml2.uml.PackageImport theTgt){
	}
	def void onnestedNodeSliced(org.eclipse.uml2.uml.Node theSrc, org.eclipse.uml2.uml.Node theTgt){
		 
	}
	def void onupperBoundSliced(org.eclipse.uml2.uml.ObjectNode theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void oninputValueSliced(org.eclipse.uml2.uml.OpaqueAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onoutputValueSliced(org.eclipse.uml2.uml.OpaqueAction theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void onpackageMergeSliced(org.eclipse.uml2.uml.Package theSrc, org.eclipse.uml2.uml.PackageMerge theTgt){
		 
	}
	def void onpackagedElementSliced(org.eclipse.uml2.uml.Package theSrc, org.eclipse.uml2.uml.PackageableElement theTgt){
		 
	}
	def void onprofileApplicationSliced(org.eclipse.uml2.uml.Package theSrc, org.eclipse.uml2.uml.ProfileApplication theTgt){
		 
	}
	def void ondefaultValueSliced(org.eclipse.uml2.uml.Parameter theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void onconditionSliced(org.eclipse.uml2.uml.ParameterSet theSrc, org.eclipse.uml2.uml.Constraint theTgt){
	}
	def void ondefaultValueSliced(org.eclipse.uml2.uml.Property theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void onqualifierSliced(org.eclipse.uml2.uml.Property theSrc, org.eclipse.uml2.uml.Property theTgt){
		 
	}
	def void onconformanceSliced(org.eclipse.uml2.uml.ProtocolStateMachine theSrc, org.eclipse.uml2.uml.ProtocolConformance theTgt){
		 
	}
	def void onexceptionSliced(org.eclipse.uml2.uml.RaiseExceptionAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onresultSliced(org.eclipse.uml2.uml.ReadExtentAction theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void onobjectSliced(org.eclipse.uml2.uml.ReadIsClassifiedObjectAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onresultSliced(org.eclipse.uml2.uml.ReadIsClassifiedObjectAction theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void onresultSliced(org.eclipse.uml2.uml.ReadLinkAction theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void onobjectSliced(org.eclipse.uml2.uml.ReadLinkObjectEndAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onresultSliced(org.eclipse.uml2.uml.ReadLinkObjectEndAction theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void onobjectSliced(org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onresultSliced(org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void onresultSliced(org.eclipse.uml2.uml.ReadSelfAction theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void onresultSliced(org.eclipse.uml2.uml.ReadStructuralFeatureAction theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void onresultSliced(org.eclipse.uml2.uml.ReadVariableAction theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void onobjectSliced(org.eclipse.uml2.uml.ReclassifyObjectAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void oncollectionSliced(org.eclipse.uml2.uml.ReduceAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onresultSliced(org.eclipse.uml2.uml.ReduceAction theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void onsubvertexSliced(org.eclipse.uml2.uml.Region theSrc, org.eclipse.uml2.uml.Vertex theTgt){
		 
	}
	def void ontransitionSliced(org.eclipse.uml2.uml.Region theSrc, org.eclipse.uml2.uml.Transition theTgt){
		 
	}
	def void onremoveAtSliced(org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onremoveAtSliced(org.eclipse.uml2.uml.RemoveVariableValueAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onreplyValueSliced(org.eclipse.uml2.uml.ReplyAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onreturnInformationSliced(org.eclipse.uml2.uml.ReplyAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onrequestSliced(org.eclipse.uml2.uml.SendObjectAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void ontargetSliced(org.eclipse.uml2.uml.SendObjectAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void ontargetSliced(org.eclipse.uml2.uml.SendSignalAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onexecutableNodeSliced(org.eclipse.uml2.uml.SequenceNode theSrc, org.eclipse.uml2.uml.ExecutableNode theTgt){
		 
	}
	def void onownedAttributeSliced(org.eclipse.uml2.uml.Signal theSrc, org.eclipse.uml2.uml.Property theTgt){
		 
	}
	def void onvalueSliced(org.eclipse.uml2.uml.Slot theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void onobjectSliced(org.eclipse.uml2.uml.StartClassifierBehaviorAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onobjectSliced(org.eclipse.uml2.uml.StartObjectBehaviorAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onconnectionSliced(org.eclipse.uml2.uml.State theSrc, org.eclipse.uml2.uml.ConnectionPointReference theTgt){
		 
	}
	def void onconnectionPointSliced(org.eclipse.uml2.uml.State theSrc, org.eclipse.uml2.uml.Pseudostate theTgt){
		 
	}
	def void ondeferrableTriggerSliced(org.eclipse.uml2.uml.State theSrc, org.eclipse.uml2.uml.Trigger theTgt){
		 
	}
	def void ondoActivitySliced(org.eclipse.uml2.uml.State theSrc, org.eclipse.uml2.uml.Behavior theTgt){
		 
	}
	def void onentrySliced(org.eclipse.uml2.uml.State theSrc, org.eclipse.uml2.uml.Behavior theTgt){
		 
	}
	def void onexitSliced(org.eclipse.uml2.uml.State theSrc, org.eclipse.uml2.uml.Behavior theTgt){
		 
	}
	def void onregionSliced(org.eclipse.uml2.uml.State theSrc, org.eclipse.uml2.uml.Region theTgt){
		 
	}
	def void oninvariantSliced(org.eclipse.uml2.uml.StateInvariant theSrc, org.eclipse.uml2.uml.Constraint theTgt){
		 
	}
	def void onconnectionPointSliced(org.eclipse.uml2.uml.StateMachine theSrc, org.eclipse.uml2.uml.Pseudostate theTgt){
		 
	}
	def void onregionSliced(org.eclipse.uml2.uml.StateMachine theSrc, org.eclipse.uml2.uml.Region theTgt){
		 
	}
	def void oniconSliced(org.eclipse.uml2.uml.Stereotype theSrc, org.eclipse.uml2.uml.Image theTgt){
		 
	}
	def void onsubExpressionSliced(org.eclipse.uml2.uml.StringExpression theSrc, org.eclipse.uml2.uml.StringExpression theTgt){
		 
	}
	def void onobjectSliced(org.eclipse.uml2.uml.StructuralFeatureAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onedgeSliced(org.eclipse.uml2.uml.StructuredActivityNode theSrc, org.eclipse.uml2.uml.ActivityEdge theTgt){
		 
	}
	def void onnodeSliced(org.eclipse.uml2.uml.StructuredActivityNode theSrc, org.eclipse.uml2.uml.ActivityNode theTgt){
		 
	}
	def void onstructuredNodeInputSliced(org.eclipse.uml2.uml.StructuredActivityNode theSrc, org.eclipse.uml2.uml.ActivityNode theTgt){
		 
	}
	def void onvariableSliced(org.eclipse.uml2.uml.StructuredActivityNode theSrc, org.eclipse.uml2.uml.Variable theTgt){
		 
	}
	def void onownedAttributeSliced(org.eclipse.uml2.uml.StructuredClassifier theSrc, org.eclipse.uml2.uml.Property theTgt){
		 
	}
	def void onownedConnectorSliced(org.eclipse.uml2.uml.StructuredClassifier theSrc, org.eclipse.uml2.uml.Connector theTgt){
		 
	}
	def void onparameterSubstitutionSliced(org.eclipse.uml2.uml.TemplateBinding theSrc, org.eclipse.uml2.uml.TemplateParameterSubstitution theTgt){
		 
	}
	def void onownedDefaultSliced(org.eclipse.uml2.uml.TemplateParameter theSrc, org.eclipse.uml2.uml.ParameterableElement theTgt){
		 
	}
	def void onownedParameteredElementSliced(org.eclipse.uml2.uml.TemplateParameter theSrc, org.eclipse.uml2.uml.ParameterableElement theTgt){
		 
	}
	def void onownedActualSliced(org.eclipse.uml2.uml.TemplateParameterSubstitution theSrc, org.eclipse.uml2.uml.ParameterableElement theTgt){
		 
	}
	def void onownedParameterSliced(org.eclipse.uml2.uml.TemplateSignature theSrc, org.eclipse.uml2.uml.TemplateParameter theTgt){
		 
	}
	def void onownedTemplateSignatureSliced(org.eclipse.uml2.uml.TemplateableElement theSrc, org.eclipse.uml2.uml.TemplateSignature theTgt){
		 
	}
	def void ontemplateBindingSliced(org.eclipse.uml2.uml.TemplateableElement theSrc, org.eclipse.uml2.uml.TemplateBinding theTgt){
		 
	}
	def void onfirstSliced(org.eclipse.uml2.uml.TestIdentityAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onresultSliced(org.eclipse.uml2.uml.TestIdentityAction theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void onsecondSliced(org.eclipse.uml2.uml.TestIdentityAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onwhenSliced(org.eclipse.uml2.uml.TimeEvent theSrc, org.eclipse.uml2.uml.TimeExpression theTgt){
		 
	}
	def void onexprSliced(org.eclipse.uml2.uml.TimeExpression theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void oneffectSliced(org.eclipse.uml2.uml.Transition theSrc, org.eclipse.uml2.uml.Behavior theTgt){
		 
	}
	def void ontriggerSliced(org.eclipse.uml2.uml.Transition theSrc, org.eclipse.uml2.uml.Trigger theTgt){
		 
	}
	def void onobjectSliced(org.eclipse.uml2.uml.UnmarshallAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onresultSliced(org.eclipse.uml2.uml.UnmarshallAction theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void onextendSliced(org.eclipse.uml2.uml.UseCase theSrc, org.eclipse.uml2.uml.Extend theTgt){
		 
	}
	def void onextensionPointSliced(org.eclipse.uml2.uml.UseCase theSrc, org.eclipse.uml2.uml.ExtensionPoint theTgt){
		 
	}
	def void onincludeSliced(org.eclipse.uml2.uml.UseCase theSrc, org.eclipse.uml2.uml.Include theTgt){
		 
	}
	def void onvalueSliced(org.eclipse.uml2.uml.ValuePin theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void onresultSliced(org.eclipse.uml2.uml.ValueSpecificationAction theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void onvalueSliced(org.eclipse.uml2.uml.ValueSpecificationAction theSrc, org.eclipse.uml2.uml.ValueSpecification theTgt){
		 
	}
	def void onresultSliced(org.eclipse.uml2.uml.WriteStructuralFeatureAction theSrc, org.eclipse.uml2.uml.OutputPin theTgt){
		 
	}
	def void onvalueSliced(org.eclipse.uml2.uml.WriteStructuralFeatureAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}
	def void onvalueSliced(org.eclipse.uml2.uml.WriteVariableAction theSrc, org.eclipse.uml2.uml.InputPin theTgt){
		 
	}

	protected def void onStart(){
	}

	protected def void onEnd(){
	}

	def void reinit() {	}
}
