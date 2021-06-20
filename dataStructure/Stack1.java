package dataStructure;

public class Stack1 {
	int arr[];
	int size;
	int top;
	
	public Stack1(int s)
	{
		size=s;
		arr=new int[size];
		top=-1;
		
	}
	
	public void push(int data) 
	{
		arr[++top]=data;
		
	}
	
	public int pop()
	{
		return arr[top--];
	}
	
	public int peek()
	{
		return arr[top];
	}
	
	boolean isEmpty()
	{
		return (top==-1);
	}
	public boolean isFull() 
	{
		return top==size-1;
	}
	void display() {
		for(int i:arr) {
			System.out.println(i);
		}
	}
}
class Stackapp{
	public static void main(String[] args) {
		Stack1 s1=new Stack1(5);
		s1.push(5);
		s1.push(15);
		s1.display();
	}
	
}
	