package Zustandspattern.Zustaende;

import Zustandspattern.Befehl.Befehl;

public class Bezahlzustand implements Zustand {
  int verbliebeneKosten;

  public Bezahlzustand() {
    System.out.println("Bitte einen Euro einwerfen. Es funktioniere auch 50 und 10 Cent Stücke");
    this.verbliebeneKosten = 100;
  }

  @Override
  public Zustand bearbeiten(String befehl) {
    if(befehl.equals(Befehl.GeldEinwerfen10cent.toString())) {
      this.verbliebeneKosten -= 10;
    } else if (befehl.equals(Befehl.GeldEinwerfen50cent.toString())) {
      this.verbliebeneKosten -= 50;
    } else if (befehl.equals(Befehl.GeldEinwerfen100cent.toString())) {
      this.verbliebeneKosten -= 100;
    }
    if(verbliebeneKosten > 0) {
      System.out.printf("Es verbleiben %d Cent. Bitte einwerfen.", this.verbliebeneKosten);
      return this;
    }
    System.out.println("-- wechsle zu Zubereitungszustand --");
    return new Zubereitungszustand().bearbeiten(Befehl.KaffeeauswahlGetroffen.toString());
  }
}
