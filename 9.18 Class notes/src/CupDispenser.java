/**
 * CupDispenser.java
 * 
 * object class representing a cup dispenser
 *
 * @author N. Bashias
 * @version 9-18-2023
 */
public class CupDispenser
{
    // instance variables
    private String location; // location of the dispenser
    private int numberOfCups; // number of cups in the dispenser

    /**
     * Constructor for objects of class CupDispenser
     */
    public CupDispenser(String loc, int numCups)
    {
        // Initialize instance variables to arguments
        setLocation(loc);
        setNumberOfCups(numCups);
    }

    /**
     * No-arg constructor for objects of class CupDispenser
     */
    public CupDispenser()
    {
        // initialise instance variables to defaults
        location = "";
        numberOfCups = 0;
    }

    /**
     * location accessor
     */
    public String getLocation() { return location; }
    
    /**
     * numberOfCups accessor
     */
    public int getNumberOfCups() { return numberOfCups; }
    
    /**
     * location mutator
     */
    public void setLocation(String loc) { location = loc; }
    
    /**
     * numberOfCups mutator
     * throws IllegalArgumentException if arg is negative
     */
    public void setNumberOfCups(int numCups) {
        if (numCups < 0) {
            throw new IllegalArgumentException("invalid number of cups");
        }
        numberOfCups = numCups;
    }
    
    
    /**
     * returns true if the dispenser is empty, false otherwise
     */
    public boolean isEmpty() { return numberOfCups == 0; }
    
    /**
     * returns the dispenser data as a String
     */
    public String toString() {
        String result = "Dispenser at location " + location;
        if (isEmpty()) {
            result += " is empty";
        } else {
            result += " has " + numberOfCups + " cups";
        }
        return result;
    }
    
    /**
     * method dispenses one cup by decrementing the numberOfCups
     * outputs "empty dispenser" if the dispenser is empty
     */
    public void getOneCup()
    {
        if (isEmpty()) {
            System.out.println("empty dispenser" );
        } else {
            numberOfCups--;
            System.out.println("dispensed a cup; there are " + numberOfCups + " left");
        }
    }
    
    /**
     * method takes cups from CupDispenser argument
     */
    public void takeCupsFrom(CupDispenser other) {
        numberOfCups += other.numberOfCups;
        other.numberOfCups = 0;
    }
}