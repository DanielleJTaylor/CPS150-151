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
 * Assignment: 3 
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
public class FantasyGame1 {
	
    private static PrintStream out = System.out;
    private static Scanner scan = new Scanner(System.in);
    private static Random generator = new Random();
	
	public static void main(String[] args)
    {
		
    
		
		System.out.println("Welcome to the Fantasy Game\r\n"
				+ "\r\n"
				+ "        1. Add the game players\r\n"
				+ "        2. Players play in turn until only one is left");
		
		System.out.println("\r\n"
				+ "Good Luck!");
       
	
		
	    ArrayList <Creature> creatures = new ArrayList<Creature>();
	       
		/*
        name = "";
        species = "";
        strength = 0;
        hitPoints = 0;
        */
		String newName = "";
		 do{
		
	     out.println("\r\n"
					+ "Enter player's name ('quit' when no more players): ");
	    newName = scan.nextLine();
	    
	     out.println("\r\n"
					+ newName + ", which species are you?\r\n"
	     		+ "        b/B: Balrog\r\n"
	     		+ "        c/C: Cyberdemon\r\n"
	     		+ "        e/E: Elf\r\n"
	     		+ "        h/H: Human");
	    
	     out.println("\r\n"
					+ "Select " + newName + "'s species: ");
	     String newSpecies = scan.nextLine();
	     int newStrength =  generator.nextInt(200) +1;
	     int newHitPoints =  generator.nextInt(200)+1;
	    
	     
	     creatures.add(new Creature(newName,newSpecies,newHitPoints,newStrength));
		
	        
	        //System.out.println("Enter player's name ('quit' when no more players): ");
	 
		 } while(!(newName.equalsIgnoreCase("quit")));
		
		 
	        out.println("\nCalling toString...");
	       
	        System.out.println("Current Players:");
	        System.out.println("NAME | SPECIES | STRENGTH | HIT POINTS");
	        creatures.remove(creatures.size() - 1);
	        
	        for(Creature creature : creatures){
	        	  System.out.println(creature); 
	        	  creature.toString();
	        }
	        
	     
	        out.println("The Players are ready!\r\n"
	        		+ "\r\n"
	        		+ "Let the Battle begin!");
	        
	        
	        
	        do {
	            for (Creature attacker : creatures) {
	                if (!attacker.isDead()) {
	                    out.println("\n" + attacker.getName() + "\n" +
	                                "Select one of the following options:\n" +
	                                "a/A: Attack an opponent\n" +
	                                "p/P: Pass (go to the next player)\n" +
	                                "q/Q: Quit the game");

	                    String option = scan.nextLine();
	                    
	                    if (option.equalsIgnoreCase("A")) {
	                        out.println("Which player are you attacking? ");
	                        String targetName = scan.nextLine();
	                       Creature target = attacker.findCreatureByName(targetName, creatures);
	                        
	                        if (target != null && !target.isDead()) {
	                            attacker.attack(target);
	                            
	                           if (target.isDead()) {
	                               out.println(target.getName() + " has been defeated!");
	                            }
	                        } else {
	                            out.println("Invalid target or target is already defeated.");
	                        }
	                    } else if (option.equalsIgnoreCase("P")) {
	                        out.println("Skip Turn");
	                    } else if (option.equalsIgnoreCase("Q")) {
	                        out.println("Thanks for playing!");
	                        break;
	                    }
	                } else {
	                    out.println("Sorry, " + attacker.getName() + ", but you are dead. Thanks for playing!");
	                    creatures.remove(attacker);
	                }
	            }
	            
	            // Check if there's only one player left
	          
	                if (creatures.size() == 1) {
	                    Creature winner = creatures.get(0);
	                    out.println(winner.getName() + ", you are the only remaining player: You Won! Thanks for playing!");
	                };
	            
	        } while (creatures.size() > 1);
	        
	      
}//main end

	

	
	
}// end class
