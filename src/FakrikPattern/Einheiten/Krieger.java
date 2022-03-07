package FakrikPattern.Einheiten;

public class Krieger extends TemplateEinheit {

  public Krieger(String name, String volk) {
    super(name, volk);
    System.out.printf("Krieger %s vom Volk %s erscheint! \n", name, volk);
  }
  
}
