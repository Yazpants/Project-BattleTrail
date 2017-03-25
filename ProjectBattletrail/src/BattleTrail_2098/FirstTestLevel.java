package BattleTrail_2098;

import java.util.Scanner;

/** the first level (For testing)
 * Created by victor on 2017-03-01.
 */
public class FirstTestLevel {
    Scanner sc = new Scanner(System.in);
    //declares player
    Player player;
    //declares parser
    Parser parser;
    //declares area as currentArea
    private GameAreas currentArea;

    /**
     * @param parser
     * @param player
     */
    public FirstTestLevel(Player player, Parser parser) {
        this.player = player;
        this.parser = parser;
        createAreas();
    }

    /**
     * create all areas and link their exits
     */
    private void createAreas() {

    }

}


