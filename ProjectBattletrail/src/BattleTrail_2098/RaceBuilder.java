package BattleTrail_2098;

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


    RaceBuilder() {
        // Test hardcoded race
        human = new Race("Human", 10,10,10,10);
        cyborg = new Race("Cyborg", 11, 12, 8, 9 );
        martian = new Race("Martian", 7, 14, 8,11);
        robot = new Race("Robot", 13, 11, 10, 6);
        mutant = new Race("Mutant", 9, 9, 13, 9);



    }

}
