package BeobachterPattern;

public interface NotifierInterface {
  public void registriereBeobachter(BeobachterInterface neuerBeobachter);
  public void entferneBeobachter(BeobachterInterface neuerBeobachter);
  public void benachrichtigeBeobachter();
}
