package org.kermeta.kompren.parser.sub

import scala.collection.JavaConversions.seqAsJavaList
import org.eclipse.emf.ecore.EcoreFactory
import kompren.KomprenFactory
import kompren.Radius
import kompren.SlicedClass
import org.eclipse.emf.ecore.EClass

trait RadiusParser extends KomprenAbstractParser {
	def parseRadius : Parser[Radius] = "radius" ~ ":" ~ rep1sep((pointedIdent | ident), ",") ^^ {
	  case _ ~ _ ~ names =>
	    var slicedClasses : List[EClass] = List()
	    names.foreach{ name =>
	      val clazz = EcoreFactory.eINSTANCE.createEClass
	      clazz.setName(name)
	      slicedClasses = slicedClasses ++ List(clazz)
	    }
	    
	    val radius = KomprenFactory.eINSTANCE.createRadius
	    radius.getFocusedClasses.addAll(slicedClasses)
	    
	    radius
	} 
}