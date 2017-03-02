package BattleTrail_2098;

/**
 * Created by: victor
 */
/*
    Controls player Stats, Inventory, and such
 */
public class Player {
    Role playerRole;
    Role roleDescription;
    Race playerRace;
    String name;
    int level;

    public void playerProperties() {
        playerProgression();
        inventorySystem();

    }

    private void playerProgression() {
        // Progression
        level = 0;
    }

    private void inventorySystem() {
        // Implement later

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the player's race in string
     * @return raceName in string
     */
    public String getRaceName() {
        return playerRace.getRaceName();
    }

    /**
     * Returns the specified stat in double
     * @return stat in double
     */
    public double getStr() {
        return (playerRace.getStr() + (double) level);
    }
    public double getIntl() {
        return (playerRace.getIntl() + (double) level);
    }
    public double getHealth() {
        return  (playerRace.getHealth() + (double) level);
    }
    public double getLuck() {
        return (playerRace.getLuck() + (double) level);
    }

    /**
     * This sets the players race to specified race
     * @param race
     */
    public void setPlayerRace(Race race) {
        playerRace = race;
    }

    /**
     * Returns player class in string
     * @return
     */
    public  String getRoleName() {
        return playerRole.getRolename();
    }

    /**
     * returns description of class
     * @return
     */
    public String getRoleDescription() {
        return playerRole.getRoleDescription();
    }
    /**
     * Sets players class
     * @param role
     */
    public void setPlayerRole(Role role) {
        playerRole = role;
    }

}
