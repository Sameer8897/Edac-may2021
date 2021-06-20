package dataStructure;
/*3. Write a program to shift every element of an array to
circularly right. E.g.-
INPUT : 1 2 3 4 5
OUTPUT : 5 1 2 3 4
4 5 1 2 3
3 4 5 1 2
2 3 4 5 1
1 2 3 4 5*/
public class Question3 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		for(int j=0;j<arr.length;j++)
		{
			int temp=arr[arr.length-1];
			int a=arr.length-1;
		for( int i=arr.length-1; i>0; i--)
			{
				arr[i]=arr[--a];
			}
		arr[0]=temp;
		for(int i=0;i<arr.length; i++)
			{
			System.out.print(arr[i] +" ");
			}
			System.out.println();
		}
	}

}
