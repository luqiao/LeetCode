package myAtoi8;
/*
 * Implement atoi to convert a string to an integer.
Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
Update (2015-02-10):
The signature of the C++ function had been updated. If you still see your function signature accepts a const char * argument, please click the reload button  to reset your code definition.
*/

public class Solution {
    public static int myAtoi(String str) {
    	StringBuilder sb=new StringBuilder();
    	int flag=0;
    	if(str.length()==0)
    		return 0;
    	else{
    		for(int i=0;i<str.length();i++){
    			if(str.charAt(i)<'0'||str.charAt(i)>'9')
    				if(str.charAt(i)=='0'||str.charAt(i)==' ')
    					if (sb.length()==0)
    						continue;
    					else
    						break;
    				else if (str.charAt(i)=='-')
    					if (flag==0){
    						flag=-1;
    						sb.append('0');
    					}
    					else
    						break;
    				else if (str.charAt(i)=='+')
    					if (flag==0){
    						flag=1;
    						sb.append('0');
    					}
    					else
    						break;
    				else
    					break;
    			else
    				sb.append(str.charAt(i));		
    			}		
    	}
    	if(sb.length()==0)
    		return 0;
    	else if(sb.length()>12)
    		str=sb.substring(sb.length()-12);
    	else
    		str=sb.toString();
    	if (flag==-1)
			str="-"+str;
    	long result=Long.parseLong(str);
    	if (result>2147483647)
    		return 2147483647;
    	else if (result<-2147483648)
    		return -2147483648;
    	else
    		return (int)result;
        
    }
    public static void main(String[] args){
    	String str1="";//0
    	String str2="+";//0
    	String str3="              +45555";//45555
    	String str4="              -45555";//-45555
    	String str5="2147483647";//2147483647
    	String str6="2147483648";//2147483647
    	String str7="+-2";//0
    	String str8="-+2";//0
    	String str9="++2";//0
    	String str10="-2147483648";//-2147483648
    	String str11="   - 321";//0
    	String str12="      -11919730356x";//-2147483648
    	String str13="1234567890123456789012345678901234567890";//2147483647
    	System.out.println(myAtoi(str1));
    	System.out.println(myAtoi(str2));
    	System.out.println(myAtoi(str3));
    	System.out.println(myAtoi(str4));
    	System.out.println(myAtoi(str5));
    	System.out.println(myAtoi(str6));
    	System.out.println(myAtoi(str7));
    	System.out.println(myAtoi(str8));
    	System.out.println(myAtoi(str9));
    	System.out.println(myAtoi(str10));
    	System.out.println(myAtoi(str11));
    	System.out.println(myAtoi(str12));
    	System.out.println(myAtoi(str13));


    }
}
