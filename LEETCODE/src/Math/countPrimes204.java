package Math;

/*
 * Description:
 * Count the number of prime numbers less than a non-negative number, n.
 */
public class countPrimes204 {
	//Time Limit Exceeded
	/*
    public static int countPrimes(int n) {
    	int number=0;
        for (int i=0;i<n;i++)
        	if(IsPrime(i)==true)
        		number++;
        return number;
    }
	 public static boolean IsPrime(int n){
	       if (n <= 3) 
	            return n > 1;
	       else if (n%2==0||n%3==0)
	    	   return false;
	       else{
	    	   for(int i=2;i<=Math.sqrt(n);i++){
		           if(n%i == 0)
		               return false;
		       }
	       }
	       return true;
	   }
	  */
	
    public static int countPrimes(int n) {
    	//boolean default is false
    	boolean[] IsPrime=new boolean[n];
    	int numPrime=0;
    	for (int i=2;i<n;i++){
    		if (IsPrime[i-1]==false){
    			numPrime++;
    		    for(int j=2;i*j<n;j++)
    		    	IsPrime[i*j-1]=true;
    		}
    	}
    	return numPrime;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countPrimes(15000000));
		boolean[] IsPrime=new boolean[2];
		System.out.println(IsPrime[0]);
	}
	//reference
    public int countPrimes2(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        return count;
    }
}
