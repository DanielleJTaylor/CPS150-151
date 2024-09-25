import java.util.*;

public class ListMethodsRunner
{
   public static void main(String[] args)
   {
      ArrayList<Integer> tempList = ListMethods.makeList(100);
      if (tempList.size() == 0)
      {
          System.out.println("The list is empty");
      }
      else
      {
         for (Integer i : tempList)
         {
            System.out.println(i);
         }
         
         //reverse list
         tempList =  ListMethods.reverseList(tempList);
         
         //output list
         for (Integer i : tempList)
         {
            System.out.println(i);
         }   
         System.out.println(tempList);    
            
      }//else end
   } // end main method
} // end class ListMethodsRunner

