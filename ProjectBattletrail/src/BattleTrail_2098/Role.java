package BattleTrail_2098;

/**
 * Handles player class related data
 * Created by victor on 2017-02-27.
 */
public class Role {
    String roleName;
    String roleDescription;

    /**
     *
     * @param roleName name of player class
     * @param roleDescription description of class properties
     */
    Role(String roleName, String roleDescription) {
        this.roleName = roleName;
        this.roleDescription = roleDescription;
    }

    /**
     * returns classname
     * @return
     */
    public String getRolename() {
        return roleName;
    }

    /**
     * returns classdescription
     * @return
     */
    public String getRoleDescription() {
        return roleDescription;
    }

}
