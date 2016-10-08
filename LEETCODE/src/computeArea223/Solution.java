package computeArea223;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
 Find the total area covered by two rectilinear rectangles in a 2D plane.
 (A,B)(C,D)
 (E,F)(G,H)
 */
public class Solution {
    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>(8);
        hm.put(1,A);
        hm.put(2,B);
        hm.put(3,C);
        hm.put(4,D);
        hm.put(5,E);
        hm.put(6,F);
        hm.put(7,G);
        hm.put(8,H);
        List<Map.Entry<Integer,Integer>> list=new ArrayList<Map.Entry<Integer,Integer>>(hm.entrySet());;
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
        	public int compare(Entry<Integer,Integer>o1,Entry<Integer,Integer>o2){
        		return o1.getValue()-o2.getValue();
        	}
        });
        return 1;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
