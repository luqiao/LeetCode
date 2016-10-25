package DynamicProgramming;
/*
 You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public  class climbStairs70 {
    public static int climbStairs(int n) {
        if(n==0)
        	return 1;
        else if(n==1)
        	return 1;
        else
        	return climbStairs(n-1)+climbStairs(n-2); 
    }
    public static int climbStairs2(int n) {
    	int pre=1;
    	int prepre=1;
    	int now=1;
        while(n>1){
        	now=pre+prepre;
        	prepre=pre;
        	pre=now;
        	n--;
        }
        return now;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(3));

	}

}
