package BitManipulation;
/*
Write a function that takes an unsigned integer and returns the number of ¡¯1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ¡¯11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 */
public class hammingWeight191 {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
    	int count=0;
        while(n!=0){
        	count+=n&1;
        	n=n>>>1;
        }
        return count;
    }

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingWeight(1));
		 // 2147483648 (10000000000000000000000000000000)
		System.out.println(hammingWeight(-2147483648));

	}

}
