/**
 * generated by Xtext
 */
package fr.inria.diverse.kompren.validation;

import fr.inria.diverse.kompren.validation.AbstractKomprenValidator;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import kompren.KomprenPackage;
import kompren.Slicer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Custom validation rules.
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class KomprenValidator extends AbstractKomprenValidator {
  public final static String INVALID_URI = "invalidURI";
  
  @Check
  public void checkURI(final Slicer slicer) {
    EList<String> _uriMetamodel = slicer.getUriMetamodel();
    final Procedure1<String> _function = new Procedure1<String>() {
      public void apply(final String uri) {
        try {
          final URL url = new URL(uri);
          URLConnection _openConnection = url.openConnection();
          final InputStream stream = _openConnection.getInputStream();
          InputStreamReader _inputStreamReader = new InputStreamReader(stream);
          final BufferedReader in = new BufferedReader(_inputStreamReader);
          in.close();
          stream.close();
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception ex = (Exception)_t;
            KomprenValidator.this.error("Cannot resolve this URI.", KomprenPackage.Literals.SLICER__URI_METAMODEL, KomprenValidator.INVALID_URI);
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    };
    IterableExtensions.<String>forEach(_uriMetamodel, _function);
  }
}
