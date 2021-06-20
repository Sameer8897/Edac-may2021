class Pattern10
{
public static void main(String args[])
{
	int count =64;
	for(int i=5;i>=1;i--)
	{
		for(int j=1;j<=5;j++)
		{
		if(j<i)
		System.out.print(" ");
		else
		System.out.print(" "(char)(count+j));
		}
	System.out.println();
	}	
}
}