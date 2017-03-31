package day20170207;
//LeetCode:69. Sqrt(x)
/*
Implement int sqrt(int x).
Compute and return the square root of x.
 */
public class mySqrt69 {
    public static int mySqrt(int x) {
    	int i=-1;
        while(x>=0){
        	i=i+2;
        	x-=i;
        }
        return (i+1)/2-1;
    }
    //study newton method
    public static int mySqrt2(int x){
    	int i=x;
    	while(i*i>x){
    		i=(i+x/i)/2;
    	}
    	return (int)i;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(0));
		System.out.println(mySqrt(1));
		System.out.println(mySqrt(4));
		System.out.println(mySqrt(5));
		
		System.out.println(mySqrt2(0));
		System.out.println(mySqrt2(1));
		System.out.println(mySqrt2(4));
		System.out.println(mySqrt2(5));
	}

}
