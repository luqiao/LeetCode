package day20170204;
//LeetCode:35. Search Insert Position
/*
 Given a sorted array and a target value, return the index if the target is found. 
 If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 ¡ú 2
[1,3,5,6], 2 ¡ú 1
[1,3,5,6], 7 ¡ú 4
[1,3,5,6], 0 ¡ú 0
 */
public class searchInsert35 {
    public static int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
        	if(nums[i]>=target)
        		return i;
        }
        return nums.length;
    }
    //study Ð´µÄ¿Ä¿Ä°Í°ÍµÄ
    public static int searchInsert2(int[] nums,int target){
    	int left=0,right=nums.length;
    	while(left<right){
    		int mid=(left+right)/2;
    		if(nums[mid]==target) 
    			return mid;
    		else if(nums[mid]<target)
    			left=mid+1;
    		else
    			right=mid;
    	}
    	return left;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,3,5,6};
		System.out.println(searchInsert(nums,5));
		System.out.println(searchInsert(nums,2));
		System.out.println(searchInsert(nums,7));
		System.out.println(searchInsert(nums,0));
		
		
		System.out.println(searchInsert2(nums,5));
		System.out.println(searchInsert2(nums,2));
		System.out.println(searchInsert2(nums,7));
		System.out.println(searchInsert2(nums,0));
	}

}
