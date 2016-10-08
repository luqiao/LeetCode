package maxDepth104;
/*
Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public void insert(int val){
		TreeNode newNode=new TreeNode(val);
		
		
		
	}
    public int maxDepth(TreeNode root) {
        int count=0;
        int max=0;
        return preOrder(root,count,max);
    }
    public int preOrder(TreeNode root,int count,int max){
    	if (root!=null){
    		count++;
    		if(max<count)
    			max=count;
    		preOrder(root.left,count,max);
    		count--;
    		preOrder(root.right,count,max);
    	}
    	return max;
    }
}

