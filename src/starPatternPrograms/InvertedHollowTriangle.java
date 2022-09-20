package starPatternPrograms;

public class InvertedHollowTriangle 
{
	public static void main(String[] args) 
	{
		/*   								Row   Star	Space	
		 *     * * * * *		*****		 1     5  	  0
		 *      * * * *			 ****	     2     4      1
		 *       * * *            ***        3     3      2
		 *        * *              **        4     2      3
		 *         *                *        5     1      4
		 * 
		 */
		int Line=10;
		for(int i=1;i<=Line;i++) //1<=5
		{
			for(int j=Line;j>=i;j--) //j=5  5>1 4 3 2 1
			{
				System.out.print("* "); // *****  //Space is given after star(*) to achieve hollow triangle shape
			}
			System.out.println();
			
			for(int k=1;k<=i;k++) //k=1 1<=1
			{
				System.out.print(" ");
			}
			
		}
		
		
	}

}
