package Adventure;

import java.util.Scanner;

public class UserInterface {
  Scanner scan = new Scanner(System.in);
  Room currentRoom;
  private String playerName;

  private char input;

  void welcome() {
    System.out.println("Please enter your player name");
    playerName = scan.nextLine();
    System.out.println("Hi " + playerName);
    System.out.println("Welcome to the adventure game!");
  }

  void getHelp() {
    System.out.println("""
        You generally have six actions at any given time you can perform:
        Press n and press enter to go to the room north of your current position.
        Press s and press enter to go to the room south of your current position.
        Press e and press enter to go to the room east of your current position.
        Press w and press enter to go to the room west of your current position.
        Press l and enter to get a description of the room your standing in.
        Press E and enter to terminate the program.
        You can always press h and enter again to get a list of commands. Hope you have fun! :)""");
  }

  void getWrongDirection() {
    System.out.println("You can't go that direction");
  }

  void getExitMessage() {
    System.out.println("The program is shutting down, Thanks for playing!");
  }

  void setInput() {
    input = scan.next().charAt(0);
  }

  char getInput() {
    return input;
  }

  void getCommandMessage() {
    System.out.println("Please enter [n]orth, [s]outh, [e]ast, [w]est, [l]ook, [h]elp, or [E]xit ");
  }

  void playerGoingNorth() {
    System.out.println("Going north");
  }

  void playerGoingSouth() {
    System.out.println("Going south");
  }

  void playerGoingEast() {
    System.out.println("Going East");
  }

  void playerGoingWest() {
    System.out.println("Going west");
  }

 /*public void roomName() {
    PlayerInfo player = new PlayerInfo();
    currentRoom = player.getCurrentRoom();
    currentRoom.getName();
  } TODO hvorfor virker det ikke? */

  public void looksAround() {
    System.out.println(playerName + " looks around the room.\n\n");
  }
}


