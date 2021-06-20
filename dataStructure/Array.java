package dataStructure;

public class Array
{
	
}
public class ArrayImpli {

	public static void main(String[] args) {
		int arr[]= {11,22,33,44,55};
		int n=0;
		int j;
		
	//	arr[0]=22;
	//	arr[1]=32;
	//	arr[2]=42;
		
		//for(j=0; j<arr.length; j++) 
	//	{
		//	System.out.print(arr[j]+" ");
		
		//}
			
	//for(int i : arr)
		//System.out.print(i +" ");

	
	/*int key=45;
	for(j=0 ; j<n ; j++)
	{
		if( arr[j] == key) 
		
			 break;
	}

		if(arr[j]==n) 
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println("found");
		}
		*/
	int key=33;
	for(j=0; j<n; j++)
	{
		if(arr[j]==key)
			break;
			}
		for( int k=j; k<n; k++)
		{
			arr[k]=arr[k+1];
		}
		n--;
		
		for(j=0; j<n; j++) {
			System.out.println(arr[j]+" ");
		}
	}}
	
	
	
