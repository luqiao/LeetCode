package test;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverse2(-214));
	}

public static int reverse(int x) {
		
	 
	Integer i=x;
		if(x>Integer.MAX_VALUE||x<=Integer.MIN_VALUE){
			   return 0;
		   }
	  boolean flag=true;
	   if(x==0){
		   return 0;
	   }

	   else if(i<0){
	    	flag=false;
	    	i=-i;
	    }
	   StringBuilder sb=new StringBuilder();
	   while(i>0){
		   sb.append(i%10);
		   i=i/10;
	   }
	   String s=sb.toString();
	   long out=Long.parseLong(s);
	   if(out>Integer.MAX_VALUE||-out<Integer.MIN_VALUE){
		   return 0;
	   }
	   if(flag==false){
		   out=-out;
	   }
	   return (int)out;
	   
	}
//+-号不用考虑，要考虑溢出
public static int reverse2(int x) {
    long result = 0;
    while (x != 0) {
        result = result * 10 + x%10;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        x = x / 10;
    }
    return (int)result;
}
public static int reverse3(int x) {
    if (x == 0)
        return 0;
    int sign = 1;
    if (x < 0)
        sign = -1;
    long number = Math.abs((long) x), sum = 0;
    while (number != 0) {
        sum = sum * 10 + number % 10;
        number = number / 10;
    }
    if ((sign==1 && sum > Integer.MAX_VALUE) ||( sign ==-1 )&&(-1*sum < Integer.MIN_VALUE))
        return 0;
    return sign * (int) sum;
}
	
	
}


