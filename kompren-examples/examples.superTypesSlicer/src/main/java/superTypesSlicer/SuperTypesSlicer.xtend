package superTypesSlicer
import ex.*
import ex.classModel.*
import ex.classModel.impl.*
import static extension superTypesSlicer.__SlicerAspect__.*
import java.util.List

class SuperTypesSlicer{
public val StringBuilder buf = new StringBuilder

	val List<Clazz> inputClazz

	new(List<Clazz> inputClazz){
		this.inputClazz = inputClazz
	}

	def void slice(){
		onStart
		inputClazz?.forEach[visitToAddClasses(this)]
		inputClazz?.forEach[visitToAddRelations(this)]
		onEnd
	}

	def void onClazzSliced(Clazz clazz){
		println("Clazz: " + clazz.name)
buf.append(clazz.name).append(' ')
	}
	def void onsuperClassesSliced(Clazz srcClass, Clazz tgtClass){
		println("Inheritance: " + srcClass.name + " " + tgtClass.name)
buf.append(srcClass.name).append(' ').append(tgtClass.name).append(' ')
	}

	protected def void onStart(){
		println("Slicing starting")
buf.append("Slicing starting ")
	}

	protected def void onEnd(){
		println("Slicing ended")
buf.append("Slicing ended")
	}

}

