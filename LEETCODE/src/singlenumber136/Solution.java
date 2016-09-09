package singlenumber136;
//Given an array of integers, every element appears twice except for one. Find that single one.
//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
public class Solution {
	 public static int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++)
        	result^=nums[i];
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,1,2,3,2,4,5,4,5};
		System.out.println(singleNumber(nums));

	}

}

