package isPalindrome9;
/*
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class Solution {
    public static boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        for(int i=0;i<s.length()/2;i++)
        	if (s.charAt(i)!=s.charAt(s.length()-i-1))
        		return false;
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(12322));
	}

}
