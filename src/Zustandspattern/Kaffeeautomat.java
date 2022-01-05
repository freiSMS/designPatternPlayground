package Zustandspattern;
import Zustandspattern.Zustaende.Zustand;

public class Kaffeeautomat {
  private Zustand zustand;
  Kaffeeautomat(Zustand startZustand) {
    this.zustand = startZustand;
  }

  public void setBefehl(String befehlseingabe) {
    this.zustand = zustand.bearbeiten(befehlseingabe);
  }
}
