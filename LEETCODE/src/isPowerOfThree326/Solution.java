package isPowerOfThree326;
/*
 Given an integer, write a function to determine if it is a power of three.
 */
public class Solution {
	/*
	//题目理解错误，理解成3次开方
    public static boolean isPowerOfThree(int n) {
    	if (n==1)
    		return true;
    	else{
    		for(int i=2;i<=Math.sqrt(n);i++){
    			if(n%i==0){
    				n=n/i;
    				if(n%i==0){
    					n=n/i;
    					if (n%i==0){
    						n=n/i;
    						return isPowerOfThree(n);
    					}	
    					else
    						return false;
    				}
    				return false;
    			}
    		}
    		return false;
        }
    }
    */
	public static boolean isPowerOfThree(int n){
		if (n==1)
			return true;
		else if (n==0)
			return false;
		else if (n%3==0){
			n=n/3;
			return isPowerOfThree(n);
		}
		else
			return false;
			
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfThree(-3));
	}

}
