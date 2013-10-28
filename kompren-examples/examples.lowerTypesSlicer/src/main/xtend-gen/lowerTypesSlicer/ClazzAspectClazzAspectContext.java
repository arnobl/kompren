package lowerTypesSlicer;

import ex.classModel.Clazz;
import java.util.Map;
import lowerTypesSlicer.ClazzAspectClazzAspectProperties;

@SuppressWarnings("all")
public class ClazzAspectClazzAspectContext {
  public final static ClazzAspectClazzAspectContext INSTANCE = new ClazzAspectClazzAspectContext();
  
  public static ClazzAspectClazzAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Clazz,ClazzAspectClazzAspectProperties> map = new java.util.HashMap<ex.classModel.Clazz, lowerTypesSlicer.ClazzAspectClazzAspectProperties>();
  
  public Map<Clazz,ClazzAspectClazzAspectProperties> getMap() {
    return map;
  }
}
