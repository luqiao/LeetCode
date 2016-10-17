package Tree;

import java.util.ArrayList;
import java.util.List;

public class minDepth111 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> ll=new ArrayList<List<Integer>>();
        posOrder(ll,0,root);
        return ll;
    }
    public void posOrder(ArrayList<List<Integer>> list,int index,TreeNode root){
        if(root!=null){
            if(list.size()-1<index)
                list.add(0,new ArrayList<Integer>());
            list.get(list.size()-1-index).add(root.val);
            posOrder(list,index+1,root.left);
            posOrder(list,index+1,root.right);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
