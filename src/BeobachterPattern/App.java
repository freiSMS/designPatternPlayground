package BeobachterPattern;

import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("Ein neuer Held wurde geboren...");
    Held held = new Held(30);
    EreignisAnzeige ereignisAnzeige = new EreignisAnzeige(held);
    Lebensbalken lebensbalken = new Lebensbalken(held);

    System.out.printf("...er fühlt sich super ausgeruht und hat %d Lebenspunkte", 30);

    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Angriff!! Wie viel Schaden wurden zugefügt?");
      int naechsterSchaden = scanner.nextInt();
      held.lebenspunkte += naechsterSchaden;
      held.benachrichtigeBeobachter();
    }
  }
}
