class Pattern7
{
public static void main(String args[])
{
   	for(int row=1;row<=5;row++)
	{
		for(int space=4;space>=row;space--)
		{
		System.out.print(" ");
		}
		for(int col=1;col<=row;col++)
		{
		System.out.print(col+" ");
		}
	System.out.println();
	}     
}
}