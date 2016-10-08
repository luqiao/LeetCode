package findTheDifference389;
//Given two strings s and t which consist of only lowercase letters.
//String t is generated by random shuffling string s and then add one more letter at a random position.
//Find the letter that was added in t.
public class Solution {
    public static char findTheDifference(String s, String t) {
        char result=0;
        String str=s+t;
        for (int i=0;i<str.length();i++){
        	result^=str.charAt(i);
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdef";
		String t="fedcbah";
		System.out.println(findTheDifference(s,t));
	}

}