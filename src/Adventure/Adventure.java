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
        case 'n' -> {
          moved = playerMoving.north();
          if (moved) {
            ui.playerGoingNorth();
            ui.roomName(playerMoving.getCurrentRoom());
          } else {
            ui.getWrongDirection();
          }
        }
        case 's' -> {
          moved = playerMoving.south();
          if (moved) {
            ui.playerGoingSouth();
            ui.roomName(playerMoving.getCurrentRoom());
          } else {
            ui.getWrongDirection();
          }
        }
        case 'e' -> {
          moved = playerMoving.east();
          if (moved) {
            ui.playerGoingEast();
            ui.roomName(playerMoving.getCurrentRoom());
          } else {
            ui.getWrongDirection();
          }
        }
        case 'w' -> {
          moved = playerMoving.west();
          if (moved) {
            ui.playerGoingWest();
            ui.roomName(playerMoving.getCurrentRoom());
          } else {
            ui.getWrongDirection();
          }
        }
        case 'i' -> {
          ui.displayInventory(playerMoving);
          ui.inventoryAction();
          ui.setInventoryInput();

        }
        case 'l' -> {
          ui.looksAround();
          ui.roomDescription(playerMoving.getCurrentRoom());
          ui.roomItems(playerMoving.getCurrentRoom());
          ui.chooseItem();
          ui.fixScannerBug();
          ui.setItemChoice();
          switch (ui.getItemChoice()) {
            case "t" -> {
              ui.askWhatItemToTake();
              ui.setItemInput();
              Item itemInput = playerMoving.takeFromRoom(ui.getItemInput());
              if (itemInput != null) {
                System.out.println("You picked up an item.");
              } else {
                System.out.println("There is no such item in this room.");
              }
            }

            case "d" -> {
              ui.askWhatItemToPut();
              ui.setItemInput();
              Item itemInput = playerMoving.putInRoom(ui.getItemInput());
              if(itemInput != null) {
                System.out.println("You placed an item.");
              } else {
                System.out.println("There is no such item in this room.");
              }
            }
          }
        }

        case 'h' -> ui.getHelp();
        case 'E' -> {
          ui.getExitMessage();
          isPlaying = false;
        }
      }
    }
  }

  void go() {
    ui.welcome();
    playerChoice();
  }
}
