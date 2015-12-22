package supertypesslicer

import static extension supertypesslicer.__SlicerAspect__.*
import static extension supertypesslicer.exclassModelClazzAspect.*
class SuperTypesSlicer{

	public val buf = new StringBuilder
	
	val java.util.List<ex.classModel.Clazz> inputClazz

	new(java.util.List<ex.classModel.Clazz> inputClazz){
		this.inputClazz = inputClazz
	}

	def void slice(){
		onStart
		inputClazz?.forEach[visitToAddClasses(this)]
		inputClazz?.forEach[visitToAddRelations(this)]
		onEnd
	}

	def void onClazzSliced(ex.classModel.Clazz clazz){
		
	println("Clazz: " + clazz.name)
	buf.append(clazz.name).append(' ')
	
	}
	def void onsuperClassesSliced(ex.classModel.Clazz srcClass, ex.classModel.Clazz tgtClass){
		
	println("Inheritance: " + srcClass.name + " " + tgtClass.name)
	buf.append(srcClass.name).append(' ').append(tgtClass.name).append(' ')
	
	}

	protected def void onStart(){
		
	println("Slicing starting ")
	buf.append("Slicing starting ")
	
	}

	protected def void onEnd(){
		
	println("Slicing ended")
	buf.append("Slicing ended")
	
	}

	def void reinit() {	}
}
