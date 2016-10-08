package Array;

import java.util.ArrayList;
import java.util.List;

/*
 Given numRows, generate the first numRows of Pascal's triangle.
For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */
public class generate118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists=new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
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
        return lists;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> lists=new ArrayList<List<Integer>>();
		lists=generate(5);
		for(int i=0;i<lists.size();i++){
			for(int j=0;j<lists.get(i).size();j++){
				System.out.print(lists.get(i).get(j)+",");
			}
			System.out.println();
		}
		
	}

}
