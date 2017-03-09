package BattleTrail_2098;

import java.util.Scanner;

/** the first level (For testing)
 * Created by victor on 2017-03-01.
 */
public class FirstTestLevel {
    Player player = new Player();
    Scanner sc = new Scanner(System.in);

    public void firstLevel() {
        System.out.println("Welcome to Cathcart city " + player.getName() + "This is where you'll begin" +
                "your mission as a " + player.getRoleName() + "you will be taking out whoever our employer " +
                "tells you to. Do you understand?\n [Yes] / [No] ");

        String input = sc.next();
        if (input == "YES") {
            start();
        } else if (input == "NO"){
            System.out.println("right....Let's start either way.\n");
        } else {
            firstLevel();
        }

    }
    public void start() {
        System.out.println("Now, this is a huge city so don't get lost." +
                "your first contact is not far from here, just head a few miles west." +
                "Okay, you're on your own now.");
    }
}
