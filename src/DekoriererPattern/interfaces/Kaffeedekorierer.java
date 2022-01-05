package DekoriererPattern.interfaces;

import  DekoriererPattern.interfaces.Kaffeespezialitaet;

public abstract class Kaffeedekorierer extends Kaffeespezialitaet {
  protected Kaffeespezialitaet childKaffeeReference;
  public Kaffeedekorierer(Kaffeespezialitaet childKaffeeReference) {
    this.childKaffeeReference = childKaffeeReference;
  }
  public abstract String getDescription();
  public abstract int getPrice();
}
