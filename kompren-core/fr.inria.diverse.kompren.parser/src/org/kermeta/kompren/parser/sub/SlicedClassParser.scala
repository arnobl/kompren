package org.kermeta.kompren.parser.sub

import scala.collection.JavaConversions.seqAsJavaList

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EcoreFactory

import kompren.KomprenFactory
import kompren.SlicedClass

trait SlicedClassParser extends KomprenAbstractParser with ConstraintParser {
	def parseSlicedClass : Parser[SlicedClass] = "slicedClass" ~ ":" ~ (pointedIdent | ident) ~ opt("option") ~ opt(ident) ~ opt(blockCode) ~ (parseConstraints*) ^^ {
	  case _ ~ _ ~ name ~ option ~ nameVar ~ exp ~ consts =>
	    val slicedClass = KomprenFactory.eINSTANCE.createSlicedClass
	    var clazz : EClass = EcoreFactory.eINSTANCE.createEClass
	    
	    clazz.setName(name)
	    slicedClass.setExpression(if(exp.isDefined) exp.get else null)
	    slicedClass.setIsOption(option.isDefined && option.get.equals("option"))
	    slicedClass.setDomain(clazz)
	    slicedClass.getConstraints.addAll(consts)

	    if(nameVar.isDefined) {
	      val ctx = KomprenFactory.eINSTANCE.createVarDecl
	      ctx.setVarName(nameVar.get)
	      slicedClass.setCtx(ctx)
	    }
	    
	    slicedClass
	}
}