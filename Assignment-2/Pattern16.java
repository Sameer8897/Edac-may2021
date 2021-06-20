class Pattern16
{
public static void main(String args[])
{	
	int count=6;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
		count--;
		System.out.print(count);
		}
	count=6;
	System.out.println();
	}
}
}