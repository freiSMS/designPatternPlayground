package FassadePattern.Fassaden;

import FassadePattern.SmarteHomeDevices.*;

public class RoutineFassade {
  Beleuchtung beleuchtung = new Beleuchtung();
  Fenster fenster = new Fenster();
  Getraenkemaschine getraenkemaschine = new Getraenkemaschine();
  Heizung heizung = new Heizung();
  Herd herd = new Herd();
  Klimaanlage klimaanlage = new Klimaanlage();

  public void gutenMorgen() {
    System.out.println("Guten Morgen! Ich bereite das Haus für einen tollen Morgen vor!");

    beleuchtung.an();
    fenster.rolloAuf();
    getraenkemaschine.kaffeeKochen();

    herd.eierKochen();
    herd.milchErwaermen();

    heizung.heizen();
  }

  public void geheZurArbeit() {
    System.out.println("Viel Spaß bei der Arbeit!");
        
        beleuchtung.aus();
        fenster.fensterToenen(50);
        getraenkemaschine.saeubern();
        
        herd.reinigen();

        heizung.aus();

        klimaanlage.temperaturHalten();
  }

}
