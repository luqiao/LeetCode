package Math;

/*
Given an integer n, return the number of trailing zeroes in n!.
Note: Your solution should be in logarithmic time complexity.
 */
public class trailingZeroes172 {
    public static int trailingZeroes(int n) {
    	int count=0;
        while(n>=5){
        	count+=n/5;
        	n=n/5;
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trailingZeroes(100));
	}

}
