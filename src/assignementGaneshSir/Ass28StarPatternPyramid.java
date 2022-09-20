package assignementGaneshSir;

public class Ass28StarPatternPyramid 
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
		System.out.println("-------------------------------------------");
		
		/*					  Star	
		 *          *          1 			     *         	 1       1	     4
		 * 		   ***         3     			**      	 2		 2	     3
		 * 		  *****        5    		   *** 			 3       3       2
		 * 		 *******       7   			  ****			 4	     4       1
		 *      *********      9             *****			 5       5       0
		 *  Here Logic for odd number  is (2*Line number)-1      
		 *  Ex To print 1 star on line 1 (2*1)-1 1  
		 *     To print 3 star on line 2 (2*2)-1 3
		 *     Same Goes On
		 *     This is logic
		 *     The Above Logic is used in Right Side Right Angle Triangle
		 *    
		 * */  
		//int Line=10;
		
		for(int i=1;i<=Line;i++)
		{
			for(int j=Line;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
