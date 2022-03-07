package FakrikPattern.Fabriken;

import FakrikPattern.Einheiten.Reiter;
import FakrikPattern.Einheiten.TemplateEinheit;

public class Orkfabrik extends TemplateFabrik {

  @Override
  public TemplateEinheit erzeugeEinheit(String name) {
    return new Reiter(name, "Ork");
  }
  
}
