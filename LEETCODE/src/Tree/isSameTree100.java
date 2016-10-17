package Tree;

public class isSameTree100 {
	static boolean result=true;
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if(result==true&&p!=null&&q!=null){
			if(p.val!=q.val)
				result= false;
			isSameTree(p.left,q.left);
			isSameTree(p.right,q.right);
		}else if((result==true&&p==null&&q!=null)||(result==true&&p!=null&&q==null)){
		    
			result= false;
		}
		return result;
		
	}
	/*
	static StringBuilder sb=new StringBuilder();
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        StringBuilder pp=new StringBuilder();
        StringBuilder pi=new StringBuilder();
        sb=pp;
        preOrder(p);
        sb=pi;
        inOrder(p);
        StringBuilder qp=new StringBuilder();
        StringBuilder qi=new StringBuilder();
        sb=qp;
        preOrder(q);
        sb=qi;
        inOrder(q);
        System.out.println(pp.toString());
        System.out.println(qp.toString());
        if(pp.toString().equals(qp.toString())&&pi.toString().equals(qi.toString()))
        	return true;
        else
        	return false;
        
        
    }
    public static void preOrder(TreeNode root){
    	if(root!=null){
    		sb.append(root.val);
    		preOrder(root.left);
    		preOrder(root.right);
    	}
    }
    public static void inOrder(TreeNode root){
    	if(root!=null){
    		inOrder(root.left);
    		sb.append(root.val);
    		inOrder(root.right);
    	}
    }
    */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t1=new Tree();
		t1.insert(1,1);
		t1.insert(2,1);
		//t.insert(5,5);
		//t.insert(6,6);
		Tree t2=new Tree();
		t2.insert(1,1);
		t2.insert(3,1);
		System.out.println(isSameTree(t1.root,t2.root));

	}

}
