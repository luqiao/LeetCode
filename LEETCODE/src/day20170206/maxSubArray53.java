package day20170206;
//LeetCode:53. Maximum Subarray
/*
 Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.

click to show more practice.

More practice:
If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class maxSubArray53 {
    public static int maxSubArray(int[] nums) {
    	int max=nums[0];
        for(int i=0;i<nums.length;i++){
        	for(int j=i,sum=0;j<nums.length;j++){
        		sum+=nums[j];
        		if(sum>max)
        			max=sum;
        	}
        }
        return max;
    }
    //study if(AB+C)<C£¬AB<0,ÇÒA<AB
    public static int maxSubArray2(int[] nums){
    	int max=nums[0],subMax=nums[0];
    	for(int i=1;i<nums.length;i++){
    		subMax=Math.max(nums[i]+subMax, nums[i]);
    		max=Math.max(max, subMax);
    	}
    	return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={-2,1,-3,4,-1,2,1,-5,4};
		int[] nums2={-2,1};
		int[] nums3={1};
		
		System.out.println(maxSubArray(nums));
		System.out.println(maxSubArray(nums2));
		System.out.println(maxSubArray(nums3));
		
		System.out.println(maxSubArray2(nums));
		System.out.println(maxSubArray2(nums2));
		System.out.println(maxSubArray2(nums3));
	}

}
