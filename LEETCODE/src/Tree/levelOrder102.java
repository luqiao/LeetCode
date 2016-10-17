package Tree;

import java.util.ArrayList;
import java.util.List;

public class levelOrder102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> ll=new ArrayList<List<Integer>>();
        addlevel(ll,0,root);
        return ll;
    }
    public void addlevel(ArrayList<List<Integer>> lists,int index,TreeNode root){
        if(root!=null){
            if(lists.size()-1<index)
                lists.add(new ArrayList<Integer>());
            lists.get(index).add(root.val);
            addlevel(lists,index+1,root.left);
            addlevel(lists,index+1,root.right);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
