class Pattern18
{
public static void main(String args[])
{	
	int count=64;
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
		count++;
		System.out.print((char)count);
		}
	count=64;
	System.out.println();
	}
}
}