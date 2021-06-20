package dataStructure;
class Bs{
	static int bisearch(int a1[],int x,int l,int h)
	{
		if (h>=1)
		{
			int mid=1+(h-l)/2;
			if(a1[mid]==x)
				return mid;
			if(a1[mid]>x)
				return bisearch(a1,x,l,mid-1);
				return bisearch(a1,x,mid+1,h);
		}
		return -1;
		
	}
}
public class BinerySearch {

	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5};
		int x=6;
		int n=a1.length;
		int res=bisearch(a1,x,0,n-1);
		if(res==-1)
			System.out.println("not found");
		else
			System.out.println("found");
	}

	private static int bisearch(int[] a1, int x, int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
