package Adventure;

public class Adventure {

  private UserInterface ui = new UserInterface();
  Map map = new Map();
  private boolean isPlaying = true;

  void playerChoice() {
    Room startRoom = map.getStartRoom();
    PlayerInfo playerMoving = new PlayerInfo(startRoom, 50);
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
          ui.fixScannerBug();
          ui.setInventoryInput();
          if (ui.getInventoryInput().equals("c")) {
            ui.whichItemToConsume();
            ui.setInventoryInput();
            Item tmp;
            tmp = playerMoving.doesItemExistInventory(ui.getInventoryInput());
            if (tmp == null) {
              System.out.println("You do not have this item in your inventory");
            } else {
              if (!tmp.getIsEdible()) {
                ui.itemIsNotEdible();
              } else {
                playerMoving.Eat(tmp);
                ui.youAteFood(tmp.getName(), playerMoving.getCurrentHealth());
              }
            }
          }
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
                if (itemInput.getIsEdible()) {
                  ui.eatOrKeep();
                  ui.setEatOrKeep();
                  if (ui.getEatOrKeep().equals("c")) {
                    playerMoving.Eat(itemInput);
                    ui.youAteFood(itemInput.getName(), playerMoving.getCurrentHealth());
                  }
                  if (ui.getEatOrKeep().equals("k")) {
                    System.out.println("You picked up an item");
                  }
                }
                if (!(itemInput instanceof Food)) {
                  System.out.println("You picked up an item");
                }
              } else {
                System.out.println("There is no such item in this room.");
              }
            }

            case "d" -> {
              ui.askWhatItemToPut();
              ui.setItemInput();
              Item itemInput = playerMoving.putInRoom(ui.getItemInput());
              if (itemInput != null) {
                System.out.println("You placed an item.");
              } else {
                System.out.println("There is no such item in this room.");
              }
            }
          }
        }
        case 'h' -> ui.displayHealth(playerMoving.getCurrentHealth());
        case 'H' -> ui.getHelp();
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
