package Tree;

public class Tree {

	public TreeNode root;
	
	public void insert(int x,int index){
		StringBuilder sb=new StringBuilder();
		TreeNode newNode=new TreeNode(x);
		TreeNode current=root;
		if(index==1){
			root=newNode;
		}else{
			while(index>1){
				sb.append(index%2);
				index=index/2;
			}
		}
		sb.reverse();
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)=='0'){
				if(i==sb.length()-1)
					current.left=newNode;
				else
					current=current.left;
			}else{
				if(i==sb.length()-1)
					current.right=newNode;
				else
					current=current.right;
			}
		}

	}
	public void preOrder(TreeNode root){
		if(root!=null){
			System.out.println(root.val);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
}
