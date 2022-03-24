package Adventure;

public class String {
private java.lang.String name;
private java.lang.String description;

String(java.lang.String name, java.lang.String description){
  this.name = name;
  this.description = description;
}
  @Override
  public java.lang.String toString() {
    return "item: " + name + " " + description;
  }
  public java.lang.String getName() {
  return name;
  }
}
