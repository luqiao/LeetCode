package LinkedList;
/*
 Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
 */
public class removeNthFromEnd19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode pre=null,first=head,last=head;
    	for(int i=0;i<n-1;i++){
    		last=last.next;
    	}
    	while(last.next!=null){
    		if (pre==null){
    			pre=head;
    		}else{
    			pre=pre.next;
    		}
    		first=first.next;
    		last=last.next;
    	}
    	if(first==head){
    		head=first.next;
    		
    	}else{
    		pre.next=first.next;
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
		ll.insertLast(5);
		ll.first=removeNthFromEnd(ll.first,2);
		ll.displayList();
		LinkList ll2=new LinkList();
		ll2.insertLast(1);
		ll2.first=removeNthFromEnd(ll2.first,1);
		ll2.displayList();
		LinkList ll3=new LinkList();
		ll3.insertLast(1);
		ll3.insertLast(2);
		ll3.first=removeNthFromEnd(ll3.first,2);
		ll3.displayList();
		

	}

}
