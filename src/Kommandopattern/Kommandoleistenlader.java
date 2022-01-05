package Kommandopattern;

import Kommandopattern.Kommandoleiste;
import Kommandopattern.Befehl.*;

public class Kommandoleistenlader {
  Kommandoleiste kommandoleiste;
  static Kommandoleiste createKommandoleiste(Spielcharacter character) {
    Kommandoleiste kommandoleiste = new Kommandoleiste();
    kommandoleiste.setBefehl('w', new Vorwaerts(character));
    kommandoleiste.setBefehl('a', new Links(character));
    kommandoleiste.setBefehl('s', new Ruekwaerts(character));
    kommandoleiste.setBefehl('d', new Rechts(character));
    kommandoleiste.setBefehl('o', new Vorwaerts(character));
    kommandoleiste.setBefehl('l', new Links(character));
    kommandoleiste.setBefehl('k', new Ruekwaerts(character));
    kommandoleiste.setBefehl('ö', new Rechts(character));
    return kommandoleiste;
  }
  
}
