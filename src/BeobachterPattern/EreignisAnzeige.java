package BeobachterPattern;

public class EreignisAnzeige implements BeobachterInterface {

  private Held  held;
  private int lebenspunkteLetzteIteration;

  public EreignisAnzeige(Held held) {
    this.held = held;
    lebenspunkteLetzteIteration = held.lebenspunkte;
    held.registriereBeobachter(this);
  }

  @Override
  public void aktualisiere() {
    int lebenspunkteVeraenderung = held.lebenspunkte - this.lebenspunkteLetzteIteration; 
    if(held.lebenspunkte <= 0) {
      gestorben();
    } else if (lebenspunkteVeraenderung > 0) {
      zeigHeilung(lebenspunkteVeraenderung);
    } else {
      zeigSchaden(lebenspunkteVeraenderung);
    }
    this.lebenspunkteLetzteIteration = held.lebenspunkte; 
    
  }

  public void zeigSchaden(int schaden){
    System.out.println("Du erhälst " + schaden + " Schaden!");
}

public void zeigHeilung(int heilung){
    System.out.println("Du wirst " + heilung + " Punkte geheilt!");
}

public void gestorben(){
    System.out.println("Du bist gestorben! RIP!");
}
  
}
