package Tree;
/*
 Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class maxDepth104 {
	static int max=0;
	static int count=1;
    public static int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        else{
            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        }
        
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
