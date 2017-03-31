package day20170206;
//LeetCode:441. Arranging Coins
/*
 You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.
Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.

Example 1:

n = 5

The coins can form the following rows:
¤
¤ ¤
¤ ¤

Because the 3rd row is incomplete, we return 2.
Example 2:

n = 8

The coins can form the following rows:
¤
¤ ¤
¤ ¤ ¤
¤ ¤

Because the 4th row is incomplete, we return 3.
Subscribe to see which companies asked this question.
 */
public class arrangeCoins441 {
    public static int arrangeCoins(int n) {
    	int i=1;
    	for(;n>=i;i++){
    		n=n-i;
    	}
    	return i-1;
    }
    //study (k+1)k<=2n--> 4k^2+4k+1<=8n+1--> (2k+1)^2<=8n+1
    public static int arrangeCoins2(int n){
    	return (int)((Math.sqrt(8.0*n+1)-1)/2);
    }
    //study left right   mid*mid是一个很大的数，0.5要放在前面  left=0和left=1无差
    public static int arrangeCoins3(int n){
    	int left=1,right=n;
    	int mid=0;
    	while(left<=right){
    		mid=(left+right)/2;
    		if(0.5*mid*(mid+1)>n)
    			right=mid-1;
    		else
    			left=mid+1;
    	}
    	return left-1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(arrangeCoins(1));
		System.out.println(arrangeCoins(3));
		System.out.println(arrangeCoins(4));
		System.out.println(arrangeCoins(5));
		System.out.println(arrangeCoins(6));
		System.out.println(arrangeCoins(7));
		System.out.println(arrangeCoins(8));
		System.out.println(arrangeCoins(1804289383));
		
		System.out.println(arrangeCoins2(1));
		System.out.println(arrangeCoins2(3));
		System.out.println(arrangeCoins2(4));
		System.out.println(arrangeCoins2(5));
		System.out.println(arrangeCoins2(6));
		System.out.println(arrangeCoins2(7));
		System.out.println(arrangeCoins2(8));
		System.out.println(arrangeCoins2(1804289383));
		
		System.out.println(arrangeCoins3(1));
		System.out.println(arrangeCoins3(3));
		System.out.println(arrangeCoins3(4));
		System.out.println(arrangeCoins3(5));
		System.out.println(arrangeCoins3(6));
		System.out.println(arrangeCoins3(7));
		System.out.println(arrangeCoins3(8));

		System.out.println(arrangeCoins3(1804289383));
	}

}
