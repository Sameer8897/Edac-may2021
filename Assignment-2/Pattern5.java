class Pattern5
{
public static void main(String args[])
{
	int a=65;
	for(int row=1;row<=5;row++)
	{
		for(int col=1;col<=row;col++)
		{
		System.out.print((char)a);
		}
		a++;
	System.out.println();
	}
}
}