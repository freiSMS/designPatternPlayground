package FakrikPattern;

import FakrikPattern.Fabriken.Menschenfabrik;
import FakrikPattern.Fabriken.Orkfabrik;

public class Main {
  public static void main(String[] args) {
    Menschenfabrik kaserneMensch = new Menschenfabrik();
    Orkfabrik kaserneOrk = new Orkfabrik();

    kaserneMensch.erzeugeEinheit("Peter");
    kaserneOrk.erzeugeEinheit("Hschmark");
  }
}
