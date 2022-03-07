package FakrikPattern.Fabriken;

import FakrikPattern.Einheiten.TemplateEinheit;

public abstract class TemplateFabrik {
  public abstract TemplateEinheit erzeugeEinheit(String name);
}
