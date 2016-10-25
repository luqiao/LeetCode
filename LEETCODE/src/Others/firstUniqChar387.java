package Others;

import java.util.HashMap;
import java.util.Map;

/*
 Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
 */
public class firstUniqChar387 {
    public static int firstUniqChar(String s) {
        char[] chars=new char[256];
        for(char ch:s.toCharArray()){
        	chars[(int)ch]++;
        }
        for(int i=0;i<s.length();i++){
        	if(chars[(int)s.charAt(i)]==1)
        		return i;
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqChar("leetcode"));
		System.out.println(firstUniqChar("loveleetcode"));
		System.out.println(firstUniqChar("cc"));
		System.out.println(firstUniqChar("acaadcad"));

	}

}
