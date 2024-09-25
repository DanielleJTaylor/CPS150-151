/*
 * LinkedList.java
 *
 * CPS 151
 * Algorithms & Programming II
 *
 * Lab Project: Implementing a Linked List
 *
 * Name: Danielle Taylor
 */

import java.util.NoSuchElementException;

public class LinkedList
{
   private Node first;
   public LinkedList() { first = null; }

   public Object getFirst()
   {
      if (first == null) { throw new NoSuchElementException(); }
      return first.data;
   }
   
   /*
    * first complete the code for its addFirst method.
    *  
    *  
  1. Create a new Node object.
  2. Make the data variable in the new Node object reference the object that was passed to addFirst.
  3. Make the next variable in the new Node object reference the object that is currently referenced in variable first.
  4. Make variable first reference the new Node.

  Test your code by running the main method in the LinkedListRunner class.
    *   
    */
   
     //object element is the reference object that was passed to addFirst
   public void addFirst(Object element)
   {
      // put your code here
	   
	   //create node object
	   Node newNode = new Node();
	 
	   // Make the element variable in the new Node object reference the passed element to addFirst.
	   newNode.data = element;
	   
	   // Make the next variable in the new Node object reference the object currently referenced in variable first
	   newNode.next = first;
	   
	   
	   // Make variable first reference the new Node  
	   first = newNode; 
	   
	
	
   }

   public String toString()
   {
      String temp = "";
      Node current = first;
      while (current != null)
      {
         temp = temp + current.data.toString() + '\n';
         current = current.next;
      }

      return temp;
   }

   class Node
   {
      Object data;
      Node next;
   }
}
