package Adventure;

import java.util.ArrayList;

public class PlayerInfo {
  private Room currentRoom;
  private ArrayList<Item> inventory;

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

  public void description() {
    System.out.println(currentRoom.getRoomDescription());
    System.out.println("You can see some items in the room: " + currentRoom.getItems());
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
      inventory.add(placedRoomItem);
    }
    return placedRoomItem;
  }
  public Room getCurrentRoom() {
    return currentRoom;
  }
}