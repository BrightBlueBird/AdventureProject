package Adventure;
public class Adventure {


  PlayerInfo playerMoving = new PlayerInfo();

  private UserInterface ui = new UserInterface();
  Map map = new Map();
  private boolean isPlaying = true;
  private Room currentRoom;


  void playerChoice() {
    playerMoving.setCurrentRoom(map.rooms());
    while (isPlaying) {
      ui.getCommandMessage();
      ui.setInput();
      switch (ui.getInput()) {
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
          break;
        case 't':
          System.out.println("You picked up " + currentRoom.getItems().indexOf("Doors"));
          break;

        case 'd':
          System.out.println("You dropped " + currentRoom.dropItems().indexOf("Light"));
          break;

          /*
          String[] names = {"GardenShears", "Light", "Shovel"};
          ArrayList<String> Item = new ArrayList<>(List.of(names));
          System.out.println(Item);
          Item.clear();
          /* Item.add("Treasure");
          Item.add("Spell");
          Item.remove("Beef");
          Item.add("Pepsi");
          Item.add("Keys");
          Item.add("Doors");
          Item.add("Hammer");
          List youThree = Item.subList(0,3);
          Item.add(1,"Cho");
          System.out.println(Item);
          Item.set(1,"Ginny");
          System.out.println(Item);
   */

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
