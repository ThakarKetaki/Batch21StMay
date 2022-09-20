package assignementGaneshSir;

public class Ass23StarPatternSquare 
{
	public static void main(String[] args) 
	{

		/*       *****  
		 *       *****
		 *       *****
		 * */
		
		int row=4;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		
		/*       ********
		 *       ********
		 *       ********
		 * */
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=8;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
