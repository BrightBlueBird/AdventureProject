package Adventure;

import java.util.ArrayList;

public class PlayerInfo {
  private Room currentRoom;
  private ArrayList<Item> inventory;
  private int currentHealth;

  public PlayerInfo(Room startRoom) {
    this.currentRoom = startRoom;
    inventory = new ArrayList<>();
  }

  public Boolean north() {
    if (currentRoom.getNorth() != null) {
      currentRoom = currentRoom.getNorth();
      return true;
    } else {
     return false;
    }
  }

  public Boolean south() {
    if (currentRoom.getSouth() != null) {
      currentRoom = currentRoom.getSouth();
      return true;
    } else {
      return false;
    }
  }

  public Boolean east() {
    if (currentRoom.getEast() != null) {
      currentRoom = currentRoom.getEast();
    return true;
    } else {
      return false;
    }
  }

  public Boolean west() {
    if (currentRoom.getWest() != null) {
      currentRoom = currentRoom.getWest();
      return true;
    } else {
      return false;
    }
  }

  public ArrayList<Item> getInventory() {
    return inventory;
  }

  public Item takeFromRoom(String itemName) {
    Item takenRoomItem = currentRoom.itemTakenFromRoom(itemName);
    if (takenRoomItem != null) {
      inventory.add(takenRoomItem);
    }
    return takenRoomItem;
  }

  public Item putInRoom(String itemName) {
    Item placedRoomItem = currentRoom.itemPlacedInRoom(itemName);
    if (placedRoomItem != null) {
      inventory.remove(placedRoomItem);
    }
    return placedRoomItem;
  }
  public Room getCurrentRoom() {
    return currentRoom;
  }
  public void setStartHealth(int currentHealth) {
    this.currentHealth = currentHealth;
  }
  public int getCurrentHealth() {
    return currentHealth;
  }
  public void Eat(Item food) {
    currentHealth = currentHealth + food.getHealth();
    inventory.remove(food);
  }
  public Item doesItemExistInventory(String foodName) {
    for (int i = 0; i < inventory.size(); i++) {
      Item check = inventory.get(i);
      if(foodName.equalsIgnoreCase(inventory.get(i).getName())) {
        return check;
      }
    }
    return null;
  }
}