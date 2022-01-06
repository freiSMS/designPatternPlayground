package FassadePattern.SmarteHomeDevices;

public class Fenster {
  public void rolloAuf() {
    System.out.println("Rolle wird geöffnet.");
  }

  public void rolloZu() {
    System.out.println("Rollo wird geschlossen.");
  }

  public void fensterToenen(int prozent) {
    System.out.println("Fenster werden auf " + prozent + " getönt.");
  }

  public void lueften(int minuten) {
    System.out.println("Fenster werden für " + minuten + " geöffnet.");
  }

  public void auf() {
    System.out.println("Fenster werden geöffnet.");
  }

  public void zu() {
    System.out.println("Fenster werden geschlossen.");
  }
}
