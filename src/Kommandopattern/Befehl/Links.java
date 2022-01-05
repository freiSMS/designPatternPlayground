package Kommandopattern.Befehl;

import Kommandopattern.Spielcharacter;

public class Links implements IBefehl {

  Spielcharacter character;

  public Links(Spielcharacter character) {
    this.character = character;
  }

  @Override
  public void ausfuehren() {
    this.character.xPosition -= 1;
    System.out.printf("Links...neue X Position %d", this.character.xPosition);
  }
  
}
