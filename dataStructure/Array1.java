package dataStructure;
/*
1. If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50,
60], your program should be able to find that the
subarray lies between the indexes 3 and 8.
Output: 30,25,40,32,31,35*/

public class Array1 {

	public static void main(String[] args) {
		
		int a1[]=new int[] {10,12,20,30,25,40,32,31,35,50,60};
	    int a2[]=new int[8];
	    
	 
		for(int i=3,j=0; i<=8; i++)
		{
			a2[j]=a1[i];
			System.out.print(a2[j]+" ");
			j++;
		}
	
	
}}

