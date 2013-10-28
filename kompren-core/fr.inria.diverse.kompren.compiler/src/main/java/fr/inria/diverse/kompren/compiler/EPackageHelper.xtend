/* $Id:$ 
 * Creation : January 5, 2010
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : ablouin
 */
package fr.inria.diverse.kompren.compiler

import fr.inria.triskell.k3.Aspect
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference

@Aspect(className=typeof(EPackage)) class EPackageAspectAll {
	public def List<EClass> getAllClasses(){
		return _self.EClassifiers.filter(EClass).toList
	}
	
	
	public def List<EReference> getAllReferences(){
		val result = _self.getAllClasses.map[EStructuralFeatures.filter(EReference).filter[!derived]].flatten.toList
		result.addAll(_self.ESubpackages.map[getAllReferences].flatten.toList)
		return result
	} 
}
