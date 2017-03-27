package BattleTrail_2098;


import java.util.Scanner;

/** the first level (For testing)
 * Created by victor on 2017-03-01.
 */
public class FirstTestLevel {
    Scanner sc = new Scanner(System.in);
    //declares player
    Player player;
    //declares parser
    Parser parser;
    //declares area as currentArea
    private GameAreas currentArea;


    /**
     * @param parser implemented from parser class
     * @param player implemented from player class
     */
    public FirstTestLevel(Player player, Parser parser) {
        this.player = player;
        this.parser = parser;
        createAreas();
    }

    /**
     * create all areas and link their exits
     */
    private void createAreas() {
        GameAreas Bar_69, Slum, Hideout, Hotel, Slum_Exit,
                Middle_city_Entrance, Main_Street, Gun_Store,
                Armory, Watch_Tower, Shady_corner, General_Store;

        //create the rooms
        Bar_69 = new GameAreas("in a shady sex dungeon bar called Bar_69");
        Slum = new GameAreas("in the most vile part of the city");
        Hideout = new GameAreas("in a gang hideout");
        Hotel = new GameAreas("in an old empty hotel..seems strange");
        Slum_Exit =  new GameAreas("the exit from the slum to middle city");
        //Midle part of city
        Middle_city_Entrance = new GameAreas("in the not so shitty area of the city");
        Armory = new GameAreas("in the middle city armory");
        Watch_Tower = new GameAreas("in here you can see all over the city, " +
                "the watchtower of Middle city");
        Shady_corner = new GameAreas("in the less vile shady corner of middle city");
        General_Store = new GameAreas(" in the store, get to the shopping ");
        Main_Street = new GameAreas("in the mainstreet of middle city");
        Gun_Store = new GameAreas(" in the gunstore, buy some weapons");

        // initialize area exits

        //Start area
        Bar_69.setExit("west", Slum);

        //Slum exits
        Slum.setExit("east", Bar_69);
        Slum.setExit("west", Hotel);
        Slum.setExit("south", Slum_Exit);

        //Hideout exits
        Hideout.setExit("west", Slum_Exit);

        // hotel exits
        Hotel.setExit("east", Slum);

        // Slum_exit to middle city
        Slum_Exit.setExit("north", Slum);
        Slum_Exit.setExit("east", Hideout);
        Slum_Exit.setExit("south", Middle_city_Entrance);

        //Middle city area
        Middle_city_Entrance.setExit("north", Slum_Exit);
        Middle_city_Entrance.setExit("east", Main_Street);

        //Main street exits
        Main_Street.setExit("west", Middle_city_Entrance);
        Main_Street.setExit("north", General_Store);
        Main_Street.setExit("east", Gun_Store);
        Main_Street.setExit("south", Shady_corner);


        //Store exits
        Gun_Store.setExit("west", Main_Street);
        General_Store.setExit("south", Main_Street);

        //Shady corner
        Shady_corner.setExit("north", Main_Street);
        Shady_corner.setExit("east", Armory);

        //Armory
        Armory.setExit("west", Shady_corner);
        Armory.setExit("east", Watch_Tower);

        //Watch tower
        Watch_Tower.setExit("west", Armory);

        currentArea = Bar_69; //Starting area


    }

   public void playTestLevel() {
        welcomeToBattleTrail();

        // Enter the main command loop.

       boolean finished = false;
       while (!finished) {
           Commands commands = parser.getCommands();
           finished = processCommand(commands);
       }

    }

    /**
     * Print out the opening message for the player.
     */
    public void welcomeToBattleTrail() {
        System.out.println("* Insert prologue message here * ");
        System.out.println("type 'help' for help");
        System.out.println(currentArea.getLongDescription());
    }

    /**
     *
     * @param commands the command to be processed
     * @return true if you want to quit game
     */
    private boolean processCommand(Commands commands) {

        boolean goingToQuit = false;

        if (commands.isNotKnown()) {
            System.out.println("Invalid command");
            return false;
        }
        String commandWord = commands.getCommandWord();
        if (commandWord.equals("help")) {
            printHelp();
        }
        else if (commandWord.equals("go")) {
            goArea(commands);
        }
        else if (commandWord.equals("quit")) {
            goingToQuit = quit(commands);
        }
        //else command not recognized
        return goingToQuit;
    }

    /**
     * Print a little help message
     */
    private void printHelp() {
        System.out.println("You wander this city of madness\n " +
                "your command words are: ");
        parser.showCommands();
    }

    /**
     * Try to in to one direction. If there is an exit, enter the new
     * area, otherwise print an error message.
     */

    private void goArea(Commands commands) {

        if (!commands.hasSecondWord()) {
            //if there is no second word, we dont know whre to go
            System.out.println("Where do you want to go?");
            return;
        }
        String direction = commands.getSecondWord();

        GameAreas nextArea = currentArea.getExit(direction);

        if (nextArea == null) {
            System.out.println("hm....Nope.");
        } else {
            currentArea = nextArea;
            System.out.println(currentArea.getLongDescription());
        }
    }
    /**
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Commands commands) {
        if (commands.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        } else {
            return true;
        }
    }

}


