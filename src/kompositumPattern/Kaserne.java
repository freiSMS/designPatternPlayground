package kompositumPattern;

import kompositumPattern.interfaces.Truppeninterface;
import kompositumPattern.interfaces.Truppenname;
import kompositumPattern.truppen.Offizier;
import kompositumPattern.truppen.Reiter;
import kompositumPattern.truppen.Soldat;

public class Kaserne {  

  private int lastUsedId = 0;

  public Offizier produceOffizier() {
    lastUsedId++;
    return new Offizier(lastUsedId);
  }
  public Reiter produceReiter() {
    lastUsedId++;
    return new Reiter(lastUsedId);
  }
  public Soldat produceSoldat() {
    lastUsedId++;
    return new Soldat(lastUsedId);
  }
}
