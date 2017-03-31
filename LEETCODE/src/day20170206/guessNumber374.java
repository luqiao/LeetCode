package day20170206;
//LeetCode:374. Guess Number Higher or Lower
/*
 We are playing the Guess Game. The game is as follows:
I pick a number from 1 to n. You have to guess which number I picked.
Every time you guess wrong, I'll tell you whether the number is higher or lower.
You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

-1 : My number is lower
 1 : My number is higher
 0 : Congrats! You got it!
Example:
n = 10, I pick 6.

Return 6.
 */
public class guessNumber374 {
	/* The guess API is defined in the parent class GuessGame.
	   @param num, your guess
	   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
	      int guess(int num); */

    public static int guessNumber(int n) {
        if(guess(1)==0)
        	return 1;
        else if(guess(n)==0)
        	return n;
        else{
        	int left=1,right=n,mid;
        	while(left<right){
        		mid=left+(right-left)/2;
        		if(guess(mid)==0)
        			return mid;
        		else if(guess(mid)==1)
        			left=mid+1;
        		else 
        			right=mid-1;
        	}
        	return left;
        }
    }
    public static int guess(int n){
    	int num=1702766719;
    	//int num=6;
    	if(n==num)
    		return 0;
    	else if(n<num)
    		return 1;
    	else
    		return -1;
    }
    //竟然超时，然后就自己写了个guess测试，把mid=(left+right)/2换成mid=left+(right-left)/2 
    //当数值太大，mid就会溢出，然后while语句就死循环了，所以就报超时的错了
    //题目看了老半天才知道啥意思，也是醉了，guessNumber传入的参数是范围，我们只负责猜，返回的是猜中的数，guess会告诉我们猜的对不对，所以我们的程序要完成的就是猜的这个过程，如何遍历数
    
    //study  用(l & r) + ((l ^ r) >> 1)替换left+(right-left)/2 ，表示不能理解啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(guessNumber(10));
		System.out.println(guessNumber(2126753390));
	}

}
