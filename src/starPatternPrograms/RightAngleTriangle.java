package starPatternPrograms;

public class RightAngleTriangle 
{
	public static void main(String[] args) 
	{
		/*               Row   Star 
		 *       *        1		1
		 *       **       2 	2
		 *       ***	  3     3
		 *       ****	  4     4
		 *       *****	  5 	5
		 * */
		int row=10;
		for(int i=1;i<=row;i++)     //i=1
		{
			for(int j=1;j<=i;j++) //j=1;1<1
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
