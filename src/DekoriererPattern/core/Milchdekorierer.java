package DekoriererPattern.core;

import DekoriererPattern.interfaces.Kaffeedekorierer;
import DekoriererPattern.interfaces.Kaffeespezialitaet;

public class Milchdekorierer extends Kaffeedekorierer{
  private int milchPreis = 30;

  public Milchdekorierer(Kaffeespezialitaet childKaffeeReference) {
    super(childKaffeeReference);
  }

  @Override
  public String getDescription() {
    String mitMilchDescription = childKaffeeReference.getDescription() + ", mit Milch";
    return mitMilchDescription;
  }

  @Override
  public int getPrice() {
    return childKaffeeReference.getPrice() + milchPreis;
  }
  
}
