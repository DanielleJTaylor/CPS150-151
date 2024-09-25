/*
 * BST.java
 */

/**
 * Binary Search Tree (BST) Implementation
 *    based on Binary Tree abstract class
 *
 * @author Danielle Taylor
 */
public class BST extends BinaryTree
{
    // Dictionary ADT methods
    
    @Override
    public void insert(Comparable e)
    {
        if (isEmpty())
        {
            root = new Node(e);
            return;
        }
        
        Node curr = root;
        Node parent = null;
        while (curr != null && !e.equals(curr.getData()))
        {
            parent = curr;
            if (lessThan(e, curr.getData())) { curr = curr.getLeft(); }
            else if (greaterThan(e, curr.getData())) { curr = curr.getRight(); }
        }
        if (curr == null) // otherwise, we found e already in the BST
        {
            curr = new Node(e);
            if (lessThan(e, parent.getData())) { parent.setLeft( curr ); }
            else { parent.setRight( curr ); }
        }
    } // end insert
    
    @Override
    public void delete(Comparable e)
    {
        if (isEmpty()) { return; }
        
        // Locate e in the BST, along with its parent
        Node curr = root, parent = null;
        while (curr != null && !e.equals(curr.getData()))
        {
            parent = curr;
            if (lessThan(e, curr.getData())) { curr = curr.getLeft(); }
            else if (greaterThan(e, curr.getData())) { curr = curr.getRight(); }
        }
        
        if (curr == null) { return; } // e isn't in the BST
        
        // e must == data in curr Node
        Node leftChild = curr.getLeft();
        Node rightChild = curr.getRight();
        
        // if curr is a leaf, remove it from the tree
        if (leftChild == null && rightChild == null)
        {
            if (parent == null) // root
            {
                root = null;
            }
            else // non-root node
            {
                if (curr == parent.getLeft()) { parent.setLeft( null ); }
                else { parent.setRight( null ); }
            }
            System.gc();
            return;
        }
        
        // if curr has 2 children, replace curr's data with
        // the smallest Comparable in its right subtree
        if (leftChild != null && rightChild != null)
        {
            curr.setData( deleteMin(rightChild, curr) );
            System.gc();
            return;
        }
        
        // curr has 1 child; replace it with that child
        Node child;
        if (leftChild != null) { child = leftChild; }
        else { child = rightChild; }
        
        if (parent == null) // root node
        {
            root = child;
        }
        else // non-root node
        {
            if (parent.getLeft() == curr) { parent.setLeft( child ); }
            else { parent.setRight( child ); }
        }
        System.gc();
    } // end delete
    
    /**
     * remove/return smallest element in tree rooted at given Node
     * 
     * @param node the given Node
     * @param Parent the given Node's parent (assuming, wlg,
	 *        node is Parent's right child)
     * @return the smallest Comparable in BST rooted at node
     */
    private Comparable deleteMin(Node node, Node Parent)
    {
        if (node == null) { return null; }
        
        Comparable result = node.getData();
        Node curr = node;
        Node parent = Parent;
        while (curr.getLeft() != null)
        {
            parent = curr;
            curr = curr.getLeft();
            result = curr.getData();
        }
        if (parent != Parent) { parent.setLeft( curr.getRight()); }
        else { Parent.setRight( curr.getRight()); }
        return result;
    }
    
    @Override
    public boolean member(Comparable e)
    {
        return find(e) != null;
    } // end member
    
    // Helper Methods
    
    private Node find(Comparable e)
    {
        if (isEmpty()) { return null; }
        
        boolean found = false;
        Node curr = root;
        while (curr != null && !found)
        {
            if (lessThan(e, curr.getData())) { curr = curr.getLeft(); }
            else if (greaterThan(e, curr.getData())) { curr = curr.getRight(); }
            else { found = true; }
        }
        return curr;
    } // end find
    
    // Utility Methods
    
    @Override
    public String toString()
    {
        return inTraverse().toString();
    }
    
} // end class BST
