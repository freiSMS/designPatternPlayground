package FassadePattern;

import FassadePattern.Fassaden.RoutineFassade;

public class Main {
  public static void main(String[] args) {
    RoutineFassade routinenSammlung = new RoutineFassade();
    routinenSammlung.gutenMorgen();
    routinenSammlung.geheZurArbeit();
  }
}
