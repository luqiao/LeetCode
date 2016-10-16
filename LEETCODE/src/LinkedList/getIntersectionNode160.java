package LinkedList;
/*
 Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 �� a2
                   �K
                     c1 �� c2 �� c3
                   �J            
B:     b1 �� b2 �� b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class getIntersectionNode160 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currenta=headA;
        ListNode currentb=headB;
        while(currenta!=null&&currentb!=null){
        	if(currenta.next==currentb.next){
        		return currenta.next;
        	}
        	currenta=currenta.next;
        	currentb=currentb.next;

        }
        return null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
