package HashTable;

import java.util.HashSet;
import java.util.Set;

/*
 Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
public class longestPalindrome409 {
    public static int longestPalindrome(String s) {
        Set hs=new HashSet();
        char[] chars=s.toCharArray();
        int count=0;
        for(int i=0;i<chars.length;i++){
        	if(hs.add(chars[i])==false){
        		hs.remove(chars[i]);
        		count+=2;
        	}
        }
        if(hs.isEmpty()==false){
        	count++;
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abccccdd";
		System.out.println(longestPalindrome(s));

	}

}
