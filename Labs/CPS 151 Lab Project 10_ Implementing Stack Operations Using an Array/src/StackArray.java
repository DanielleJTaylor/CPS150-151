/*
 * StackArray.java
 */

/*
 * CPS 151, Fall 2018 semester
 *
 * Section: 02
 * 
 * Lab Project 15: Implementing Stack Operations Using an Array
 *
 * author *** Replace with your name ***
 */

import java.util.Arrays;
import java.util.NoSuchElementException;

public class StackArray
{
  private Object[] item;                      // The array where elements are stored
  private int open = 0;                       // The index of the first empty location in the stack
  private static final int INITIAL_SIZE = 2;  // The initial number of item locations in the stack
  
  /**
   Constructs an empty stack.
   */
  public StackArray()
  {
    item = new Object[INITIAL_SIZE];
  }
  
  public void push(Object element)
  {
    // put your code here
	  if (open >= item.length-1) {
		  int newCapacity = item.length*2;
	  Object [] temp = Arrays.copyOf(item, newCapacity);
	  item = temp;
	  }
	  
	  open++;
	  item[open] = element;
	  
	 
  }
  
  public Object pop() throws NoSuchElementException
  {
    // put your code here
	  if(!isEmpty()) {
	 Object result;
	 open--;
	 result = item[open];
	 return result;
	  }
	 else {
		 throw new NoSuchElementException ("The stack is empty");
		 }
  }
  
  public boolean isEmpty()
  {
    return open == 0;
  }
  
  public String toString()
  {
    if (open == 0) { return "[]"; }
    String temp = "[" + item[0];
    int i = 1;
    while (i < open)
    {
      temp = temp + ", " + item[i];
      i = i + 1;
    }
    temp = temp + "]";
    return temp;
  } // end toString
} // end classs StackArray