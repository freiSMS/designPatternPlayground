package SchablonenmethodePattern;

public class Espresso extends Kaffeespezialitaet{

  @Override
  protected void bohnenMahlen() {
    System.out.println("Mahle 9 Gramm Bohnen");
    
  }

  @Override
  protected void wasserAufgießen() {
    System.out.println("Hole 30 ml Wasser");
    System.out.println("Aufkochen und aufgießen");
  }
  
  
}
