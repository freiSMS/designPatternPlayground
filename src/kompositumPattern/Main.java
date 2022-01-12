package kompositumPattern;

import kompositumPattern.interfaces.Truppeninterface;
import kompositumPattern.truppen.Offizier;
import kompositumPattern.truppen.Reiter;

public class Main {
  public static void main(String[] args) {
    Kaserne meineKaserne = new Kaserne();

    Offizier karlDerGrosse = meineKaserne.produceOffizier();
    Offizier derAndere = meineKaserne.produceOffizier();

    Reiter kaputterReiter = meineKaserne.produceReiter();

    karlDerGrosse.hinzufuegen(meineKaserne.produceSoldat());
    karlDerGrosse.hinzufuegen(meineKaserne.produceSoldat());
    karlDerGrosse.hinzufuegen(meineKaserne.produceSoldat());
    karlDerGrosse.hinzufuegen(kaputterReiter);
    karlDerGrosse.hinzufuegen(meineKaserne.produceSoldat());
    karlDerGrosse.hinzufuegen(meineKaserne.produceReiter());
    karlDerGrosse.hinzufuegen(meineKaserne.produceReiter());

    System.out.println("Der kaputte Reiter läuft weg...");

    karlDerGrosse.entfernen(kaputterReiter);

    derAndere.hinzufuegen(meineKaserne.produceReiter());
    derAndere.hinzufuegen(meineKaserne.produceReiter());
    derAndere.hinzufuegen(meineKaserne.produceReiter());



    karlDerGrosse.hinzufuegen(derAndere);
    
    
  }
}
