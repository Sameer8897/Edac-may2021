package dataStructure;
/*1. How to find the missing number in an integer array of 1
to 100?*/

public class MissingNo {

	public static void main(String[] args, int i) {
		int arr[]= {1,2,3,5};
		int n=arr.length+1;
		int missNo=((n)*(n+1))/2;
		for(int i=0;i<arr.length;i++);
		{
		
			missNo=missNo-arr[i];
		}
			System.out.println(missNo);
	}

}
