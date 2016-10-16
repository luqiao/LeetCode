package LinkedList;
/*
 Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 */
public class deleteDuplicates83 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current=head;
        while(current!=null&&current.next!=null){
        	if(current.val==current.next.val){
        		current.next=current.next.next;
        	}
        	else{
        		current=current.next;
        	}
        }
    	return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList ll=new LinkList();
		ll.insertLast(1);
		ll.insertLast(2);
		ll.insertLast(2);
		ll.insertLast(2);

		ll.first=deleteDuplicates(ll.first);
		ll.displayList();

	}

}
