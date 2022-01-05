package SchablonenmethodePattern;

public abstract class Kaffeespezialitaet {
  public void zubereiten() {
    tasseFuellen();
    reinigen();
  };
  protected void tasseFuellen() {
    bohnenMahlen();
    wasserAufgießen();
  }
  protected abstract void bohnenMahlen();
  protected abstract void wasserAufgießen();
  protected void reinigen() {
    tresterEntsorgen();
  };
  protected void tresterEntsorgen() {
    System.out.println("Trester entsorgt.");
  };
}
