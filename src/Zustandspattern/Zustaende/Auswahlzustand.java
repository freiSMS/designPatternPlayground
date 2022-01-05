package Zustandspattern.Zustaende;

import Zustandspattern.Befehl.Befehl;

public class Auswahlzustand implements Zustand {

  public Auswahlzustand() {
    System.out.println("Warte auf Kaffeeauswahl..");
  }

  @Override
  public Zustand bearbeiten(String befehl) {
    // TODO Auto-generated method stub
    if(befehl.equals(Befehl.KaffeeauswahlGetroffen.toString())) {
      return new Bezahlzustand();
    }
    System.out.println("Auf diesen Befehl reagiere ich hier nicht. " + befehl + " , " + Befehl.KaffeeauswahlGetroffen.toString() );

    return this;
  }
  
}
