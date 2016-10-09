package Array;
/*
 Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. 
The number of elements initialized in nums1 and nums2 are m and n respectively.
 */

//nums1与nums2从大到小合并，就不需要另外开辟一段新的空间了。
public class merge88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
    	while(k>=0){
    		if(i>=0&&j>=0){
    			if(nums1[i]>nums2[j]){
    				nums1[k--]=nums1[i--];
    			}else if(nums1[i]<nums2[j]){
    				nums1[k--]=nums2[j--];
    			}else{
    				nums1[k--]=nums1[i--];
    				nums1[k--]=nums2[j--];
    			}
    		}else if(i>=0){
    			nums1[k--]=nums1[i--];
    		}else if(j>=0){
    			nums1[k--]=nums2[j--];
    		}
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1=new int[6];
		//nums1[0]=1;
		//nums1[1]=2;
		//nums1[2]=3;
		//int[] nums2={1,2,3};
		//int[] nums2={1,1,3};
		//int[] nums22={3,4};
		int[] nums222={1};
		//merge(nums1,3,nums2,3);
		//merge(nums1,3,nums22,2);
		merge(nums1,0,nums222,1);
		for (int i=0;i<nums1.length;i++){
			System.out.print(nums1[i]+" ");
		}

	}

}