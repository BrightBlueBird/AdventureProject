package Adventure;

public class Item {
private String name;
private String description;

Item(String name, String description){
  this.name = name;
  this.description = description;
}

  @Override
  public String toString() {
    return "item: " + name + " " + description;
  }
}
