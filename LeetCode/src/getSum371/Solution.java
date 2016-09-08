package getSum371;
//Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
public class Solution {
    public static int getSum(int a, int b) {
    	if (a<0&b<0){
    		return ~(getSum((~a+1),(~b+1)))+1;
    	}
        int sum=a^b;
        int cont=a&b;
        while(cont>=1){
        	int tmp=sum;
        	cont=cont<<1;
        	sum=sum^cont;
        	cont=tmp&cont;
        }
        return sum;
    }
    public static void main(String[] args){
    	int a=-4;
    	int b=-4;
    	System.out.println(getSum(a,b));
    }
}