package LinkedList;
/*
 Reverse a singly linked list.

click to show more hints.

Hint:
A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class reverseList206 {
    public static ListNode reverseList(ListNode head) {
    	if (head==null)
    		return null;
        ListNode pre=null,current=head,after=head.next;
        while(current!=null&&after!=null){
        	if(pre==null){
        		pre=current;
        		pre.next=null;
        	}else{
        		pre=current;
        	}
        	current=after;
        	after=after.next;
        	current.next=pre;	
        }
        return current;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkList ll=new LinkList();
		ll.insertLast(1);
		ll.insertLast(2);
		ll.insertLast(3);
		ll.insertLast(4);
		ll.first=reverseList(ll.first);
		ll.displayList();
		
	}

}
