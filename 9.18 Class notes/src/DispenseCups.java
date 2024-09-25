import java.io.PrintStream;

/**
 * DispenseCups.java
 * 
 * Tester for CupDispenser class
 *
 * @author N. Bashias
 * @version 9-18-2023
 */
public class DispenseCups
{
    private static PrintStream out = System.out;
    
    public static void main(String[] args)
    {
        CupDispenser[] dispensers = new CupDispenser[3];
        
        dispensers[0] = new CupDispenser("KU", 10);
        dispensers[1] = new CupDispenser("Anderson", 20);
        dispensers[2] = new CupDispenser();
        
        out.println("Calling accessors...");
        
        for (CupDispenser dispenser : dispensers)
        {
            out.println("dispenser.getLocation(): "+dispenser.getLocation());
            out.println("dispenser.getNumberOfCups(): "+dispenser.getNumberOfCups());
        }
        
        out.println("\nCalling toString...");
        
        for (CupDispenser dispenser : dispensers)
        {
            out.println(dispenser); // calls dispenser.toString()
        }
        
        out.println("\nGet a cup from each dispenser...");
        
        for (CupDispenser dispenser : dispensers)
        {
            dispenser.getOneCup();
            out.println(dispenser); // calls dispenser.toString()
        }
        
        out.println("\nMove cups from Anderson to KU...");
        
        dispensers[0].takeCupsFrom(dispensers[1]);
        
        out.println("\nDispensers at KU and Anderson:");
        
        out.println(dispensers[0]);
        out.println(dispensers[1]);
    }
}