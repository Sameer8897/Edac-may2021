package dataStructure;

import java.util.LinkedList;

import dataStructure.List2.Node;

class Node1{
	int data;
	Node1 next;
	Node1 prev;
	
	Node1(int data){
		this.data=data;
		next=prev=null;
	}
static class Linklist{
	Node1 head;
	
	void inserLast(int data) {
		Node1 n=new Node1(data);
		
		if(head==null)
			 head=n;
		  else 
		  {
			  Node1 temp=head;
			  while(temp.next != null) {
				  temp=temp.next;
			  }
			  temp.next=n;
		  }
			
	}
	
	void inMid(int data,int pos) {
		Node1 n=new Node1(data);
		Node1 temp=head;
		while(temp.data!=pos)
		{
			temp=temp.next;
		}
			n.next=temp.next;
			temp.next=n;
	}
	void display() {
		Node1 temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	
	
}

static class Linked {

	public static void main(String[] args) {
		
		Linklist l=new Linklist();
		l.inserLast(10);
		l.inserLast(20);
		l.display();
		l.inMid(1, 40);
		
		
		
	}
}
}



