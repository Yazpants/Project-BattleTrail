package BattleTrail_2098;


import java.util.ArrayList;

/**
 * This class handles creation of the races
 * To add a new race just look how the human was made
 *      @author victor
 * Created by: emil
 * Version: 2017-02-24
 */
public class RaceBuilder {
    Race human;
    Race cyborg;
    Race martian;
    Race robot;
    Race mutant;
    ArrayList<String> raceList = new ArrayList<>();


    RaceBuilder() {

        human = new Race("Human", 10,10,10,10);
        cyborg = new Race("Cyborg", 11, 12, 8, 9 );
        martian = new Race("Martian", 7, 14, 8,11);
        robot = new Race("Robot", 13, 11, 10, 6);
        mutant = new Race("Mutant", 9, 9, 13, 9);
        raceList.add("HUMAN");
        raceList.add("CYBORG");
        raceList.add("MARTIAN");
        raceList.add("ROBOT");
        raceList.add("MUTANT");


    }

    public boolean checkIfRaceExist(String race) {
       return raceList.contains(race);

    }

}


