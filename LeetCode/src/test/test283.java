package test;

public class test283 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={0,2,1,3,0};
		moveZeroes(nums);
		for(int k:nums){
			System.out.println(k);
		}
		
	}
	
	/**
	 * @author luluqiao
	 * @version 1.0
	 */
public static void moveZeroes(int[] nums) {
    int j=0;   
	for(int i=0;i<nums.length;i++){
		if(nums[i]!=0){
			nums[j++]=nums[i];
		}
	}
	for(;j<nums.length;j++)
		nums[j]=0;
    }

}
