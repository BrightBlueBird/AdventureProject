package Adventure;
public class Adventure {

  PlayerInfo playerName = new PlayerInfo();
  private Room currentRoom;
  UserInterface ui = new UserInterface();
  Map map = new Map();
  private boolean isPlaying = true;

  void playerChoice() {
    currentRoom = map.rooms();
    while (isPlaying) {
      ui.getCommandMessage();
      ui.setInput();
      switch (ui.getInput()) {
        case 'n':
          map.rooms();
          if (currentRoom.getNorth() != null) {
            currentRoom = currentRoom.getNorth();
            System.out.println("Going north");
            System.out.println("You are standing in: " + currentRoom.getName());
          } else {
            ui.getWrongDirection();
          }
          break;
        case 's':
          map.rooms();
          if (currentRoom.getSouth() != null) {
            currentRoom = currentRoom.getSouth();
            System.out.println("Going south");
            System.out.println("You are standing in: " + currentRoom.getName());
          } else {
            ui.getWrongDirection();
          }
          break;
        case 'e':
          map.rooms();
          if (currentRoom.getEast() != null) {
            currentRoom = currentRoom.getEast();
            System.out.println("Going East");
            System.out.println("You are standing in: " + currentRoom.getName());
          } else {
            ui.getWrongDirection();
          }
          break;
        case 'w':
          map.rooms();
          if (currentRoom.getWest() != null) {
            currentRoom = currentRoom.getWest();
            System.out.println("Going west");
            System.out.println("You are standing in: " + currentRoom.getName());
          } else {
            ui.getWrongDirection();
          }
          break;
        case 'l':
          System.out.println(playerName.getNameOfPlayer() + " looks around the room.\n\n");
          System.out.println(currentRoom.getDescription());
          break;
        case 'h':
          ui.getHelp();
          break;
        case 'E':
          ui.getExitMessage();
          isPlaying = false;
      }
    }
  }

  void go() {
    ui.welcome();
    playerChoice();
  }
}
