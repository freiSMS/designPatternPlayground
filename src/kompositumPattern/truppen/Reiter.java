package kompositumPattern.truppen;

import kompositumPattern.interfaces.Truppeninterface;

public class Reiter extends Truppeninterface {

  public Reiter(int id) {
    super(id);
  }

  @Override
  public int angreiffen() {
    System.out.println("Reiter greift mit der Schleuder an. Verursacht 1 Schaden.");
    return 1;
  }
  
}
