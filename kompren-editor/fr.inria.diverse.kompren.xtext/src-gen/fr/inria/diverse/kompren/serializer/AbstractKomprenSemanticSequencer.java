package fr.inria.diverse.kompren.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.inria.diverse.kompren.services.KomprenGrammarAccess;
import kompren.Constraint;
import kompren.KomprenPackage;
import kompren.OppositeCreation;
import kompren.Radius;
import kompren.SlicedClass;
import kompren.SlicedProperty;
import kompren.Slicer;
import kompren.VarDecl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractKomprenSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private KomprenGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == KomprenPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case KomprenPackage.CONSTRAINT:
				if(context == grammarAccess.getConstraintRule()) {
					sequence_Constraint(context, (Constraint) semanticObject); 
					return; 
				}
				else break;
			case KomprenPackage.OPPOSITE_CREATION:
				if(context == grammarAccess.getOppositeCreationRule()) {
					sequence_OppositeCreation(context, (OppositeCreation) semanticObject); 
					return; 
				}
				else break;
			case KomprenPackage.RADIUS:
				if(context == grammarAccess.getRadiusRule()) {
					sequence_Radius(context, (Radius) semanticObject); 
					return; 
				}
				else break;
			case KomprenPackage.SLICED_CLASS:
				if(context == grammarAccess.getSlicedClassRule()) {
					sequence_SlicedClass(context, (SlicedClass) semanticObject); 
					return; 
				}
				else break;
			case KomprenPackage.SLICED_PROPERTY:
				if(context == grammarAccess.getSlicedPropertyRule()) {
					sequence_SlicedProperty(context, (SlicedProperty) semanticObject); 
					return; 
				}
				else break;
			case KomprenPackage.SLICER:
				if(context == grammarAccess.getSlicerRule()) {
					sequence_Slicer(context, (Slicer) semanticObject); 
					return; 
				}
				else break;
			case KomprenPackage.VAR_DECL:
				if(context == grammarAccess.getVarDeclRule()) {
					sequence_VarDecl(context, (VarDecl) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=EString expression=EString)
	 */
	protected void sequence_Constraint(EObject context, Constraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KomprenPackage.Literals.CONSTRAINT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KomprenPackage.Literals.CONSTRAINT__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, KomprenPackage.Literals.CONSTRAINT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KomprenPackage.Literals.CONSTRAINT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstraintAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConstraintAccess().getExpressionEStringParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_OppositeCreation(EObject context, OppositeCreation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KomprenPackage.Literals.OPPOSITE_CREATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KomprenPackage.Literals.OPPOSITE_CREATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOppositeCreationAccess().getNameEStringParserRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((focusedClasses+=[SlicedClass|QName] focusedClasses+=[SlicedClass|QName]*)?)
	 */
	protected void sequence_Radius(EObject context, Radius semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (domain=[EClass|QName] isOption?='option'? ctx=VarDecl? expression=EString? constraints+=Constraint*)
	 */
	protected void sequence_SlicedClass(EObject context, SlicedClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         domain=[EStructuralFeature|QName] 
	 *         isOption?='option'? 
	 *         opposite=OppositeCreation? 
	 *         src=VarDecl? 
	 *         tgt=VarDecl? 
	 *         expression=EString? 
	 *         constraints+=Constraint*
	 *     )
	 */
	protected void sequence_SlicedProperty(EObject context, SlicedProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         active?='active'? 
	 *         strict?='strict'? 
	 *         name=QName 
	 *         uriMetamodel+=EString+ 
	 *         inputClasses+=[EClass|QName] 
	 *         inputClasses+=[EClass|QName]* 
	 *         radius=Radius? 
	 *         slicedElements+=SlicedClass* 
	 *         slicedElements+=SlicedProperty* 
	 *         onStart=EString? 
	 *         onEnd=EString? 
	 *         helper=EString?
	 *     )
	 */
	protected void sequence_Slicer(EObject context, Slicer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     varName=EString
	 */
	protected void sequence_VarDecl(EObject context, VarDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
