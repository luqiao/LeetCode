package HashTable;

import java.util.HashMap;

/*
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. 
No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.
 */
public class isIsomorphic205 {
    public static boolean isIsomorphic(String s, String t) {
        int len=s.length();
        if(t.length()!=len){
        	return false;
        }else{
        	HashMap hm=new HashMap();
        	char[] sc=s.toCharArray();
        	char[] tc=t.toCharArray();
        	for(int i=0;i<len;i++){
        		if(hm.get(sc[i])==null){
        			if(hm.containsValue(tc[i]))
        				return false;
        			hm.put(sc[i], tc[i]);
        		}else{
        			if(hm.get(sc[i])!=(Character)tc[i]){
        				return false;
        			}
        		}
        	}
        	return true;
        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="",t1="";
		String s2="egg",t2="add";
		String s3="paper",t3="title";
		String s4="foo",t4="bar";
		String s5="ab",t5="aa";
		System.out.println(isIsomorphic(s1,t1));
		System.out.println(isIsomorphic(s2,t2));
		System.out.println(isIsomorphic(s3,t3));
		System.out.println(isIsomorphic(s4,t4));
		System.out.println(isIsomorphic(s5,t5));
	}

}
