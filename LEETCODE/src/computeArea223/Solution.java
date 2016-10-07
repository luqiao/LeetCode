package computeArea223;

import java.util.HashMap;

/*
 Find the total area covered by two rectilinear rectangles in a 2D plane.
 (A,B)(C,D)
 (E,F)(G,H)
 */
public class Solution {
    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        HashMap hm=new HashMap(8);
        hm.put(new Integer(1), new Integer(A));
        hm.put(new Integer(2), new Integer(B));
        hm.put(new Integer(3), new Integer(C));
        hm.put(new Integer(4), new Integer(D));
        hm.put(new Integer(5), new Integer(E));
        hm.put(new Integer(6), new Integer(F));
        hm.put(new Integer(7), new Integer(G));
        hm.put(new Integer(8), new Integer(H));
        
        
        return 1;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
