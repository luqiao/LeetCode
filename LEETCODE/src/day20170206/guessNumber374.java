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
    //��Ȼ��ʱ��Ȼ����Լ�д�˸�guess���ԣ���mid=(left+right)/2����mid=left+(right-left)/2 
    //����ֵ̫��mid�ͻ������Ȼ��while������ѭ���ˣ����Ծͱ���ʱ�Ĵ���
    //��Ŀ�����ϰ����֪��ɶ��˼��Ҳ�����ˣ�guessNumber����Ĳ����Ƿ�Χ������ֻ����£����ص��ǲ��е�����guess��������ǲµĶԲ��ԣ��������ǵĳ���Ҫ��ɵľ��ǲµ�������̣���α�����
    
    //study  ��(l & r) + ((l ^ r) >> 1)�滻left+(right-left)/2 ����ʾ������Ⱑ����������������������������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(guessNumber(10));
		System.out.println(guessNumber(2126753390));
	}

}
