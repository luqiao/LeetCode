package String;

import java.util.HashMap;

/*
 * Given a roman numeral, convert it to an integer.
Input is guaranteed to be within the range from 1 to 3999.
 */
public class romanToInt13 {
	/*
	 * �����ַ���
����I��V��X��L��C��D��M
������Ӧ�İ��������ֱ�ʾΪ��
����1��5��10��50��100��500��1000
����(1)��ͬ��������д������ʾ����������Щ������ӵõ��������磺�� = 3��
����(2)С�������ڴ�����ֵ��ұߣ�����ʾ����������Щ������ӵõ������� �磺�� = 8���� = 12��
����(3)С�����֣������ڢ�X ��C���ڴ�����ֵ���ߣ�����ʾ�������ڴ�����С���õ��������磺��= 4����= 9��
����(4)����ʹ��ʱ��д�������ظ����ó������Ρ��������ϵ��ĵ���--��IIII�������⡣��
����(5)��һ���������滭һ�����ߣ���ʾ�������ֵ1000 ����

�������� ��X ��C �е��κ�һ�����������ù�����Ŀ�����߷��ڴ������ұ����ù�����Ŀ�������ܳ������������ڴ��������ֻ����һ����
���ܰѻ������� V ��L ��D �е��κ�һ����ΪС�����ڴ�������߲�������ķ���������Ŀ�����ڴ������ұ߲�����ӵķ�ʽ������Ŀ��ֻ��ʹ��һ����
Iֻ������V��X��ߣ�
Xֻ������L��C��ߣ�
Cֻ������D��M��ߡ�
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
		//��1����2����3������4������5������6������7������8������9
		//����10������11������12��XIII��13��XIV��14��XV��15��XVI��16��XVII��17��XVIII��18��XIX��19��
		//XX��20��XXI��21��XXII��22��XXIX��29��
		//XXX��30��XXXIV��34��XXXV��35��XXXIX��39��XL��40��L��50��
		//LI��51��LV��55��LX��60��LXV��65��LXXX��80��XC��90��XCIII��93��XCV��95��XCVIII��98��XCIX��99
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
