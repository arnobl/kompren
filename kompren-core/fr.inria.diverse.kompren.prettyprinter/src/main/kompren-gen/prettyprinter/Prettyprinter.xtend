package prettyprinter
import kompren.*
import kompren.impl.*
import org.eclipse.emf.ecore.*
import org.eclipse.emf.ecore.impl.*

import static extension prettyprinter.__SlicerAspect__.*
import static extension prettyprinter.SlicerAspect.*
import static extension prettyprinter.SlicedClassAspect.*
import static extension prettyprinter.SlicedPropertyAspect.*
import static extension prettyprinter.RadiusAspect.*
import static extension prettyprinter.ConstraintAspect.*

import static extension prettyprinter.__SlicerAspect__.*
import static extension prettyprinter.SlicerAspect.*
import static extension prettyprinter.SlicedClassAspect.*
import static extension prettyprinter.SlicedPropertyAspect.*
import static extension prettyprinter.RadiusAspect.*
import static extension prettyprinter.ConstraintAspect.*
import java.util.List

class Prettyprinter{

	public val buf = new StringBuilder
	val dbleBrack = "] ]".replaceAll(" ", "")	

	private static def String qualifiedName(ENamedElement elt) {
		if(elt==null) return ""
		var qn = elt.name
		if(elt.eContainer instanceof ENamedElement) 
			qn = qualifiedName(elt.eContainer as ENamedElement) + "." + qn
		qn
	}
	
	val List<Slicer> inputSlicer

	new(List<Slicer> inputSlicer){
		this.inputSlicer = inputSlicer
	}

	def void slice(){
		onStart
		inputSlicer?.forEach[visitToAddClasses(this)]
		inputSlicer?.forEach[visitToAddRelations(this)]
		onEnd
	}

	def void onSlicerSliced(Slicer sl){
		
	buf.append("slicer ")
	if(sl.isStrict) buf.append("strict ")
	if(sl.isActive) buf.append("active ") 
	buf.append(sl.name).append("{\n")
	sl.uriMetamodel.forEach[uri | buf.append("\tdomain: \"").append(uri).append("\"\n")]
	buf.append("\tinput: ")
	buf.append(sl.inputClasses.map[in | qualifiedName(in)].join(", ")).append('\n')
	
	}
	def void onSlicedClassSliced(SlicedClass sc){
		
	buf.append("\tslicedClass: ").append(qualifiedName(sc.domain))
	if(sc.isOption) buf.append(" option")
	if(sc.ctx!=null) buf.append(" ").append(sc.ctx.varName)
	if(sc.expression!=null && sc.expression.length>0)
		buf.append("[[").append(sc.expression).append(dbleBrack)
	buf.append('\n')			
	
	}
	def void onSlicedPropertySliced(SlicedProperty sp){
		
	buf.append("\tslicedProperty: ").append(qualifiedName(sp.domain))
	if(sp.isOption) buf.append(" option")
	if(sp.src!=null) buf.append(" ").append(sp.src.varName)
	if(sp.tgt!=null) buf.append(" ").append(sp.tgt.varName)
	if(sp.expression!=null && sp.expression.length>0)
		buf.append("[[").append(sp.expression).append(dbleBrack) 
	buf.append("\n")
	
	}
	def void onRadiusSliced(Radius rad){
		
	buf.append("\radius: ").append(rad.focusedClasses.map[cl | qualifiedName(cl.domain)].join(", ")).append('\n')	
	
	}
	def void onConstraintSliced(Constraint cst){
		
	buf.append("\t\tconstraint: ").append(cst.name).append(" [[").append(cst.expression).append(dbleBrack).append('\n')
	
	}

	protected def void onStart(){
	}

	protected def void onEnd(){
		
		buf.append("}\n")		
	
	}

}
