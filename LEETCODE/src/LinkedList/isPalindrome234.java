package LinkedList;

/*
 Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?
 */

public class isPalindrome234 {

	//有点问题，-1的时候就变成两个字符了，郁闷
    public static boolean isPalindrome(ListNode head) {
    	StringBuilder sb=new StringBuilder();
    	ListNode current=head;
        while(current!=null){
        	System.out.println(current.val);
        	sb.append(current.val);
        	current=current.next;
        }
        int N=sb.length();
        System.out.println(N);
        for(int i=0;i<N/2;i++){
        	if(sb.charAt(i)!=sb.charAt(N-i-1))
        		return false;
        }
        return true;
    }
    public static boolean isPalindrome2(ListNode head){
    	ListNode current=head;
    	if(current==null||current.next==null){
    		return true;
    	}
    	ListNode first=null,slow=head;
    	while(current!=null&&current.next!=null){
    		
    		
    		current=current.next.next;
    		if(first==null){
    			first=slow;
    			slow=slow.next;
    		}else{
    			ListNode tmp=slow;
    			slow=slow.next;
    			tmp.next=first;
    			first=tmp;
    		}
    		
    	}
    	if(current!=null&&current.next==null){
    		slow=slow.next;
    	}
    	while(slow!=null){
    		if(slow.val!=first.val)
    			return false;
    		slow=slow.next;
    		first=first.next;
    	}
    	return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList ll=new LinkList();
		ll.insertLast(1);
		ll.insertLast(2);
		ll.insertLast(3);
		ll.insertLast(2);
		ll.insertLast(1);
		//ll.displayList();
		LinkList ll2=new LinkList();
		ll2.insertLast(-1);
		ll2.insertLast(-1);
		LinkList ll3=new LinkList();
		ll3.insertLast(1);
		ll3.insertLast(2);
		ll3.insertLast(2);
		ll3.insertLast(2);
		LinkList ll4=new LinkList();
		ll4.insertLast(-1);
		System.out.println(isPalindrome2(ll.first));
		System.out.println(isPalindrome2(ll2.first));
		System.out.println(isPalindrome2(ll3.first));
		System.out.println(isPalindrome2(ll4.first));
	}

}
