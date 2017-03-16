package BattleTrail_2098;

/**
 * Handles valid commands
 * Created by victor on 2017-03-16.
 */
public class UserCommandWords {

    // a constant array that holds all valid command words
    private static final String[] validCommands = {
        "go", "inventory", "stats", "quit", "help"
    };

    /**
     * constructor - initialize command words
     */
    public UserCommandWords() {
        //Do nothing at the moment
    }

    /**
     *
     * check if its a valid command
     * @return true if its a valid command, false if not
     */
    public boolean aCommand(String aString) {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
        // if we get here, the string was not found in the commands
        return false;
    }

    /**
     * Print all valid commands.
     */
    public void showCommands()
    {
        for(String command: validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
