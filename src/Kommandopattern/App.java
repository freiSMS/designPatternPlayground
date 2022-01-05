package Kommandopattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Spiel wird initialisiert...");
        Spielcharacter character = new Spielcharacter();
        Kommandoleiste kommandoleiste =  Kommandoleistenlader.createKommandoleiste(character);


        Scanner scanner = new Scanner(System.in);
        while (true) {
          Character naechsterBefehl = scanner.next().charAt(0);
          kommandoleiste.ausführen(naechsterBefehl);
        }
    }
}
