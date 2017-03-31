package day20170207;
//LeetCode:190. Reverse Bits
/*
Reverse bits of a given 32 bits unsigned integer.
For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), 
return 964176192 (represented in binary as 00111001011110000010100101000000).

Follow up:
If this function is called many times, how would you optimize it?
Related problem: Reverse Integer
 */
public class reverseBits190 {
	//纠结unsigned纠结了很久，最后实在不知道题目几个意思就随便写了
    public static int reverseBits(int n) {
    	int reverse=0;
    	for(int i=0;i<32;i++){
    		reverse=(reverse<<1)+(n&1);
    		n=n>>1;
    	}
    	return (int)reverse;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseBits(43261596));
		System.out.println(reverseBits(1));
		System.out.println(reverseBits(2147483647));
	}

}
