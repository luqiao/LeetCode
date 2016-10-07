package Array;
/*
 Given a sorted array, remove the duplicates in place such that each element appear only once 
 and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. 
It doesn't matter what you leave beyond the new length.
 */
public class removeDuplicates26 {
    public static int removeDuplicates(int[] nums) {
    	int count=0;
    	for(int i=1,j=0;i<nums.length;i++){
    		if (nums[i]==nums[i-1]){
    			count++;
    			continue;	
    		}
    		nums[++j]=nums[i];
    	}
    	return nums.length-count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,1,2};
		int len=removeDuplicates(nums);
		System.out.println(len);
		for(int i=0;i<len;i++){
			System.out.print(nums[i]+" ");
		}

	}

}
