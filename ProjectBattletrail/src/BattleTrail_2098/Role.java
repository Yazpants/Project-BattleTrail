package BattleTrail_2098;

/**
 * Handles player class related data
 * Created by victor on 2017-02-27.
 */
public class Role {
    String role;
    String roleDescription;

    /**
     *
     * @param role name of player class
     * @param roleDescription description of class properties
     */
    Role(String role, String roleDescription) {
        this.role = role;
        this.roleDescription = roleDescription;
    }

    /**
     * returns classname
     * @return
     */
    public String getRolename() {
        return role;
    }

    /**
     * returns classdescription
     * @return
     */
    public String getRoleDescription() {
        return roleDescription;
    }

}
