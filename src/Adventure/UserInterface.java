package Adventure;

import java.util.Scanner;

public class UserInterface {
  Scanner scan = new Scanner(System.in);
  Room currentRoom;
  private String playerName;
  private String itemChoice;
  private char movementInput;
  private String itemInput;
  private String inventoryInput;

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
        Press i and enter to get a list of the items currently on your person.
        Press E and enter to terminate the program.
        You can always press h and enter again to get a list of commands. Hope you have fun! :)""");
  }

  void getWrongDirection() {
    System.out.println("You can't go that direction");
  }

  void getExitMessage() {
    System.out.println("The program is shutting down, Thanks for playing!");
  }

  void fixScannerBug() {
    scan.nextLine();
  }

  void setMovementInput() {
    movementInput = scan.next().charAt(0);
  }

  char getMovementInput() {
    return movementInput;
  }

  void getCommandMessage() {
    System.out.println("Please enter [n]orth, [s]outh, [e]ast, [w]est, [l]ook, [i]nventory, [h]elp, or [E]xit");
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


  public void roomName(Room currentRoom) {
    System.out.println(currentRoom.getName());
  }

  public void roomDescription(Room currentRoom) {
    System.out.println(currentRoom.getRoomDescription());
  }

  public void roomItems(Room currentRoom) {
    System.out.println(currentRoom.getItems());
  }

  void looksAround() {
    System.out.println(playerName + " looks around the room.\n\n");
  }

  public void setItemChoice() {
    itemChoice = scan.nextLine();
  }

  String getItemChoice() {
    return itemChoice;
  }

  void chooseItem() {
    System.out.println("Do you want to take or drop an item? Enter [t]ake, [d]rop or [n]o to do neither.");
  }

  void askWhatItemToTake() {
    System.out.println("Please write the item you would like to take from the room.");
  }

  void askWhatItemToPut() {
    System.out.println("Please write the item you would like to place in the room");
  }

  void displayInventory(PlayerInfo player) {
    System.out.println(player.getInventory());
  }

  void inventoryAction() {
    System.out.println("Would you like to [c]onsume or [a]ttack ?");
  }

  public String getItemInput() {
    return itemInput;
  }

  public String getInventoryInput() {
    return inventoryInput;
  }

  public void setItemInput() {
    itemInput = scan.nextLine();
  }

  public void setInventoryInput() {
    inventoryInput = scan.nextLine();
  }


}


