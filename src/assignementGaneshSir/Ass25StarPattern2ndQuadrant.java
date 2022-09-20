package assignementGaneshSir;

public class Ass25StarPattern2ndQuadrant 
{
	public static void main(String[] args) 
	{
		/*               Row   Space  Star 
		 *       *       1		4	   1                                 
		 *      **       2      3 	   2
		 *     ***	     3      2      3
		 *    ****	     4      1      4
		 *   *****	     5   	0      5
		 * */
		int line=10;
		for(int i=1;i<=line;i++)
		{
			for(int j=line;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
