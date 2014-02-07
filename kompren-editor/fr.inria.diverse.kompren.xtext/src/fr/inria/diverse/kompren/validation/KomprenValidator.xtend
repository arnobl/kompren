/*
 * generated by Xtext
 */
package fr.inria.diverse.kompren.validation

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL
import kompren.KomprenPackage
import kompren.Slicer
import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class KomprenValidator extends AbstractKomprenValidator {

  public static val INVALID_URI = 'invalidURI'

	@Check
	def checkURI(Slicer slicer) {
		slicer.uriMetamodel.forEach[uri |
			try {
				val url = new URL(uri)
				val stream = url.openConnection.getInputStream
				val in = new BufferedReader(new InputStreamReader(stream))
				in.close
				stream.close
			}catch(Exception ex) {
				error("Cannot resolve this URI.", KomprenPackage.Literals.SLICER__URI_METAMODEL, INVALID_URI)
			}
		]
	}
}
