package isHappy202;
/*
 * Write an algorithm to determine if a number is "happy".
A happy number is a number defined by the following process: 
Starting with any positive integer, replace the number by the sum of the squares of its digits, 
and repeat the process until the number equals 1 (where it will stay), 
or it loops endlessly in a cycle which does not include 1. 
Those numbers for which this process ends in 1 are happy numbers.
 */

public class Solution {
	/*
	 * solution:
	 * 1
	 * 2-4-16-37-58-89-145-42-20-4
	 * 3-9-81-65-61
	 * 4
	 * 5-25-29-85-89
	 * 6-36-45-41-17-50
	 * 7-49-97-130-10
	 * 8-64-52-29
	 * 9-81-65
	 * so only 1 and 7 is "happy"
	 */
    public static boolean isHappy(int n) {
        while(n/10>0){
        	int sum=0;
        	while(n/10>0){
        		sum+=Math.pow((n%10),2);
        		n=n/10;
        	}
        	sum+=Math.pow(n,2);
        	n=sum;	
        }
        if (n==1||n==7)
        	return true;
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(23456));
	}
}





