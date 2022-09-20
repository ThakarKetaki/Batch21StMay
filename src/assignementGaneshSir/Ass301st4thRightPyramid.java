package assignementGaneshSir;

public class Ass301st4thRightPyramid 
{
	public static void main(String[] args) 
	{
		/* 	  			Rows	Star	
		 * 	  *			 1		 1			
		 *    **		 2		 2
		 * 	  ***		 3		 3
		 * 	  ****		 4       4
		 * 	  *****		 5 		 5	
		 * 	  ****		 6		 4
		 *    ***		 7		 3
		 *    **		 8		 2
		 *    *			 9		 1
		 * 
		 * Combination of Both
		 * 
		/*               Row   Star 				Row   Star 
		 *       *        1		1			*****	 1		5	
		 *       **       2 	2			****	 2		4
		 *       ***	  3     3			***		 3		3
		 *       ****	  4     4		    **		 4		2
		 *       *****	  5 	5			*		 5		1
		 *       
		 *      
		 * */	 
		int Row=5;
	
		for(int i=1;i<=Row;i++)     //i=1
		{
			for(int j=1;j<=i;j++) //j=1;1<1
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		//System.out.println("----------------------------");
		
		for(int i=1;i<=Row;i++)//i=1
		{
			for(int j=Row;j>i;j--)//To achieve Corner condition j>i is used instead of j>=i 
			{
				System.out.print("*"); 
			}
			System.out.println();
		}
		
		
		
		
	}

}
