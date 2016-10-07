package Array;

import java.util.ArrayList;
import java.util.List;

/*
 Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?
 */
public class getRow119 {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> lists=new ArrayList<List<Integer>>();
        for(int i=0;i<rowIndex+1;i++){
        	List<Integer> list=new ArrayList<Integer>();
        	list.add(1);
        	if (i==0){
        		lists.add(list);
        		continue;
        	}
        	List<Integer> listpre=lists.get(i-1);
        	for(int j=1;j<i;j++){
        		int sum=listpre.get(j-1)+listpre.get(j);
        		list.add(sum);
        	}
        	list.add(1);
        	lists.add(list);
        }
        return lists.get(rowIndex);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list=getRow(3);
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+",");
		}
	}

}
