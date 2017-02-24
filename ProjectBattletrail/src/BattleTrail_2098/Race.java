package BattleTrail_2098;

/**
 * Handles the race related data
 *
 * Created by: emil
 * Version: 2017-02-24
 */
public class Race {
    String race;

    double str;
    double intl;
    double health;
    double luck;

    /**
     *  Sets up the base values of this race
     * @param race name of this race
     * @param str strength of this race
     * @param intl intelligence of this race
     * @param health health of this race
     * @param luck luck of this race
     */
    Race(String race, double str, double intl, double health, double luck) {
        // Name:
        this.race = race;
        // Stats
        this.str = str;
        this.intl = intl;
        this.health = health;
        this.luck = luck;
    }


    /**
     * Returns this race strength
     * @return str double
     */
    public double getStr() {
        return str;
    }


    /**
     * Returns the race name
     * @return
     */
    public String getRaceName() {
        return race;
    }


}
