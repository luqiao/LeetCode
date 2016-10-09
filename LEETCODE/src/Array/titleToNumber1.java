package Array;

/*
    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
 */
public class titleToNumber1 {
    public static int titleToNumber(String s) {
        char[] chr=s.toCharArray();
        int result=0;
        for (int i=0;i<chr.length;i++)
        	result=result*26+(chr[i]-'A')+1;

        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(titleToNumber("A"));
		System.out.println(titleToNumber("Z"));
		System.out.println(titleToNumber("AA"));
		System.out.println(titleToNumber("AB"));
		System.out.println(titleToNumber("AZ"));
	}

}
