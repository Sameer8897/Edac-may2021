package dataStructure;

public class DLL {
	Node head;
	  static class Node
	  {
		int data;
		Node next;
		Node prev;
		
		public Node(int data)
		{
			this.data=data;
			next=prev=null;	
		}
	  }
	  

	void insertBeg(int data)
	{
		Node n=new Node(data);
		n.next=head;
		n.prev=null;
	if(head!=null) {
		head.prev=n;
	}
		head=n;
	
	}	
	
	void insertLast(int data) {
		Node n=new Node(data);
		Node temp=head;
		n.next=null;
		if(head==null) {
			n.prev=null;
			head=n;
		}
		
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=n;
		n.prev=temp;
	}
	
		void insertMid(int data) {
			Node n=new Node(data);
			Node temp=head;
			
			n.next=temp.next;
			temp.next=n;
			n.prev=temp;
		if(n.next!=null) 
			n.next.prev=n;
			
		}
		
	
	void InsertAtPos(int data,int poss)
	{
		int i=0;
		if(poss>0){
	    Node n=new Node(data);
		Node trav=head;
		if(poss==1)
		{
				n.next = head;
			   head = n;
		}
		
		for(i=2;i<poss;i++)
			 {
			   	trav = trav.next;
			 }
		n.next= trav.next;
		trav.next = n;
	    }
	    else
		{
	    	
	    	System.out.println("Invalid position\n");
	    }
	}
	public void reverse() { 
		Node temp = head; 
		Node prev = null;
		Node temp1;
		 
		while (temp != null) 
		{ 
			temp1 = temp; 
			temp = temp.next; 
			
			temp1.next = prev; 
			prev = temp1; 
			head = temp1;
			} 
		}
	public void deleteIn() {
		Node temp=head;
		head=temp.next;
		temp.next.prev=null;
	}
	
	public void deleteAtLast() {
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
	}
//	public void deleteMid(int poss) {
//		Node temp=head;
//		Node temp1=head;
//		while(temp!=head){
//			temp=temp.next;
//		}
		
	

	void show() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}


	public static void main(String args[]) {
		DLL l=new DLL();
		
		l.head=new Node(10);
		l.show();
		System.out.println("insert at big------------");
		l.insertBeg(20);
		l.show();
		System.out.println("insertAt Last------------");
		l.insertLast(40);
		l.show();
		System.out.println("insertAtmid------------");
		
		l.insertMid(30);
		l.show();
		System.out.println("insertAt poss------------");
		l.InsertAtPos(70, 3);
		l.show();
		
		System.out.println("delete at first--------------");
		l.deleteIn();
		l.show();
		
		System.out.println("delete at first--------------");
	//	l.deleteMid(3);
	//	l.show();
		System.out.println("del at Last------");
		l.deleteAtLast();
		l.show();
		System.out.println("reverse---------------");
		l.reverse();
		l.show();
	}
}