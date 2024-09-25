/*
 * FIFO Queue ADT
 */

import java.util.NoSuchElementException;

/**
 * FIFO Queue ADT Interface
 * 
 * @author Danielle Taylor
 */
public interface QueueInterface
{
    // is the queue empty?
    boolean isEmpty();
    
    // add item at rear of queue
    void enqueue(Object e);
    
    // remove item from front of queue
    // throw NoSuchElementException if queue is empty
    Object dequeue() throws NoSuchElementException;
    
    // get item at front of queue
    // throw NoSuchElementException if queue is empty
    Object peek() throws NoSuchElementException;
} // end interface QueueInterface
