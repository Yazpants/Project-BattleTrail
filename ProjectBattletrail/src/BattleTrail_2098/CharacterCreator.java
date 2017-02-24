package BattleTrail_2098;


import java.util.Scanner;

public class CharacterCreator {
    Scanner input = new Scanner(System.in);
    Player player = new Player();

    public void createCharacter() {
        genderSelect();
        raceSelect();
        classSelect();
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

        System.out.println();
        System.out.println("Select race down below:");
        System.out.println("Human\n" +
                           "Cyborg\n" +
                           "Martian\n" +
                           "Robot\n" +
                           "Mutant");
        String choice = input.next();
        choice = choice.toUpperCase();

        if (choice.equals("HUMAN") || choice.equals("CYBORG") || choice.equals("MARTIAN") ||
                choice.equals("ROBOT")|| choice.equals("MUTANT")) {
            correct = true;

            // SImple hardcoded setup that makes the player into human. no matter his choice :P
            RaceBuilder raceBuilder = new RaceBuilder();
            player.setPlayerRace(raceBuilder.human);


        } else {
            System.out.println("Invalid choice, please try again.");
            raceSelect();
        }

    }
    // Class creation
    private void classSelect() {
        boolean correct = false;

        System.out.println();
        System.out.println("Now finally, select your class:");
        System.out.println("Soldier\n" +
                           "Hacker\n" +
                           "Paladin\n" +
                           "Telepath\n" +
                           "Fighter");
        String choice = input.next();
        choice = choice.toUpperCase();

        if (choice.equals("SOLDIER") || choice.equals("HACKER") || choice.equals("PALADIN") ||
                choice.equals("TELEPATH") || choice.equals("FIGHTER")) {
            correct = true;

        } else {
            System.out.println("Not a class, please try again.");
            classSelect();
        }
    }

    public void finalStep() {
        System.out.println("Character creation complete!");
        System.out.println("You picked race " + player.getRaceName());
        double str =0; // dirty hack not sure why i have to do this
        System.out.println("Your strength is " + player.getStr());
    }
}
