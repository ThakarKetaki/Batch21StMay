package starPatternPrograms;

public class InvertedRightSideRightAngleTriangle 
{
	public static void main(String[] args) 
	{
		/*              Row   Space  Star 
		 *   *****       1		0	   5
		 *    ****       2      1 	   4
		 *     ***	     3      2      3
		 *      **	     4      3      2
		 *       *	     5   	4      1
		 * */
		int line=10;
		for(int i=1;i<=line;i++)//i=1
		{
			for(int j=line;j>=i;j--)//j=5 5>=1
			{
				System.out.print("*"); //*
			}
			System.out.println();
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
		}
		
		
	}

}
