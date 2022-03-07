package FakrikPattern.Einheiten;

public class Reiter extends TemplateEinheit {

  public Reiter(String name, String volk) {
    super(name, volk);
    System.out.printf("Reiter %s vom Volk %s erscheint! \n", name, volk);
  }
  
}
