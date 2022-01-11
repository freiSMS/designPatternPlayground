package adapterPattern.maschinen;

public class PadMaschine {
  public static final String KLEINER_BECHER = "Kleiner Becher";
  public static final String GROSSER_BECHER = "Grosser Becher";

  public static final String KLEINER_KAFFEE = "klein";
  public static final String GROSSER_KAFFEE = "groß";

  public void stelleBecherBereit(String becher) {
    if (!becher.equals(KLEINER_BECHER) || !becher.equals(GROSSER_BECHER)) {
      throw new Error(String.format("Die Bechergröße %s wird von der Padmaschine nicht unterstützt", becher));
    }
    System.out.println(becher + " wird bereitgestellt.");
  }

  public void padEinlegen(int padCount) {
    if (padCount == 1) {
      System.out.println("Es wird ein Pad in die Maschine gelegt.");
    } else if (padCount > 1) {
      System.out.printf("Es werden %d Pads in die Maschine gelegt. \n", padCount);
    } else {
      throw new Error(String.format("Die Größe %d wird von der Padmaschine nicht unterstützt", padCount));
    }
  }

  public void brueheAuf(String großOderKlein) {
    if (großOderKlein.equals(KLEINER_KAFFEE)) {
      System.out.println("Der Kaffee wird mit 200 ml heißem Wasser aufgebrüht.");
    } else if (großOderKlein.equals(GROSSER_KAFFEE)) {
      System.out.println("Der Kaffee wird mit 400 ml heißem Wasser aufgebrüht.");
    }
  }

  public void entsorgePad() {
    System.out.println("Das Pad wird entsorgt.");
  }
}
