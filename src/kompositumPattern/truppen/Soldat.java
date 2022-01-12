package kompositumPattern.truppen;

import kompositumPattern.interfaces.Truppeninterface;

public class Soldat extends Truppeninterface {

  public Soldat(int id) {
    super(id);
  }

  @Override
  public int angreiffen() {
    return 2;
  }
  
}
