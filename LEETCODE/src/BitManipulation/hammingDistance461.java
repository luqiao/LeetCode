package BitManipulation;
//Question 461. Hamming Distance
/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, calculate the Hamming distance.
Note:
0 ≤ x, y < 231.
Example:
Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.
 */
public class hammingDistance461 {
    public static int hammingDistance(int x, int y) {
        int count=0;
    	while(x>0|y>0){
        	count+=(x&1)^(y&1);
        	x=x>>1;
        	y=y>>1;
        }
    	return count;
    }
    //test
    public static void main(String[] args){
    	int x=1;
    	int y=4;
    	System.out.println(hammingDistance(x,y));
    }
    
    //study the solution of other people
    //example1:use Integer.bitCount
    public static int hammingDistance1(int x, int y) {
    	return Integer.bitCount(x ^ y);
    }
    //example2:xor = (xor) & (xor-1)
    //4(100),1(001)->101&100=100->100&011=000
    //1000001001这样中间的0可以一步直接跳过，机智！
    public int hammingDistance2(int x, int y) {
        int count = 0;
        for(int xor = x^y; xor != 0; xor = (xor) & (xor-1)) count++;
        return count;
    }
}
