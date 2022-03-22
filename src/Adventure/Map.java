package Adventure;

import java.util.ArrayList;

public class Map {
 private Room startRoom;


  Map() {
    Room room1 = new Room("The first room");
    Room room2 = new Room("The green room");
    Room room3 = new Room("The dark room");
    Room room4 = new Room("The decaying room");
    Room room5 = new Room("The winning room?");
    Room room6 = new Room("The laboratory");
    Room room7 = new Room("The room of judgement");
    Room room8 = new Room("The room of choice");
    Room room9 = new Room("The room of mirrors");

    Item GardenShears = new Item(ConsoleColers.RED + "Garden Shears", ConsoleColers.PURPLE + "Used for cutting" + ConsoleColers.RESET);
    Item Light = new Item(ConsoleColers.RED + "Light", ConsoleColers.PURPLE + "This spell is nice" + ConsoleColers.RESET);
    Item Shovel = new Item(ConsoleColers.RED + "Shovel", ConsoleColers.PURPLE + "This tool helps for digging" + ConsoleColers.RESET);
    Item Treasure = new Item(ConsoleColers.RED + "Treasure", ConsoleColers.PURPLE + "Oh mama! JACKPOT" + ConsoleColers.RESET);
    Item Spell = new Item(ConsoleColers.RED + "Spell", ConsoleColers.PURPLE + "This spell is amazing for killing things" + ConsoleColers.RESET);
    Item Beef = new Item(ConsoleColers.RED + "Beef", ConsoleColers.PURPLE + "Hungry? Lets eat some beef" + ConsoleColers.RESET);
    Item Pepsi = new Item(ConsoleColers.RED + "Pepsi", ConsoleColers.PURPLE + "Quench the thirst" + ConsoleColers.RESET);
    Item Keys = new Item(ConsoleColers.RED + "Keys", ConsoleColers.PURPLE + "Unlocks a specific door" + ConsoleColers.RESET);
    Item Doors = new Item(ConsoleColers.RED + "Doors", ConsoleColers.PURPLE + "Many doors, oh no!" + ConsoleColers.RESET);
    Item Hammer = new Item(ConsoleColers.RED + "Hammer", ConsoleColers.PURPLE + "Used as a weapon" + ConsoleColers.RESET);

    room1.setEast(room2);
    room1.setSouth(room4);
    room1.setRoomDescription("""
        This is the room where the adventure begins!
        There are a couple of cobwebs in the corners of the room
        A chandelier cast a dim light on the cold stone walls
        To your east and west you see a wooden door.""");
    room1.addItem(new Item(ConsoleColers.RED + "Garden Shears", ConsoleColers.PURPLE + "Used for cutting" + ConsoleColers.RESET));
    room1.addItem(Shovel);

    room2.setEast(room3);
    room2.setWest(room1);
    room2.setRoomDescription("""
        You are standing in a massive greenhouse.
        You feel a sense of awe and wonder as you inspect all the exotic plants around you.
        A bird chirps vigorously somewhere above you.""");
    room2.addItem(GardenShears);

    room3.setSouth(room6);
    room3.setWest(room2);
    room3.setRoomDescription("""
        The room is completely dark, however a putrid, almost sweet smell fills your nostrils.""");
    room3.addItem(Light);

    room4.setNorth(room1);
    room4.setSouth(room7);
    room4.setRoomDescription("""
        The room is filled with sand. Sand is also trickling down from the ceiling.
        You can see different kinds of furniture barely sticking up from the sand.""");
    room4.addItem(Shovel);

    room5.setSouth(room8);
    room5.setRoomDescription("""
        You are in the treasure chamber or something!
        I think this is where you win the game later on.""");
    room5.addItem(Treasure);

    room6.setNorth(room3);
    room6.setSouth(room9);
    room6.setRoomDescription("""
        You stand in something that looks like a medieval laboratory.
        Viles filled with liquids in all the colors of the rainbow decorate shelf's on the wall.
        A vile with a clear blue substance on a table in the corner of the room catches your attention.""");
    room6.addItem(Spell);

    room7.setEast(room8);
    room7.setNorth(room4);
    room7.setRoomDescription("""
        There is a wyvern sleeping in the room with an iron collar around it's neck.
        The iron collar is chained to the wall.
        There are burn marks on the stone walls.
        One of the burn marks outlines something that might have been human at some point...""");
    room7.addItem(Beef);
    room7.addItem(Pepsi);

    room8.setNorth(room5);
    room8.setWest(room7);
    room8.setEast(room9);
    room8.setRoomDescription("""
        There are three huge doors in total in this room.
        One door is cast in gold, one in silver and one in bronze.""");

    room8.addItem(Keys);
    room8.addItem(Doors);

    room9.setNorth(room6);
    room9.setWest(room8);
    room9.setRoomDescription("You see mirrors all around the room which makes it difficult to orient yourself.\n" +
        "At least you look handsome. ;)");
    room9.addItem(Hammer);

    this.startRoom = room1;
  }

  public Room getStartRoom() {
    return startRoom;
  }
}
