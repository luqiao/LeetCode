package day20170204;
//LeetCode:485. Max Consecutive Ones
/*
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
 */
public class findMaxConsecutiveOnes485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]==1){
        		count++;
        	}else{
        		if(count>max)
        			max=count;
        		count=0;
        	}
        	if(count>max)
        		max=count;
        
        }
        return max;
    }
    //study 思路很普通，人家写的好简约
    public static int findMaxConsecutiveOnes2(int[] nums){
    	int maxhere=0,max=0;
    	for(int num:nums)
    		max=Math.max(max, maxhere=num==0?maxhere=0:maxhere+1);
    	return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));
		System.out.println(findMaxConsecutiveOnes2(nums));
	}

}
