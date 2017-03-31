package Array;

import java.util.ArrayList;
import java.util.List;

//Question 448. Find All Numbers Disappeared in an Array
/*
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), 
some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.
Could you do it without extra space and in O(n) runtime? 
You may assume the returned list does not count as extra space.
Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
 */
public class findDisappearedNumbers448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
    	List<Integer> result=new ArrayList<Integer>();
    	int len=nums.length;
    	for(int i=0;i<len;i++){
    		nums[(nums[i]-1)%len]+=len;
    	}
    	for(int i=0;i<len;i++){
    		if(nums[i]<=len){
    			result.add(i+1);
    		}
    	}
    	return result;
    }
    public static void main(String[] args){
    	//int[] nums={2,2,1};
    	int[] nums={4,3,2,7,8,2,3,1};
    	//System.out.println(findDisappearedNumbers(nums));
    	System.out.println(findDisappearedNumbers2(nums));
    }
    
    //study the solution of other people
    //example1:原理是一样的，只是一个用的是绝对值，一个用的是取余
    public static List<Integer> findDisappearedNumbers2(int[] nums) {
    	List<Integer> result=new ArrayList<Integer>();
    	int len=nums.length;
    	for(int i=0;i<len;i++){
    		nums[Math.abs(nums[i])-1]=-Math.abs(nums[Math.abs(nums[i])-1]);
    	}
    	for(int i=0;i<len;i++){
    		if(nums[i]>0){
    			result.add(i+1);
    		}
    	}
    	return result;
    }
    
    
    
}
