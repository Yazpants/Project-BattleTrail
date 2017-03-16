package BattleTrail_2098;

import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 * For controlling actions such as directions, and item selection from the later on implemented Inventory system
 * Test.
 * Created by victor on 2017-03-14.
 */

//for direction events..maybe ¯\_(ツ)_/¯

public class UserController {
    Scanner sc = new Scanner(System.in);

    public void Directions(KeyEvent event) {
        int keyCode = event.getKeyCode();

        switch (keyCode) {
            case KeyEvent.VK_UP:
                //Handles up
                break;
            case KeyEvent.VK_DOWN:
                //Handles down
                break;
            case KeyEvent.VK_RIGHT:
                //Handles right
                break;
            case KeyEvent.VK_LEFT:
                //Handles left
                break;
        }

    }

}
