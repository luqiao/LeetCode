package LinkedList;

public class LinkList {

	public ListNode first;
	public ListNode last;
	public LinkList(){
		first=null;
		last=null;
	}
	public boolean isEmpty(){
		return (first==null);
	}
	public void insertLast(int x){
		ListNode newNode=new ListNode(x);
		if(isEmpty()){
			first=newNode;
		}else{
			last.next=newNode;
		}
		last=newNode;
	}
	public void displayList(){
		System.out.println("List (first-->last): ");
		ListNode current=first;
		while(current !=null){
			current.displayLink();
			System.out.print(" ");
			current=current.next;
		}
	}
}
