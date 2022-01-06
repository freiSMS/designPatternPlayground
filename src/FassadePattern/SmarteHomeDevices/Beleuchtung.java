package FassadePattern.SmarteHomeDevices;

public class Beleuchtung {
  public void an(){
    System.out.println("Lampen werden angemacht.");
}
public void aus(){
    System.out.println("Lampen werden aus gemacht.");
}
public void dimmen(){
    System.out.println("Lampen werden gedimmt.");
}
public void farbeAendern(String farbe){
    System.out.println("Lampen werden auf " + farbe + " gestellt.");
}
}
