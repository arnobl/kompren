/*
 * Creation : November 22, 2010
 * Licence  : EPL
 * Copyright: INRIA Rennes, Triskell
 * Authors  : Arnaud Blouin
 */
package fr.inria.triskell.kompren.helpers

import org.eclipse.emf.ecore.ENamedElement
import fr.inria.triskell.k3.Aspect
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EClass
import java.util.List
import org.eclipse.emf.ecore.EReference



@Aspect(className=typeof(ENamedElement)) class ENamedElementAspectQName {
	public def String getQualifiedName(String sep) {
		var result = _self.name
		
		if(_self.eContainer!=null && _self.eContainer instanceof ENamedElement)
			result = (_self.eContainer as ENamedElement).getQualifiedName(sep) + sep + _self.name 
		
		return result
	}
	
	public def String getQualifiedName(){
		return _self.getQualifiedName("::")
	}
}


@Aspect(className=typeof(EClassifier)) class EClassifierAspectQName extends ENamedElementAspectQName {
	/**
	 * @param clazz The class to test.
	 * @return True: If the calling class is a super type of the given class.
	*/
	public def boolean isSuperTypeOfBis(EClass clazz) {
		var result = clazz!=null
		val qualifiedName = _self.getQualifiedName
		
		if(result){
			result = clazz.getESuperTypes.exists[st | st.getQualifiedName.equals(qualifiedName) ]

			if(!result)
				result = clazz.getESuperTypes.exists[st | _self.isSuperTypeOfBis(st)]
		}
		
		return result
	}
}


@Aspect(className=typeof(EClass)) class EClassAspectQName extends EClassifierAspectQName {
	public def List<EClass> getConcreteSubClasses(List<EClass> allClasses) {
		return allClasses.filter[c | !c.isAbstract && _self.isSuperTypeOfBis(c)].toList
	}


	public def boolean canBeRootClass(List<EClass> allClasses) {
		return !_self.abstract && 
			_self.EStructuralFeatures.exists[st | st instanceof EReference && (st as EReference).containment] &&
			!allClasses.exists[clazz | self!=clazz && clazz.hasStructFeatureWithType(_self)]
	}
	
	public def boolean hasStructFeatureWithType(EClass clazz) {
		return _self.EStructuralFeatures.filter(typeof(EReference)).exists[st | st.containment &&
		 	(st.EType.getQualifiedName.equals(clazz.getQualifiedName) || (st.EType instanceof EClass && (st.EType as EClass).isSuperTypeOfBis(clazz)))
 		]
	}
}
