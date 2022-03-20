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
