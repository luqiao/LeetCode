package day20170204;
//LeetCode:453. Minimum Moves to Equal Array Elements
/*
Given a non-empty integer array of size n, find the minimum number of moves required to make all array 
elements equal, where a move is incrementing n - 1 elements by 1.

Example:
Input:
[1,2,3]
Output:
3
Explanation:
Only three moves are needed (remember each move increments two elements):
[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
*/
public class minMoves453 {
    public static int minMoves(int[] nums) {
    	int min=nums[0];
    	int sum=0;
        for(int i=1;i<nums.length;i++){
        	if(nums[i]<min)
        		min=nums[i];
        }
        for(int i=0;i<nums.length;i++){
        	sum+=nums[i]-min;
        }
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,3};
		int[] nums2={1,2,4,6};
		System.out.println(minMoves(nums));
		System.out.println(minMoves(nums2));
	}

}
