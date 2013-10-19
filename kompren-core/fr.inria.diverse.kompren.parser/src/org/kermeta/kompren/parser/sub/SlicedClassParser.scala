package org.kermeta.kompren.parser.sub

import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EClass
import kompren.SlicedClass
import kompren.VarDecl
import kompren.KomprenFactory

trait SlicedClassParser extends KomprenAbstractParser {
	def parseSlicedClass : Parser[SlicedClass] = "slicedClass" ~ ":" ~ (pointedIdent | ident) ~ opt("option") ~ opt(ident) ~ opt(blockCode) ^^ {
	  case _ ~ _ ~ name ~ option ~ nameVar ~ exp =>
	    val slicedClass = KomprenFactory.eINSTANCE.createSlicedClass
	    var clazz : EClass = EcoreFactory.eINSTANCE.createEClass
	    
	    clazz.setName(name)
	    slicedClass.setExpression(if(exp.isDefined) exp.get else null)
	    slicedClass.setIsOption(option.isDefined && option.get.equals("option"))
	    slicedClass.setDomain(clazz)

	    if(nameVar.isDefined) {
	      val ctx = KomprenFactory.eINSTANCE.createVarDecl
	      ctx.setType(clazz)
	      ctx.setVarName(nameVar.get)
	      slicedClass.setCtx(ctx)
	    }
	    
	    slicedClass
	}
}