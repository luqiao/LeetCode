package Array;

import java.util.HashMap;

/*
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array 
such that nums[i] = nums[j] and the difference between i and j is at most k.
 */
public class containsNearbyDuplicate219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap hs=new HashMap();
        for(int i=0;i<nums.length;i++){
        	Object j=hs.get(nums[i]);
        	if(j!=null&&i-(Integer)j<=k){
    			return true;		
        	}else{
        		hs.put(nums[i],i);
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={0,1,2,2,4,5,6,7};
		int[] nums2={0,1,2,3,4,5,6,2};
		int[] nums3={1,0,1,1};
		System.out.println(containsNearbyDuplicate(nums,2));
		System.out.println(containsNearbyDuplicate(nums2,2));
		System.out.println(containsNearbyDuplicate(nums3,1));


	}

}
