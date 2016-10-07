package Array;
/*
 Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */
public class rotate189 {
    public static void rotate(int[] nums, int k) {
        int len=nums.length;
        k=k%len;
        int[] numss=new int[len];
        int index=-1;
        for(int i=len-k;i<len;i++){
        	numss[++index]=nums[i];
        }
        for(int i=0;i<len-k;i++){
        	numss[++index]=nums[i];
        }
        for(int i=0;i<len;i++){
        	nums[i]=numss[i];
        }
    }
    public static void showArray(int[] array){
    	for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] array={1,2,3,4,5,6,7};
		int[] array={1};
		//int[] array={1,2};
		showArray(array);
		rotate(array,1);
		showArray(array);
	}

}
