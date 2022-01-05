package BeobachterPattern;

import java.util.LinkedList;

public class Held implements NotifierInterface {

  public int lebenspunkte;
  public int maxLebenspunkte;

  private LinkedList<BeobachterInterface> beobachter = new  LinkedList<BeobachterInterface>();

  public Held(int maxLebenspunkte) {
      this.lebenspunkte = maxLebenspunkte;
      this.maxLebenspunkte = maxLebenspunkte;
  }

  @Override
  public void registriereBeobachter(BeobachterInterface neuerBeobachter) {
    beobachter.add(neuerBeobachter);
    
  }

  @Override
  public void entferneBeobachter(BeobachterInterface neuerBeobachter) {
    beobachter.remove(neuerBeobachter);
  }

  @Override
  public void benachrichtigeBeobachter() {
    beobachter.forEach((beobachter) -> { beobachter.aktualisiere();});
    
  }
  
}
