package FakrikPattern.Fabriken;

import FakrikPattern.Einheiten.Krieger;
import FakrikPattern.Einheiten.TemplateEinheit;

public class Menschenfabrik extends TemplateFabrik {

  @Override
  public
  TemplateEinheit erzeugeEinheit(String name) {
    return new Krieger(name, "Mensch");
  }
  
}
