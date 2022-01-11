package adapterPattern.adapter;

import adapterPattern.interfaces.Bechergroessen;
import adapterPattern.interfaces.Zubereitungsinterface;
import adapterPattern.maschinen.PadMaschine;

public class PadAdapter implements Zubereitungsinterface {
  private PadMaschine padMaschine = new PadMaschine(); 


  @Override
  public void stelleBecherBereit(Bechergroessen becher) {
    if(becher.equals(Bechergroessen.KLEINER_BECHER)) {
      padMaschine.stelleBecherBereit(PadMaschine.KLEINER_KAFFEE);
    } else if(becher.equals((Bechergroessen.GROSSER_BECHER))) {
      padMaschine.stelleBecherBereit(PadMaschine.GROSSER_BECHER);
    }
  }

  @Override
  public void mahleBohnen(int gramm) {
    if (gramm <= 20) {
      padMaschine.padEinlegen(1);
    } else if (gramm > 20 && gramm <= 30 ) {
      padMaschine.padEinlegen(2);
    }  else if(gramm > 30 ) {
      padMaschine.padEinlegen(3);
    }
  }

  @Override
  public void brueheAuf(int ml) {
    System.out.println("Bei der Pad Maschine gibt es nur die Einstellungen klein (200ml) und groß (400ml)...");
    if(ml <= 200) {
      System.out.println("Die Eingabe fällt ins Intervall eines kleinen Kaffees.");
      padMaschine.brueheAuf(PadMaschine.KLEINER_KAFFEE);
    } else if(ml > 200) {
      System.out.println("Die Eingabe fällt ins Intervall eines großen Kaffees.");
      padMaschine.brueheAuf(PadMaschine.GROSSER_KAFFEE);
    }
    
  }

  @Override
  public void entsorgeTrester() {
    padMaschine.entsorgePad();
  }

  
}
