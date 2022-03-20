package Adventure;

import java.util.ArrayList;
import java.util.List;


public class Inventory {

  //ALOHOMORA UNLOCK DOORS
  //LOMOS = LIGHT
  //ACCIO BRINGS OBJECT CLOSER

  String [] values = {"shears", "light", "shovel", "treasure", "beef", "pepsi", "keys", "doors", "hammer"};
  ArrayList<String> items = new ArrayList<String>(List.of(values));

  public static void listOfItemsRoom1() {
    // String [] values = {"shears", "light", "shovel", "treasure", "beef", "pepsi", "keys", "doors", "hammer"};
    // ArrayList<String> items = new ArrayList<String>(List.of(values));
  }
  List roomItems() {
    String [] values = {"shears", "light", "shovel", "treasure", "beef", "pepsi", "keys", "doors", "hammer"};
    ArrayList<String> items = new ArrayList<String>(List.of(values));
    List roomItems = items.subList(0, 8);
    System.out.println(roomItems);
    System.out.println("We need shears to cut the plants in the green room");
    //   System.out.println(roomItems.get(2));
    return roomItems;

  }



/* public static void listOfItems2(){
      String [] spells = {"alohomora", "lumos", "accio"};
      ArrayList<String> spellCast = new ArrayList<String>(List.of(spells));
      List userSpells = spellCast.subList(0,3);
      System.out.println(userSpells);
      System.out.println("I need to bring this key closer to me");
      System.out.println("I need to use this spell " + userSpells.get(2));

 */
    }

