package BattleTrail_2098;

import java.util.Scanner;

/** the first level (For testing)
 * Created by victor on 2017-03-01.
 */
public class FirstTestLevel {
    Scanner sc = new Scanner(System.in);

    public void firstLevel(Player player) {
        System.out.println("Welcome to Cathcart city\n " + player.getName() + " This is where you'll begin" +
                " your mission as a " + player.getRoleName() + "\n you will be taking out whoever our employer " +
                "tells you to. Do you understand?\n [Yes] / [No] ");

        String input = sc.next();
        if (input == "Yes") {
            start();
        } else if (input == "No"){
            System.out.println("right....Let's start either way.\n");
            start();
        } else {
            firstLevel(player);
        }

    }
    public void start() {
        System.out.println("Now, this is a huge city so don't get lost.\n" +
                "your first contact is not far from here, just head a few miles west.\n" +
                "Okay, you're on your own now.\n");
    }
}
