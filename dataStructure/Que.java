package dataStructure;

public class Que {
	int arr[];
	int rare;
	int front;
	int cap;
	public Que(int size)
	{
		arr=new int[size];
		rare=-1;
		front=0;
		cap=size;
	}
	
	boolean isFull() {
		return rare==cap-1;
	}
	
	boolean isEmpty() {
		return rare==rare-1;
	}
	
	public void enque(int data) {
		if(isFull())
		{
			System.out.println("Que is Full");
		}
		rare=rare+1;
		arr[rare]=data;
		
	}
	
	public int deque() {
		if(isEmpty()) 
		{
			System.out.println("que is empty");
		}
		return front++;
	}

	void display() {
		for(int i:arr) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Que q=new Que(3);
		q.enque(10);
		q.enque(20);
		q.display();
		
		q.deque();
		q.deque();
		q.display();
	}

}
