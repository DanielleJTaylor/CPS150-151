/*
 * LinkedList.java
 * 
 * Original, 'plain vanilla' singly-linked list
 */

import java.util.NoSuchElementException;

public class LinkedList
{
	private int size; // set to 0 by default
	
    private class Node
    {
        Object data;
        Node next;

        Node(Object d) { data = d; } // next is null by default
    } // end inner class Node
    
    private Node head; // null by default
    
    // is the list empty?
    public boolean isEmpty() { return head == null; }
    
    // return the item at the head of the list
    public Object poll() throws NoSuchElementException
    {
        if (isEmpty()) { throw new NoSuchElementException("empty list"); }
        
        return head.data;
    } // end poll
    
    // add an item to the head of the list
    public void addFirst(Object e)
    {
    	size++;
        Node newNode = new Node(e);
        newNode.next = head;
        head = newNode;
    } // end addFirst
    
    // add an item e to the tail of the list
    public void addLast(Object e)
    {
    	
        if (isEmpty()) // for empty list, same as addFirst
        {
            addFirst(e);
        }
        else
        {
        	size++;
            Node newNode = new Node(e);
            // traverse to last node in list
            Node curr = head;
            while (curr.next != null) { curr = curr.next; }
            // add newNode after curr
            curr.next = newNode;
        }
    } // end addLast
    
    // remove the item at the head of the list
    public Object removeFirst() throws NoSuchElementException
    {
    	size--;
        if (isEmpty()) { throw new NoSuchElementException("empty list"); }
        
        Object result = head.data;
        head = head.next;
        return result;
    } // end removeFirst
    
    // remove the item at the tail of the list
    public Object removeLast() throws NoSuchElementException
    {
    	size--;
        if (isEmpty()) { throw new NoSuchElementException("empty list"); }
        
        // traverse to next-to-last and last nodes in list
        // use two Node references: current and previous
        Node curr = head;
        Node prev = null;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        
        Object result = curr.data;
        if (prev != null) {     // more than one node in list
            prev.next = null;
        } else {                // one node in list
            head = null;
        }
      
        return result;
    } // end removeLast
    
    private int getSize(int size) {
		return this.size;	
    }
    
    public Object getObjAt(int index) {
    
    	Object result = null;
    	int currIndex = 0;
    	Node currNode = head;
    	
    	
    	try {
  
    	  // traverse to last node in list
        Node curr = head;
        int count = 0;
        
        while (index != count) {
            count++;
            curr = curr.next; }
        //
  
      return   curr.next;
    

    }
    catch(Exception e) {
    	System.out.println("list index out of bounds");
    	System.out.println(e.getMessage());
    }
    }
    
	// return list as String
    public String toString()
    {
      if (isEmpty()) { return "[]"; } // empty list
      
      String result = "[";
      Node curr = head;
      while (curr.next != null) // stop at last node
      {
        result += curr.data; // concatenate node data to result
        result += ", ";      // add separator after each non-tail data
        curr = curr.next;
      } // end while
      
      result += curr.data;
      
      return result + "]";
    } // end toString
} // end class LinkedList