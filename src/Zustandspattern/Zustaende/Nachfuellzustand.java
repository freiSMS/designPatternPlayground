package Zustandspattern.Zustaende;

import Zustandspattern.Befehl.Befehl;

public class Nachfuellzustand implements Zustand {

  public Nachfuellzustand() {
    System.out.println("Warte auf neue Kaffeebohnen.");
  }

  @Override
  public Zustand bearbeiten(String befehl) {
    // TODO Auto-generated method stub
    if(befehl.equals(Befehl.KaffeeNachgefuellt.toString())) {
      System.out.println("Neue Kaffeebohnen eingefüllt...");
      return new Zubereitungszustand();
    }
    System.out.println("Auf diesen Befehl reagiere ich hier nicht.");
    return this;
  }
  
}
