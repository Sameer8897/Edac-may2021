package dataStructure;

public class ArrayExam
{
	int arr[];
	int n;
public ArrayExam(int size)
	{
	arr=new int[size];
	n=0;
	}
public void display()
{
	for(int i:arr)
		System.out.println(i +" ");
}
public void insert(int value)
{
	arr[n]=value;
	n++;
}
	
}
public class ArrayDs {

	public static void main(String[] args) {
		int size=10;
		ArrayExam a=new ArrayExam(100);
		a.insert(10);
		a.insert(20);
		a.display();
	}
}
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
	
	
	
	
