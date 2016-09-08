package test;

public class test258 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(addDigits(28));
	}
	
    public static int addDigits(int num) {
    	int temp=num;
        while(temp>=10){
        	temp=0;
        	
        	while(num>0){
        		temp=num%10+temp;
        		num=num/10;
        	}
        	num=temp;
        	
        }
        return temp;
    }

    //10^k % 9 = 1
    //a*10^k % 9 = a % 9 
    public int addDigits2(int num) {
        if (num == 0){
            return 0;
        }
        if (num % 9 == 0){
            return 9;
        }
        else {
            return num % 9;
        }
    }
}
