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
        GameAreas Bar_69, Slum, Hideout, Hotel, Slum_Street;

        //create the rooms
        Bar_69 = new GameAreas("in a shady sex dungeon bar called Bar_69");
        Slum = new GameAreas("in the most vile part of the city");
        Hideout = new GameAreas("in a gang hideout");
        Hotel = new GameAreas("in an old empty hotel..seems strange");
        Slum_Street =  new GameAreas("in the slum area main street");
    }

}


