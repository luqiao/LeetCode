package Tree;

public class invertTree226 {
    public static TreeNode invertTree(TreeNode root) {
    	invert(root);
    	return root;
    }
    public static void invert(TreeNode root){
    	if(root!=null){
        	if(root.left!=null||root.right!=null){
        		TreeNode tmp=root.left;
        		root.left=root.right;
        		root.right=tmp;
        	}
        	invertTree(root.left);
        	invertTree(root.right);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
