package Math;

import java.util.Arrays;

//Question 268. Missing Number
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
	//测试case设计的有问题，就有点不理解题目了，其实根本不存在[3]这种情况，把题目想复杂了
    public static int missingNumber(int[] nums) {
    		int N=nums.length;
    		int sum=0;
    		for(int i=0;i<nums.length;i++){
    			sum+=nums[i];
    		}
    		return N*(N+1)/2-sum;
    }
    //study1 利用a^b^b=a
    //[0,1,3]   0^0^0^1^1^2^3^3=2  好吧，好机智
    public static int missingNumber2(int[] nums){
    	int xor=0;
    	int i=0;
    	for(;i<nums.length;i++){
    		xor=xor^i^nums[i];
    	}
    	return xor^i;
    }
    //study2 binary search
    public static int missingNumber3(int[] nums){
    	Arrays.sort(nums);
    	int left=0;
    	int right=nums.length-1;
    	while(left<right){
    		int mid=(left+right)/2;
    		if(nums[mid]>mid)
    			right=mid;
    		left=mid+1;
    	}
    	return left;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1={};
		//测试case设计错误
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
