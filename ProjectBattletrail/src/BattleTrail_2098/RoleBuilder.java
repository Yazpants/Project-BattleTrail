package BattleTrail_2098;

import java.util.Map;
import java.util.HashMap;

/** This handles the creation of player classes
 * Makes it easy to add new things
 * Created by victor on 2017-02-27.
 */
public class RoleBuilder {

    Map<String, Role> roleList = new HashMap<String, Role>();

    RoleBuilder() {


        addRole("Soldier", " Overall ");
        addRole("Hacker", " Stealth");
        addRole("Paladin", " Tank ");
        addRole("Telepath", " Support ");
        addRole("Fighter", " Offense ");

    }

    /**
     *
     * @param roleName name of role
     * @param roleDescription description of player role
     */
    private void addRole(String roleName, String roleDescription) {
        //new role object
        Role newRole = new Role(roleName, roleDescription);

        //add the role name to arrayList
        roleName = roleName.toUpperCase();
        roleList.put(roleName, newRole);
    }

    /**
     *
     * @param roleName name of role
     * @return true if role exists
     */
    public boolean checkIfRoleExist(String roleName) {
        roleName = roleName.toUpperCase();
        return roleList.containsKey(roleName);
    }

}

