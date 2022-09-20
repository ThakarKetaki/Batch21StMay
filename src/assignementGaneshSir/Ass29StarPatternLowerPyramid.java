package assignementGaneshSir;

public class Ass29StarPatternLowerPyramid 
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
		System.out.println();
		System.out.println("----------------------------------------------");
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
