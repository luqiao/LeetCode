package LinkedList;
/*
 Merge two sorted linked lists and return it as a new list. 
 The new list should be made by splicing together the nodes of the first two lists.
 */
public class mergeTwoLists21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode tmp=null;
    	ListNode head=null;
        while(l1!=null&&l2!=null){
        	if(l1.val>l2.val){
        		if (tmp==null){
        			tmp=l2;
        			head=l2;
        		}else{
        			tmp.next=l2;
        			tmp=tmp.next;
        		}
        		l2=l2.next;
        	}else{
        		if(tmp==null){
        			tmp=l1;
        			head=l1;
        		}else{
        			tmp.next=l1;
        			tmp=tmp.next;
        		}
        		l1=l1.next;
        	}
        }
        if(l1!=null){
        	if(tmp==null){
        		tmp=l1;
        		head=l1;
        	}else
        		tmp.next=l1;
        }else if(l2!=null){
        	if(tmp==null){
        		tmp=l2;
        		head=l2;
        	}else
        		tmp.next=l2;
        }
        return head;
        	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList l1=new LinkList();
		l1.insertLast(1);
		l1.insertLast(2);
		LinkList l2=new LinkList();
		l2.insertLast(2);
		//l2.insertLast(4);;
		l1.first=mergeTwoLists(l1.first,l2.first);
		l1.displayList();

	}

}
