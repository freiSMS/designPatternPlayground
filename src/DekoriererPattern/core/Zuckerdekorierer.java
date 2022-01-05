package DekoriererPattern.core;

import DekoriererPattern.interfaces.Kaffeedekorierer;
import DekoriererPattern.interfaces.Kaffeespezialitaet;

public class Zuckerdekorierer extends Kaffeedekorierer{
  private int zuckerPreis = 50;

  public Zuckerdekorierer(Kaffeespezialitaet childKaffeeReference) {
    super(childKaffeeReference);
  }

  @Override
  public String getDescription() {
    return childKaffeeReference.getDescription() + ", mit Zucker";
  }

  @Override
  public int getPrice() {
    return childKaffeeReference.getPrice() + zuckerPreis;
  }
  
}
