package Array;

public class maxProfit122 {
	
/*
 Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. 
You may complete as many transactions as you like 
(ie, buy one and sell one share of the stock multiple times). 
However, you may not engage in multiple transactions at the same time 
(ie, you must sell the stock before you buy again).
 */
    public  static int maxProfit(int[] prices) {
    	int max=0;
        for(int i=0;i<prices.length;i++){
        	int sum=0;
        	for(int j=i+1;j<prices.length;j++){
        		if(prices[j]>prices[i])
        			sum+=prices[j]-prices[i];
        	}
        	if (sum>max)
        		max=sum;
        }
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices={};
		int[] prices2={1,2,4};
		System.out.println(maxProfit(prices));
		System.out.println(maxProfit(prices2));
	}

}
