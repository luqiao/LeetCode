package convertToTitle168;
/*
     1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
 */
public class Solution {
    public static String convertToTitle(int n) {
        StringBuilder st=new StringBuilder();
        while(n>26){
        	int tmp=(n-1)%26;
        	n=(n-1)/26;
        	st.append((char)('A'+tmp));
        }
        st.append((char)('A'+n-1));
        return st.reverse().toString();
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToTitle(1));
		System.out.println(convertToTitle(26));
		System.out.println(convertToTitle(27));
		System.out.println(convertToTitle(28));
		System.out.println(convertToTitle(52));
		System.out.println(convertToTitle(703));
		System.out.println(convertToTitle(728));

	}

}
