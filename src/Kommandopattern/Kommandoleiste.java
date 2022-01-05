package Kommandopattern;

import java.util.HashMap;

import Kommandopattern.Befehl.IBefehl;

public class Kommandoleiste {
  HashMap<Character, IBefehl> kommandoMap =  new HashMap<Character, IBefehl>();


  public Kommandoleiste() {
  }

  public void setBefehl(Character taste, IBefehl befehl) {
    kommandoMap.put(taste, befehl);
  };

  public void ausführen(Character taste) {
    IBefehl aktuellerBefehl =  kommandoMap.get(taste);
    if(aktuellerBefehl != null) {
      aktuellerBefehl.ausfuehren();
    }
  }
  
}
