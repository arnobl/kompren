package lowerTypesSlicer;

import ex.classModel.ClassModel;
import java.util.Map;
import lowerTypesSlicer.ClassModelAspectClassModelAspectProperties;

@SuppressWarnings("all")
public class ClassModelAspectClassModelAspectContext {
  public final static ClassModelAspectClassModelAspectContext INSTANCE = new ClassModelAspectClassModelAspectContext();
  
  public static ClassModelAspectClassModelAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<ClassModel,ClassModelAspectClassModelAspectProperties> map = new java.util.HashMap<ex.classModel.ClassModel, lowerTypesSlicer.ClassModelAspectClassModelAspectProperties>();
  
  public Map<ClassModel,ClassModelAspectClassModelAspectProperties> getMap() {
    return map;
  }
}
