package dataStructure;
class Q1
{
	int size;
	int Q1[];
	int front;
	int rear;
	int n;
	
	public Q1(int s) 
	{
		size=s;
		Q1=new int[size];
		front=0;
		rear=-1;	
	}
	
	public void enqueue(int k)
	{
		if(rear==size-1)
			rear=-1;
		Q1[++rear]=k;
		n++;
	}
	public void dequeue()
	{
		int s=Q1[front++];
		if(front==size)	
		front=0;
	
	}
	
	public boolean isEmpty() 
	{
		return rear==front;
	
	}
	
	void isFull() {
		rear=size-1;
	}
	void display() {
		for(int i:Q1) {
			System.out.println(i);
		}
	}
}

public class Queue {
	public static void main(String args[]) 
	{
		
	
	Q1 a1=new Q1(5);
	a1.enqueue(10);
	a1.enqueue(20);
	a1.enqueue(30);
	
	a1.display();
	System.out.println(" ");
	a1.dequeue();
	a1.dequeue();
	a1.display();

	
	}
}
