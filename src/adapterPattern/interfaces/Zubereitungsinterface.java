package adapterPattern.interfaces;

public interface Zubereitungsinterface {
  public void stelleBecherBereit(Bechergroessen becher);
  public void mahleBohnen(int gramm);
  public void brueheAuf(int ml);
  public void entsorgeTrester();
}