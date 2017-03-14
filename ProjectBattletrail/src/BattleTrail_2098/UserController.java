package BattleTrail_2098;

import java.util.Scanner;

/**
 * For controlling actions such as directions, and item selection from the later on implemented Inventory system
 * Test.
 * Created by victor on 2017-03-14.
 */

//An interface to be implemented by UserController for direction events..maybe ¯\_(ツ)_/¯
interface DirectionListener {
    void East();
    void West();
    void North();
    void South();
}

public class UserController {
    Scanner sc = new Scanner(System.in);

    public void Directions() {

    }

}
