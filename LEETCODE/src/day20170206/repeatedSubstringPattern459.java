package day20170206;
//LeetCode:459. Repeated Substring Pattern
/*
 Given a non-empty string check if it can be constructed by taking a substring of it 
 and appending multiple copies of the substring together.
 You may assume the given string consists of lowercase English letters only 
 and its length will not exceed 10000.

Example 1:
Input: "abab"
Output: True
Explanation: It's the substring "ab" twice.

Example 2:
Input: "aba"
Output: False

Example 3:
Input: "abcabcabcabc"
Output: True

Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
 */
public class repeatedSubstringPattern459 {
    public static boolean repeatedSubstringPattern(String str) {
    	int len=str.length();
    	for(int i=0;i<len/2;i++){
    		if(len%(i+1)==0){
    			String subStr=str.substring(0, i+1);
    			StringBuilder sb=new StringBuilder();
    			for(int j=0;j<len/(i+1);j++)
    				sb.append(subStr);
    			if(sb.toString().equals(str))
    				return true;
    		}
    	}
    	return false;
    }
    //study  abab-->abababab-->bababa去掉了一头一尾，如果是copy的，就是每一个copy向前移了一下
    public static boolean repeatedSubstringPattern2(String str){
    	String s=str+str;
    	return s.substring(1,s.length()-1).contains(str);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repeatedSubstringPattern("abab"));
		System.out.println(repeatedSubstringPattern("aba"));
		System.out.println(repeatedSubstringPattern("abcabcabcabc"));
		System.out.println(repeatedSubstringPattern("abaababaab"));
		System.out.println(repeatedSubstringPattern("ababab"));
		System.out.println(repeatedSubstringPattern("aaaaaaaaaaaaa"));
		System.out.println(repeatedSubstringPattern2("abab"));
		System.out.println(repeatedSubstringPattern2("aba"));
		System.out.println(repeatedSubstringPattern2("abcabcabcabc"));
		System.out.println(repeatedSubstringPattern2("abaababaab"));
		System.out.println(repeatedSubstringPattern2("ababab"));
		System.out.println(repeatedSubstringPattern2("aaaaaaaaaaaaa"));
	}

}
