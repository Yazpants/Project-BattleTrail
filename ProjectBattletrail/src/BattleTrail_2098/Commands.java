package BattleTrail_2098;

/**
 * This class holds information about a command that was issued by the user.
 * A command currently consists of two strings: a command word and a second
 * word
 * Created by victor on 2017-03-25.
 */
public class Commands {
    private String commandWord;
    private String secondWord;

    /**
     * create a command object. Both can be Null
     * @param firstWord the first word of command, null if not valid
     * @param secondWord second word of command
     */
    public Commands(String firstWord, String secondWord) {
        commandWord = firstWord;
        this.secondWord = secondWord;
    }
    /**
     * Return the first command word, if not understood, it is null.
     * @return command word.
     */
    public String getCommandWord() {
        return commandWord;
    }
    /**
     * @return second word of command, null if no command.
     */
    public String getSecondWord() {
        return secondWord;
    }
    /**
     * @return true if command was not found
     */
    public boolean isNotKnown() {
        return (commandWord == null);
    }

    /**
     * @return true if command has second word
     */
    public boolean hasSecondWord() {
        return (secondWord != null);
    }
}
