package String;

/*
 Given two binary strings, return their sum (also a binary string).
For example,
a = "11"
b = "1"
Return "100".
 */
public class addBinary67 {
    public static String addBinary(String a, String b) {
    	//ensure a.length()<=b.length()
    	if (a.length()>b.length())
    		return addBinary(b,a);
    	char[] chara=a.toCharArray();
    	char[] charb=b.toCharArray();
    	int lena=chara.length;
    	int lenb=charb.length;
    	StringBuilder sb=new StringBuilder();
    	int carry=0;
    	//add the same length numbers
    	for (int i=0;i<lena;i++){
    		int inta=chara[lena-1-i]-'0';
    		int intb=charb[lenb-1-i]-'0';
    		sb.append(inta^intb^carry);
    		carry=(inta&intb)|((inta^intb)&carry);
    	}
    	//add the longer length numbers
    	for (int i=lenb-lena-1;i>=0;i--){
    		int intb=charb[i]-'0';
    		sb.append(intb^carry);
    		carry=intb&carry;
    	}
    	//judge the first bit
    	if(carry>0)
    		sb.append(carry);
    	return sb.reverse().toString();
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		String b="110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
		//String a="101";
		//String b="10111";
		System.out.println(addBinary(a,b));
		//110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000
		

	}

}
