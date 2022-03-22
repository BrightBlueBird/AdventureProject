package Adventure;

import java.util.Scanner;

public class UserInterface {
  Scanner scan = new Scanner(System.in);
  Room currentRoom;
  private String playerName;
  private String itemChoice;
  private char movementInput;
  private String itemInput;

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

  void setMovementInput() {
    movementInput = scan.next().charAt(0);
  }

  char getMovementInput() {
    return movementInput;
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

  void looksAround() {
    System.out.println(playerName + " looks around the room.\n\n");
  }

  String getItemChoice() {
    return itemChoice;
  }

  void chooseItem() {
    System.out.println("Do you want to take or drop an item? Enter [t]ake, [d]rop or [n]o to do neither.");
  }

  void somethingWithItem() {
    System.out.println("Please write the item you would like to take from the room.");
  }

  void somethingItem2() {
    System.out.println("Please write the item you would like to place in the room");
  }

  void setItemChoice() {
    itemChoice = scan.nextLine();
  }

  public String getItemInput() {
    return itemInput;
  }

  public void setItemInput() {
    itemInput = scan.nextLine();
  }
}


