class Pattern9
{
public static void main(String args[])
{
	int count=64;
	for(int i=1;i<=5;i++)
	{
		for(int j=4;j>=i;j--)
		{
		System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
		System.out.print((char)(count+k)+" ");
		}
		System.out.println();
	}
}
}