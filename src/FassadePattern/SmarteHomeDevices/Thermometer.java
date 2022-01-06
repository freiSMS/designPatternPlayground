package FassadePattern.SmarteHomeDevices;

public class Thermometer {
  public void aktuelleTemperatur(){
    System.out.println("21° C");
}
public void warnungBeiTemperatur(int temperatur){
    System.out.println("Es wird bei " + temperatur + "° Grad gewarnt.");
}
public void wettervorhersage(){
    System.out.println("Regen... Regen... Regen... ");
}
}
