package HashTable;

import java.util.HashMap;
import java.util.Map;

/*
 Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:
What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
public class intersect350 {
    public int[] intersect(int[] nums1, int[] nums2) {
    	Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
    	int[] result=new int[Math.min(nums1.length,nums2.length)];
    	int k=0;
    	for(int i=0;i<nums1.length;i++){
    		if(hm.get(nums1[i])==null){
    			hm.put(nums1[i],1);
    		}else{
    			int tmp=hm.get(nums1[i]);
    			hm.put(nums1[i],++tmp);
    		}
    	}
    	for(int j=0;j<nums2.length;j++){
    		if(hm.get(nums2[j])!=null){
    			result[k++]=nums2[j];
    			int tmp=hm.get(nums2[j]);
    			if(tmp==1)
    				hm.remove(nums2[j]);
    			else{
    				hm.put(nums2[j],--tmp);
    			}
    		}
    	}
    	int[] res=new int[k];
    	for(int i=0;i<k;i++){
    		res[i]=result[i];
    	}
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
