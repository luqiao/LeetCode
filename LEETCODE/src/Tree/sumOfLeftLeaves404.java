package Tree;

public class sumOfLeftLeaves404 {
	static int count=0;
    public static int sumOfLeftLeaves(TreeNode root) {
    	order(root);
    	return count;
    }
	public static void order(TreeNode root){
		if(root!=null){
			if(root.left!=null)
				count+=root.val;
			order(root.left);
			order(root.right);
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t=new Tree();
		t.insert(1,1);
		t.insert(2,2);
		t.insert(3,3);
		t.insert(4,4);
		//t.insert(5,5);
		//t.insert(6,6);
		t.preOrder(t.root);
		System.out.println(sumOfLeftLeaves(t.root));

	}

}
