class HollowInvertedHalfPyramid
{
public static void main(String args[])
{
	for(int i=1;i<=6;i++)
	{
		for(int j=6;j>=i;j--)
		{
			if(i==2&&j==5||i==2&&j==4||i==2&&j==3||i==3&&j==5||i==3&&j==4||i==4&&j==5)
			System.out.print(" ");
			else
			System.out.print("*");
		}
	System.out.println();
	}
}
}