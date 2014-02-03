package org.kermeta.kompren.parser.sub

import kompren.Constraint
import kompren.KomprenFactory

trait ConstraintParser extends KomprenAbstractParser {
	def parseConstraints : Parser[Constraint] = "constraint" ~ ":" ~ ident ~ blockCode ^^ {
	  case _ ~ _ ~ name ~ exp => 
	    val constraint = KomprenFactory.eINSTANCE.createConstraint 
	    constraint.setName(name)
	    constraint.setExpression(exp)
	    
	    constraint
	}
}