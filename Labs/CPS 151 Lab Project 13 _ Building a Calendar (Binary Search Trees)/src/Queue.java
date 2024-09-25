/*
 * FIFO Queue of Objects
 */

import java.util.*;

/**
 * Implements QueueInterface using java.util.Vector
 *   Front of queue is at head of list
 *   Rear of queue is at tail of list
 *   
 * @author Danielle Taylor
 */
public class Queue implements QueueInterface
{
    private Vector list;
    
    public Queue() { list = new Vector(); }
    
    // is the queue empty? (i.e., is the list empty?)
    @Override
    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    // add item at rear of queue (i.e., add item to the tail of the list)
    @Override
    public void enqueue(Object e)
    {
        list.add(e);
    }

    // remove item from front of queue (i.e., remove item at head of list)
    // throw NoSuchElementException if queue is empty
    @Override
    public Object dequeue() throws NoSuchElementException
    {
        Object result = peek();
        list.removeElementAt(0);
        return result;
    }

    // get item at front of queue (i.e., poll item at head of list)
    // throw NoSuchElementException if queue is empty
    @Override
    public Object peek() throws NoSuchElementException
    {
        if (isEmpty()) { throw new NoSuchElementException("empty queue"); }
        
        return list.elementAt(0);
    }
    
} // end class Queue
