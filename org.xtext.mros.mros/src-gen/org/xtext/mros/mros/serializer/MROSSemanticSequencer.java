/*
 * generated by Xtext 2.21.0
 */
package org.xtext.mros.mros.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.mros.mros.mROS.ActionType;
import org.xtext.mros.mros.mROS.Clutterness;
import org.xtext.mros.mros.mROS.Component;
import org.xtext.mros.mros.mROS.Configuration;
import org.xtext.mros.mros.mROS.Context;
import org.xtext.mros.mros.mROS.ERROR;
import org.xtext.mros.mros.mROS.Environment;
import org.xtext.mros.mros.mROS.Feedback;
import org.xtext.mros.mros.mROS.GoalDefinition;
import org.xtext.mros.mros.mROS.INPROGRESS;
import org.xtext.mros.mros.mROS.MROSPackage;
import org.xtext.mros.mros.mROS.MessageDefinition;
import org.xtext.mros.mros.mROS.Model;
import org.xtext.mros.mros.mROS.Narowness;
import org.xtext.mros.mros.mROS.ParameterType;
import org.xtext.mros.mros.mROS.QualityAttribute;
import org.xtext.mros.mros.mROS.QualityModel;
import org.xtext.mros.mros.mROS.ResultDefinition;
import org.xtext.mros.mros.mROS.SUCCESS;
import org.xtext.mros.mros.mROS.SkillDefinition;
import org.xtext.mros.mros.mROS.SkillRealization;
import org.xtext.mros.mros.mROS.SystemMode;
import org.xtext.mros.mros.services.MROSGrammarAccess;

@SuppressWarnings("all")
public class MROSSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MROSGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MROSPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MROSPackage.ACTION:
				sequence_Action(context, (org.xtext.mros.mros.mROS.Action) semanticObject); 
				return; 
			case MROSPackage.ACTION_TYPE:
				sequence_ActionType(context, (ActionType) semanticObject); 
				return; 
			case MROSPackage.CLUTTERNESS:
				sequence_Clutterness(context, (Clutterness) semanticObject); 
				return; 
			case MROSPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case MROSPackage.CONFIGURATION:
				sequence_Configuration(context, (Configuration) semanticObject); 
				return; 
			case MROSPackage.CONTEXT:
				sequence_Context(context, (Context) semanticObject); 
				return; 
			case MROSPackage.ERROR:
				sequence_ERROR(context, (ERROR) semanticObject); 
				return; 
			case MROSPackage.ENVIRONMENT:
				sequence_Environment(context, (Environment) semanticObject); 
				return; 
			case MROSPackage.FEEDBACK:
				sequence_Feedback(context, (Feedback) semanticObject); 
				return; 
			case MROSPackage.GOAL_DEFINITION:
				sequence_GoalDefinition(context, (GoalDefinition) semanticObject); 
				return; 
			case MROSPackage.INPROGRESS:
				sequence_INPROGRESS(context, (INPROGRESS) semanticObject); 
				return; 
			case MROSPackage.MESSAGE_DEFINITION:
				sequence_MessageDefinition(context, (MessageDefinition) semanticObject); 
				return; 
			case MROSPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MROSPackage.NAROWNESS:
				sequence_Narowness(context, (Narowness) semanticObject); 
				return; 
			case MROSPackage.PARAMETER:
				if (rule == grammarAccess.getMessagePartRule()) {
					sequence_MessagePart(context, (org.xtext.mros.mros.mROS.Parameter) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (org.xtext.mros.mros.mROS.Parameter) semanticObject); 
					return; 
				}
				else break;
			case MROSPackage.PARAMETER_TYPE:
				sequence_ParameterType(context, (ParameterType) semanticObject); 
				return; 
			case MROSPackage.QUALITY_ATTRIBUTE:
				sequence_QualityAttribute(context, (QualityAttribute) semanticObject); 
				return; 
			case MROSPackage.QUALITY_MODEL:
				sequence_QualityModel(context, (QualityModel) semanticObject); 
				return; 
			case MROSPackage.RESULT_DEFINITION:
				sequence_ResultDefinition(context, (ResultDefinition) semanticObject); 
				return; 
			case MROSPackage.SUCCESS:
				sequence_SUCCESS(context, (SUCCESS) semanticObject); 
				return; 
			case MROSPackage.SKILL_DEFINITION:
				sequence_SkillDefinition(context, (SkillDefinition) semanticObject); 
				return; 
			case MROSPackage.SKILL_REALIZATION:
				sequence_SkillRealization(context, (SkillRealization) semanticObject); 
				return; 
			case MROSPackage.SYSTEM_MODE:
				sequence_SystemMode(context, (SystemMode) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ActionType returns ActionType
	 *
	 * Constraint:
	 *     (name=ID goal=GoalDefinition? result=ResultDefinition? feedback=Feedback?)
	 */
	protected void sequence_ActionType(ISerializationContext context, ActionType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (name=ID i=Parameter at=ActionType q+=QualityModel q+=QualityModel*)
	 */
	protected void sequence_Action(ISerializationContext context, org.xtext.mros.mros.mROS.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnvironmentParameter returns Clutterness
	 *     Clutterness returns Clutterness
	 *
	 * Constraint:
	 *     value=Double
	 */
	protected void sequence_Clutterness(ISerializationContext context, Clutterness semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MROSPackage.Literals.ENVIRONMENT_PARAMETER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MROSPackage.Literals.ENVIRONMENT_PARAMETER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClutternessAccess().getValueDoubleParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Component returns Component
	 *
	 * Constraint:
	 *     (name=ID observable?='observable'? p+=Configuration p+=Configuration*)
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Configuration returns Configuration
	 *
	 * Constraint:
	 *     (name=QualifiedMode (p+=Parameter p+=Parameter*)?)
	 */
	protected void sequence_Configuration(ISerializationContext context, Configuration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Context returns Context
	 *
	 * Constraint:
	 *     type=ContextType
	 */
	protected void sequence_Context(ISerializationContext context, Context semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MROSPackage.Literals.CONTEXT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MROSPackage.Literals.CONTEXT__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getContextAccess().getTypeContextTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ResultType returns ERROR
	 *     ERROR returns ERROR
	 *
	 * Constraint:
	 *     ((value=STRING value=Double) | value=Double)?
	 */
	protected void sequence_ERROR(ISerializationContext context, ERROR semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Environment returns Environment
	 *
	 * Constraint:
	 *     (name=ID parameterlist+=EnvironmentParameter parameterlist+=EnvironmentParameter*)
	 */
	protected void sequence_Environment(ISerializationContext context, Environment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feedback returns Feedback
	 *
	 * Constraint:
	 *     feedback=MessageDefinition
	 */
	protected void sequence_Feedback(ISerializationContext context, Feedback semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MROSPackage.Literals.FEEDBACK__FEEDBACK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MROSPackage.Literals.FEEDBACK__FEEDBACK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFeedbackAccess().getFeedbackMessageDefinitionParserRuleCall_0(), semanticObject.getFeedback());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GoalDefinition returns GoalDefinition
	 *
	 * Constraint:
	 *     goal=MessageDefinition
	 */
	protected void sequence_GoalDefinition(ISerializationContext context, GoalDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MROSPackage.Literals.GOAL_DEFINITION__GOAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MROSPackage.Literals.GOAL_DEFINITION__GOAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGoalDefinitionAccess().getGoalMessageDefinitionParserRuleCall_0(), semanticObject.getGoal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ResultType returns INPROGRESS
	 *     INPROGRESS returns INPROGRESS
	 *
	 * Constraint:
	 *     ((value=STRING value=Double) | value=Double)?
	 */
	protected void sequence_INPROGRESS(ISerializationContext context, INPROGRESS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessageDefinition returns MessageDefinition
	 *
	 * Constraint:
	 *     (MessagePart+=MessagePart MessagePart+=MessagePart*)
	 */
	protected void sequence_MessageDefinition(ISerializationContext context, MessageDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessagePart returns Parameter
	 *
	 * Constraint:
	 *     p=ParameterType
	 */
	protected void sequence_MessagePart(ISerializationContext context, org.xtext.mros.mros.mROS.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MROSPackage.Literals.PARAMETER__P) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MROSPackage.Literals.PARAMETER__P));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMessagePartAccess().getPParameterTypeParserRuleCall_0(), semanticObject.getP());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     SkillDefinitionSet+=SkillDefinition+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnvironmentParameter returns Narowness
	 *     Narowness returns Narowness
	 *
	 * Constraint:
	 *     value=Double
	 */
	protected void sequence_Narowness(ISerializationContext context, Narowness semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MROSPackage.Literals.ENVIRONMENT_PARAMETER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MROSPackage.Literals.ENVIRONMENT_PARAMETER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNarownessAccess().getValueDoubleParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterType returns ParameterType
	 *
	 * Constraint:
	 *     (name=ID value=AbstractType)
	 */
	protected void sequence_ParameterType(ISerializationContext context, ParameterType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MROSPackage.Literals.PARAMETER_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MROSPackage.Literals.PARAMETER_TYPE__NAME));
			if (transientValues.isValueTransient(semanticObject, MROSPackage.Literals.PARAMETER_TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MROSPackage.Literals.PARAMETER_TYPE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterTypeAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterTypeAccess().getValueAbstractTypeParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (name=QualifiedName value=STRING? value=Double?)
	 */
	protected void sequence_Parameter(ISerializationContext context, org.xtext.mros.mros.mROS.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     QualityAttribute returns QualityAttribute
	 *
	 * Constraint:
	 *     (name='safety' | name='performance' | name='energy')
	 */
	protected void sequence_QualityAttribute(ISerializationContext context, QualityAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     QualityModel returns QualityModel
	 *
	 * Constraint:
	 *     (qa=QualityAttribute qvalue=Double e=Environment*)
	 */
	protected void sequence_QualityModel(ISerializationContext context, QualityModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ResultDefinition returns ResultDefinition
	 *
	 * Constraint:
	 *     result=MessageDefinition
	 */
	protected void sequence_ResultDefinition(ISerializationContext context, ResultDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MROSPackage.Literals.RESULT_DEFINITION__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MROSPackage.Literals.RESULT_DEFINITION__RESULT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getResultDefinitionAccess().getResultMessageDefinitionParserRuleCall_0(), semanticObject.getResult());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ResultType returns SUCCESS
	 *     SUCCESS returns SUCCESS
	 *
	 * Constraint:
	 *     ((value=STRING value=Double) | value=Double)?
	 */
	protected void sequence_SUCCESS(ISerializationContext context, SUCCESS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SkillDefinition returns SkillDefinition
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         listqa+=QualityAttribute 
	 *         listqa+=QualityAttribute* 
	 *         (p+=ParameterType p+=ParameterType*)* 
	 *         (p+=ParameterType p+=ParameterType*)* 
	 *         result+=ResultType 
	 *         result+=ResultType* 
	 *         realizations+=SkillRealization*
	 *     )
	 */
	protected void sequence_SkillDefinition(ISerializationContext context, SkillDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SkillRealization returns SkillRealization
	 *
	 * Constraint:
	 *     (name=ID c+=Component c+=Component* (q+=QualityModel q+=QualityModel*)? context=Context)
	 */
	protected void sequence_SkillRealization(ISerializationContext context, SkillRealization semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SystemMode returns SystemMode
	 *
	 * Constraint:
	 *     (name=ID c+=Component c+=Component*)
	 */
	protected void sequence_SystemMode(ISerializationContext context, SystemMode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
