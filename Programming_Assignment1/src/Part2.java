
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

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
 * Have the user input the name of the customers and the amount of their purchase then output the names of the customers with the largest purchases
 *   
 *
 * Bug Report:
 *  
 *  Works well
 *
 */

public class Part2 {

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
		
		// get number of customers with the largest sales
		System.out.print("Number of customers with the largest sales: ");
		 int topN = scan.nextInt();
		 
		String customer_largest = nameOfBestCustomer(purchases_list, customers_list);
		System.out.println("Best customer is "+ customer_largest);
		
		ArrayList<String> best_array = nameOfBestCustomers(purchases_list,customers_list,topN);
		System.out.println("The top "+ topN+ " best customers are " + best_array);
	}// main end
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
	
	
	/*Improve the program from Part 1 so that it displays the top customers, that is, the topN customers with the largest sales, where topN is a value that the user of the program supplies.

	Implement a method

	    public static ArrayList<String> nameOfBestCustomers(ArrayList<Double> sales,  ArrayList<String> customers, int topN)
	   
	If there were fewer than topN customers, include all of them.
	*/
	
	 public static ArrayList<String> nameOfBestCustomers(ArrayList<Double> purchases_list, ArrayList<String> customers_list, int topN){
		//what if I copy the array into another array
		//sort copied array then find the greatest element 
		//output the name of where the greatest element is
		
	ArrayList<Double> purchases_list2 = new ArrayList<Double>(purchases_list);
	Collections.sort(purchases_list2, Collections.reverseOrder());  
	
	System.out.println(purchases_list2);
	ArrayList<String> return_array = new ArrayList<String>();
	
	for(int i=0; i<purchases_list.size(); i++) {
	for (int x=0; x<purchases_list.size(); x++) {
		if (purchases_list2.get(i) == purchases_list.get(x)) {
			System.out.println(customers_list.get(x));
			return_array.add(customers_list.get(x));
		}
	}
	}

	ArrayList<String> return_array2 = new ArrayList<String>();
	for(int i = 0; i < topN; i++) {
		return_array2.add(return_array.get(i));
	}
		 
	return return_array2;
	 }
	
	
	
}//end main