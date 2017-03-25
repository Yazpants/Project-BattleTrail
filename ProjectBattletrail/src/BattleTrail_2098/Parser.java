package BattleTrail_2098;

import java.util.Scanner;

/**
 * For controlling actions such as directions, and item selection from the later on implemented Inventory system
 * Test. Tied to UserCommandWords class
 * Created by victor on 2017-03-14.
 */

public class Parser {

    private UserCommandWords commands;
    private Scanner reader;

    /**
     * Parser to read from terminal window
     */
    public Parser() {
        commands = new UserCommandWords();
        reader = new Scanner(System.in);
    }

    public Commands getCommands() {
        String userinputLine; //Holds the full inputline
        String word1 = null;
        String word2 = null;

        System.out.println("> "); //Print Prompt

        userinputLine = reader.nextLine();

        //Find up to two words on the line
        Scanner sc = new Scanner(userinputLine);
        if (sc.hasNext()) {
            word1 = sc.next();  //get first word
            if (sc.hasNext()) {
                word2 = sc.next(); //get second word
                //note to self: ignore the rest of input line
            }
        }
        //Check if word is known, if so, create command.
        // If not create a "NULL" command.
        if (commands.aCommand(word1)) {
            return new Commands(word1, word2);
        } else {
            return new Commands(null, word2);
        }
    }

    /**
     * print list of known commands
     */
    public void showCommands() {
        commands.showCommands();
    }
}


