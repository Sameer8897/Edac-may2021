package dataStructure;

import java.util.Scanner;

public class Fibonacci {
	static int fibonacci(int n)
	{
		if(n<=1)
			return n;
		return fibonacci(n-1)+fibonacci(n-2);
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		System.out.println("Fibonacci:");
		for(int i=0;i<=k;i++)
			System.out.print(i+" ");
	}

}
