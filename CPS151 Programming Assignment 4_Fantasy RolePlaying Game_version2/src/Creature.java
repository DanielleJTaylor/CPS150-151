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
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
import java.io.PrintStream;



public class Creature {
	// instance variables
   
    private int strength; 
    private int hitPoints; // number of cups in the dispenser
    private String name; // location of the dispenser
    
    
    private int damage;
    private Random generator = new Random();
    private static PrintStream out = System.out;
    
    
    /**
     * Constructor for objects of class CupDispenser
     */
    protected String species;

    public Creature(String newName, int newHitPoints, int newStrength) {
    	
        // Initialize instance variables to arguments
        setStrength(newStrength);
        setHitPoints(newHitPoints);
        name = newName;
        
        
   
    
    }
    
    /**
     *  species  accessor
     */
    public String getSpecies() {
		return null;
	}
    public int getDamage() {
    	  return damage = 1+generator.nextInt(hitPoints);
	}


    /**
     * No-arg constructor for objects of class CupDispenser
     */
    public Creature()
    {
        // initialise instance variables to defaults  also class constructor
        name = "";
        strength = 0;
        hitPoints = 0;
        
    }
    
   
    

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
    public int GetHitPoints() { return hitPoints; }
    
    
    /**
     * Damage accessor
     */
    
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
