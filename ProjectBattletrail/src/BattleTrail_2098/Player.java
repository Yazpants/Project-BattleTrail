package BattleTrail_2098;

/*
    Controls player Stats, Inventory, and such
 */
public class Player {
    Race playerRace;
    int level;

    public void playerProperties() {
        playerStats();
        inventorySystem();

    }

    private void playerStats() {
        // Progression
        level = 0;


        //Main stats
        double str;
        double intl;
        double health;
        double luck;

        // extra weapon stats
        int plasma_rifles;
        int rifles;
        int shields;
        int hand_to_hand_combat_weapons;
        int melee_weapons;

    }

    private void inventorySystem() {

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

    /**
     * This sets the players race to specified race
     * @param race
     */
    public void setPlayerRace(Race race) {
        playerRace = race;
    }


}
