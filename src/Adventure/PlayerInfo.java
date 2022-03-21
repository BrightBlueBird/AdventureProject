package Adventure;

public class PlayerInfo {
  private Room currentRoom;

  public void setCurrentRoom(Room currentRoom) {
    this.currentRoom = currentRoom;
  }

  public void north() {
  UserInterface ui = new UserInterface();

    if (currentRoom.getNorth() != null) {
      currentRoom = currentRoom.getNorth();
      ui.playerGoingNorth();
      // ui.roomName(); TODO Få den her metode til at virke
      System.out.println(currentRoom.getName());
    } else {
      ui.getWrongDirection();
    }
  }

  public void south() {
    UserInterface ui = new UserInterface();

    if (currentRoom.getSouth() != null) {
      currentRoom = currentRoom.getSouth();
      ui.playerGoingSouth();
      // ui.roomName(); TODO Få den her metode til at virke
      System.out.println(currentRoom.getName());
    } else {
      ui.getWrongDirection();
    }
  }

  public void east() {
    UserInterface ui = new UserInterface();

    if (currentRoom.getEast() != null) {
      currentRoom = currentRoom.getEast();
      ui.playerGoingEast();
      //ui.roomName(); TODO Få den her metode til at virke
      System.out.println(currentRoom.getName());
    } else {
      ui.getWrongDirection();
    }
  }

  public void west() {
    UserInterface ui = new UserInterface();

    if (currentRoom.getWest() != null) {
      currentRoom = currentRoom.getWest();
      ui.playerGoingWest();
     // ui.roomName(); TODO Få den her metode til at virke
      System.out.println(currentRoom.getName());
    } else {
      ui.getWrongDirection();
    }
  }

  public void description() {
    System.out.println(currentRoom.getDescription());
  }
}