package assignementGaneshSir;

public class Ass27StarPattern4thQuadrant 
{
	public static void main(String[] args) 
	{
		/*               Row   Star 
		 *       *****   1		5
		 *       ****    2      4 	
		 *       ***	 3      3
		 *       **	     4      2
		 *       *	     5   	1
		 * */
		int row=10;
		for(int i=1;i<=row;i++)//i=1
		{
			for(int j=row;j>=i;j--)//j=5  5>i
			{
				System.out.print("*"); //*****
			}
			System.out.println();
		}
		
		
	}

}
