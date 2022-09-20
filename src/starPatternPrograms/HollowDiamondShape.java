package starPatternPrograms;

public class HollowDiamondShape 
{
	public static void main(String[] args) 
	{
		/*         							                 
		 * 			*                Logic
		 * 		   * *            Combination of above both 
		 * 		  * * *            
		 * 		 * * * *      
		 *      * * * * *      1) here downward side triangle is achieve through inverted right side right angle triangle
		 *       * * * *          (console pasun right la ulata triangle) by giving space after * in syso statement
		 *        * * *           So in that we use 1st inner loop for * and 2nd inner loop for space
		 *         * *         2) But when we combined both code(upper triangle and lower triangle)then here to achieve corner 
		 *          *             side logic we us 1st inner loop for space and then 2nd inner loop for *
		 *       	           3) And in 2nd for loop for star we use j>i instead of j>=i
		 */
		int Line=10;
		for(int i=1;i<=Line;i++)
		{
			for(int j=Line;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");  //Space is given after star(*) to achieve hollow triangle shape
			}
			System.out.println();
			
		}
		for(int i=1;i<=Line;i++) 
		{
			
			for(int k=1;k<=i;k++) 
			{
				System.out.print(" ");
			}
			for(int j=Line;j>i;j--) //Here  instead of j>=i we us j>i for connecting two triangle
			{
				System.out.print("* "); //Space is given after star(*) to achieve hollow triangle shape
			}
			System.out.println();
			
		}
		
		
	}

}
