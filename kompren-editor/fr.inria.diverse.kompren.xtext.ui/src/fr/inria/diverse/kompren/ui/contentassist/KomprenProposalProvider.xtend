package fr.inria.diverse.kompren.ui.contentassist

import java.util.HashMap
import org.eclipse.jface.viewers.StyledString
import org.eclipse.swt.graphics.Image
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal

class KomprenProposalProvider extends AbstractKomprenProposalProvider {
	val static values = {
		val map = new HashMap<String, String>()
		
		map.put("slicer", "Defining a Slicer

slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 }

A model slicer is a tool that extracts a subset of model elements for a specific purpose. This is the root concept of the Kompren language. Type `slicer`. 
The `name` of the slicer must be defined. The name of the slicer. The expected format is a qualified named (e.g., `pkg1.Class1`). In our example, type: `Slicer1 `.

Type `{`. 

The source metamodel URIs must be defined. It defines the URI of the Ecore models used to define the slicer. The slicer will be based on the model elements of these metamodels. Genmodels of the metamodels must be provided here. The expected format is a string literal (between double quotes).
Type `domain :`. 
Then, give the value, here: `'platform:/resource/test/src/main/ex1.genmodel' `.
The input classes must be defined. It defines the classes of the input metamodels that will be considered during the slicing process. The expected format is a qualified named (e.g., `pkg1.Class1`).
Type `input :`. 
Then, give the value, here: `ex1.A `.

Type `}`.")

		map.put("slicedClass", "Defining a SlicedClass
```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	slicedClass : 	ex1.A 

 }

When a sliced class is selected from the input metamodels, instances of this class will be sliced and put in the output model slice. The sliced element must be defined. It defines the element of metamodel targeted by this slicing feature. The expected format is a qualified named (e.g., `pkg1.Class1`).
Then, give the value, here: `ex1.A `.")
		
		map.put("slicedProperty", "Defining a SlicedProperty

slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	slicedProperty : 	ex1.A.d 

 }

When a property is selected from the input metamodels, instances of this property will be sliced and put in the output model slice. The sliced element must be defined. It defines the element of metamodel targeted by this slicing feature. The expected format is a qualified named (e.g., `pkg1.Class1`).
Then, give the value, here: `ex1.A.d `.")
		
		map.put("constraint", "Defining a Constraint

slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	slicedClass : ex1.D 	constraint : checkDAttr [[ theD.dAttr ]]
 

 }

A constraint can be added to restrict the slicing process. The produced slicer will have a parameter to state whether this constraint has to be used. The `name` of the constraint must be defined. It defines the name of the constraint that will be the name of the corresponding parameter of the slicer. The expected format is a simple variable name (i.e. must follow the Java naming convention). In our example, type: `checkDAttr `.


The boolean expression of the constraint must be defined. It defines the predicate (to write in Xtend) that will be used to checked whether the constraint can be applied. The expected format is a block of Xtend code (between `[[` `]]`). In our example, type: `[[ theD.dAttr ]]
 `.")
 
 	map.put("helper", "Defining a helper

slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	helper [[ println(\"Defining the helper\")
// data can be used in all the expressions of the slicer.
val data = newArrayList() ]]
 
 }

It defines a block of statements (written in Kermeta3), such as variables, operations, that can be used in other blocks (e.g. onStart). Then, give the value, here: `[[ println(\"Defining the helper\")
// data can be used in all the expressions of the slicer.
val data = newArrayList() ]]
 `.");
		
	map.put("radius", "Defining a Radius

```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	radius : 	ex1.A 

 }
```
The radius is used to filter the sliced elements in the input model. The radius works as follows: Starting at 0, a value is incremented on each visited class instance focused by the radius. The slicing process stops when no elements can be sliced anymore or when this value is greater than the radius given as parameter. The value of the radius is specificed by the user of the slicer. The classes of the radius must be defined. The expected format is a qualified named (e.g., `pkg1.Class1`).
Then, give the value, here: `ex1.A `.")	
		
	map.put("opposite", "Defining a OppositeCreation

```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	slicedProperty : ex1.C.ce 	opposite ( ceOpposite )

 }
```
An opposite can be used when the slicer has to go throw a relation in its opposite way. The `name` of the opposite reference must be defined. It defines the name of the new relation that goes in the opposite way than the relation specified. The expected format is a simple variable name (i.e. must follow the Java naming convention).
Type `opposite (`. 

Then, give the value, here: `ceOpposite `.


Type `)`. ")

	map.put("onStart", "Defining a pre-execution code block

```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	onStart [[ println(\"starting the slicing process!\") ]]
 
 }
```
It defines a block of Kermeta 3 statements that are executed before the slicing process. Then, give the value, here: `[[ println(\"starting the slicing process!\") ]]
 `.");
 
	map.put("onEnd", "Defining a post-execution code block

```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	onEnd [[ println(\"ending the slicing process.\") ]]
 
 }
```
It defines a block of Kermeta 3 statements that are executed after the slicing process. Then, give the value, here: `[[ println(\"ending the slicing process.\") ]]
 `.")
 
 	map.put("option", "Defining an optional element to slice

```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	slicedClass : ex1.A option
 }
```
If optional, an option will be added to the slicer to state whether this slicing element has to be considered during the slicing. Type `option`. 
")
		
		map
	}
	
	override ConfigurableCompletionProposal doCreateProposal(String proposal, StyledString displayString, Image image,
		int replacementOffset, int replacementLength) {

		val cc = new ConfigurableCompletionProposal(proposal, replacementOffset, replacementLength, proposal.length(),
			image, displayString, null, values.get(proposal))
		return cc;
	}
	
	
//	static class DocCompletionProposal extends ConfigurableCompletionProposal {
//		new(String replacementString, int replacementOffset, int replacementLength, int cursorPosition, Image image, StyledString displayString, IContextInformation contextInformation, String additionalProposalInfo) {
//			super(replacementString, replacementOffset, replacementLength, cursorPosition, image, displayString, contextInformation, additionalProposalInfo)
//		}
//		
//		override IInformationControlCreator getInformationControlCreator() {
//			new MyInformationControlCreator()
//		}
//	}
//	
//	
//	static class MyInformationControlCreator implements IInformationControlCreator {
//		
//		override createInformationControl(Shell parent) {
//			new BrowserInformationControl(parent, null, true)
//		}
//		
//	}
	
//    static class DocProposalDelegate extends Delegate {
//		ContentAssistContext ctx
//
//		new(ICompletionProposalAcceptor delegate, ContentAssistContext ctx) {
//			super(delegate)
//			this.ctx = ctx
//		}
//
//		override accept(ICompletionProposal proposal) {
//			println("coucoucoucou")
//			super.accept(proposal)
//		}
//
//	}
}
