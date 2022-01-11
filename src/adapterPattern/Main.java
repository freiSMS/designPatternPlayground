package adapterPattern;

import java.util.Scanner;

import adapterPattern.adapter.PadAdapter;
import adapterPattern.interfaces.Zubereitungsinterface;
import adapterPattern.maschinen.Kaffeemaschine;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Zubereitungsinterface aktuelleMaschine = new Kaffeemaschine();
    System.out.println("Hi. Wähle 1 um die normale Kaffeemaschine zu nutzen und 2 für die Padmaschine.");

    int maschinenAuswahl = scanner.nextInt();
    switch (maschinenAuswahl) {
      case 1:
        aktuelleMaschine = new Kaffeemaschine();
        break;
      case 2:
        aktuelleMaschine = new PadAdapter();
        break;
      default:
        System.out.println("Das habe ich nicht verstanden. Ich nehme die Kaffeemaschine.");
        aktuelleMaschine = new Kaffeemaschine();
        break;
    }

    System.out.println("Hallo ich bin deine Kaffeemaschine. Wie viel ml soll dein Kaffee enthalten?");
    int kaffeegroesseInMl = scanner.nextInt();

    System.out.printf("Super! Kaffeegroesse %d ml. Wie viel Gramm Bohnen?", kaffeegroesseInMl);

    int bohnenmenge = scanner.nextInt();

    System.out.printf("%d Bohnen. In Ordnung. Ich starte...", bohnenmenge);

    aktuelleMaschine.mahleBohnen(bohnenmenge);
    aktuelleMaschine.brueheAuf(kaffeegroesseInMl);
    aktuelleMaschine.entsorgeTrester();
  }
}
