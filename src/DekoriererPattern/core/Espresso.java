package DekoriererPattern.core;

import DekoriererPattern.interfaces.Kaffeespezialitaet;

public class Espresso extends Kaffeespezialitaet {

  @Override
  public String getDescription() {
    return "Ein Espresso";
  }

  @Override
  public int getPrice() {
    return 130;
  }
  
}
