package HashTable;

import java.util.HashMap;

/*
 Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern 
and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 */
public class wordPattern290 {
    public static boolean wordPattern(String pattern, String str) {
        String[] strs=str.split(" ");
        int len=pattern.length();
        char[] chs=pattern.toCharArray();
        if(strs.length!=len){
        	return false;
        }else{
        	HashMap hm=new HashMap();
        	for(int i=0;i<len;i++){
        		if(hm.get(chs[i])==null){
        			if(hm.containsValue(strs[i])){
        				return false;
        			}else{
        				hm.put(chs[i], strs[i]);
        			}
        		}else{
        			if(((String)(hm.get(chs[i]))).compareTo(strs[i])!=0)
        				return false;
        		}
        	}
        	return true;	
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern1 = "abba", str1 = "dog cat cat dog";
		String pattern2 = "abba", str2 = "dog cat cat fish";
		String pattern3 = "aaaa", str3 = "dog cat cat dog";
		String pattern4 = "abba", str4 = "dog dog dog dog";
		System.out.println(wordPattern(pattern1,str1));
		System.out.println(wordPattern(pattern2,str2));
		System.out.println(wordPattern(pattern3,str3));
		System.out.println(wordPattern(pattern4,str4));
	}

}
