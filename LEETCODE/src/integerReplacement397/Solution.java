package integerReplacement397;
/*
 * Given a positive integer n and you can do operations as follow:

If n is even, replace n with n/2.
If n is odd, you can replace n with either n + 1 or n - 1.
What is the minimum number of replacements needed for n to become 1?
 * 
 */
public class Solution {
    public static int integerReplacement(int n) {
        int count=0;
        long nl=n;
        while(nl>1){
        	if(nl%2==0)
        		nl=nl/2;
        	else if ((nl+1)%4==0&&(nl+1)/4!=1)
        		nl=nl+1;
        	else
        		nl=nl-1;
        	count++;
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(integerReplacement(2147483647));

	}

}
