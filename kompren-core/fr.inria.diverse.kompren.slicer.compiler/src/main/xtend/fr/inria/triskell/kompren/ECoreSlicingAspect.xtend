/*
 * Creation : November 23, 2010
 * Licence  : EPL
 * Copyright: INRIA Rennes, Triskell
 * Authors  : Arnaud Blouin
 */
package fr.inria.triskell.kompren;

import fr.inria.triskell.k3.Aspect
import java.util.List
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EStructuralFeature
import kompren.SlicedProperty

@Aspect(className=typeof(EStructuralFeature)) class EStructuralFeatureAspectName {
	public def String getValidKermetaName() {
		var result = _self.name
		
		if(_self.name.equals("result") || _self.name.equals("is") || _self.name.equals("class") || _self.name.equals("aspect") ||
			_self.name.equals("inherits") || _self.name.equals("do") || _self.name.equals("value") || _self.name.equals("if") ||
			_self.name.equals("then") || _self.name.equals("else") || _self.name.equals("loop") || _self.name.equals("until") ||
			_self.name.equals("operation") || _self.name.equals("method") || _self.name.equals("end") || _self.name.equals("reference") ||
			_self.name.equals("attribute") || _self.name.equals("package") || _self.name.equals("using") || _self.name.equals("require") ||
			_self.name.equals("self") || _self.name.equals("bag") || _self.name.equals("Void") || _self.name.equals("not") || _self.name.equals("oset") ||
			_self.name.equals("from") || _self.name.equals("super") || _self.name.equals("init") || _self.name.equals("true") || _self.name.equals("false") ||
			_self.name.equals("var") || _self.name.equals("raise") || _self.name.equals("rescue") || _self.name.equals("getter") || _self.name.equals("pre") || _self.name.equals("post") ||
			_self.name.equals("setter") || _self.name.equals("property") || _self.name.equals("abstract") || _self.name.equals("enumeration") || _self.name.equals("metamodel") ||
			_self.name.equals("set") || _self.name.equals("inv") || _self.name.equals("extern"))
			result = "~" + result
			
		return result
	}
}


@Aspect(className=typeof(EClassifier)) 
class EClassifierAspectName {
	public var List<SlicedProperty> outputFocusedRelations = null

	public def String getVarNameClassifier() {
		return _self.getVarName(_self.name, false)
	}


	public def String getVarName(String name, boolean withS) {
		var result = "the" + name
		if(withS) result = result + "s"
		return result
	}

	public def String getRequiredAttributeName() {
		return "required" + _self.name + "s"
	}

	public def String getAddedAttributeName() {
		return "added" + _self.name + "s"
	}
}
