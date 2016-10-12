package String;
/*
 Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.
 */
public  class lengthOfLastWord58 {
    public static int lengthOfLastWord(String s) {
        String[] strs=s.split(" ");
        int N=strs.length;
        if(N==0)
        	return 0;
        else
        	return strs[N-1].length();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="World";
		String s2="Hello World";
		String s3="";
		String s4=" ";
		String s5="Hello World";
		System.out.println(lengthOfLastWord(s1));
		System.out.println(lengthOfLastWord(s2));
		System.out.println(lengthOfLastWord(s3));
		System.out.println(lengthOfLastWord(s4));
		System.out.println(lengthOfLastWord(s5));
		
	}

}
