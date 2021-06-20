class Pyramid5
{
public static void main(String args[])
{
	int count=9;
	for(int i=9;i>=1;i--)
	{
		for(int s=1;s<i;s++)
		{
		System.out.print(" ");
		}
		for(int j=i;j<=9;j++)
		{
		System.out.print(j);
		}
		for(int j=8;j>=i;j--)
		{
		count--;
		System.out.print(count);
		}
		count=9;
	System.out.println();
	}
}
}