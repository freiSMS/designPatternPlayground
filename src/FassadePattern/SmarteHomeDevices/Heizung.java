package FassadePattern.SmarteHomeDevices;

public class Heizung {
  Thermometer thermometer = new Thermometer();

  public void heizen() {
    System.out.println("Es wird geheizt.");
  }

  public void tropischeHitze() {
    thermometer.aktuelleTemperatur();
    System.out.println("Es wird irre geheizt.");
  }

  public void aus() {
    System.out.println("Die Heizung wird aus geschaltet.");
  }
}
