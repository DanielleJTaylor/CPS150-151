class TreeNode {
	int key; 
	TreeNode lchild; 
	TreeNode rchild; 
	int height; 
	public TreeNode(int key) { 
		this.key = key; 
		this.lchild = null; 
		this.rchild = null; 
		this.height = 1; 
		} 
	}

public class AVLTree {
	 
    // Function to update the height of a node based on its children's heights
    public static void updateHeight(AVLwithparent root) {
        if (root != null) {
            int leftHeight = (root.left != null) ? root.left.height : 0;
            int rightHeight = (root.right != null) ? root.right.height : 0;
            root.height = Math.max(leftHeight, rightHeight) + 1;
        }
    }