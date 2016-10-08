package Array;
/*
 Given an array of integers A and let n to be its length.

Assume Bk to be an array obtained by rotating the array A k positions clock-wise, we define a "rotation function" F on A as follow:

F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1].

Calculate the maximum value of F(0), F(1), ..., F(n-1).

Note:
n is guaranteed to be less than 105.

Example:

A = [4, 3, 2, 6]

F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26

So the maximum value of F(0), F(1), F(2), F(3) is F(3) = 26.
 */
public class maxRotateFunction396 {
	//当输入数组比较大的时候会超时
	//发现原来F(i)可以建立在F(i-1)的基础上得到,即下面表达式中的    results[i]=results[i-1]+sum-N*A[N-i];
    public static int maxRotateFunction(int[] A) {
        int N=A.length;
        if(N==0)
        	return 0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
        	int sum=0;
        	for(int j=0;j<N;j++){
        		sum+=((i+j)%N)*A[j];
        		
        	}
        	if(sum>max)
        		max=sum;
        }
        return max;
    }
    public static int maxRotateFunction2(int[] A){
    	int N=A.length;
    	if(N==0)
    		return 0;
    	int max=0;
    	int[] results=new int[N];
    	int sum=0;
    	for(int i=0;i<N;i++){
    		sum+=A[i];
    		results[0]+=i*A[i];
    	}
    	max=results[0];
    	for(int i=1;i<N;i++){
    		results[i]=results[i-1]+sum-N*A[N-i];
    		if(max<results[i]){
    			max=results[i];
    		}
    	}
    	return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={4,3,2,6};
		int[] B={1};
		int[] C={-1,-2};
		int[] D={};
		System.out.println(maxRotateFunction(A));
		System.out.println(maxRotateFunction(B));
		System.out.println(maxRotateFunction(C));
		System.out.println(maxRotateFunction(D));
		System.out.println(maxRotateFunction2(A));
		System.out.println(maxRotateFunction2(B));
		System.out.println(maxRotateFunction2(C));
		System.out.println(maxRotateFunction2(D));

	}

}
