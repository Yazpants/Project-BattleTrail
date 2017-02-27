package BattleTrail_2098;

/** This handles the creation of player classes
 * Makes it easy to add new things
 * Created by victor on 2017-02-27.
 */
public class RoleBuilder {
    Role soldier;
    Role hacker;
    Role paladin;
    Role telepath;
    Role fighter;

    RoleBuilder() {
        //Test hardcoded race
        soldier = new Role("Soldier", " - ");
        hacker = new Role("Hacker", " - ");
        paladin = new Role("Paladin", " - ");
        telepath = new Role("Telepath", " - ");
        fighter = new Role("Fighter", " - ");

    }

}

