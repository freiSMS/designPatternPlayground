package BeobachterPattern;

public class Lebensbalken implements BeobachterInterface {

  private Held held;

  public Lebensbalken(Held held) {
    this.held = held;
    held.registriereBeobachter(this);
  }

  @Override
  public void aktualisiere() {
    zeigeLeben(held.lebenspunkte, held.maxLebenspunkte);
    
  }

  public void zeigeLeben(int aktuell, int max){
    System.out.println("Leben: " + aktuell + "/" + max);
}
  
}
