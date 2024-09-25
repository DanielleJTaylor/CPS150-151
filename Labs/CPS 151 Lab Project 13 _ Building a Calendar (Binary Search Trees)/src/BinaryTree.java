/*
 * BinaryTree.java
 */

import java.util.*;

/**
 * Binary Tree abstract class
 * 
 * @author Danielle Taylor
 */
public abstract class BinaryTree
{
    // Dictionary ADT method prototypes
    public abstract void insert(Comparable e);
    public abstract void delete(Comparable e);
    public abstract boolean member(Comparable e);
    
    protected Node root;
    
    public BinaryTree() { root = null; }
    
    public boolean isEmpty() { return root == null; }
    
    // Breadth-First Traversals

    public ArrayList<Comparable> levelTraverse()
    {
        ArrayList<Comparable> result = new ArrayList<>();
        QueueInterface nodeQ = new Queue();
        
        nodeQ.enqueue(root);
        
        try {
            while (!nodeQ.isEmpty()) {
                Node currNode = (Node)nodeQ.dequeue();
                result.add(currNode.getData());
                
                Node leftChild = currNode.getLeft();
                if (leftChild != null) {
                    nodeQ.enqueue(leftChild);
                }
                
                Node rightChild = currNode.getRight();
                if (rightChild != null) {
                    nodeQ.enqueue(rightChild);
                }
            }
        } catch (NoSuchElementException e) {
            System.err.println(e);
            return null;
        }
        
        return result;
    } // end levelTraverse
    
    // Depth-First Traversals

    public ArrayList<Comparable> inTraverse()
    {
        ArrayList<Comparable> result = new ArrayList<>();
        
        if (!isEmpty()) { inTraverse(root, result); }
        
        return result;
    } // end inTraverse interface method
    
    private void inTraverse(Node node, ArrayList<Comparable> result)
    {
        Node leftChild = node.getLeft();
        if (leftChild != null) { inTraverse(leftChild, result); }
        result.add(node.getData());
        Node rightChild = node.getRight();
        if (rightChild != null) { inTraverse(rightChild, result); }
    } // end inTraverse helper method
    
    public ArrayList<Comparable> preTraverse()
    {
        ArrayList<Comparable> result = new ArrayList<>();
        
        if (!isEmpty()) { preTraverse(root, result); }
        
        return result;
    } // end preTraverse interface method
    
    private void preTraverse(Node node, ArrayList<Comparable> result)
    {
        result.add(node.getData());
        Node leftChild = node.getLeft();
        if (leftChild != null) { preTraverse(leftChild, result); }
        Node rightChild = node.getRight();
        if (rightChild != null) { preTraverse(rightChild, result); }
    } // end preTraverse helper method
    
    public ArrayList<Comparable> postTraverse()
    {
        ArrayList<Comparable> result = new ArrayList<>();
        
        if (!isEmpty()) { postTraverse(root, result); }
        
        return result;
    } // end postTraverse interface method
    
    private void postTraverse(Node node, ArrayList<Comparable> result)
    {
        Node leftChild = node.getLeft();
        if (leftChild != null) { postTraverse(leftChild, result); }
        Node rightChild = node.getRight();
        if (rightChild != null) { postTraverse(rightChild, result); }
        result.add(node.getData());
    } // end postTraverse helper method
    
    // Utility methods
    
    protected boolean lessThan(Comparable item1, Comparable item2)
    {
        return item1.compareTo(item2) < 0;
    }
    
    protected boolean greaterThan(Comparable item1, Comparable item2)
    {
        return item1.compareTo(item2) > 0;
    }
    
    protected void swap(Node node1, Node node2)
    {
        Comparable temp = node1.getData();
        node1.setData( node2.getData() );
        node2.setData( temp );
    }
    
    @Override
    public String toString()
    {
        return levelTraverse().toString();
    }
} // end abstract class BinaryTree
