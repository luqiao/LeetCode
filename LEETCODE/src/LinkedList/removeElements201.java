package LinkedList;
/*
 Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
 */
public class removeElements201 {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode pre=null,current=head;
        while(current!=null){
        	if(current.val==val){
        		if(pre==null){
        			head=head.next;    			
        		}
        		else{
        			pre.next=current.next;	
        		}
        	}else{
        		pre=current;
        	}
        	current=current.next;
        }
        return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList ll=new LinkList();
		ll.insertLast(1);
		ll.insertLast(2);
		ll.insertLast(2);
		ll.insertLast(1);
		ll.first=removeElements(ll.first,2);
		ll.displayList();
		
	}

}
