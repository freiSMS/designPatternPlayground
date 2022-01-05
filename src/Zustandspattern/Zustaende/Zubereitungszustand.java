package Zustandspattern.Zustaende;

import Zustandspattern.Befehl.Befehl;

public class Zubereitungszustand implements Zustand {

  public Zubereitungszustand() {
    System.out.println("Bereit Kaffee zuzubereiten..");
  }

  @Override
  public Zustand bearbeiten(String befehl) {
    // TODO Auto-generated method stub
    if(befehl.equals(Befehl.KaffeeauswahlGetroffen.toString())) {
      System.out.println("Kaffe wird zubereitet...");
      System.out.println("...fertig!");
      if(isCoffeeEmpty()) {
        System.out.println("Kaffee ist leer...");
        return new Nachfuellzustand();

      } else {
        System.out.println("es ist noch Kaffee da...");
        return new Auswahlzustand();
      }
    }
    System.out.println("Auf diesen Befehl reagiere ich hier nicht.");
    return this;
    
  }

  private Boolean isCoffeeEmpty() {
    return Math.random() > 0.5 ? true : false;
  }
  
}
