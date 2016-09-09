package plusOne66;
/*
	Given a non-negative number represented as an array of digits, plus one to the number.
	The digits are stored such that the most significant digit is at the head of the list. 
 */
public class Solution {

    public static int[] plusOne(int[] digits) {
        int index=digits.length-1;
        digits[index]=digits[index]+1;
        while(digits[index]>=10&&index>0){
        	digits[index]=digits[index]%10;
        	index--;
        	digits[index]=digits[index]+1;
        }
        if (digits[0]>9)
        {
        	digits[0]=digits[0]%10;
        	int[] result=new int[digits.length+1];
        	result[0]=1;
        	for (int i=0;i<digits.length;i++){
        		result[i+1]=digits[i];
        	}
        	return result;
        }
        return digits;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] digits={9,9,9,9};
		//System.out.println(plusOne(digits).toString());
	}

}
