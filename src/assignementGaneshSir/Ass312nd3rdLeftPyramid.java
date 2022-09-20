package assignementGaneshSir;

public class Ass312nd3rdLeftPyramid 
{
	public static void main(String[] args) 
	{
		/*	Rows=5				Rows     Star     Space
		 * 			*			 1		  1	       4
		 *         **			 2		  2		   3
		 *        ***			 3		  3        2
		 *       ****			 4		  4        1
		 *      *****			 5		  5        0
		 *       ****			 4		  4        1 
		 *        ***			 3		  3        2
		 *         **			 2		  2        3
		 *         	*			 1		  1        4
		 *         
		 *   Combination of both
		 *   
		 *   		Row   Star	Space             Row   Star	Space
		 *      *    1	   1	 4		*****      1     5       0
		 *     **    2     2     3   	 ****	   2     4       1
		 *    ***    3     3     2		  ***      3     3       2
		 *   ****    4     4     1		   **	   4     2       3
		 *  *****    5     5     0			*      5     1       4
		 *         
		 *     
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
		//System.out.println("---------------");
		for(int i=1;i<=line;i++)//i=1
		{
			for(int k=1;k<=i;k++)             //First space loop is used because here inverted triangle started from space
			{
				System.out.print(" ");
			}
			for(int j=line;j>i;j--)   //To achieve Corner condition j>i is used instead of j>=i
			{
				System.out.print("*"); //*
			}
			System.out.println();
			
		}
		

		
	}

}
