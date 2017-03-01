Kompren
=======

An eclipse tool for modelling and generating model slicers.

Papers on Kompren:

- Kompren: Modeling and Generating Model Slicers, Journal of Software and Systems Modeling (SoSyM), 2015. http://hal.inria.fr/docs/00/74/65/66/PDF/slicer.pdf
- Modeling Model Slicers, ACM/IEEE 14th International Conference on Model Driven Engineering Languages and Systems (MODELS'11), 2011. http://hal.inria.fr/docs/00/60/90/72/PDF/BLO11b.pdf

## Tutorials

This section contains a serie of tutorials to help start the learning of the language and its syntax. 

### <a name="Defining-a-Slicer"></a>Defining a Slicer

```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 }
```
A model slicer is a tool that extracts a subset of model elements for a specific purpose. This is the root concept of the Kompren language. Type `slicer`. 

The `name` of the slicer must be defined. The name of the slicer. The expected format is a qualified named (e.g., `pkg1.Class1`). In our example, type: `Slicer1 `.


Type `{`. 

The source metamodel URIs must be defined. It defines the URI of the Ecore models used to define the slicer. The slicer will be based on the model elements of these metamodels. Genmodels of the metamodels must be provided here. The expected format is a string literal (between double quotes). 
Type `domain :`. 
Then, give the value, here: `'platform:/resource/test/src/main/ex1.genmodel' `

The input classes must be defined. It defines the classes of the input metamodels that will be considered during the slicing process. The expected format is a qualified named (e.g., `pkg1.Class1`). 
Type `input :`. 
Then, give the value, here: `ex1.A `


Type `}`. 


### <a name="Defining-a-Radius"></a>Defining a Radius

```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	radius : 	ex1.A 

 }
```
The radius is used to filter the sliced elements in the input model. The radius works as follows: Starting at 0, a value is incremented on each visited class instance focused by the radius. The slicing process stops when no elements can be sliced anymore or when this value is greater than the radius given as parameter. The value of the radius is specificed by the user of the slicer. The classes of the radius must be defined. The expected format is a qualified named (e.g., `pkg1.Class1`). In our example, type: `ex1.A `.
Then, give the value, here: `ex1.A `


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)

### <a name="Defining-a-SlicedClass"></a>Defining a SlicedClass

```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	slicedClass : 	ex1.A 

 }
```
When a sliced class is selected from the input metamodels, instances of this class will be sliced and put in the output model slice. The sliced element must be defined. It defines the element of metamodel targeted by this slicing feature. The expected format is a qualified named (e.g., `pkg1.Class1`). In our example, type: `ex1.A `.
Then, give the value, here: `ex1.A `


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)


### <a name="Defining-a-SlicedProperty"></a>Defining a SlicedProperty

```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	slicedProperty : 	ex1.A.d 

 }
```
When a property is selected from the input metamodels, instances of this property will be sliced and put in the output model slice. The sliced element must be defined. It defines the element of metamodel targeted by this slicing feature. The expected format is a qualified named (e.g., `pkg1.Class1`). In our example, type: `ex1.A.d `.
Then, give the value, here: `ex1.A.d `


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)

### <a name="Defining-a-helper"></a>Defining a helper

```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	helper [[ println("Defining the helper")
// data can be used in all the expressions of the slicer.
val data = newArrayList() ]]
 
 }
```
It defines a block of statements (written in Kermeta3), such as variables, operations, that can be used in other blocks (e.g. onStart). Then, give the value, here: `[[ println("Defining the helper")
// data can be used in all the expressions of the slicer.
val data = newArrayList() ]]
 `


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)


### <a name="Defining-a-post-execution-code-block"></a>Defining a post-execution code block

```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	onEnd [[ println("ending the slicing process.") ]]
 
 }
```
It defines a block of Kermeta 3 statements that are executed after the slicing process. Then, give the value, here: `[[ println("ending the slicing process.") ]]
 `


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)


### <a name="Defining-a-pre-execution-code-block"></a>Defining a pre-execution code block

```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	onStart [[ println("starting the slicing process!") ]]
 
 }
```
It defines a block of Kermeta 3 statements that are executed before the slicing process. Then, give the value, here: `[[ println("starting the slicing process!") ]]
 `


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)


### <a name="Defining-an-optional-element-to-slice"></a>Defining an optional element to slice

```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	slicedClass : ex1.A option
 }
```
If optional, an option will be added to the slicer to state whether this slicing element has to be considered during the slicing. Type `option`. 


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)<br/>
[Defining a SlicedClass](Defining-a-SlicedClass)


### <a name="Defining-an-expression"></a>Defining an expression

```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	slicedClass : ex1.A [[ println("Slicing a " + theA) ]]
 
 }
```
It defines the Xtend code executed when an instance of this element is sliced. It does not work with strict slicer. The boolean expression of the constraint must be defined. It defines the Xtend code executed when an instance of this element is sliced. It does not work with strict slicer. The expected format is a block of Xtend code (between `[[` `]]`). In our example, type: `[[ println("Slicing a " + theA) ]]
 `.


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)<br/>
[Defining a SlicedClass](Defining-a-SlicedClass)


### <a name="Defining-a-Constraint"></a>Defining a Constraint

```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	slicedClass : ex1.D 	constraint : checkDAttr [[ theD.dAttr ]]
 

 }
```
A constraint can be added to restrict the slicing process. The produced slicer will have a parameter to state whether this constraint has to be used. The `name` of the slicer must be defined. It defines the name of the constraint that will be the name of the corresponding parameter of the slicer. The expected format is a simple variable name (i.e. must follow the Java naming convention). In our example, type: `checkDAttr `.


The boolean expression of the constraint must be defined. It defines the predicate (to write in Xtend) that will be used to checked whether the constraint can be applied. The expected format is a block of Xtend code (between `[[` `]]`). In our example, type: `[[ theD.dAttr ]]
 `.


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)<br/>
[Defining a SlicedClass](Defining-a-SlicedClass)


### <a name="Defining-a-VarDecl"></a>Defining a VarDecl

```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	slicedClass : ex1.A 	theA 

 }
```
In some cases, a variable declaration to required to perform some actions while slicing a model. `varName` must be defined. It defines the name of the declared variable. The expected format is a simple variable name (i.e. must follow the Java naming convention). In our example, type: `theA `.
Then, give the value, here: `theA `


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)<br/>
[Defining a SlicedClass](Defining-a-SlicedClass)


### <a name="Defining-a-strict-slicer"></a>Defining a strict slicer

```
slicer strict Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	slicedClass : 	ex1.A 

 }
```
It defines a slicer as a strict slicer. A strict slicer produces as output a model that is always conformed to its input metamodel. This means that some classes, relations, attributes may be sliced while not selected by the user. Type `strict`. 


See also:<br/>
[Defining a Slicer](Defining-a-Slicer)<br/>
[Defining a SlicedClass](Defining-a-SlicedClass)


### <a name="Defining-a-OppositeCreation"></a>Defining a OppositeCreation

```
slicer Slicer1 {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	slicedProperty : ex1.C.ce 	opposite ( ceOpposite )

 }
```
An opposite can be used when the slicer has to go throw a relation in its opposite way. The `name` of the slicer must be defined. It defines the name of the new relation that goes in the opposite way than the relation specified. The expected format is a simple variable name (i.e. must follow the Java naming convention). In our example, type: `ceOpposite `.
Type `opposite (`. 

Then, give the value, here: `ceOpposite `


Type `)`. 

See also:<br/>
[Defining a Slicer](Defining-a-Slicer)<br/>
[Defining a SlicedProperty](Defining-a-SlicedProperty)


