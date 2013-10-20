package ex.classModel;

import ex.classModel.Clazz;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class ClasssuperClasses {
  private final Clazz _src;
  
  public Clazz getSrc() {
    return this._src;
  }
  
  private final Clazz _tar;
  
  public Clazz getTar() {
    return this._tar;
  }
  
  public ClasssuperClasses(final Clazz src, final Clazz tar) {
    super();
    this._src = src;
    this._tar = tar;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_src== null) ? 0 : _src.hashCode());
    result = prime * result + ((_tar== null) ? 0 : _tar.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ClasssuperClasses other = (ClasssuperClasses) obj;
    if (_src == null) {
      if (other._src != null)
        return false;
    } else if (!_src.equals(other._src))
      return false;
    if (_tar == null) {
      if (other._tar != null)
        return false;
    } else if (!_tar.equals(other._tar))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
