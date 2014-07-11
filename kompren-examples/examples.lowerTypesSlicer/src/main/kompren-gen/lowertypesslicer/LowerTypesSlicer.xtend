package lowertypesslicer

import static extension lowertypesslicer.__SlicerAspect__.*
import static extension lowertypesslicer.exclassModelClazzAspect.*
class LowerTypesSlicer{

	public val buf = new StringBuilder
	
	val java.util.List<ex.classModel.Clazz> inputClazz

	val org.eclipse.emf.ecore.EObject _root

	new(java.util.List<ex.classModel.Clazz> inputClazz, org.eclipse.emf.ecore.EObject metamodelRoot){
		this.inputClazz = inputClazz
		if(metamodelRoot==null) throw new IllegalArgumentException
		this._root = metamodelRoot
	}

	def void slice(){
		_root.feedOpposites
		onStart
		inputClazz?.forEach[visitToAddClasses(this)]
		inputClazz?.forEach[visitToAddRelations(this)]
		onEnd
	}

	def void onClazzSliced(ex.classModel.Clazz clazz){
		
	println("Clazz: " + clazz.name)
	buf.append(clazz.name).append(' ')
	
	}
	def void onlowerTypeSliced(ex.classModel.Clazz src, ex.classModel.Clazz tgt){
		
	println("Inheritance: " + src.name + " " + tgt.name)
	buf.append(src.name).append(' ').append(tgt.name).append(' ')
	
	}

	protected def void onStart(){
	}

	protected def void onEnd(){
	}

}
