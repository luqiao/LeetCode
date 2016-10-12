package Math;
/*
 Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
find the one that is missing from the array.
For example,
Given nums = [0, 1, 3] return 2.
Note:
Your algorithm should run in linear runtime complexity.
 Could you implement it using only constant extra space complexity?
 */
public class missingNumber268 {
    public static int missingNumber(int[] nums) {
    	int N=nums.length;
    	if(N==0||(N==1&&nums[0]==1))
    		return 0;
    	else{
    		int min=nums[0];
    		int max=nums[0];
    		int sum=nums[0];
    		for(int i=1;i<nums.length;i++){
    			sum +=nums[i];
    			if(nums[i]<min){
    				min=nums[i];
    			}else if(nums[i]>max){
    				max=nums[i];
    			}
    		}
    		if(max-min+1==N)
    			return max+1;
    		else
    			return (min+max)*(N+1)/2-sum;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1={};
		int[] nums2={3};
		int[] nums3={1,3};
		int[] nums4={1,3,2,5};
		int[] nums5={1,2,3};
		int[] nums6={1};

		System.out.println(missingNumber(nums1));
		System.out.println(missingNumber(nums2));
		System.out.println(missingNumber(nums3));
		System.out.println(missingNumber(nums4));
		System.out.println(missingNumber(nums5));
		System.out.println(missingNumber(nums6));
	}

}
