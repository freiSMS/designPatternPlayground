package Kommandopattern.Befehl;

import Kommandopattern.Spielcharacter;

public class Rechts implements IBefehl {

  Spielcharacter character;

  public Rechts(Spielcharacter character) {
    this.character = character;
  }

  @Override
  public void ausfuehren() {
    this.character.xPosition += 1;
    System.out.printf("Vorwärts...neue X Position %d", this.character.xPosition);
  }
  
}
