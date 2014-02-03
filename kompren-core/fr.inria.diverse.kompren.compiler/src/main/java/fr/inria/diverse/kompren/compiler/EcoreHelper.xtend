/*
 * Creation : November 22, 2010
 * Licence  : EPL
 * Copyright: INRIA Rennes, Triskell
 * Authors  : Arnaud Blouin
 */
package fr.inria.diverse.kompren.compiler

import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod
import java.util.ArrayList
import java.util.List
import java.util.Set
import kompren.SlicedClass
import kompren.SlicedProperty
import kompren.Slicer
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EPackage

import static extension fr.inria.diverse.kompren.compiler.EClassifierAspect.*
import static extension fr.inria.diverse.kompren.compiler.EPackageAspect.*
import static extension fr.inria.diverse.kompren.compiler.SlicerAspect.*
import static extension fr.inria.diverse.kompren.compiler.EStructuralFeatureAspect.*
import java.util.HashSet
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature

@Aspect(className=typeof(EClassifier)) class EClassifierAspect{
	private var Set<String> primitiveTypes
	
	def void feedSubClassesRelations() {}
	
	def boolean isPrimitiveType() {
		if(_self.primitiveTypes==null) {
			_self.primitiveTypes = new HashSet
			_self.primitiveTypes.add("EString")
			_self.primitiveTypes.add("EBoolean")
			_self.primitiveTypes.add("EFloat")
			_self.primitiveTypes.add("EDouble")
			_self.primitiveTypes.add("EInt")
			_self.primitiveTypes.add("EInteger")
			_self.primitiveTypes.add("EChar")
			_self.primitiveTypes.add("EDate")
			_self.primitiveTypes.add("EByte")
			_self.primitiveTypes.add("ECharObject")
			_self.primitiveTypes.add("EIntObject")
			_self.primitiveTypes.add("EIntegerObject")
			_self.primitiveTypes.add("EDoubleObject")
			_self.primitiveTypes.add("EBooleanObject")
			_self.primitiveTypes.add("EByteObject")
			_self.primitiveTypes.add("EFloatObject")
			_self.primitiveTypes.add("ELong")
			_self.primitiveTypes.add("ELongObject")
			_self.primitiveTypes.add("EShort")
			_self.primitiveTypes.add("EShortObject")
		}
		return _self.primitiveTypes.contains(_self.name)
	}
	
	def boolean isEcore() { _self?.EPackage.ecore }
}


@Aspect(className=typeof(EPackage)) class EPackageAspect {
	private var String _factoryName = null
	
	def void feedSubClassesRelations() {
		_self.EClassifiers.forEach[feedSubClassesRelations]
		_self.ESubpackages.forEach[feedSubClassesRelations]
	}
	
	def String factoryName() {
		if(_self._factoryName==null)
			_self._factoryName = Character.toUpperCase(_self.name.charAt(0))+_self.name.substring(1)+"FactoryImpl"
		_self._factoryName
	}
	
	def boolean isEcore() { "ecore".equals(_self.name) }
}


@Aspect(className=typeof(EStructuralFeature)) class EStructuralFeatureAspect {
	def boolean isEcore() { _self?.EContainingClass.ecore }
	
	def String getXtendName() { _self.name }
}


@Aspect(className=typeof(EReference)) class EReferenceAspect extends EStructuralFeatureAspect {
	def String getXtendName() {
		if(_self.name.startsWith("e") && _self.ecore)
			Character.toUpperCase(_self.name.charAt(0))+_self.name.substring(1)
		else
			_self.name
	}
}

@Aspect(className=typeof(EClass)) class EClassAspect extends EClassifierAspect {
	val StringBuilder codeVisit = new StringBuilder
	val StringBuilder codeAction = new StringBuilder
	val StringBuilder relationCode = new StringBuilder
	val StringBuilder oppositeAttr = new StringBuilder
	val StringBuilder oppositeFeed = new StringBuilder
	var List<EClass> lowerClasses
	
	@OverrideAspectMethod
	def void feedSubClassesRelations() {
		if(_self.lowerClasses==null) _self.lowerClasses = new ArrayList
		_self.ESuperTypes.forEach[addLowerClass(_self)]
	}
	
	
	private def void addLowerClass(EClass cl) {
		if(_self.lowerClasses==null) _self.lowerClasses = new ArrayList
		if(!_self.lowerClasses.contains(cl)) _self.lowerClasses.add(cl)
	}
	
	
	def void generateOppositeCode(SlicedProperty sp) {
		if(sp.opposite!=null) {
			if(sp.opposite.name==null || sp.opposite.name.length==0)
				sp.opposite.name = "opposite"+sp.domain.name
			if(sp.domain.upperBound==1)
				_self.oppositeAttr.append("\tvar ").append(sp.domain.EType.name).append(' ^').append(sp.opposite.name).append("\n\n")
			else
				_self.oppositeAttr.append("\tvar List<").append(sp.domain.EType.name).append("> ^").append(sp.opposite.name).append(" = new ArrayList\n\n")
		}	
	}	


	def void generateFeedOppositeCodeVisitor() {
		_self.EReferences.filter[containment].forEach[ref|
			if(ref.upperBound>1 || ref.upperBound<0)
				_self.oppositeFeed.append("_self.^").append(ref.xtendName).append(".forEach[feedOpposites]\n")
			else
				_self.oppositeFeed.append("_self.^").append(ref.xtendName).append("?.feedOpposites\n")
		]
	}


	def void generateFeedOppositeCode(SlicedProperty sp) {
		val elt = sp.domain

		if(sp.opposite!=null){
			if(elt.upperBound==1)
				_self.oppositeFeed.append("_self.^").append(elt.xtendName).append('.^').append(sp.opposite.name).append(" = ").append("_self\n")
			else
				_self.oppositeFeed.append("_self.^").append(elt.xtendName).append(".forEach[^").append(sp.opposite.name).append(".add(_self)]\n")
		}
	}


	def void generateVisitToAddClassesActions(SlicedClass sc, Slicer slicer) {
		val optionName = slicer.getOptionName(sc.domain)
		if(optionName!=null)
			_self.codeAction.append("\t\tif(theSlicer.").append(optionName).append("){\n")
		if(slicer.strict) {
			if(!_self.abstract)
				_self.codeAction.append("\t\tif(_self.clonedElt==null){\n\t\t\t_self.clonedElt = ").append(_self.EPackage.factoryName).
				append(".eINSTANCE.create").append(_self.name).append("\n\t\t\ttheSlicer.objectCloned(_self.clonedElt)\n\t\t}\n")
		}
		else _self.codeAction.append("\t\ttheSlicer.on").append(_self.name).append("Sliced(_self)\n")
		if(optionName!=null)
			_self.codeVisit.append("\t\t}\n")
	}


	def void generateVisitToAddClasses(SlicedProperty sp) {
		val elt = sp.domain
		if(!elt.EType.primitiveType) {		
			val name = if(sp.opposite==null) elt.xtendName else sp.opposite.name
	
			if(elt.upperBound>1 || elt.upperBound<0)
				_self.codeVisit.append("\t\t_self.^").append(name).append(".forEach[visitToAddClasses(theSlicer)]\n")
			else
				_self.codeVisit.append("\t\t_self.^").append(name).append("?.visitToAddClasses(theSlicer)\n")
		}
	}


	def void generateVisitToAddRelations(SlicedProperty sp, Slicer slicer) {
		val okSlice = slicer.strict || (sp.expression!=null && sp.expression.length>0 && sp.tgt!=null && sp.src!=null)
		val name = if(sp.opposite==null) sp.domain.xtendName else sp.opposite.name
		
		if(sp.domain.upperBound>1 || sp.domain.upperBound<0)
			_self.generateVisitToAddRelations4MultiCard(sp, slicer, name, okSlice)
		else
			_self.generateVisitToAddRelations4OneCard(sp, slicer, name, okSlice)
	}
	
	
	private def void generateVisitToAddRelations4OneCard(SlicedProperty sp, Slicer slicer, String name, boolean okSlice) {
		val isPrim = sp.domain.EType.isPrimitiveType
		if(!isPrim) {
			if(sp.domain.lowerBound==0)
				_self.relationCode.append("\t\tif(_self.^").append(name).append("!=null){\n")
			_self.relationCode.append("\t\t_self.^").append(name).append(".visitToAddRelations(theSlicer)\n")
		}
		if(okSlice && !sp.domain.derived) {
			val hasOpposite = sp.domain instanceof EReference && ((sp.domain) as EReference).EOpposite!=null
			
			_self.relationCode.append("\n\t\tif(_self.sliced")
			if(!isPrim) _self.relationCode.append(" && _self.^").append(name).append(".sliced")
			_self.relationCode.append(") ")
			if(slicer.strict)
				if(isPrim)
					_self.relationCode.append("(_self.clonedElt as ").append(_self.name).append(").^").append(name).append(" = _self.^").append(name).append('\n')
				else
					if(!sp.domain.changeable && hasOpposite)
						_self.generateCodeForReadOnlyRefWithOpposite(sp)
					else
						_self.relationCode.append("(_self.clonedElt as ").append(_self.name).append(").^").append(name).
						append(" = _self.^").append(name).append(".clonedElt as ").append(sp.domain.EType.name).append('\n')
			else
				_self.relationCode.append("\t\ttheSlicer.on").append(name).append("Sliced(_self").append(", _self.^").append(name).append(")\n")
		}
		if(!isPrim && sp.domain.lowerBound==0) _self.relationCode.append("}\n")
	}
	
	
	
	private def void generateVisitToAddRelations4MultiCard(SlicedProperty sp, Slicer slicer, String name, boolean okSlice) {
		_self.relationCode.append("\t\t_self.^").append(name).append(".forEach[_elt| _elt.visitToAddRelations(theSlicer)")
		val hasOpposite = sp.domain instanceof EReference && ((sp.domain) as EReference).EOpposite!=null
		if(okSlice  && !sp.domain.derived && (sp.domain.changeable || hasOpposite)){
			val isPrim = sp.domain.EType.isPrimitiveType
			_self.relationCode.append("\n\t\t\tif(_self.sliced")
			if(!isPrim) _self.relationCode.append(" && _elt.sliced")
			_self.relationCode.append(") ")
			if(slicer.strict)
				if(isPrim)
					_self.relationCode.append("(_self.clonedElt as ").append(_self.name).append(").^").append(name).append(".add( _elt)\n")
				else {
					if(!sp.domain.changeable && hasOpposite)
						_self.generateCodeForReadOnlyRefWithOpposite(sp)
					else _self.relationCode.append("(_self.clonedElt as ").append(_self.name).append(").^").append(name).
					append(".add( _elt.clonedElt as ").append(sp.domain.EType.name).append(")\n")
				}
			else
				_self.relationCode.append("theSlicer.on").append(name).append("Sliced(_self").append(", _elt)\n")
		}
		_self.relationCode.append("\t\t]\n")
	}
	
	
	private def void generateCodeForReadOnlyRefWithOpposite(SlicedProperty sp) {
		val refOpp = (sp.domain as EReference).EOpposite
		_self.relationCode.append("(_self.").append(sp.domain.xtendName).append(".clonedElt as ").append(sp.domain.EType.name).append(").^").append(refOpp.xtendName)
		if(refOpp.upperBound<0 || refOpp.upperBound>1)
			_self.relationCode.append(".add(_self.clonedElt as ").append(refOpp.EType.name).append(")\n")
		else
			_self.relationCode.append(" = _self.clonedElt as ").append(refOpp.EType.name).append('\n')
	}
}
