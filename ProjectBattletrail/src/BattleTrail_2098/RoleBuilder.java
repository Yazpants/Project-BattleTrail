package BattleTrail_2098;

import java.util.ArrayList;

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
    ArrayList<String> roleList = new ArrayList<>();

    RoleBuilder() {

        soldier = new Role("Soldier", " Overall ");
        hacker = new Role("Hacker", " Stealth ");
        paladin = new Role("Paladin", " Tank ");
        telepath = new Role("Telepath", " Support ");
        fighter = new Role("Fighter", " Offensive ");
        roleList.add("SOLDIER");
        roleList.add("HACKER");
        roleList.add("PALADIN");
        roleList.add("TELEPATH");
        roleList.add("FIGHTER");

    }
    public boolean checkIfRoleExist(String role) {
        return roleList.contains(role);
    }

}

