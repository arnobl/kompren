package strictEcore;

import java.util.Map;
import org.eclipse.emf.ecore.EAnnotation;
import strictEcore.EAnnotationAspectEAnnotationAspectProperties;

@SuppressWarnings("all")
public class EAnnotationAspectEAnnotationAspectContext {
  public final static EAnnotationAspectEAnnotationAspectContext INSTANCE = new EAnnotationAspectEAnnotationAspectContext();
  
  public static EAnnotationAspectEAnnotationAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<EAnnotation,EAnnotationAspectEAnnotationAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EAnnotation, strictEcore.EAnnotationAspectEAnnotationAspectProperties>();
  
  public Map<EAnnotation,EAnnotationAspectEAnnotationAspectProperties> getMap() {
    return map;
  }
}
