import java.util.Arrays;

/*
 * CPS151_Lab0.java
 */

/**
 * CPS 151; Algorithms & Programming II
 * 
 * Lab Project 0: Review of CPS 150 Material
 *
 * @author *** Danielle Taylor ***
 */


public class CPS151_Lab0
{
  public static void main(String[] args)
  {
    int[] a = {1, 4, 9, 16, 9, 7, 4, 9, 11};
    int[] b = {11, 1, 4, 9, 16, 9, 7, 4, 9};
    int[] c = {11, 11, 7, 9, 16, 4, 1, 4, 9};
    
    System.out.print("The arrays a and b ");
    
    
    
    if (!sameElements(a, b)) {
      System.out.print("do not ");
    }
    
    System.out.println("have the same elements.");
    
    System.out.print("The arrays a and c ");
    
    if (!sameElements(a, c)) {
      System.out.print("do not ");
    }
    
    System.out.println("have the same elements.");
  } // end main method
  
  public static boolean sameElements(int[] a, int[] b) {
	  
	  if (a.length != b.length) {
		  return false;
	  }
	  else {
		  
		  Arrays.sort(a);
		  Arrays.sort(b);
		  
for (int i=0; i < a.length; i++) {
	
	if (a[i] != b[i]) {
	return false;
	} 
	
	
	
}
return true;	  
	  }
  }
 
} // end public class CPS151_Lab0