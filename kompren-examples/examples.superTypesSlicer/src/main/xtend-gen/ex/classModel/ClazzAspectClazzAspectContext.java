package ex.classModel;

import ex.classModel.Clazz;
import ex.classModel.ClazzAspectClazzAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ClazzAspectClazzAspectContext {
  public final static ClazzAspectClazzAspectContext INSTANCE = new ClazzAspectClazzAspectContext();
  
  public static ClazzAspectClazzAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Clazz,ClazzAspectClazzAspectProperties> map = new java.util.HashMap<ex.classModel.Clazz, ex.classModel.ClazzAspectClazzAspectProperties>();
  
  public Map<Clazz,ClazzAspectClazzAspectProperties> getMap() {
    return map;
  }
}
