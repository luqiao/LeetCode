package day20170204;

import java.util.HashMap;
import java.util.Map;

//LeetCode:167. Two Sum II - Input array is sorted
/*
 Given an array of integers that is already sorted in ascending order,
 find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, 
where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
 */
public class twoSum167 {
    public static int[] twoSum(int[] numbers, int target) {
        Map map=new HashMap(); 
        int index1=0,index2=0;
    	for(int i=0;i<numbers.length;i++){
    		if(map.get(numbers[i])!=null){
				index1=(int)map.get(numbers[i])+1;
				index2=i+1;
			}else{
				map.put(target-numbers[i], i);
			}
    	}
    	return new int[]{index1,index2};
    }
    //study 不占用多余的空间
    public static int[] twoSum2(int[] numbers,int target){
    	int left=0,right=numbers.length-1;
    	while(left<right){
    		int sum=numbers[left]+numbers[right];
    		if(sum==target) break;
    		else if(sum>target) right--;
    		else left++;
    	}
    	return new int[]{left+1,right+1};
    	
    		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={2,7,13,15};
		System.out.println(twoSum(numbers,9)[0]+" and "+twoSum(numbers,9)[1]);
		System.out.println(twoSum2(numbers,9)[0]+" and "+twoSum2(numbers,9)[1]);
		int[] numbers2={0,2};
		System.out.println(twoSum(numbers2,2)[0]+" and "+twoSum(numbers2,2)[1]);
		System.out.println(twoSum2(numbers2,2)[0]+" and "+twoSum2(numbers2,2)[1]);
	}

}
