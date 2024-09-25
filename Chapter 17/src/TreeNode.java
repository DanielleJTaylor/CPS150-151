
public class TreeNode {
	 	private Comparable data;
	    private TreeNode left, right;
	    
	    public TreeNode(Comparable e)
	    {
	        data = e;  //new TreeNode("A") is set to data
	        left = right = null; //left and right is null
	    } // end constructor
	    
		
		public Comparable getData() { return data; }
	    public TreeNode getLeft() { return left; }
	    public TreeNode getRight() { return right; }
	    
	    public void setData(Comparable e) { data = e; }
	    public void setLeft(TreeNode n) { left = n; }
	    public void setRight(TreeNode n) { right = n; }   
		   
}
