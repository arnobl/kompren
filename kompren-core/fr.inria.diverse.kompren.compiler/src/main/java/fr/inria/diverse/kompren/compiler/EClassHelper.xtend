/*
 * Creation : November 22, 2010
 * Licence  : EPL
 * Copyright: INRIA Rennes, Triskell
 * Authors  : Arnaud Blouin
 */
package fr.inria.diverse.kompren.compiler

import fr.inria.triskell.k3.Aspect
import java.util.List
import kompren.SlicedProperty
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EReference

@Aspect(className=typeof(ENamedElement)) class ENamedElementAspectQName {
	public def String getQualifiedName(String sep) {
		var String result = _self.name
		
		if(_self.eContainer!=null && _self.eContainer instanceof ENamedElement)
			result = (_self.eContainer as ENamedElement).getQualifiedName(sep) + sep + _self.name 
		
		return result
	}
	
	public def String getQualifiedName(){
		return _self.getQualifiedName(".")
	}
}


@Aspect(className=typeof(EClassifier)) class EClassifierAspectQName extends ENamedElementAspectQName {
	/**
	 * @param clazz The class to test.
	 * @return True: If the calling class is a super type of the given class.
	*/
	public def boolean isSuperTypeOfBis(EClass clazz) {
		var boolean result = clazz!=null
		val String qualifiedName = _self.getQualifiedName
		
		if(result){
			result = clazz.getESuperTypes.exists[getQualifiedName.equals(qualifiedName)]

			if(!result)
				result = clazz.getESuperTypes.exists[st | _self.isSuperTypeOfBis(st)]
		}
		
		return result
	}
}


@Aspect(className=typeof(EClass)) class EClassAspectQName extends EClassifierAspectQName {
	val StringBuilder codeVisit = new StringBuilder
	val StringBuilder codeAction = new StringBuilder
	val StringBuilder relationCode = new StringBuilder
	val StringBuilder oppositeAttr = new StringBuilder
	val StringBuilder oppositeFeed = new StringBuilder
	
	def void generateOppositeCode(SlicedProperty sp) {
		if(sp.opposite!=null) {
			if(sp.opposite.name==null || sp.opposite.name.length==0)
				sp.opposite.name = "opposite"+sp.domain.name
			if(sp.domain.upperBound==1)
				_self.oppositeAttr.append("\tvar ").append(sp.domain.EType.name).append(' ').append(sp.opposite.name).append("\n\n")
			else
				_self.oppositeAttr.append("\tvar List<").append(sp.domain.EType.name).append("> ").append(sp.opposite.name).append(" = new ArrayList\n\n")
		}	
	}	


	def void generateFeedOppositeCodeVisitor() {
		_self.EReferences.filter[containment].forEach[ref|
			if(ref.upperBound>1 || ref.upperBound<0)
				_self.oppositeFeed.append("_self.").append(ref.name).append(".forEach[feedOpposites]\n")
			else {
				if(ref.lowerBound==0)
					_self.oppositeFeed.append("if(_self.").append(ref.name).append("!=null) ")
				_self.oppositeFeed.append("_self.").append(ref.name).append(".feedOpposites\n")
			}
		]
	}
	
	
	def void generateFeedOppositeCode(SlicedProperty sp) {
		val elt = sp.domain
		
		if(sp.opposite!=null){
			if(elt.upperBound==1)
				_self.oppositeFeed.append("_self.").append(elt.name).append('.').append(sp.opposite.name).append(" = ").append("_self\n")
			else
				_self.oppositeFeed.append("_self.").append(elt.name).append(".forEach[").append(sp.opposite.name).append(".add(_self)]\n")
		}
	}
	
	
	def void generateVisitToAddClasses(SlicedProperty sp) {
		val elt = sp.domain
		val name = if(sp.opposite==null) elt.name else sp.opposite.name

		if(elt.upperBound>1 || elt.upperBound<0)
			_self.codeVisit.append("_self.").append(name).append(".forEach[visitToAddClasses(theSlicer)]\n")
		else {
			if(elt.lowerBound==0)
				_self.codeVisit.append("if(_self.").append(name).append("!=null) ")
			_self.codeVisit.append("_self.").append(name).append(".visitToAddClasses(theSlicer)\n")
		}
		
		_self.codeAction.append("\t\ttheSlicer.on").append(_self.name).append("Sliced(_self)\n")
	}
	
	def void generateVisitToAddRelations(SlicedProperty sp) {
		val elt = sp.domain
		val okSlice = sp.expression!=null && sp.expression.length>0 && sp.tgt!=null && sp.src!=null
		val name = if(sp.opposite==null) elt.name else sp.opposite.name
		
		if(elt.upperBound>1 || elt.upperBound<0) {
			_self.relationCode.append("_self.").append(name).append(".forEach[_elt| _elt.visitToAddRelations(theSlicer)")
			if(okSlice){
				_self.relationCode.append("\n\t\t\tif(_self.sliced && _elt.sliced) ")
				_self.relationCode.append("theSlicer.on").append(name).append("Sliced(_self").append(", _elt)\n")
			}
			_self.relationCode.append("\t\t]\n")
		}
		else {
			if(elt.lowerBound==0)
				_self.relationCode.append("if(_self.").append(name).append("!=null){\n")
			_self.relationCode.append("\t_self.").append(name).append(".visitToAddRelations(theSlicer)\n")
			if(okSlice) {
				_self.relationCode.append("\n\t\t\tif(_self.sliced && ").append(", _self.").append(name).append(") ")
				_self.relationCode.append("theSlicer.on").append(name).append("Sliced(_self").append(", _self.").append(name).append(")\n")
			}
			_self.relationCode.append("}\n")
		}
	}
	
	public def List<EClass> getConcreteSubClasses(List<EClass> allClasses) {
		return allClasses.filter[c | !c.isAbstract && _self.isSuperTypeOfBis(c)].toList
	}


	public def boolean canBeRootClass(List<EClass> allClasses) {
		return !_self.abstract && 
			_self.EStructuralFeatures.exists[st | st instanceof EReference && (st as EReference).containment] &&
			!allClasses.exists[clazz | self!=clazz && clazz.hasStructFeatureWithType(_self)]
	}
	
	public def boolean hasStructFeatureWithType(EClass clazz) {
		return _self.EStructuralFeatures.filter(EReference).exists[st | st.containment &&
		 	(st.EType.getQualifiedName.equals(clazz.getQualifiedName) || (st.EType instanceof EClass && (st.EType as EClass).isSuperTypeOfBis(clazz)))
 		]
	}
}
