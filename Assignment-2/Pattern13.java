class Pattern13
{
public static void main(String args[])
{
	int count=64;
	for(int i=1;i<=5;i++)
	{
		for(int s=4;s>=i;s--)
		{
		System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
		System.out.print((char)(count+i)+" ");
		}
	System.out.println();	
	}
}
}