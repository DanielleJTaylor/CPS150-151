// LinkedListTester.java

import java.io.PrintStream;

import java.util.Random;
import java.util.Scanner;

public class LinkedListTester
{
    private static final Random randy = new Random();
    private static final Scanner kbd = new Scanner( System.in );
    
    private static final PrintStream output = System.out;
    private static final PrintStream error = System.err;
    
    public static void main(String[] args)
    {
        LinkedList numbers = new LinkedList();
        
        try
        {
            output.print("Enter number of integers: ");
            int sizeOfList = kbd.nextInt();
            
            if (sizeOfList <= 0)
            {
                throw new Exception("invalid number (not positive): " + sizeOfList);
            }
            
            // add random integers to the list, each between 1 and sizeOfList
            
            for (int count=1; count<=sizeOfList; count++)
            {
                // no auto-boxing, so we need to create the Integer before
                //   adding it to our list
                Integer Next = new Integer(randy.nextInt(sizeOfList)+1);
                numbers.add(Next);
            } // end filling for loop
            
            // output the list, one Integer per line, using a for loop
            // note: loop will throw an exception in its last iteration
            
            for (int i=0; i <= list.getSize(); i++)
            {
                output.println(list.get(i));
            } // end output for loop
        }
        catch (Exception ex)
        {
            error.println("oops, something's wrong: " + ex.getMessage());
        }
    } // end main
} // end class LinkedListTester