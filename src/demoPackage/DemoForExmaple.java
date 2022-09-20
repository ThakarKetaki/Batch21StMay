package demoPackage;

public class DemoForExmaple 
{
	public static void main(String[] args)
	{   /*             Row    space     star
	     *    *****     1       0         5        ****
		 *     ****     2       1         4        ****
		 *      ***     3       2         3        ****
		 *       **     4       3         2
		 *        *     5       4         1
		 *        
		 *        
		 *        ****  1      3     4
		 *       ****   2      2
		 *      ****    3      1
		 *     ****     4      0
		 *        
		 *        
		 *        
		 *        
		 *        
		 *        
		 *        
		 *        
		 *        
		 *        
		 */
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("hello");
		int t=5;
		 
		for (int i=1; i<=t; i++)   
		{
			for( int j=t; j>=i; j--) 
			{                              
				System.out.print("*");   
			}
			System.out.println();
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			

		}
	
		
		
		
		
	}

}
