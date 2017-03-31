package day20170207;
//LeetCode:414. Third Maximum Number
/*
Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.
Example 2:
Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:
Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
 */
public class thirdMax414 {
    public static int thirdMax(int[] nums) {
        Integer first=null,second=null,third=null;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]>first){
        		third=second;
        		second=first;
        		first=nums[i];
        	}else if(nums[i]<first&&nums[i]>second){
        		third=second;
        		second=nums[i];
        	}else if(nums[i]<second&&nums[i]>=third){
        		third=nums[i];
        	}
        }
        if(third==null)
        	return first;
        else
        	return third;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={3,2,1};
		int[] nums2={1,2};
		int[] nums3={2,2,3,1};
		int[] nums4={2,2,3,2};
		int[] nums5={1,2,-2147483648};
		int[] nums6={1,-2147483648,-2147483648};
		int[] nums7={1,-2147483648,2};
		System.out.println(thirdMax(nums));
		System.out.println(thirdMax(nums2));
		System.out.println(thirdMax(nums3));
		System.out.println(thirdMax(nums4));
		System.out.println(thirdMax(nums5));
		System.out.println(thirdMax(nums6));
		System.out.println(thirdMax(nums7));
	}

}
