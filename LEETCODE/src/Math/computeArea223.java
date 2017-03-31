package Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
Find the total area covered by two rectilinear rectangles in a 2D plane.

Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
AD CD EH  GH
|  |  |   | 
AB-CB EF--GF
 */

public class computeArea223 {

	/*
	 x�᣺1-A,2-C,3-E,4-G  y�᣺1-B,2-D,3-F,4-H
	 1.��������    x��y�������ǣ�1 2 3 4 or 3 4 1 2  ����x,yֻҪ��һ������ǰ������1�������� 
	 2.�ཻ  x,y��������ǣ�1 3 2 4 or 3 1 4 2
	 3.��һ����������һ����1 3 4 2 or 3 1 2 4
	 	     ��2��3��������м�����������ص�������
	 */
    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    	int sum=(C-A)*(D-B)+(G-E)*(H-F);
    	int same=0;
        Map<Integer,Integer> mapx=new HashMap<Integer,Integer>();
        mapx.put(1, A);
        mapx.put(2, C);
        mapx.put(3, E);
        mapx.put(4, G);
        Map<Integer,Integer> mapy=new HashMap<Integer,Integer>();
        mapy.put(1, B);
        mapy.put(2, D);
        mapy.put(3, F);
        mapy.put(4, H);
        List<Map.Entry<Integer,Integer>> listx=new ArrayList<Map.Entry<Integer,Integer>>(mapx.entrySet());
        Collections.sort(listx,new Comparator<Map.Entry<Integer,Integer>>(){
        	public int compare(Entry<Integer,Integer>o1,Entry<Integer,Integer>o2){
        		return o1.getValue().compareTo(o2.getValue());
        	}
        	
        });
        List<Map.Entry<Integer, Integer>> listy=new ArrayList<Map.Entry<Integer,Integer>>(mapy.entrySet());
        Collections.sort(listy,new Comparator<Map.Entry<Integer, Integer>>(){
        	public int compare(Entry<Integer,Integer>o1,Entry<Integer,Integer>o2){
        		return o1.getValue().compareTo(o2.getValue());
        	}
        });
        
        if(listx.get(1).getKey()-listx.get(0).getKey()==1 || listy.get(1).getKey()-listy.get(0).getKey()==1){
        	same=0;
        }else {
        	same=(listx.get(2).getValue()-listx.get(1).getValue())*(listy.get(2).getValue()-listy.get(1).getValue());
        }
        return sum-same;
        
    }
    public static void main(String[] args){
    	System.out.println(computeArea(-4,-4,4,4,-1,-1,1,1));
    	System.out.println(computeArea(-4,-4,4,4,0,0,5,5));
    	System.out.println(computeArea(-4,-4,0,0,0,0,5,5));
    	System.out.println(computeArea2(-4,-4,4,4,-1,-1,1,1));
    	System.out.println(computeArea2(-4,-4,4,4,0,0,5,5));
    	System.out.println(computeArea2(-4,-4,0,0,0,0,5,5));
    }
    
    //study example1:��ʵ����������ļ򻯰�
    public static int computeArea2(int A, int B, int C, int D, int E, int F, int G, int H) {
    	int left=Math.max(A, E);
    	int right=Math.max(Math.min(C, G),left);
    	int bottom=Math.max(B,F);
    	int top=Math.max(Math.min(D, H), bottom);
    	return (C-A)*(D-B)+(G-E)*(H-F)-(right-left)*(top-bottom);
    }
}
