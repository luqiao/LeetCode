package BitManipulation;

public class isPowerOfFour342 {
    public static boolean isPowerOfFour(int num) {
        long current=1;
    	while(current<=num){
    		if(current==num)
    			return true;
    		current=current<<2;
    		
    	}
    	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfFour(16));
		System.out.println(isPowerOfFour(1162261466));

	}

}
