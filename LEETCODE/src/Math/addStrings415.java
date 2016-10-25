package Math;
/*
 Given two non-negative numbers num1 and num2 represented as string, 
 return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class addStrings415 {
    public static String addStrings(String num1, String num2) {
    	StringBuilder sb=new StringBuilder();
    	int carry=0;
    	int len1=num1.length();
    	int len2=num2.length();
    	int i=0;
    	for(;i<len1&&i<len2;i++){
    		int sum=num1.charAt(len1-1-i)-'0'+num2.charAt(len2-1-i)-'0'+carry;
    		if(sum>9)
    			carry=1;
    		else
    			carry=0;
    		sb.append(sum%10);
    	}
    	for(;i<len1;i++){
    		int sum=num1.charAt(len1-1-i)-'0'+carry;
    		if(sum>9)
    			carry=1;
    		else
    			carry=0;
    		sb.append(sum%10);
    	}
    	for(;i<len2;i++){
    		int sum=num2.charAt(len2-1-i)-'0'+carry;
    		if(sum>9)
    			carry=1;
    		else
    			carry=0;
    		sb.append(sum%10);
    	}
    	if(carry==1)
    		sb.append(carry);
    	
        return sb.reverse().toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addStrings("123","999"));

	}

}
