package starPatternPrograms;

public class InvertedSolidTriangle 
{
	public static void main(String[] args) 
	{
		int row=10;
		for(int i=1;i<=row;i++)//1 1<=5
		{
			for(int j=1;j<i;j++)//console la chitkun * print karnya sathi <= remove kel 
			{ //j=1 1<1
				System.out.print(" ");
			}
			for(int k=1;k<=2*(row-i)+1;k++)//ithe -1 chya aivaji +1 kel //ani -1 jar merge karaych asel tenvha
			{//k=1 k=2*4+1
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
