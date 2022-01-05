package SchablonenmethodePattern;

public class Kaffee extends Kaffeespezialitaet {

  @Override
  protected void bohnenMahlen() {
    System.out.println("Mahle 12 Gramm Kaffee");
    
  }

  @Override
  protected void wasserAufgießen() {
    System.out.println("Hole 200 ml Wasser");
    System.out.println("Wasser aufkochen und aufgießen"); 
  }
  
}
