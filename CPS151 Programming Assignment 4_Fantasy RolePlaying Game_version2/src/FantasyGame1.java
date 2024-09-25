import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.PrintStream;
/*
 *ComboLock.java
 * Danielle Taylor, taylord24
 */


/*
 * ComboLock.java
 * Danielle Taylor, taylord24
 */

/*
 *
 * Name: Danielle Taylor
 * User Name: taylord24
 * Assignment: 4 
 *
 * Description:
 * 
 * Creating a simple fantasy role-playing game in Java. 
 * The game has two phases:

Add each player to the game as a Creature object; each player enters their name and selects their species
Any number of players can be added to a game.  An ArrayList of Creatures would work perfectly for this!
 
Each player plays in turn; for each turn a player may:
Attack another player:
    The player enters the attacked opponent's name
    The damage points are subtracted from the attacked opponent's strength
    If that opponent's strength is then 0, the opponent is dead and is removed from the game
Pass their turn to the next player
Quit the game
The second phase keeps going until only one player is left; that player is the winner.
 * 
 * 
 *
 * Bug Report:
 *  Works well, no problems
 *
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FantasyGame1 {
    private static Scanner scan = new Scanner(System.in);
    private static Random generator = new Random();

    public static void main(String[] args) {
        System.out.println("Welcome to the Fantasy Game");
        System.out.println("1. Add the game players");
        System.out.println("2. Players play in turn until only one is left");
        System.out.println("Good Luck!");
        ArrayList<Creature> creatures = new ArrayList<Creature>();
        String newName = "";

        do {
            System.out.println("\nEnter player's name ('quit' when no more players): ");
            newName = scan.nextLine();
            if (!newName.equalsIgnoreCase("quit")) {
                System.out.println(newName + ", which species are you?");
                System.out.println("b/B: Balrog");
                System.out.println("c/C: Cyberdemon");
                System.out.println("e/E: Elf");
                System.out.println("h/H: Human");
                System.out.println("Select " + newName + "'s species: ");
                String species = scan.nextLine();
                int newStrength = generator.nextInt(200) + 1;
                int newHitPoints = generator.nextInt(200) + 1;

                Creature newCreature = null;

                if (species.equalsIgnoreCase("B")) {
                    newCreature = new Balrog(newName, newHitPoints, newStrength);
                } else if (species.equalsIgnoreCase("C")) {
                    newCreature = new Cyberdemon(newName, newHitPoints, newStrength);
                } else if (species.equalsIgnoreCase("E")) {
                    newCreature = new Elf(newName, newHitPoints, newStrength);
                } else if (species.equalsIgnoreCase("H")) {
                    newCreature = new Human(newName, newHitPoints, newStrength);
                }

                if (newCreature != null) {
                    creatures.add(newCreature);
                } else {
                    System.out.println("Invalid species selection. Please choose from b/B, c/C, e/E, or h/H.");
                }
            }
        } while (!newName.equalsIgnoreCase("quit"));

        System.out.println("\nCalling toString...");
        System.out.println("Current Players:");
        System.out.println("NAME | SPECIES | STRENGTH | HIT POINTS");

        for (Creature creature : creatures) {
            System.out.println(creature);
        }

        System.out.println("The Players are ready!\nLet the Battle begin!");

        do {
            for (int i = 0; i < creatures.size(); i++) {
                Creature attacker = creatures.get(i);
                if (!attacker.isDead()) {
                    System.out.println("\n" + attacker.getName());
                    System.out.println("Select one of the following options:");
                    System.out.println("a/A: Attack an opponent");
                    System.out.println("p/P: Pass (go to the next player)");
                    System.out.println("q/Q: Quit the game");
                    String option = scan.nextLine();

                    if (option.equalsIgnoreCase("A")) {
                        System.out.println("Which player are you attacking? ");
                        String targetName = scan.nextLine();
                        Creature target = attacker.findCreatureByName(targetName, creatures);

                        if (target != null && !target.isDead()) {
                            attacker.attack(target);

                            if (target.isDead()) {
                                System.out.println(target.getName() + " has been defeated!");
                                creatures.remove(target);
                            }
                        } else {
                            System.out.println("Invalid target or target is already defeated.");
                        }
                    } else if (option.equalsIgnoreCase("P")) {
                        System.out.println("Skip Turn");
                    } else if (option.equalsIgnoreCase("Q")) {
                        System.out.println("Thanks for playing!");
                        System.exit(0);
                    }
                } else {
                    System.out.println("Sorry, " + attacker.getName() + ", but you are dead. Thanks for playing!");
                    creatures.remove(attacker);
                    i--; // Adjust index to account for removed creature
                }
            }
        } while (creatures.size() > 1);

        Creature winner = creatures.get(0);
        System.out.println(winner.getName() + ", you are the only remaining player: You Won! Thanks for playing!");
    }
}
