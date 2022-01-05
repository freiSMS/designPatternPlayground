package SchablonenmethodePattern;

public class Milchkaffee extends Kaffee {
  @Override
  protected void tasseFuellen() {
    System.out.println("Michschaum für 10 Sekunden ausgeben");
    super.tasseFuellen();
  }

  @Override
  protected void reinigen() {
  super.reinigen();
  System.out.println("Milchdüse reinigen");
  }
}
