package Adventure;

import java.util.ArrayList;

public class PlayerInfo {
  private Room currentRoom;
  private ArrayList<String> inventory;

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

  public String takeFromRoom(java.lang.String itemName) {
    String takenRoomItem = currentRoom.itemTakenFromRoom(itemName);
    if (takenRoomItem != null) {
      inventory.add(takenRoomItem);
    }
    return takenRoomItem;
  }

  public String putInRoom(java.lang.String itemName) {
    String placedRoomItem = currentRoom.itemPlacedInRoom(itemName);
    if (placedRoomItem != null) {
      inventory.add(placedRoomItem);
    }
    return placedRoomItem;
  }
  public Room getCurrentRoom() {
    return currentRoom;
  }
}