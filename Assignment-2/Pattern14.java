class Pattern14
{
public static void main(String args[])
{	
	int count=0;
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
		count++;
		System.out.print(count);
		}
		count=0;
	System.out.println();
	}
}
}