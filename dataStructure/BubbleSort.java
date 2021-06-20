package dataStructure;

public class BubbleSort {

	void bubbleSort(int arr[]) {
		int n=arr.length;
		{
			for(int i=1; i<n-1;i++) 
			{
				for(int j=1;j<n-1-i;j++) {
					if(arr[j]>arr[j])
					{
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						
					}
				}
			}
		}
	}
	void display(int arr[]) {
		for(int i:arr)
			System.out.println(i+" ");
		
		
	}
	public static void main(String[] args) {
	BubbleSort b1=new BubbleSort();
	int arr[]= {64,34,25,12,22,45};
	System.out.println("Sorted array");
	b1.display(arr);

	}

}
