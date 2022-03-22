package Adventure;

public class Adventure {

  private UserInterface ui = new UserInterface();
  Map map = new Map();
  private boolean isPlaying = true;


  void playerChoice() {
    Room startRoom = map.getStartRoom();
    PlayerInfo playerMoving = new PlayerInfo(startRoom);
    while (isPlaying) {
      ui.getCommandMessage();
      ui.setMovementInput();
      switch (ui.getMovementInput()) {
        case 'n':
          playerMoving.north();
          break;
        case 's':
          playerMoving.south();
          break;
        case 'e':
          playerMoving.east();
          break;
        case 'w':
          playerMoving.west();
          break;
        case 'l':
          ui.looksAround();
          playerMoving.description(); //TODO flyt description fra player klassen til UserInterface klassen.

          ui.chooseItem();
          ui.setItemChoice();
          if (ui.getItemChoice().equals("t")) {
            ui.somethingWithItem();
            ui.setItemInput();
            Item itemInput = playerMoving.takeFromRoom(ui.getItemInput());
            if (itemInput != null) {
              System.out.println("You took " + itemInput);
            } else {
              System.out.println("There is no such item in this room!");
            }
          } else if (ui.getItemChoice().equals("d")) {
            ui.somethingItem2();
            ui.setItemInput();
            Item itemInput = playerMoving.putInRoom(ui.getItemInput());
            if (itemInput != null) {
              System.out.println("You placed" + itemInput);
            } else {
              System.out.println("There is no such item in your inventory.");
            }
          } else if (!ui.getItemChoice().equals("n")) {
            System.out.println("Invalid input");
          } else {
            System.out.println("You chose to do nothing with items.");
          }


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
