package BinarySearch;

import java.util.HashSet;
import java.util.Set;

/*
 Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
 */
public class intersection349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hm=new HashSet<Integer>();
        Set<Integer> tmp=new HashSet<Integer>();
        
        
        for(int i=0;i<nums1.length;i++){
        	hm.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
        	if(hm.contains(nums2[i])){
        		tmp.add(nums2[i]);
        	}
        }
        int[] result=new int[tmp.size()];
        int k=0;
        for(Integer x :tmp){
        	result[k++]=x;
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1={1,2,2,1};
		int[] nums2={2,2};
		int[] result=intersection(nums1,nums2);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}

	}

}
