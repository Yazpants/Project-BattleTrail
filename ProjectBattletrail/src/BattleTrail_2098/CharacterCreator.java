package BattleTrail_2098;
/**
 * @author victor
 */

import java.util.Scanner;

public class CharacterCreator {
    Scanner input = new Scanner(System.in);
    Player player = new Player();

    public void createCharacter() {
        genderSelect();
        raceSelect();
        roleSelect();
        finalStep();
    }

    //Character creator
    private void genderSelect(){
        boolean correct = false;

        System.out.println("Select your gender: Male or Female");
        String choice = input.next();
        choice = choice.toUpperCase();

        if (choice.equals("MALE") || choice.equals("FEMALE")) {
            correct = true;
        } else {
            System.out.println("Incorrect choice, try again.");
            // call gender select again
            genderSelect();
        }

    }

    //Race creation
    private void raceSelect() {
        boolean correct = false;
        RaceBuilder rb = new RaceBuilder();
        System.out.println();
        System.out.println("Select race down below:");
        System.out.println("Human\n" +
                           "Cyborg\n" +
                           "Martian\n" +
                           "Robot\n" +
                           "Mutant");
        String choice = input.next();
        choice = choice.toUpperCase();

        if(rb.checkIfRaceExist(choice)){
            correct = true;

        } else {
            System.out.println("Invalid choice, please try again.");
            raceSelect();
        }

    }
    // Class creation
    private void roleSelect() {
        boolean correct = false;
        RoleBuilder rlb = new RoleBuilder();
        System.out.println();
        System.out.println("Now finally, select your class:");
        System.out.println("Soldier\n" +
                           "Hacker\n" +
                           "Paladin\n" +
                           "Telepath\n" +
                           "Fighter");
        String choice = input.next();
        choice = choice.toUpperCase();

        if (rlb.checkIfRoleExist(choice)) {
            correct = true;

        } else {
            System.out.println("Not a class, please try again.");
            roleSelect();
        }
    }

    public void finalStep() {
        System.out.println("Character creation complete!");
        System.out.println("You picked race " + player.getRaceName());
        System.out.println("You picked the " + player.getRoleName() + " role!");
        double str =0; // dirty hack not sure why i have to do this

        System.out.println("Your overall perks and stats:\n" + player.getRoleDescription() +
              "(Passive)\n"  + "STR: " + player.getStr() + " HP: " +
                player.getHealth() + " INT: " + player.getIntl() + " LUCK: " + player.getLuck());
    }
}
