package SchablonenmethodePattern;

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner((System.in));
    System.out.println("Möchtest du Kaffee oder Espresso?");
    String auswahl = scanner.nextLine().toLowerCase();
    Kaffeespezialitaet kaffeespezialitaet;
    if(auswahl.equals("espresso")) {
      kaffeespezialitaet = new Espresso();
    } else if (auswahl.equals("kaffee")) {
      kaffeespezialitaet = new Kaffee();
    } else if (auswahl.equals("milchkaffee")) {
      kaffeespezialitaet = new Milchkaffee();
    }
    else if (auswahl.equals("espressomacchiato")) {
      kaffeespezialitaet = new EspressoMacchiato();
    } 
    else {
      throw new Error("Diese Kaffespezialität gibt es nicht");
    }
    kaffeespezialitaet.zubereiten();
    scanner.close();
  }
  
}
