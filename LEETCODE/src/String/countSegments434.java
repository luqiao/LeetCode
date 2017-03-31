package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Question 434. Number of Segments in a String
/*
Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

Please note that the string does not contain any non-printable characters.

Example:

Input: "Hello, my name is John"
Output: 5
 */
public class countSegments434 {
	/*一开始考虑到上面多个非字母符号的在一起的情况，先做了一个替换的过程，再分离，
	 * 后来发现自己把题目理解错了,其实很简单，就是以空格为分割，不用考虑引号逗号这些符号
	 * 但是得考虑空字符串，和只有空格的字符串，
	 * 后来参考别人的，可以先用trim去除首尾的空格，\\s空格
	 */
    public static int countSegments(String s) {
    	/*
    	if (s.length()==0)
    		return 0;
    	String regEx="[^a-zA-Z'-]";
    	Pattern pat=Pattern.compile(regEx);
    	Matcher mat=pat.matcher(s);
    	String ss=mat.replaceAll("@");
    	System.out.println(ss);
    	String[] strs=ss.split("@+");
    	for(int i=0;i<strs.length;i++){
    		System.out.println(strs[i]);
    	}
        return strs.length;
        */
    	String[] strs=s.split(" +");
    	if(strs.length!=0&&strs[0].length()==0)
    		return strs.length-1;
    	return strs.length;
        
    }
    //study1
    public static int countSegments2(String s){
    	String ss=s.trim();
    	if(ss.length()==0)
    		return 0;
    	return ss.split("\\s+").length;
    }
    //study2:好机智啊
    public static int countSegments3(String s){
    	return ("x  "+s).split(" +").length-1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println(countSegments("Hello, my name is John"));
		System.out.println(countSegments("love live! mu'sic forever"));
		System.out.println(countSegments(""));
		System.out.println(countSegments("The one-hour drama series Westworld is a dark odyssey about the dawn of artificial consciousness and the evolution of sin. Set at the intersection of the near future and the reimagined past, it explores a world in which every human appetite, no matter how noble or depraved, can be indulged."));
		System.out.println(countSegments(", , , ,        a, eaefa"));
		System.out.println(countSegments("    foo    bar    "));
		System.out.println(countSegments("                "));
		
		System.out.println(countSegments2("Hello, my name is John"));
		System.out.println(countSegments2("love live! mu'sic forever"));
		System.out.println(countSegments2(""));
		System.out.println(countSegments2("The one-hour drama series Westworld is a dark odyssey about the dawn of artificial consciousness and the evolution of sin. Set at the intersection of the near future and the reimagined past, it explores a world in which every human appetite, no matter how noble or depraved, can be indulged."));
		System.out.println(countSegments2(", , , ,        a, eaefa"));
		System.out.println(countSegments2("    foo    bar    "));
		System.out.println(countSegments2("                "));
		*/
		
		System.out.println(countSegments3("Hello, my name is John"));
		System.out.println(countSegments3("love live! mu'sic forever"));
		System.out.println(countSegments3(""));
		System.out.println(countSegments3("The one-hour drama series Westworld is a dark odyssey about the dawn of artificial consciousness and the evolution of sin. Set at the intersection of the near future and the reimagined past, it explores a world in which every human appetite, no matter how noble or depraved, can be indulged."));
		System.out.println(countSegments3(", , , ,        a, eaefa"));
		System.out.println(countSegments3("    foo    bar    "));
		System.out.println(countSegments3("                "));
		
	}

}
