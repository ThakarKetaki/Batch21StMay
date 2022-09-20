package starPatternPrograms;

public class HollowTriangle 
{
	public static void main(String[] args) 
	{
		/*         								Row     Star    Space                 
		 * 			*                *         	 1       1	     4
		 * 		   * *              **      	 2		 2	     3
		 * 		  * * *            *** 			 3       3       2
		 * 		 * * * *          ****			 4	     4       1
		 *      * * * * *        *****			 5       5       0
		 * 
		 */
		int Line=10;
		
		for(int i=1;i<=Line;i++)//i=1  1<=5 
		{
			for(int j=Line;j>i;j--) //j=5 5>1 4
			{
				System.out.print(" ");  //space space
			}
			for(int k=1;k<=i;k++)//k=1 1<=1 2
			{
				System.out.print("* ");  //Space is given after star(*) to achieve hollow triangle shape
			}
			System.out.println();
			
		}
		
	}

}
