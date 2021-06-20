package dataStructure;

public class List2
 {
	 Node head;
  static class Node
  {
	int data;
	Node next;
	
	public Node(int d)
	{
		data=d;
		next=null;	
	}
  }
  public void display() {
	  Node n=head;
	  while(n!=null)
	  {
		 System.out.println(n.data);
		 n=n.next;
	  }
  }
 
  public void insertBeg(int data)
  {
	 Node node=new Node(data);
	 if(head==null)
		 head=node;
	 else
	 {
		 node.next=head;
		 head=node;
	 }
	  
  }
  
  public void insertEnd(int new_data)
  {
	  Node node=new Node(new_data);
	  if(head==null)
		 head=node;
	  else 
	  {
		  Node temp=head;
		  while(temp.next != null) {
			  temp=temp.next;
		  }
		  temp.next=node;
	  }
  }	  
	 public void insertM(int data,int key)
	  {
		  Node n1=new Node(data);
		  Node temp=head;
		  while(temp.data!=key) {
			 temp=temp.next;
		  }
			  n1.next=temp.next;
			  temp.next=n1;
		  }
	  
	  
	 public void deleteBeg() {
		 Node temp=head;
		 head=temp.next;
 }
	 public void deleteLast() {
		 Node temp=head;
		 while(temp.next.next!=null) {
			 temp=temp.next;
		 }
		 temp.next=null;
	 }
	 
	 public void deleteMid(int key) {
		Node temp=head;
		Node temp1=head;
		
		if(head.data==key) {
			head=head.next;
		}
		else
			while(temp.data!=key)
			{
				temp1=temp;
				temp=temp.next;
			}
		temp1.next=temp.next;
	 }
	 
	 public void delNode() {
		 head=null;
	 }
	 
	  void insertAtPosi(int data,int poss) {
		 int i=0;
		 if(poss>0) {
			 Node n=new Node(data);
			 Node trav=head;
		if(poss==1) {
			n.next=head;
			head=n;
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
	  
	  public void revese() {
		  Node p=head,q=head;
		  head=head.next;
		  q=head;
		  p.next=null;
		  while(head!=null)
		  {
			  head=head.next;
			  q.next=p;
			  p=q;
			  q=head;  
		  }
		  head=p;
	  }
	
 
	public static void main(String[] args) 
	{
		List2 l1=new List2();
		 
		l1.head=new Node(15);
		Node second=new Node(20);
		Node third=new Node(30);
		
		l1.head.next=second;
		second.next=third;
		l1.display();
		System.out.println("-----------------");
		l1.insertBeg(10);
		l1.insertEnd(50);
		l1.display();
		System.out.println("---------------");
		l1.insertM(55,20);
		l1.display();
		System.out.println("---------------");
		l1.deleteBeg();
		l1.display();
		System.out.println("---------------");
	l1.deleteLast();
	l1.display();
	System.out.println("---------------------");
	l1.deleteMid(55);
	
	l1.display();
	System.out.println("------------------");
	l1.insertAtPosi(50, 2);
	l1.display();
	System.out.println("----------rev---");
	l1.revese();
	l1.display();
	System.out.println("-------------------");
	System.out.println("All delete");
	l1.delNode();
	
	
	}
  }

