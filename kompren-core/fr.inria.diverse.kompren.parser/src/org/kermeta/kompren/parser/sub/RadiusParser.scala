package org.kermeta.kompren.parser.sub

import scala.collection.JavaConversions.seqAsJavaList

import org.eclipse.emf.ecore.EcoreFactory

import kompren.KomprenFactory
import kompren.Radius
import kompren.SlicedClass

trait RadiusParser extends KomprenAbstractParser {
	def parseRadius : Parser[Radius] = "radius" ~ ":" ~ rep1sep((pointedIdent | ident), ",") ^^ {
	  case _ ~ _ ~ names =>
	    var slicedClasses : List[SlicedClass] = List()
	    names.foreach{ name =>
	      val clazz = EcoreFactory.eINSTANCE.createEClass
	      val slicedClass = KomprenFactory.eINSTANCE.createSlicedClass
	      
	      clazz.setName(name)
	      slicedClass.setCtx(null)
	      slicedClass.setIsOption(false)
	      slicedClass.setDomain(clazz)
	      slicedClass.setExpression(null)
	      slicedClasses = slicedClasses ++ List(slicedClass)
	    }
	    
	    val radius = KomprenFactory.eINSTANCE.createRadius
	    radius.getFocusedClasses().addAll(slicedClasses)
	    
	    radius
	} 
}