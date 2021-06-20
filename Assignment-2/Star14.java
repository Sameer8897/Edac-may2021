class Star14
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
		System.out.print("* ");
		}
	System.out.println();
	}
	for(int i=1;i<=4;i++)
	{
		for(int s=3;s>=i;s--)
		{
		System.out.print(" ");
		}
		for(int j=0;j<=i;j++)
		{
		System.out.print("* ");
		}
	System.out.println();
	}
}
}