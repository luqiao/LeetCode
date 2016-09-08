package test;

public class test344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(reverseString("hello"));
	 
	}
	public static String reverseString(String s) {
		StringBuilder ss=new StringBuilder();
        char[] ch=s.toCharArray();
        for(int i=ch.length;i>0;i--){
           ss.append(ch[i-1]);
        }
        return ss.toString();
        }

}
