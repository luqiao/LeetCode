package HashTable;
////Question 447. Number of Boomerangs
/*
Given n points in the plane that are all pairwise distinct, 
a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals 
the distance between i and k (the order of the tuple matters).

Find the number of boomerangs. 
You may assume that n will be at most 500 and coordinates of points are all 
in the range [-10000, 10000] (inclusive).

Example:
Input:
[[0,0],[1,0],[2,0]]

Output:
2

Explanation:
The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
 */

import java.util.HashMap;
import java.util.Map;

public class numberOfBoomerangs447 {
	//一开始想的是对称点，后来是直接用最笨的方法，一个一个遍历
    public static int numberOfBoomerangs(int[][] points) {
    	int res=0;
    	for(int i=0;i<points.length;i++){
    		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
    		for(int j=0;j<points.length;j++){
    			if (i==j)
    				continue;
    			int distance=(int) (Math.pow(Math.abs(points[i][0]-points[j][0]),2)+Math.pow(Math.abs(points[i][1]-points[j][1]),2));
    			map.put(distance,map.getOrDefault(distance,0)+1);
    		}
    		for(int val:map.values()){
    			res+=val*(val-1);
    		}
    		map.clear();
    	}
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points={{0,1},{0,0},{0,2}};
		
		System.out.println(numberOfBoomerangs(points));
	}

}
