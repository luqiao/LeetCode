package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Given a string, determine if it is a palindrome, 
considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
 */
public class isPalindrome125 {
    public static boolean isPalindrome(String s) {
        String regEx="[^a-zA-Z0-9]";
        Pattern p=Pattern.compile(regEx);
        Matcher m=p.matcher(s);
        String str=m.replaceAll("").trim().toLowerCase();
        int N=str.length();
        for(int i=0;i<N/2;i++){
        	if(str.charAt(i)!=(str.charAt(N-i-1)))
        		return false;
        }
        return true;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="";
		String s2="a";
		String s3=" ";
		String s4="A man, a plan, a canal: Panama";
		String s5="race a car";
		String s6="121";
		System.out.println(isPalindrome(s1));
		System.out.println(isPalindrome(s2));
		System.out.println(isPalindrome(s3));
		System.out.println(isPalindrome(s4));
		System.out.println(isPalindrome(s5));
		System.out.println(isPalindrome(s6));
	}

}
