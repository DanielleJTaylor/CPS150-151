import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 *ProgrammingwithJava_ArrayLists.java
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
 * Have the user input the name of the customers and the amount of their purchase then output the name of the customer with the largest purchase
 *   
 *
 * Bug Report:
 *  Works well, no problems
 *
 */

public class ProgrammingwithJava_ArrayLists {

	public static void main(String[] args) {
		   /*
A supermarket wants to reward its best customer of each day, 
showing the customer’s name on a screen in the supermarket.

For that purpose, the customer’s purchase amount is stored in an ArrayList<Double> 
and the customer’s name is stored in a corresponding ArrayList<String>.


		    */
		
		  
		  Scanner scan = new Scanner(System.in);
		  boolean done = false;
		  
	
					
		ArrayList<String> customers_list = new ArrayList<String>();
		ArrayList<Double> purchases_list = new ArrayList<Double>();
					
		while(true){
			// get customer as user input
		System.out.print("Enter customer name: ");
		String customers_name = scan.nextLine();
		
	
		
		// get purchase price as user input
		System.out.print("Enter customer's purchase amout: ");
		double price = scan.nextDouble();
		
		scan.nextLine();
		
		if(price == 0){
			break;
			}
		
		customers_list.add(customers_name);
		purchases_list.add(price);
		
		} 
		String customer_largest = nameOfBestCustomer(purchases_list, customers_list);
		System.out.println("Best customer is "+ customer_largest);
	}
	 /*
	Implement a method

    public static String nameOfBestCustomer(ArrayList<Double> sales, ArrayList<String> customers)

that returns the name of the customer with the largest sale.

Write a program that prompts the cashier to enter all prices and names, adds them to two array lists, calls the method that you implemented, and displays the result. Use a price of 0 as a sentinel.
	 */
	
	public static String nameOfBestCustomer(ArrayList<Double> purchases_list, ArrayList<String> customers_list) {
		 double largest_double = 0;
		 int max_index = 0;
		
		 
		for (int i=0; i< customers_list.size();i++) {
			if (purchases_list.get(i) > largest_double) {
				largest_double = purchases_list.get(i);
				max_index = i;
				
			}
			
		}
		return customers_list.get(max_index);
		
	} // string name of BestCustomer
}//end main
