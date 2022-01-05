package DekoriererPattern;

import DekoriererPattern.core.Kaffee;
import DekoriererPattern.core.Milchdekorierer;
import DekoriererPattern.core.Zuckerdekorierer;
import DekoriererPattern.interfaces.Kaffeespezialitaet;

public class app {
  public static void main(String[] args){
  Kaffeespezialitaet kaffeMitMilch = new Milchdekorierer(new Kaffee());
  Kaffeespezialitaet kaffeMitMilchUndZucker = new Milchdekorierer(new Zuckerdekorierer(new Kaffee()));


  System.out.println(kaffeMitMilch.getDescription() + " für " + kaffeMitMilch.getPrice() + " Cent");
  System.out.println(kaffeMitMilchUndZucker.getDescription() + " für " + kaffeMitMilchUndZucker.getPrice() + " Cent");
}
}
