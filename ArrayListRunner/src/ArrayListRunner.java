import java.util.ArrayList;

public class ArrayListRunner
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
       
       // use add() method to add elements in the list
       names.add("Alice");
       names.add("Bob");
       names.add("Connie");
       names.add("David");
       names.add("Edward");
       names.add("Fran");
       names.add("Gomez");
       names.add("Harry");
       // PRINT WITH ADDED NAMES
       System.out.println(names);
       
    // Getting element at first & print
       System.out.println(names.get(0));
    // Getting element at last & print
       System.out.println(names.get(names.size()-1));
// Print the size() of the ArrayList
       System.out.println(names.size());
//Use size() to help you print the last name in the list.
       System.out.println(names.get(names.size()-1));
//Use set() to change “Alice” to “Alice B. Toklas”.
 //Print the ArrayList to verify the change.
       names.set(0, "Alice B. Toklas");
       System.out.println(names);
    //Use the alternate form of add() to insert “Doug” after “David”.
       //Print the ArrayList again.
       names.add(4, "Doug");
       System.out.println(names);
//Use a loop (instead of a single call to System.out.println) 
       //to print each name in the ArrayList.       
       for (int i=0; i<names.size();i++) {
    	   System.out.println(names.get(i));
       }
// Create a second Array List called names2 that is built by calling the ArrayList constructor
       //that accepts another ArrayList as an argument.
       //Pass names to the constructor to build names2.
       //Then print the ArrayList again.
       ArrayList<String> names2 = new ArrayList<String>(names);
       System.out.println(names2);
       
//Call names.remove(0) to remove the first element from the original ArrayList.
       //Print names and names2.
       //Verify that Alice B. Toklas was removed from names, but not from names2.
       names.remove(0);
       System.out.println(names);
       System.out.println(names2);
   }
}