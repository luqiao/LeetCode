package day20170207;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//LeetCode:438. Find All Anagrams in a String
/*
Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:

Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
 */
public class findAnagrams438 {
	//当输入字符串很长时，会超时
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<Integer>();
        Map pmap=new HashMap();
        int len=p.length();
        for(int i=0;i<len;i++){
        	pmap.put(p.charAt(i), (Integer)(pmap.getOrDefault(p.charAt(i), 0))+1);
        }
        for(int j=0;j<=s.length()-len;j++){
        	HashMap pmapcopy=new HashMap(pmap);
        	if ((Integer)(pmapcopy.getOrDefault(s.charAt(j), 0))!=0){
        		boolean flag=true;
        		pmapcopy.put(s.charAt(j), (Integer)(pmapcopy.getOrDefault(s.charAt(j), 0))-1);
        		for(int k=j+1;k<j+len;k++){
        			if ((Integer)(pmapcopy.getOrDefault(s.charAt(k), 0))==0){
        				flag=false;
        				break;
        			}else{
        				pmapcopy.put(s.charAt(k), (Integer)(pmapcopy.getOrDefault(s.charAt(k), 0))-1);
        			}
        		}
        		if(flag==true){
        			list.add(j);
        		}
        	}
        	pmapcopy.clear();
        }
        return list;
    }
    //滑动窗的形式
    public static List<Integer> findAnagrams2(String s,String p){
    	List<Integer> list=new ArrayList<Integer>();
    	return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=findAnagrams("abab","ab");
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		List<Integer> list2=findAnagrams("cbaebabacd","abc");
		for(int i=0;i<list2.size();i++){
			System.out.print(list2.get(i)+" ");
		}
	}

}


