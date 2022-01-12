package kompositumPattern.truppen;

import java.util.LinkedList;

import kompositumPattern.interfaces.KompositumInterface;
import kompositumPattern.interfaces.Truppeninterface;

public class Offizier extends Truppeninterface implements KompositumInterface {
  private LinkedList<Truppeninterface> truppen = new LinkedList<Truppeninterface>();

  public Offizier(int id) {
    super(id);
  }

  @Override
  public int angreiffen() {
    return 3;
  }

  @Override
  public void hinzufuegen(Truppeninterface truppe) {
    this.truppen.add(truppe);
    System.out.printf("Offizier mit id %s befehligt jetzt %d Truppen. \n", this.id, this.truppen.size() );
    
  }

  @Override
  public void entfernen(Truppeninterface truppe) {
    System.out.printf("Entferne %s mit id %s \n", truppe.getClass(), truppe.id);
    boolean success  = this.truppen.remove(truppe);
    if(success) {
      System.out.println("..erfolgreich");
    } else {
      System.out.println("..ohne Erfolg");
    }

    
  }

  @Override
  public Truppeninterface get(Truppeninterface truppe) {
    int truppenIndex = this.truppen.indexOf(truppe);
    if(truppenIndex == -1) {
      throw new Error(String.format("Die Truppe %s ist nicht vorhanden.", truppe));
    }
    return this.truppen.get(truppenIndex);    
  }
  
}
