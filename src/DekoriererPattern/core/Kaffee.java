package DekoriererPattern.core;

import DekoriererPattern.interfaces.Kaffeespezialitaet;

public class Kaffee extends Kaffeespezialitaet {

  @Override
  public String getDescription() {
    return "Ein Kaffee";
  }

  @Override
  public int getPrice() {
    return 100;
  }
  
}
