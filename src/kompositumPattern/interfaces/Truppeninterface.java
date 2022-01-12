package kompositumPattern.interfaces;

public abstract class Truppeninterface {
  public final int id;
  public Truppeninterface(int id) {
    this.id = id;
    System.out.printf("Neue %s Einheit mit id %s erstellt.\n ", this.getClass(), id);
  }
  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Truppeninterface) {
      Truppeninterface compareObject = (Truppeninterface) obj;
      if(compareObject.id == this.id) {
        return true;
      }
    }
    return false;
  }
  public abstract int angreiffen();
}
