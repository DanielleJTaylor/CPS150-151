import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RadixSort {
	
	private static Random rand = new Random();
	
	 
	static int getMax(Integer[] orginal, int n)
	{
	int max = orginal[0];
	for (int i = 1; i < n; i++)
	if (orginal[i] > max)
	max = orginal[i];
	return max;
	}
	
	// The main function to that sorts arr[] of
    // size n using Radix Sort
	public static void radixSort(int[] input) {
	    final int RADIX = 10;
	    
	    // declare and initialize bucket[]
	    ArrayList<Integer>[]  output = new ArrayList[10];
	    
	    for (int i = 0; i < output.length; i++) {
	    	output[i] = new ArrayList<Integer>();
	    }

	    // sort
	    ArrayList<Integer> brand = new ArrayList<Integer>();
	    boolean maxLength = false;
	    int tmp = 0, placement = 10, count = 1;
	    
	    
	    
	    while (!maxLength) {
	    	 // move to next digit
	       
	      maxLength = true;
	      
	      if  (count == 1) {
	    	  System.out.println(" Sorting "+ Arrays.toString(input) + "on rightmost digit...");
	      // split input between lists
	      for (Integer i : input) {
	        tmp = i % 10;
	        output[tmp].add(i);
	        brand.add(i);
	        
	 
	        if (maxLength && count <= 2) {
	          maxLength = false;
	        }
	      }
	  
	      System.out.println(" ");
	      System.out.println(" ");
	      System.out.println("Sorting an int array using radix sort algorithm");
	      System.out.println(" ");
	      
	        	        
	      for (int i =0; i<output.length; i++) {
	    	  System.out.println(" aux" + i + ": " + output[i]);
	      }
	      
	      count++;
	      Arrays.sort(input); 

	      }
	      
	    
	      
	      
	      System.out.println(" ");
	      System.out.println(" ");
	      

	     
	      for (int i =0; i<output.length; i++) {
	    	  output[i].clear();
	      }
	     
	     if  (count == 2) {
	    	 
	      // split input between lists
	    	  System.out.println(" Sorting "+ Arrays.toString(input) + "on leftmost digit...");	  
	    	 
	    	 
	      for (Integer i : input) {
	    	tmp = i/10;
	        output[tmp].add(i);
	        if (maxLength && count <= 2) {
	          maxLength = false;
	        }
	      }
	      
	      System.out.println(" ");
	      System.out.println(" ");
	      System.out.println("Sorting an int array using radix sort algorithm");
	      System.out.println(" ");
	      for (int i =0; i<output.length; i++) {
	    	  System.out.println(" aux" + i + ": " + output[i]);
	      }
	      count++;
	      }
	      
	     

	}
	
	}
	
	private static void countSort(Integer[] orginal, int n, int exp) {
	


	}
	



	public static void main (String[] args)
	{
	
		int[] array = new int[15];
	
	for (int i = 0; i<array.length; i++) {
	int num = rand.nextInt(89)+10;;
	array[i]= num;
	//array[i]= Integer.toString(num);
	//String.format("%02d", Integer.parseInt(array[i]));  
	}
	
	  System.out.println("Original array: " + Arrays.toString(array));

	    // sorting array using radix Sort Algorithm
	   radixSort(array);

	    System.out.println("Sorted array: " + Arrays.toString(array));

	
	}
	
	
	 // Find the first digit
    public static int firstDigit(int n)
    {
        // Remove last digit from number
        // till only one digit is left
        while (n >= 10) 
            n /= 10;
     
        // return the first digit
        return n;
    }
 
    // Find the last digit
    public static int lastDigit(int n)
    {
        // return the last digit
        return (n % 10);
    }

	}//end class