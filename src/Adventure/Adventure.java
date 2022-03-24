package Adventure;

public class Adventure {

  private UserInterface ui = new UserInterface();
  Map map = new Map();
  private boolean isPlaying = true;


  void playerChoice() {
    Room startRoom = map.getStartRoom();
    PlayerInfo playerMoving = new PlayerInfo(startRoom);
    Boolean moved;
    while (isPlaying) {
      ui.getCommandMessage();
      ui.setMovementInput();
      switch (ui.getMovementInput()) {
        case 'n':
          moved = playerMoving.north();
          if(moved) {
            ui.playerGoingNorth();
            ui.roomName(playerMoving.getCurrentRoom());
          } else {
            ui.getWrongDirection();
          }
          break;
        case 's':
          moved = playerMoving.south();
          if(moved) {
            ui.playerGoingSouth();
            ui.roomName(playerMoving.getCurrentRoom());
          } else {
            ui.getWrongDirection();
          }
          break;
        case 'e':
          moved = playerMoving.east();
          if(moved) {
            ui.playerGoingEast();
            ui.roomName(playerMoving.getCurrentRoom());
          } else {
            ui.getWrongDirection();
          }
          break;
        case 'w':
          moved = playerMoving.west();
          if(moved) {
            ui.playerGoingWest();
            ui.roomName(playerMoving.getCurrentRoom());
          } else {
            ui.getWrongDirection();
          }
          break;
        case 'l':
          ui.looksAround();
          ui.roomDescription(playerMoving.getCurrentRoom());
          ui.roomItems(playerMoving.getCurrentRoom());
          ui.chooseItem();
          ui.fixScannerBug();
          ui.setItemChoice();
          if (ui.getItemChoice().equals("t")) {
            ui.somethingWithItem();
            ui.setItemInput();
            String itemInput = playerMoving.takeFromRoom(ui.getItemInput());
            if (itemInput != null) {
              System.out.println("You took " + itemInput);
            } else {
              System.out.println("There is no such item in this room!");
            }
          } else if (ui.getItemChoice().equals("d")) {
            ui.somethingItem2();
            ui.setItemInput();
            String itemInput = playerMoving.putInRoom(ui.getItemInput());
            if (itemInput != null) {
              System.out.println("You placed" + itemInput);
            } else {
              System.out.println("There is no such item in your inventory.");
            }
               } else if (ui.getItemChoice().equals("n")) {
            System.out.println("Invalid input");
          } else {
            System.out.println("You chose to do nothing with items.");
          }
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
