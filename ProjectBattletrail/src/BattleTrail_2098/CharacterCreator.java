package BattleTrail_2098;
/**
 * @author victor
 */

import java.util.Scanner;

public class CharacterCreator {
    Scanner input = new Scanner(System.in);
    Player player = new Player();
    RaceBuilder rb = new RaceBuilder();
    RoleBuilder rlb = new RoleBuilder();
    FirstTestLevel firstTestLevel = new FirstTestLevel();

    public void createCharacter() {
        raceSelect();
        roleSelect();
        nameSelect();
        finalStep();
    }

    //Character creator


    //Race creation
    private void raceSelect() {
        boolean correct = false;

        System.out.println();
        System.out.println("Select race down below:");
        System.out.println("Human\n" +
                           "Cyborg\n" +
                           "Robot\n" +
                           "Mutant");
        String choice = input.next();
        choice = choice.toUpperCase();

        if (rb.checkIfRaceExist(choice)){
            player.setPlayerRace(rb.getRace(choice));
            correct = true;

        } else {
            System.out.println("Invalid choice, please try again.");
            raceSelect();
        }

    }
    // Class creation
    private void roleSelect() {
        boolean correct = false;

        System.out.println();
        System.out.println("Now finally, select your class:");
        System.out.println("Soldier\n" +
                           "Hacker\n" +
                           "Telepath");
        String choice = input.next();
        choice = choice.toUpperCase();

        if (rlb.checkIfRoleExist(choice)) {
            player.setPlayerRole(rlb.getRole(choice));
            correct = true;

        } else {
            System.out.println("Not a class, please try again.");
            roleSelect();
        }
    }

    public void nameSelect() {
        boolean correct = false;

        System.out.println("What is your name? ");
        String name = input.next();
        if (name.equals(name)) {
            player.setName(name);
        }

        System.out.println();
    }

    public void finalStep() {
        System.out.println("Character creation complete!");
        System.out.println("Welcome! " + player.getName());
        System.out.println("You picked race " + player.getRaceName());
        System.out.println("You picked the " + player.getRoleName() + " role!");
        double str =0; // dirty hack not sure why i have to do this

        System.out.println("Your overall perks and stats:\n" + player.getRoleDescription() +
              "(Passive)\n"  + "STR: " + player.getStr() + " HP: " +
                player.getHealth() + " INT: " + player.getIntl() + " LUCK: " + player.getLuck());
        System.out.println();
        firstTestLevel.firstLevel(player);

    }

}
