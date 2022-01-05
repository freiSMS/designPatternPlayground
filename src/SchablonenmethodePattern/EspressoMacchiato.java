package SchablonenmethodePattern;

public class EspressoMacchiato extends Espresso {
  @Override
  protected void tasseFuellen() {
    System.out.println("Milchschaum für 3 Sekunden ausgeben.");
    super.tasseFuellen();
  }

  @Override
  protected void reinigen() {
    super.reinigen();
    System.out.println("Milchdüse reinigen");
  }
  
  
}
