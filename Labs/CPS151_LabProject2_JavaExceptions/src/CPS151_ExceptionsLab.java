// CPS151_ExceptionsLab.java

import java.io.PrintStream;
import java.util.Scanner;

/*
 * CPS 151 Lab Project: Java Exceptions
 *
 * @author: Danielle Taylor
 */
public class CPS151_ExceptionsLab
{
    public static Scanner in = new Scanner( System.in );
    public static PrintStream out = System.out;

    /*
     makeRow ( int, String ) -> String
    
     method returns a String made up of n concatenated
     copies of s
    
     n: first argument (int)
     s: second argument (String)
    
     ex1: makeRow( 10, "$" ) -> "$$$$$$$$$$"
     ex2: makeRow( 0, "#" ) -> ""
     ex3: makeRow( -10, "$" ) -> ""
     
     
    */
    public static String makeRow(int n, String s)
    {
    	if (n < 0 || n>=20) {
    		throw new IllegalArgumentException("invalid number of symbols ");
    	}
        String result = "";
        
        if (s.isEmpty()) {
        	throw new IllegalArgumentException("invalid symbol ");
        }
        
        for (int count=1; count<=n; count++)
        {
            result += s;
        }
        
        return result;
    } // end makeRow method
    
    /*
     printUpTriangle ( int, String )
    
     method outputs a right triangle of height and width n,
     make up of the String s
    
     n: first argument (int)
     s: second argument (String)
    
     ex1: printUpTriangle( 10, "@" ) outputs:
    
                  @
                 @@
                @@@
               @@@@
              @@@@@
             @@@@@@
            @@@@@@@
           @@@@@@@@
          @@@@@@@@@
         @@@@@@@@@@
    
     ex2: printUpTriangle( 0, "#" ) outputs nothing
     ex3: printUpTriangle( -10, "@" ) outputs nothing
	 
	 1. for each row r from 1 to n:
	 1a. call makeRow to output n-r spaces
	 1b. call makeRow to output r copies of s
    */
    public static void printUpTriangle(int n, String s)
    {
    	if (n < 1 || n>=20) {
    		throw new IllegalArgumentException("invalid triangle size ");
    	}
        String result = "";
        
        if (s.isEmpty()) {
        	throw new IllegalArgumentException("invalid symbol ");
        }
        // for each row r from 1 to n:
        for (int r=1; r<=n; r++)
        {
            int spaces = n-r;
            // call makeRow to output n-r spaces
            out.print( makeRow(spaces, " ") );
            // call makeRow to output r copies of s
            out.print( makeRow(r, s) );
            // go to the next line
            out.println();
        }
        out.println(); // blank line
    } // end printUpTriangle method

    /*
     printDownTriangle ( int, String )
    
     method outputs a right triangle of height and width n upside down,
     make up of the String s
    
     n: first argument (int)
     s: second argument (String)
    
     ex1: printDownTriangle( 10, "@" ) outputs:
    
        @@@@@@@@@@
         @@@@@@@@@
          @@@@@@@@
           @@@@@@@
            @@@@@@
             @@@@@
              @@@@
               @@@
                @@
                 @
    
     ex2: printDownTriangle( 0, "#" ) outputs nothing
     ex3: printDownTriangle( -10, "@" ) outputs nothing
	 
	 1. for each row r from n to 1:
	 1a. call makeRow to output n-r spaces
	 1b. call makeRow to output r copies of s
    */
    public static void printDownTriangle(int n, String s)
    {
    	if (n < 1 || n>=20) {
    		throw new IllegalArgumentException("invalid triangle size ");
    	}
        String result = "";
        
        if (s.isEmpty()) {
        	throw new IllegalArgumentException("invalid symbol ");
        }
        // for each row r from n to 1:
        for (int r=n; r>=1; r--)
        {
            int spaces = n-r;
            // call makeRow to output n-r spaces
            out.print( makeRow(spaces, " ") );
            // call makeRow to output r copies of s
            out.print( makeRow(r, s) );
            // go to the next line
            out.println();
        }
        out.println(); // blank line
    } // end printDownTriangle method

    /*
     * CPS151_Lab1 -> Strings
     *
     * program demonstrates the printUpTriangle and printDownTriangle methods
     */
    public static void main(String[] args)
    {
    	try {
        int numSymbols;
        String Input;
        String Symbol;
        
        // Based on user input:
        //    # of symbols (must be 10 - 20)
        //    symbol
        
        out.print("Enter the number of symbols (must be 10 - 20): ");
        numSymbols = in.nextInt();
        out.print("Enter the symbol: ");
        Input = in.next();              // get input as string]
        Symbol = Input.substring(0, 1); // symbol is first char entered as input
        
        printUpTriangle(numSymbols, Symbol);
        System.out.println("\n");   // 2 blank lines
        printDownTriangle(numSymbols, Symbol);
    
    }// end main method
catch (Exception ex) {
	System.out.println(ex.toString());
}
} // end class CPS151_ExceptionsLab
}