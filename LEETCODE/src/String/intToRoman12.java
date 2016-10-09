package String;


import java.util.HashMap;

/*
 Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.
I只能用在V和X左边；
X只能用在L和C左边；
C只能用在D和M左边。

I、V、X、L、C、D、M
 */
public class intToRoman12 {
    public static String intToRoman(int num) {
    	StringBuilder st=new StringBuilder();
    	char[][] map={{'I','V','X'},{'X','L','C'},{'C','D','M'},{'M'}};
        for (int i=1000,j=3;i>=1;num=num%i,i=i/10,j--){
        	int number=num/i;
        	if (number==9){
        		st.append(map[j][0]);
        		st.append(map[j][2]);	
        	}else if(number==4){
        		st.append(map[j][0]);
        		st.append(map[j][1]);
        	}else{
        		if (number>=5){
        			st.append(map[j][1]);
        			number=number-5;
        		}
        		while(number>0){
        			st.append(map[j][0]);
        			number--;
        		}
        		
        	}
        }
        return st.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ⅰ－1、Ⅱ－2、Ⅲ－3、Ⅳ－4、Ⅴ－5、Ⅵ－6、Ⅶ－7、Ⅷ－8、Ⅸ－9
		//Ⅹ－10、Ⅺ－11、Ⅻ－12、XIII－13、XIV－14、XV－15、XVI－16、XVII－17、XVIII－18、XIX－19、
		//XX－20、XXI－21、XXII－22、XXIX－29、
		//XXX－30、XXXIV－34、XXXV－35、XXXIX－39、XL－40、L－50、
		//LI－51、LV－55、LX－60、LXV－65、LXXX－80、XC－90、XCIII－93、XCV－95、XCVIII－98、XCIX－99

		System.out.println(intToRoman(1));
		System.out.println(intToRoman(3));
		System.out.println(intToRoman(4));
		System.out.println(intToRoman(5));
		System.out.println(intToRoman(6));
		System.out.println(intToRoman(9));
		System.out.println(intToRoman(10));
		System.out.println(intToRoman(19));
		System.out.println(intToRoman(49));
		System.out.println(intToRoman(50));
		System.out.println(intToRoman(55));
		System.out.println(intToRoman(60));
		System.out.println(intToRoman(65));
		System.out.println(intToRoman(80));
		System.out.println(intToRoman(90));
		System.out.println(intToRoman(93));
		System.out.println(intToRoman(95));
		System.out.println(intToRoman(98));
		System.out.println(intToRoman(99));
	}

}
