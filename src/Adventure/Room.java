package Adventure;

import java.util.ArrayList;

public class Room {
  private Room north;
  private Room south;
  private Room east;
  private Room west;
  private java.lang.String name;
  private java.lang.String roomDescription;
  private ArrayList<String> items;


  Room(java.lang.String name) {
    this.name = name;
    items = new ArrayList<>();
  }

  public void setNorth(Room north) {
    this.north = north;
  }

  public void setSouth(Room south) {
    this.south = south;
  }

  public void setEast(Room east) {
    this.east = east;
  }

  public void setWest(Room west) {
    this.west = west;
  }

  public void setRoomDescription(java.lang.String description) {
    this.roomDescription = description;
  }


  public Room getNorth() {
    return north;
  }

  public Room getSouth() {
    return south;
  }

  public Room getEast() {
    return east;
  }

  public Room getWest() {
    return west;
  }

  public java.lang.String getRoomDescription() {
    return roomDescription;
  }

  public ArrayList<String> getItems() {
    return items; // Maybe String
  }

  public java.lang.String getName() {
    return name;
  }

  public void addItem(String item){
    items.add(item);
  }

  public String itemPlacedInRoom(java.lang.String itemName) {
    for (int i = 0; i < items.size(); i++) {
      String check = items.get(i);
      if(check.getName().equals(itemName)) {
        items.add(check);
        return check;
      }
    }
    return null;
  }

  public String itemTakenFromRoom(java.lang.String itemName) {
    for (int i = 0; i < items.size(); i++) {
      String check = items.get(i);
      if(check.getName().equals(itemName)) {
        items.remove(check);
        return check;
      }
    }
    return null;
  }
}