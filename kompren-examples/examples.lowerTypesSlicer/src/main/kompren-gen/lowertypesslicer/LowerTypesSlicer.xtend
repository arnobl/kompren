package lowertypesslicer

import ex.classModel.Clazz
import java.util.List
import org.eclipse.emf.ecore.EObject

import static extension lowertypesslicer.__SlicerAspect__.*

class LowerTypesSlicer{

	public val buf = new StringBuilder
	
	val List<Clazz> inputClazz

	val EObject _root

	new(List<Clazz> inputClazz, EObject metamodelRoot){
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

	def void onClazzSliced(Clazz clazz){
		
	println("Clazz: " + clazz.name)
	buf.append(clazz.name).append(' ')
	
	}
	def void onlowerTypeSliced(Clazz src, Clazz tgt){
		
	println("Inheritance: " + src.name + " " + tgt.name)
	buf.append(src.name).append(' ').append(tgt.name).append(' ')
	
	}

	protected def void onStart(){
	}

	protected def void onEnd(){
	}

}
