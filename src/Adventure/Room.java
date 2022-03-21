package Adventure;

import java.util.ArrayList;
import java.util.List;

public class Room {
  private Room north;
  private Room south;
  private Room east;
  private Room west;
  final private String name;
  private String description;
  private ArrayList<Item> items = new ArrayList<>();


  Room(String name) {
    this.name = name;
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

  public void setDescription(String description) {
    this.description = description;
  }

  public ArrayList<Item> getItems(){
    return items;
  }

  public ArrayList<Item>  dropItems(){
    return items;
  }

  public void addItem(Item item){
    items.add(item);
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

  public String getDescription() {
    return description;
  }

  public String getName() {
    return name;
  }
}