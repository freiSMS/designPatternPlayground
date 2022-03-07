package kompositumPattern.truppen;

import kompositumPattern.interfaces.Truppeninterface;

public class Soldat extends Truppeninterface {

  public Soldat(int id) {
    super(id);
  }

  @Override
  public int angreiffen() {
    System.out.println("Soldat greift mit dem Schwert an. Verursacht 2 Schaden.");
    return 2;
  }
  
}
