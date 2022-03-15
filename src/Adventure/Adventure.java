package Adventure;


import java.util.Scanner;

public class Adventure {
  Scanner scan = new Scanner(System.in);
  playerInfo playerName = new playerInfo();
  Room Room1 = new Room("The first room");
  Room Room2 = new Room("The green room");
  Room Room3 = new Room("The dark room");
  Room Room4 = new Room("The decaying room");
  Room Room5 = new Room("The winning room?");
  Room Room6 = new Room("The laboratory");
  Room Room7 = new Room("The room of judgement");
  Room Room8 = new Room("The room of choice");
  Room Room9 = new Room("The room of mirrors");
  private Room currentRoom;
  private boolean isPlaying = true;

  void Rooms() {
    Room1.setEast(Room2);
    Room1.setSouth(Room4);
    Room1.setDescription("This is the room where the adventure begins!\n\n" +
        "There are a couple of cobwebs in the corners of the room.\n" +
        "A chandelier cast a dim light on the cold stone walls.\n" +
        "To your east and west you see a wooden door.");

    Room2.setEast(Room3);
    Room2.setWest(Room1);
    Room2.setDescription("You are standing in a massive greenhouse.\n" +
        "You feel a sense of awe and wonder as you inspect all the exotic plants around you.\n" +
        "A bird chirps vigorously somewhere above you.");

    Room3.setSouth(Room6);
    Room3.setEast(Room2);
    Room3.setDescription("The room is completely dark, however a putrid, almost sweet smell fills your nostrils.");

    Room4.setNorth(Room1);
    Room4.setSouth(Room7);
    Room4.setDescription("The room is filled with sand. Sand is also trickling down from the ceiling.\n" +
        "You can see different kinds of furniture barely sticking up from the sand.");

    Room5.setSouth(Room8);
    Room5.setDescription("You are in the treasure chamber or something!\n" +
        "I think this is where you win the game later on.");

    Room6.setNorth(Room3);
    Room6.setSouth(Room9);
    Room6.setDescription("You stand in something that looks like a medieval laboratory." +
        "Viles filled with liquids in all the colors of the rainbow decorate shelf's on the wall." +
        "A vile with a clear blue substance on a table in the corner of the room catches your attention.");

    Room7.setEast(Room8);
    Room7.setNorth(Room4);
    Room7.setDescription("There is a wyvern sleeping in the room with an iron collar around it's neck. " +
        "The iron collar is chained to the wall.\n" +
        "There are burn marks on the stone walls.\n" +
        "One of the burn marks outlines something that might have been human at some point...");

    Room8.setNorth(Room5);
    Room8.setWest(Room7);
    Room8.setEast(Room9);
    Room8.setDescription("There are three huge doors in total in this room.\n" +
        "One door is cast in gold, one in silver and one in bronze.");

    Room9.setNorth(Room6);
    Room9.setWest(Room8);
    Room9.setDescription("You see mirrors all around the room which makes it difficult to orient yourself.\n" +
        "At least you look handsome. ;)");

  }

  void Welcome() {
    System.out.println("Please enter your player name");
    playerName.setNameOfPlayer(scan.nextLine());
    System.out.println("Hi " + playerName.getNameOfPlayer());
    System.out.println("Welcome to the adventure game!");
  }

  void playerChoice() {
    char input;
    currentRoom = Room1;
    while (isPlaying) {
      System.out.println("Please enter [n]orth, [s]outh, [e]ast, [w]est, [l]ook, [h]elp, or [E]xit ");
      input = scan.next().charAt(0);
      switch (input) {
        case 'n':
          Rooms();
          if (currentRoom.getNorth() != null) {
            currentRoom = currentRoom.getNorth();
            System.out.println("Going north");
            System.out.println("You are standing in: " + currentRoom.getName());
          } else {
            System.out.println("You can't go that direction");

          }
          break;
        case 's':
          Rooms();
          if (currentRoom.getSouth() != null) {
            currentRoom = currentRoom.getSouth();
            System.out.println("Going south");
            System.out.println("You are standing in: " + currentRoom.getName());
          } else {
            System.out.println("You can't go that direction");
          }
          break;
        case 'e':
          Rooms();
          if (currentRoom.getEast() != null) {
            currentRoom = currentRoom.getEast();
            System.out.println("Going East");
            System.out.println("You are standing in: " + currentRoom.getName());
          } else {
            System.out.println("You can't go that direction");
          }
          break;
        case 'w':
          Rooms();
          if (currentRoom.getWest() != null) {
            currentRoom = currentRoom.getWest();
            System.out.println("Going west");
            System.out.println("You are standing in: " + currentRoom.getName());
          } else {
            System.out.println("You can't go that direction");
          }
          break;
        case 'l':
          System.out.println(playerName.getNameOfPlayer() + " looks around the room.\n\n");
          System.out.println(currentRoom.getDescription());
          break;
        case 'h':
          System.out.println("You generally have six actions at any given time you can perform:\n" +
              "Press n and press enter to go to the room north of your current position.\n" +
              "Press s and press enter to go to the room south of your current position.\n" +
              "Press e and press enter to go to the room east of your current position.\n" +
              "Press w and press enter to go to the room west of your current position.\n" +
              "press l and enter to get a description of the room your standing in.\n" +
              "press E and enter to terminate the program.\n" +
              "You can always press h and enter again to get a list of commands. Hope you have fun! :)");
          break;
        case 'E':
          System.out.println("The program is shutting down, Thanks for playing!");
          isPlaying = false;
      }
    }
  }

  void go() {
    Welcome();
    playerChoice();
  }

  public static void main(String[] args) {
    new Adventure().go();
  }
}
