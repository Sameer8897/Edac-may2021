package dataStructure;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
	
	int arr[]={4,5,6,3,2,8,78,58,45};
	int n=arr.length;
	
	for(int i=0; i<n; i++)
	{
		int key=arr[i];
		int j=i-1;
		
		while(j>=0 && arr[j]>key)
			
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	
	System.out.println(Arrays.toString(arr));
	
	}
}
