package Adventure;
public class Adventure {

  private UserInterface ui = new UserInterface();
  Map map = new Map();
  private boolean isPlaying = true;



  void playerChoice() {
    Room startRoom  = map.getStartRoom();
    PlayerInfo playerMoving = new PlayerInfo(startRoom);
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
          break;
        case 'd':
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
