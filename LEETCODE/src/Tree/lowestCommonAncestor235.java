package Tree;

public class lowestCommonAncestor235 {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode current=root;
    	while(current!=null){
        	if(p.val<current.val&&q.val<current.val){
        		current=current.left;
        	}else if(p.val>current.val&&q.val>current.val){
        		current=current.right;
        	}else {
        		return current;
        	}
        }
    	return current;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t=new Tree();
		TreeNode p=new TreeNode(2);
		TreeNode q=new TreeNode(8);
		t.insert(1,6);
		t.insert(2,2);
		t.insert(3,8);
		t.insert(4,0);
		t.insert(5,4);
		t.insert(6,7);
		t.insert(7,9);
		//t.insert(12,3);
		//t.insert(13,5);
		TreeNode result=lowestCommonAncestor(t.root,p,q);
		System.out.println(result.val);
		

	}

}
