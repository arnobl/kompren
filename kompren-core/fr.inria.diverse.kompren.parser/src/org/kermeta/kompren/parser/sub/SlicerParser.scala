package org.kermeta.kompren.parser.sub

import scala.collection.JavaConversions.seqAsJavaList
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EcoreFactory
import kompren.KomprenFactory
import kompren.SlicedElement
import kompren.Slicer
import org.eclipse.emf.ecore.ENamedElement

trait SlicerParser extends KomprenAbstractParser 
with RadiusParser 
with SlicedClassParser 
with SlicedPropertyParser {
  def parseSlicer : Parser[Slicer] = "slicer" ~ opt("strict") ~ opt("active") ~ ident ~ "{" ~ rep1(parseDomain) ~ parseInput ~ 
		  			opt(parseRadius) ~ (parseSlicedClass*) ~ (parseSlicedProperty*) ~ opt(parseOnStart) ~ 
		  			opt(parseOnEnd) ~ opt(parseHelper) ~ "}" ^^ { 
    case _ ~ soft ~ active ~ name ~ _ ~ domain ~ inputs ~ radius ~ slicedClasses ~ slicedProps ~ onStart ~ onEnd ~ helper ~ _ =>
    val slicer = KomprenFactory.eINSTANCE.createSlicer
    var slicedElements : List[SlicedElement[_ <: ENamedElement]] = slicedClasses ++ slicedProps
    
    soft match {
	    case Some(_) => slicer.setStrict(true)
	    case _ => slicer.setStrict(false)
    }
    
    slicer.setName(name)
    slicer.setActive(active.isDefined)
    slicer.getUriMetamodel.addAll(domain)
    slicer.setHelper(if(helper.isDefined) helper.get else null)
    slicer.setOnEnd(if(onEnd.isDefined) onEnd.get else null)
    slicer.setOnStart(if(onStart.isDefined) onStart.get else null)
    slicer.setRadius(if(radius.isDefined) radius.get else null)
    slicer.getSlicedElements.addAll(slicedElements)
    slicer.getInputClasses.addAll(inputs)
    
    slicer
  }
  
  
  def parseDomain : Parser[String] = "domain" ~ ":" ~ stringLit ^^ { case _ ~ _ ~ uri => uri }
  
  def parseInput : Parser[List[EClass]] = "input" ~ ":" ~ rep1sep((pointedIdent | ident), ",") ^^ { 
    case _ ~ _ ~ inputs =>
      var inputClasses = List[EClass]()
      
      inputs.foreach{input =>
      	val clazz : EClass = EcoreFactory.eINSTANCE.createEClass()
      	clazz.setName(input)
      	inputClasses = inputClasses ++ List(clazz)
      }
      
      inputClasses 
  }
  
  def parseOnStart : Parser[String] = "onStart" ~ blockCode ^^ { case _ ~ code => code }
  
  def parseOnEnd : Parser[String] = "onEnd" ~ blockCode ^^ { case _ ~ code => code }
  
  def parseHelper : Parser[String] = "helper" ~ blockCode ^^ { case _ ~ code => code }
}
