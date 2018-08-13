/* GLASSES, Generic cLASSES
 * Copyright (c) 1998-2004, Rodrigo Augusto Barbato Ferreira
 */
package java.io;

public abstract class ObjectStreamException extends IOException {

  protected ObjectStreamException() { }

  protected ObjectStreamException(String message) {
    super(message);
  }

}

