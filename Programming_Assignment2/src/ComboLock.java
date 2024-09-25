import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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

public class ComboLock {
	
	private int secret1 = 0;
	private int secret2 = 0 ;
	private int secret3 = 0;
	private int current = 0;
	
	//my own instance variable 
	private boolean first_right = true;
	
	
	
	private boolean combo1 = false;
	private boolean combo2 = false;
	private boolean combo3 = false;


	   public ComboLock(int secret1, int secret2, int secret3) {
	        this.secret1 = secret1;
	        this.secret2 = secret2;
	        this.secret3 = secret3;
	        this.current = 0;
	        this.first_right = true;
	        this.combo1 = false;
	        this.combo2 = false;
	        this.combo3 = false;
	    }
	
	public void reset() {
		this.secret1 = 0;
		this.secret2 = 0;
		this.secret3 = 0;
		this.current = 0;
		
		this.first_right = true;
		
		this.combo1 = false;
		this.combo2 = false;
		this.combo3 = false;
		
	}
	
	
	public void turnLeft (int numTicks) {
		this.current = current + (numTicks%40);
		current = current%40;
		System.out.println(current);
		if (current == secret2) {
			combo2 = true;
		}	
		
		}
	
	public void turnRight (int numTicks) {
		if(first_right) //if it is first turn right
		{
			
		this.current = (40 - (numTicks%40));
		
		System.out.println(current);
		if (current == secret1) {
			combo1 = true;
		}	
		first_right = false;
		}
		
		else {
			//if it is second turn right
			if(current - numTicks > 0)

			{

			this.current = (current - (numTicks%40));

			}

			else

			{

			this.current = (40 - (numTicks - current));
			
			}	

			System.out.println(current);
			
			if (current == secret3) {
				combo3 = true;
			}
			
			}
	
	}

		/**

		Returns true if the lock can be opened now
		*/
		
	
	
	public void setSecret1 (int secret1) {
		this.secret1 = secret1;
	}
	
	public void setSecret2 (int secret2) {
		this.secret2 = secret2;
	}
	
	public void setSecret3 (int secret3) {
		this.secret3 = secret3;
	}
	public boolean isOpen () {
		return combo1 && combo2 && combo3;
	}

}// end class
