package dataStructure;

public class StackArray {
	int top;
	int arr[];
	int Cap;

	public StackArray(int size) {
		top=-1;
		arr=new int[size];
		Cap=size;
	}
	boolean isEmpty() {
	return top==-1;
	}
	
	public boolean isFull() {
		return top==Cap-1;
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("stack is full");
			System.exit(0);
		}
		System.out.println(data);
		arr[++top]=data;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			System.exit(0);
		}
		System.out.println(arr[top]);
		return arr[top--];
	}
	public static void main(String args[]) {
		StackArray sa=new StackArray(4);
		System.out.println("push the data");
		sa.push(10);
		sa.push(20);
		sa.push(30);
		System.out.println("pop the element");
		sa.pop();
		sa.pop();
	
	}
	}
