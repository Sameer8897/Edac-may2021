package dataStructure;

public class Question2 {

	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5,6,7,8,9,10};
		int arr1[]=new int[arr.length/2];
		int arr2[]=new int[arr.length/2];
		int x=0;
		int y=0;
		
		for(int i=0; i<arr.length;i++)
		{
			if(i <=(arr.length/2)-1)
			{
				arr1[x]=arr[i];
				x++;
			}
			else
			{
			arr2[y]=arr[i];
			y++;
			}
		}
		for(int i: arr1) {
			System.out.print(i+ " ");
		}
		System.out.println(" ");
		for(int a:arr2) {
			System.out.print(a +" ");
		}
}
}
