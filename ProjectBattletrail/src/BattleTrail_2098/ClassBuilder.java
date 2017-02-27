package BattleTrail_2098;

/** This handles the creation of player classes
 * Makes it easy to add new things
 * Created by victor on 2017-02-27.
 */
public class ClassBuilder {
    Classes soldier;
    Classes hacker;
    Classes paladin;
    Classes telepath;
    Classes fighter;

    ClassBuilder() {
        //Test hardcoded race
        soldier = new Classes("Soldier", " - ");
        hacker = new Classes("Hacker", " - ");
        paladin = new Classes("Paladin", " - ");
        telepath = new Classes("Telepath", " - ");
        fighter = new Classes("Fighter", " - ");

    }

}

