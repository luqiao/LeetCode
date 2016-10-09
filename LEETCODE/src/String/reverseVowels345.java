package String;

/*
 Write a function that takes a string as input and reverse only the vowels of a string.
Example 1:
Given s = "hello", return "holle".
Example 2:
Given s = "leetcode", return "leotcede".
 */

import java.util.Arrays;
import java.util.List;

/*
vowel: a e i o u
 */
public class reverseVowels345 {
    public static String reverseVowels(String s) {
    	char[] chs=s.toCharArray();
    	Character[] vowel={'a','e','i','o','u','A','E','I','O','U'};
    	List vl=Arrays.asList(vowel);
        int left=0;
        int right=chs.length-1;
        while(left<right){
        	if (vl.contains(chs[left])&&vl.contains(chs[right])){
        		char tmp=chs[left];
        		chs[left]=chs[right];
        		chs[right]=tmp;
        		left++;
        		right--;
        	}else if(vl.contains(chs[left])){
        		right--;
        	}else if(vl.contains(chs[right])){
        		left++;
        	}else{
        		left++;
        		right--;
        	}
        }
        return String.valueOf(chs);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="hello";
		String s="aA";
		System.out.println(reverseVowels(s));
	}

}
