package test;

import java.util.HashMap;
import java.util.Map;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(romanToInt("II"));
	}
public static int romanToInt(String s) {
        
	char[] chs=s.toCharArray();
	Map<Character,Integer> map=new HashMap<Character,Integer>();
	map.put('I', 1);
	map.put('V', 5);
	map.put('X', 10);
	map.put('L',50);
	map.put('D',500);
	map.put('M',1000);

	int sum=0;
	for(int i=0;i<chs.length-1;i++){
		
			if(map.get(chs[i])<map.get(chs[i+1])){
			sum=sum+map.get(chs[i+1])-map.get(chs[i]);
			if(i==chs.length-2)
				break;
			i++;
		}
		
		else
			sum=sum+map.get(chs[i]);
	}
	return sum;
	
    }

}
