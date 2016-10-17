package LinkedList;
/*
 Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. 
You may not modify the values in the list, only nodes itself can be changed.
 */
public class swapPairs24 {
    public static ListNode swapPairs(ListNode head) {
    	if(head==null||head.next==null)
    		return head;
    	ListNode pre=head;
    	ListNode current=head.next;
    	while(current!=null){
    		 ListNode after=current.next;
    		 current.next=pre;
    		 if(pre==head)
    			 head=current;
    		 if(after==null){
    			 pre.next=null;
    			 current=null;
    		 }else{	 
    			 current=after.next;
    			 if(current==null)
    				 pre.next=after;
    			 else
    				 pre.next=current;
    			 pre=after;	 
    		 }
    	}
    	return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList ll=new LinkList();
		ll.insertLast(1);
		ll.insertLast(2);
		ll.insertLast(3);
		ll.insertLast(4);
		ll.first=swapPairs(ll.first);
		ll.displayList();

	}

}
