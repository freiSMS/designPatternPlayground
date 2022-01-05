package Zustandspattern;
import java.util.Scanner;

import Zustandspattern.Zustaende.Auswahlzustand;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Einschalten der Kaffeemaschine...");
        Kaffeeautomat kaffeeautomat = new Kaffeeautomat(new Auswahlzustand());
        Scanner scanner = new Scanner(System.in);
        while (true) {
          String naechsterBefehl = scanner.nextLine();
          kaffeeautomat.setBefehl(naechsterBefehl);
        }
    }
}
