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
slicer Slicer1  {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 }
```
A model slicer is a tool that extracts a subset of model elements for a specific purpose. This is the root concept of the Kompren language. Type `slicer`. 

The `name` of the slicer must be defined. The name of the slicer. The expected format is a qualified named (e.g., `pkg1.Class1`).  For our example type `Slicer1`. 

Type `{`. 

The source metamodel URIs must be defined. It defines the URI of the Ecore models used to define the slicer. The slicer will be based on the model elements of these metamodels. Genmodels of the metamodels must be provided here. The expected format is a string literal (between double quotes). 
Type `domain :`. 
Then, give the value, here: `'platform:/resource/test/src/main/ex1.genmodel'`.

The input classes must be defined. It defines the classes of the input metamodels that will be considered during the slicing process. The expected format is a qualified named (e.g., `pkg1.Class1`). 
Type `input :`. 
Then, give the value, here: `ex1.A`. 


Type `}`. 


### <a name="Defining-a-Radius"></a>Defining a Radius

```
slicer Slicer1  {
 	domain : 'platform:/resource/test/src/main/ex1.genmodel' 
 	input : ex1.A 
 	radius : 	ex1.A 

 }
```
The radius is used to filter the sliced elements in the input model. The radius works as follows: Starting at 0, a value is incremented on each visited class instance focused by the radius. The slicing process stops when no elements can be sliced anymore or when this value is greater than the radius given as parameter. The value of the radius is specificed by the user of the slicer. The classes of the radius must be defined. The expected format is a qualified named (e.g., `pkg1.Class1`). 
Then, give the value, here: `ex1.A`.


See also:

[Defining a Slicer](#Defining-a-Slicer)

