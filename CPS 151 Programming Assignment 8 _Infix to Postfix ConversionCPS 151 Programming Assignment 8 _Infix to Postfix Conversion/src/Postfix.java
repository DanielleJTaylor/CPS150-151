                                        	import java.util.Set;
	import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
	import java.io.File;
import java.io.IOException;

	/*
	 *Postfix.java
	 * Danielle Taylor, taylord24
	 */


	/*
	 * Postfix.java
	 * Danielle Taylor, taylord24
	 */

	/*
	 *
	 * Name: Danielle Taylor
	 * User Name: taylord24
	 * Assignment: 8
	 *
	 * Description:
	 * 
	 * To convert an infix expression to postfix form, we scan the infix expression from left to right.
	 *
	 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Postfix {
	//8-2/2+1*3-2

	 private static String infix = " ";
	 private static ArrayList<Character> postfix = new ArrayList<Character>();
	 private static Stack<Character> stack = new Stack<Character>();
	 
	 
	 public static void main(String[] args) {
		
		  	Scanner scan = new Scanner(System.in); 
		    System.out.println("Type an infix expression:");

		   
			infix = scan.nextLine();
			System.out.println("Inflix: " + infix); 
			
			
	
				
			intoPost();
		
		
		    // Pop all the operators from the stack
	        while (!stack.isEmpty()) {
	            postfix.add( stack.pop());
	           
	        }
	       
	 

	   
		String myString = "";
		for (Character c : postfix) {
		    myString += c;
		}
		

		    System.out.println("Postfix: " + myString); 

		   
			
			
			

		  }
	 
	 
	 public static int precedence (char top) {
		 if (top == '+') {
			return 1;	
		 }
		if (top == '-') {
					return 1;
		}
		 
		 else if (top== '*') { 
			 return 2;
		 }
		 else if (top== '/') { 
			 return 2;
		 }
		
		 else if (top== '^') { 
			 return 3;
		 }
		
		 else { return -1;}
	 }
	 
	 public static void intoPost() {

		 
		   for (int i = 0; i < infix.length(); i++) {
				char symbol = infix.charAt(i);
				//System.out.println(symbol);
				
				
		
		 // if not operator	 
		if (Character.isLetterOrDigit(symbol)){
			 postfix.add(symbol);
			}
			
			
		// If an operator is scanned
	        else {
	        
	    			 
	     			//pop off stack to postfix
	     				if (!stack.isEmpty()) {
	     					
	     					char top = stack.peek();
	     					char temp = symbol;
	     					System.out.println(top);
	     					
	     					if (precedence(top) >=  precedence(temp)) {
	     					char output = stack.pop();
	     					postfix.add(output);
	     					}
	     				}
	     					 stack.push(symbol);
		    
	 }
		
		   }
	 }
}// end class
