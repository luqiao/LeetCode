package Array;
/*
Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.
 */
public class removeElement27 {
    public static int removeElement(int[] nums, int val) {
    	int N=nums.length;
    	int num=0;
        for(int i=N-1;i>=0;i--){
        	if(nums[i]==val){
        		nums[i]=nums[N-num-1];
        		num++;
        	}
        }
        return N-num;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] nums={3,2,2,3};
		//int len=removeElement(nums,3);
		int[] nums={1};
		int len=removeElement(nums,1);
		for(int i=0;i<len;i++){
			System.out.print(nums[i]+" ");
		}
		
	}

}
