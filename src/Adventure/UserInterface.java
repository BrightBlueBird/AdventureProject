package Adventure;

import java.util.Scanner;

public class UserInterface {
  Scanner scan = new Scanner(System.in);
  PlayerInfo playerName = new PlayerInfo();
  private char input;
  void welcome() {
    System.out.println("Please enter your player name");
    playerName.setNameOfPlayer(scan.nextLine());
    System.out.println("Hi " + playerName.getNameOfPlayer());
    System.out.println("Welcome to the adventure game!");
  }
  void getHelp() {
    System.out.println("You generally have six actions at any given time you can perform:\n" +
        "Press n and press enter to go to the room north of your current position.\n" +
        "Press s and press enter to go to the room south of your current position.\n" +
        "Press e and press enter to go to the room east of your current position.\n" +
        "Press w and press enter to go to the room west of your current position.\n" +
        "press l and enter to get a description of the room your standing in.\n" +
        "press E and enter to terminate the program.\n" +
        "You can always press h and enter again to get a list of commands. Hope you have fun! :)");
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
}
