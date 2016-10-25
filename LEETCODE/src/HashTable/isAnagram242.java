package HashTable;

import java.util.HashMap;
import java.util.Map;

/*
 Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
 */
public class isAnagram242 {
    public static boolean isAnagram(String s, String t) {
    	Map<Character,Integer> hm=new HashMap<Character,Integer>();
    	char[] chars=s.toCharArray();
    	char[] chart=t.toCharArray();
    	if(chars.length!=chart.length)
    	    return false;
    	for(int i=0;i<chars.length;i++){
    		if(hm.get(chars[i])==null){
    			hm.put(chars[i], 1);
    		}else{
    			Integer tmp=hm.get(chars[i]);
    			tmp++;
    			hm.put(chars[i],tmp);
    		}
    	}
    	for(int j=0;j<chart.length;j++){
    		if(hm.get(chart[j])==null){
    			return false;
    		}else{
    			Integer tmp=hm.get(chart[j]);
    			if(tmp==1){
    				hm.remove(chart[j]);
    			}else{
    				tmp--;
    				hm.put(chart[j], tmp);
    			}
    		}
    	}
    	return true;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="rat",t1="car";
		String s2="anagram",t2="nagaram";
		System.out.println(isAnagram(s1,t1));
		System.out.println(isAnagram(s2,t2));
		

	}

}
