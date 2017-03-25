package BattleTrail_2098;

import java.util.HashMap;
import java.util.Set;

/**
 * A "Game Area" represents one location in the scenery of the game.  It is
 * connected to other game areas via exits.
 * Created by victor on 2017-03-25.
 */
public class GameAreas {
    private String areaDescription;
    private HashMap<String, GameAreas> exits;       //Stores exits of areas

    /**
     *
     * @param areaDescription description of a an area such as "Lower city slums", "Upper city park" etc.
     */
    public GameAreas(String areaDescription) {
        this.areaDescription = areaDescription;
        exits = new HashMap<>();
    }


    /**
     * Define an exit from area
     * @param direction direction of exit
     * @param neighboor the area of which direction leads
     */
    public void setExit(String direction, GameAreas neighboor) {
        exits.put(direction, neighboor);
    }

    /**
     * @return short description of area (The one that is defined in constructor)
     */
    public String getShortDescription()
    {
        return areaDescription;
    }

    /**
     * @return a description of the area in form:
     * You are in the lower east city
     * Exits: north west
     */
    public String getLongDescription()
    {
        return "You are " + areaDescription + ".\n" + getExitString();
    }

    /**
     *
     * @return description of area exits
     */

    public String getExitString() {
        String returnString = "Exits: ";
        Set<String> keys = exits.keySet();

        for (String exit : keys ) {
            returnString += " " + exit;
        }
        return returnString;
    }

    /**
     * @param direction's exit
     * @return room in given direction
     */
    public GameAreas getExit(String direction) {
        return exits.get(direction);
    }
}
