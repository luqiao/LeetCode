package BinarySearch;

public class guessNumber374 {
    public static int guessNumber(int n) {
        long count=9;
        int index=1;
        while(n>count*index){
        	n-=count*index;
        	count*=10;
        	index+=1;
        }
        return String.valueOf((n/index+count/9)).charAt((n-1)%index)-'0';        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(guessNumber(10));
		System.out.println(guessNumber(11));
		System.out.println(guessNumber(12));
		System.out.println(guessNumber(13));
		System.out.println(guessNumber(2147483647));

	}

}
