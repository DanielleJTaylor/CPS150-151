import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
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

public class Creature {
	// instance variables
   
    private int strength; 
    private int hitPoints; // number of cups in the dispenser
    private String name; // location of the dispenser
    private String species;
    
    private int damage;
    private Random generator = new Random();
    private static PrintStream out = System.out;
    
    
    /**
     * Constructor for objects of class CupDispenser
     */
    public Creature(String newName, String newSpecies, int newHitPoints, int newStrength) throws IllegalArgumentException
    {
    	
        // Initialize instance variables to arguments
        setStrength(newStrength);
        setHitPoints(newHitPoints);
        name = newName;
        if(newSpecies.equalsIgnoreCase("B")){
        species = "Balrog";
        }
        if(newSpecies.equalsIgnoreCase("C")){
            species = "Cyberdemon";
            }
        if(newSpecies.equalsIgnoreCase("E")){
            species = "Elf";
            }
        
        if(newSpecies.equalsIgnoreCase("H")){
            species = "Human";
        }
    }
    
    
    /**
     * No-arg constructor for objects of class CupDispenser
     */
    public Creature()
    {
        // initialise instance variables to defaults  also class constructor
        name = "";
        species  = "";
        strength = 0;
        hitPoints = 0;
        
    }
    
    /**
     *  species  accessor
     */
    public String getSpecies() { return  species; }
    

    /**
     * strength mutator
     */
    public void setStrength(int newStrength) throws IllegalArgumentException
    { 
    	 
    	strength = newStrength;
    }
    
    /**
     * strength accessor
     */
    public int getStrength() { return strength; }
    
    
    /**
     * HitPoint mutator
     */
    public void setHitPoints(int newHitPoints)throws IllegalArgumentException
    {
    	
    	hitPoints = newHitPoints; 
    	
    }
    
    /**
     * HitPoint accessor
     */
    public int geHitPoints() { return hitPoints; }
    
    
    /**
     * Damage accessor
     */
   public int getDamage() { 
	  this.damage = 1+generator.nextInt(hitPoints);
	  int second_hit = 1+generator.nextInt(hitPoints);
	  
	  int chance = 1+generator.nextInt(100);
	  if( species.equalsIgnoreCase("Balrog") || species.equalsIgnoreCase("Cyberdemon") ){
        if(chance<=5) {
        	 this.damage = damage+50;	
        }
	  }
	  if (species.equalsIgnoreCase("Balrog")){
          System.out.println("A Balrog hit twice");
          this.damage = damage+second_hit;
      }
	  
	  chance = 1+generator.nextInt(100);
      if( species.equalsIgnoreCase("Elf") ){
            if(chance<=10) {
            	 this.damage = damage+50;	
            }
      }
	  
    return damage; 
	  
   }
    
   public Creature findCreatureByName(String targetName, ArrayList<Creature> creatures) {
	  
	   Creature attacked = null;
	   for (Creature creature : creatures){
	       if (targetName.equalsIgnoreCase(creature.getName())){
	           attacked =  creature;
	           break;
	       }
	   }
	   return attacked;
	   
	   }
   
   
   
   
   
   public void attack(Creature target) {
	    int damage = getDamage();
	    out.println(name + " attacks " + target.getName() + " for " + damage + " damage!");
	    target.takeDamage(damage);
	}
   
   public void Damage(int damage) throws IllegalArgumentException{
	
	  this.strength = strength-damage;
   }
   
   public void takeDamage(int damage) {
	    hitPoints -= damage;
	    if (hitPoints <= 0) {
	        hitPoints = 0;
	    }
	}

	// Make sure to update the isDead method as well
	public boolean isDead() {
	    return hitPoints <= 0;
	}
    
    
    /**
     *  species  accessor
     */
    public String getName() { return name; }
    /**
     * name accessor
     */
    public boolean isNamed(String  aName) { 
    if (name == aName){
    return true;
    }
    return false;
}
    
    public String toString(){
        String result = name;
        result += "|";
        result += species;
        result += "|";
        result += strength;
        result += "|";
        result += hitPoints;
        return result;
    }



    
}//end class
