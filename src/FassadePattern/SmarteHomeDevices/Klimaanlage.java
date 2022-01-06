package FassadePattern.SmarteHomeDevices;

public class Klimaanlage {
  Thermometer thermometer = new Thermometer();
  public void kuehlen(){
      System.out.println("Es wird gekühlt.");
  }
  public void temperaturHalten(){
      thermometer.aktuelleTemperatur();
      System.out.println("Die Temperatur wird gehalten.");
  }
  
}
