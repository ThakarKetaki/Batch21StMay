package starPatternPrograms;

public class SolidDiamondShape
{
	public static void main(String[] args) 
	{
		int row=5;
		for(int i=1;i<=row;i++)
		{
			for(int j=row;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//System.out.println("-----------------------------------------------------------");
		for(int i=1;i<=row;i++)//1 1<=5
		{
			for(int j=1;j<=i;j++) 
			{ //j=1 1<1
				System.out.print(" ");
			}
			for(int k=1;k<=2*(row-i)-1;k++)
			{//k=1 
				System.out.print("*");
			}
			System.out.println();
		}	
	}

}
