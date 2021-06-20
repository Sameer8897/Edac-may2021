class Star6
{
public static void main(String args[])
{
	for(int i=1;i<=5;i++)
	{
		for(int s=2;s<=i;s++)
		{
		System.out.print(" ");
		}
		for(int j=5;j>=i;j--)
		{
		System.out.print("*");
		}
		for(int j=4;j>=i;j--)
		{
		System.out.print("*");
		}
	System.out.println();
	}
}
}