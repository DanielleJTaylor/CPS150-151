/*
 * Node.java
 */

/**
 * Binary Tree Node
 *
 * Need Comparable node data since there
 *  are binary trees in which node data
 *  is compared
 * 
 * @author Danielle Taylor
 */
public class Node
{
    private Comparable data;
    private Node left, right;

    public Node(Comparable e)
    {
        data = e;
        left = right = null;
    } // end constructor
    
    public Comparable getData() { return data; }
    public Node getLeft() { return left; }
    public Node getRight() { return right; }
    
    public void setData(Comparable e) { data = e; }
    public void setLeft(Node n) { left = n; }
    public void setRight(Node n) { right = n; }
}
