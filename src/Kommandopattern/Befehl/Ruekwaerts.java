package Kommandopattern.Befehl;

import Kommandopattern.Spielcharacter;

public class Ruekwaerts implements IBefehl {

  Spielcharacter character;

  public Ruekwaerts(Spielcharacter character) {
    this.character = character;
  }

  @Override
  public void ausfuehren() {
    this.character.yPosition -= 1;
    System.out.printf("Rückwärts...neue Y Position %d", this.character.yPosition);
  }
  
}
