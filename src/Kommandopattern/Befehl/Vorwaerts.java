package Kommandopattern.Befehl;

import Kommandopattern.Spielcharacter;

public class Vorwaerts implements IBefehl {

  Spielcharacter character;

  public Vorwaerts(Spielcharacter character) {
    this.character = character;
  }

  @Override
  public void ausfuehren() {
    this.character.yPosition += 1;
    System.out.printf("Vorwärts...neue Y Position %d", this.character.yPosition);
  }
  
}
