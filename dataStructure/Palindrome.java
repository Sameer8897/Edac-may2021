package dataStructure;
import java.util.*;
public class Palindrome {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
		int len=str.length();
		Stack stack =new Stack();
		
		
		for(int i=0;i<str.length();i++) {
			stack.push(str.charAt(i));
		
		}
		String revString="";
		while(!stack.isEmpty()) {
			revString=revString+stack.pop();
		}
	
		if(str.equals(revString)){
			System.out.println("palindrom");
		}else
			System.out.println("Not palindrom");
	}
	

	}

/*class Stack1{
	Stack1 stack;
	int top;
	
	
	Stack1(String str){
		;
		top=-1;
	}
	static void push(String str) {
		s=str[++top];
		
	}
}*/

