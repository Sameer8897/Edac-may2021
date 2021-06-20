package dataStructure;

public class BinerySch {
	static int search(int arr[],int key)
	{
		int l=arr[0];
		int h=arr.length-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(mid==key) {
				return mid;
			}
			if(key<arr[mid]) {
				l=mid-1;
			}
			else
				l=mid+1;

		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int key=5;
		int n=arr.length;
		int res=search(arr,key);
		
		if(res==-1)
			System.out.println(" not found");
		else
			System.out.println("found");
	}

	}


