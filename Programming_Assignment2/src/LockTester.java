import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 *LockTester.java
 * Danielle Taylor, taylord24
 */

/*
 *
 * Name: Danielle Taylor
 * User Name: taylord24
 * Assignment: 2
 *
 * Description:
 * 
 * Holds the methods and instance variables for the ComboLock class.
 * The lock is constructed with a combination—three numbers between 0 and 39.
 * Sets three number 
 * The turnLeft and turnRight methods turn the dial by a given number of ticks to the left or right.
 * The isOpen method attempts to open the lock when set to the right three number combination.
 *
 * Bug Report:
 *  Works well, no problems
 *
 */
import java.io.PrintStream;

public class LockTester {
	 
	private static PrintStream out = System.out;
	    
	    public static void main(String[] args)
	    {
	    	
	    	Scanner scan = new Scanner(System.in);
	    	
	    	ComboLock lock = new ComboLock(0, 0, 0);
	    	
	        
	    	lock.setSecret1(10);
	    	lock.setSecret2(2);
	    	lock.setSecret3(8);
	    	
	        
	    	 String response = "y";
	         while (response.equals("y")){
	        	lock.reset();
	            System.out.print("Enter the 1st # of ticks (to the right):");
	            int first = scan.nextInt();
	            lock.turnRight(first);
	            

	            System.out.print("Enter the 2nd # of ticks (to the left):");
	            int second = scan.nextInt();
	            lock.turnLeft(second);

	            System.out.print("Enter the 3rd # of ticks (to the right):");
	            int third = scan.nextInt();
	            lock.turnRight(third);

	            
	           boolean open_lock = lock.isOpen();
	            if (open_lock == true) {
	                System.out.println("Click! Lock is opened.");
	                
	            } 
	            else {
	                System.out.println("Oops! Lock refuses to open.");
	                System.out.print("Do you want to try again? ");
	                response = scan.next().toLowerCase();
	            }
	        }
	    }
}

	//END