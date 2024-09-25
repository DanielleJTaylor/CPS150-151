import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 *Program 1.java
 * Danielle Taylor, taylord24
 */

/*
 *
 * Name: Danielle Taylor
 * User Name: taylord24
 * Assignment: 1
 *
 * Description:
 *    
 *    Creating a randomly generated pin with digits from 0 to 3. 
 *    Start by coming up with a four digit pin. 
 *    Find where the four digits are and store random numbers 
 *    that correspond to their PIN instead of their actual PIN numbers.
 *
 * Bug Report:
 *    Provide a description of all bugs
 *    and any functionality or aspects of the
 *    assignment that you didn't implement
 *
 * Could get it to generate
 *
 */

public class Password_Protection {
	
	 public static void main(String[] args) {

	System.out.println("Welcome!  To log in, enter the random digits from 1-3 that");
	System.out.println("correspond to your PIN number.");
	System.out.println(" ");
	
	int[] pin_display = {0,1,2,3,4,5,7,8,9};
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);

	int[] ran_num = new int[pin_display.length];//number of elements generated
	int[] pin = {2,4,4,9};
	
	System.out.print("PIN digit: " );
	for ( int i = 0; i < pin_display.length; i++) {
		System.out.print(pin_display[i] + " ");	
	}
	
	System.out.println(" ");
			
	System.out.print("Random #:  ");
	 for (int i = 0; i < pin_display.length; i++) {
		 ran_num[i] = rand.nextInt(4);// 0 to 4
         System.out.print(ran_num[i] + " "); 
      }
	 System.out.println(" ");
	 System.out.print("PIN: ");
	 for (int i = 0; i < pin.length; i++) {
		System.out.print(pin[i] + " ");
	 }
	 
	 System.out.println(" ");
	 System.out.println("Enter code.");
	 int user_input = scan.nextInt();

	 
	// 
	// for (int i = 0; i < pin_display.length; i++) {
	 //}}
	
	 
	// Extract the digits from the code and store in the entered_digits array
	 String temp = Integer.toString(user_input);
	 ArrayList<Integer> user_array = new ArrayList<Integer>();
	 ArrayList<Integer> actual_pin = new ArrayList<Integer>();
	 
	 int[] num = new int[temp.length()];

	for (int i = 0; i < temp.length(); i++){
	    num[i] = Character.getNumericValue(temp.charAt(i));
	 }
	// 
	 
	//  int[] num = new int[temp.length()];

	//    for (int i = 0; i < temp.length(); i++)
	//    {
	//    	num[i] = temp.parseInt(Character.toString(number.charAt(i)));
	//    }
	    
	 for (int i = 0; i < temp.length(); i++) {
		 user_array.add(num[i]);
	 }
	 
	 
	 
	 for (int x = 0; x < 4; x++) {
	     for (int i = 0; i < pin_display.length; i++) 
	    {
	        if (pin_display[i] == num[x]) 
	        {              
	           actual_pin.add(ran_num[i]);
	           
	        }
	    }

	        if (actual_pin == user_array)
	        {
	        	System.out.println("Correct!  You may now proceed.");
	            break;
	        }
	        else
	        {
	            System.out.println("Pin doesnt match.");
	            break;
	        }
	 }
	        
	        
	        
	

	 
	
	 
}
}
