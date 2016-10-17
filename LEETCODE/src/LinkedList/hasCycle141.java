package LinkedList;
/*
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
 */
public class hasCycle141 {
    public static boolean hasCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while(true){
        	if(slow==null||fast==null||fast.next==null||fast.next.next==null){
        		return false;
        	}
        	else if(fast.next.next==slow){
        		return true;
        	}
        	slow=slow.next;
        	fast=fast.next.next;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList ll=new LinkList();
		ll.insertLast(1);
		ll.insertLast(1);
		ll.insertLast(1);
		ll.insertLast(1);
		System.out.println(hasCycle(ll.first));
		

	}

}
