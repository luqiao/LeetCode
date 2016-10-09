package String;

import java.util.HashMap;

/*
 * Given a roman numeral, convert it to an integer.
Input is guaranteed to be within the range from 1 to 3999.
 */
public class romanToInt13 {
	/*
	 * 基本字符：
　　I、V、X、L、C、D、M
　　相应的阿拉伯数字表示为：
　　1．5、10、50、100、500、1000
　　(1)相同的数字连写，所表示的数等于这些数字相加得到的数，如：Ⅲ = 3；
　　(2)小的数字在大的数字的右边，所表示的数等于这些数字相加得到的数， 如：Ⅷ = 8；Ⅻ = 12；
　　(3)小的数字，（限于Ⅰ、X 和C）在大的数字的左边，所表示的数等于大数减小数得到的数，如：Ⅳ= 4；Ⅸ= 9；
　　(4)正常使用时连写的数字重复不得超过三次。（表盘上的四点钟--“IIII”，例外。）
　　(5)在一个数的上面画一条横线，表示这个数增值1000 倍。

基本数字 Ⅰ、X 、C 中的任何一个、自身连用构成数目、或者放在大数的右边连用构成数目、都不能超过三个；放在大数的左边只能用一个；
不能把基本数字 V 、L 、D 中的任何一个作为小数放在大数的左边采用相减的方法构成数目；放在大数的右边采用相加的方式构成数目、只能使用一个；
I只能用在V和X左边；
X只能用在L和C左边；
C只能用在D和M左边。
	 */
    public static int romanToInt(String s) {
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>(7);
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int[] result=new int[s.length()];
        int sum=0;
        for (int i=s.length()-1;i>=0;i--){
        	result[i]=hm.get(s.charAt(i));
        	if(i<s.length()-1&&result[i]<result[i+1]){
        		switch (result[i]){
        		case 1:
        			if (result[i+1]==5 || result[i+1]==10){
        				sum=sum-result[i];
        			}break;
        		case 10:
        			if (result[i+1]==50 || result[i+1]==100){
        				sum=sum-result[i];
        			}break;
        		case 100:
        			if (result[i+1]==500 || result[i+1]==1000){
        				sum=sum-result[i];
        			}break;
        		default:
        			break;
        		}	
        	}else{
        		sum=sum+result[i];
        	}
        }
        return sum;        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ⅰ－1、Ⅱ－2、Ⅲ－3、Ⅳ－4、Ⅴ－5、Ⅵ－6、Ⅶ－7、Ⅷ－8、Ⅸ－9
		//Ⅹ－10、Ⅺ－11、Ⅻ－12、XIII－13、XIV－14、XV－15、XVI－16、XVII－17、XVIII－18、XIX－19、
		//XX－20、XXI－21、XXII－22、XXIX－29、
		//XXX－30、XXXIV－34、XXXV－35、XXXIX－39、XL－40、L－50、
		//LI－51、LV－55、LX－60、LXV－65、LXXX－80、XC－90、XCIII－93、XCV－95、XCVIII－98、XCIX－99
		System.out.println(romanToInt("I"));
		System.out.println(romanToInt("II"));
		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("IV"));
		System.out.println(romanToInt("V"));
		System.out.println(romanToInt("VI"));
		System.out.println(romanToInt("VII"));
		System.out.println(romanToInt("VIII"));
		System.out.println(romanToInt("IX"));
		System.out.println(romanToInt("X"));
		System.out.println(romanToInt("XXII"));
		System.out.println(romanToInt("XXIX"));
		System.out.println(romanToInt("XXXIV"));
		System.out.println(romanToInt("XCV"));
	}

}
