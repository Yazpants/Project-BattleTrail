package BattleTrail_2098;


import java.util.Map;
import java.util.HashMap;

/**
 * This class handles creation of the races
 * To add a new race just look how the human was made
 *      @author victor
 * Created by: emil
 * Version: 2017-02-24
 */
public class RaceBuilder {

   Map<String, Race> raceList = new HashMap<String, Race>();


    /**
     * Constructor
     */
    RaceBuilder() {
        addRace("Human", 10,10,10,10);
        addRace("Cyborg", 11, 12, 8, 9 );
        addRace("Martian", 7, 14, 8,11);
        addRace("Robot", 13, 11, 10, 6);
        addRace("Mutant", 9, 9, 13, 9);
    }

    /**
     * Method which creates a new race object
     * @param raceName name of race
     * @param str strength of the race
     * @param intl intelligence of the race
     * @param health health of the race
     * @param luck luckof the race
     */
    private void addRace(String raceName, double str, double intl, double health, double luck) {

        // We create the new race object
        Race newRace = new Race(raceName, str, intl, health, luck);

        // We add the race name to the array list
        raceName = raceName.toUpperCase();
        raceList.put(raceName, newRace);

    }

    /**
     * Checks if the selected race exist
     * @param raceName the name of the race
     * @return true if the race exist
     */
    public boolean checkIfRaceExist(String raceName) {
        //Ensuring that the race name
        raceName = raceName.toUpperCase();
        return raceList.containsKey(raceName);
    }

}


