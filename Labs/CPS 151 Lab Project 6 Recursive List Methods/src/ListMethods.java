import java.util.*;

public class ListMethods
{
   public static ArrayList<Integer> makeList(int n)
   {
      ArrayList<Integer> tempList = null;
      if (n <= 0)  // The smallest list we can make ...
      {
    	  return tempList = new ArrayList<Integer>();
          // ... is an empty (new) list
      }
      else        // All other sized (non-empty) lists are created here
    {
    	// a list [1, 2, ... n] is n added to the end of the list [1, 2, ..., n-1]
         tempList = makeList(n-1);
         tempList.add(n);
         
      }
      System.out.print("Made a list of size" +n);
      System.out.println(":" + tempList); 
      return tempList;
   }//makeList
   
   public static ArrayList<Integer> reverseList(ArrayList<Integer> tList)
   {
	   ArrayList<Integer> cloneList = new ArrayList<Integer>();
	   
      if (tList.isEmpty() || tList.size() <=1) {
    	  // The list is empty or has one element)
         // Return the list as is – no need to reverse!
    	  
    	  return tList;
      }
      else
      {
         // Use the solution to a smaller version of the problem
         // to solve the general problem
    	cloneList = deepClone(tList);
    	int first = cloneList.remove(0);
    	cloneList = reverseList(cloneList);
    	cloneList.add(first);
      }

      return cloneList;
   }
   
   private static ArrayList<Integer> deepClone(ArrayList<Integer> tList)
   {
      ArrayList<Integer> list = new ArrayList<Integer>();
      for (Integer i : tList)
      {
         list.add(new Integer(i));
      }
      return list;
   }
   
} // end class ListMethods