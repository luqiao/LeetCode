package day20170206;
//LeetCode:367. Valid Perfect Square
/*
 Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:
Input: 16
Returns: True
Example 2:
Input: 14
Returns: False
 */
public class isPerfectSquare367 {
    public static boolean isPerfectSquare(int num) {
        for(int i=1;i<=num/2+1;i++){
        	if(i*i==num)
        		return true;
        	else if(i*i>num)
        		return false;
        }
        return false;
    }
    //study1   1+3+5+...+(2n-1)=n^2
    public static boolean isPerfectSquare2(int num){
    	for(int i=1;num>0;i+=2){
    		num-=i;
    	}
    	return num==0;
    }
    //study2 binary search
    public static boolean isPerfectSquare3(int num){
    	int left=1,right=num;
    	if(num<1)
    		return false;
    	while(left<=right){
    		int mid=left+(right-left)/2;
    		if(mid*mid==num){
    			return true;
    		}
    		else if(mid*mid>num){
    			right=mid-1;
    		}else{
    			left=mid+1;
    		}
    	}
    	return false;
    }
    //Newton Method 
    public static boolean isPerfectSquare4(int num){
    	if(num<0)
    		return false;
    	int n=num/2;
    	while(n*n>num){
    		n=(n+num/n)/2;
    	}
    	return n*n==num;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPerfectSquare(16));
		System.out.println(isPerfectSquare(11));
		System.out.println(isPerfectSquare(1));
		
		System.out.println(isPerfectSquare2(16));
		System.out.println(isPerfectSquare2(11));
		System.out.println(isPerfectSquare2(1));

		System.out.println(isPerfectSquare3(16));
		System.out.println(isPerfectSquare3(11));
		System.out.println(isPerfectSquare3(1));

	}

}
