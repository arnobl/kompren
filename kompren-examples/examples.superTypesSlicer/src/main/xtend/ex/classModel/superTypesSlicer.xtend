package ex.classModel

import java.util.ArrayList
import java.util.List

import static extension ex.classModel.SlicerVisitor.*

class superTypesSlicer {
	public var int idPass = 0
	public val List<Clazz> requiredClazzs = new ArrayList
	public val List<Clazz> addedClazzs = new ArrayList
	public val List<ClasssuperClasses> addedsuperClasses = new  ArrayList
	public val StringBuilder buf = new StringBuilder

	new(List<Clazz> requiredClazzs) {
		this.requiredClazzs.addAll(requiredClazzs)
	}

	def void launch(){
		onStart
		requiredClazzs.forEach[visitToAddClasses(this)]
		requiredClazzs.forEach[visitToAddRelations(this)]
		addedClazzs.forEach[theClazz | onClazzAdded(theClazz)]
		addedsuperClasses.forEach[thesuperClasses | onClazzsuperClassesAdded(thesuperClasses.src, thesuperClasses.tar)]
		onEnd
	}

	def void onClazzAdded(Clazz clazz){
		println("Clazz: " + clazz.name)
		buf.append(clazz.name).append(' ')
	}
	def void onClazzsuperClassesAdded(Clazz srcClass, Clazz tgtClass){
		println("Inheritance: " + srcClass.name + " " + tgtClass.name)
		buf.append(srcClass.name).append(' ').append(tgtClass.name).append(' ')
	}
	def void onEnd(){
		println("Slicing ended")
		buf.append("Slicing ended")
	}
	def void onStart(){
		println("Slicing starting")
		buf.append("Slicing starting ")
	}
}


@Data class ClasssuperClasses {
	Clazz src
	Clazz tar
}
