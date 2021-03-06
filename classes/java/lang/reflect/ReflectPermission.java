/* GLASSES, Generic cLASSES
 * Copyright (c) 1998-2004, Rodrigo Augusto Barbato Ferreira
 */
package java.lang.reflect;

import java.security.BasicPermission;

public final class ReflectPermission extends BasicPermission {

  public ReflectPermission(String name) {
    super(name);
  }

  public ReflectPermission(String name, String actions) {
    super(name, actions);
  }

}

