package demoForLoopPackage;

public class ForLoopExample1 
{
	public static void main(String[] args) 
	{
		/*       ****  
		 *       ****
		 *       ****
		 * */
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=4;j++)
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
		System.out.println("----------------------------");
		/*               Row   Star 
		 *       *        1		1
		 *       **       2 	2
		 *       ***	  3     3
		 *       ****	  4     4
		 *       *****	  5 	5
		 * */
	
		for(int i=1;i<=5;i++)     //i=1
		{
			for(int j=1;j<=i;j++) //j=1;1<1
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		/*               Row   Star 
		 *       *****   1		5
		 *       ****    2      4 	
		 *       ***	 3      3
		 *       **	     4      2
		 *       *	     5   	1
		 * */
		
		for(int i=1;i<=5;i++)//i=1
		{
			for(int j=5;j>=i;j--)//j=5  5>i
			{
				System.out.print("*"); //*****
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
		/*               Row   Space  Star 
		 *       *       1		4	   1
		 *      **       2      3 	   2
		 *     ***	     3      2      3
		 *    ****	     4      1      4
		 *   *****	     5   	0      5
		 * */
		int line=5;
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
		System.out.println("----------------------------");
		/*              Row   Space  Star 
		 *   *****       1		0	   5
		 *    ****       2      1 	   4
		 *     ***	     3      2      3
		 *      **	     4      3      2
		 *       *	     5   	4      1
		 * */
		for(int i=1;i<=line;i++)//i=1
		{
			for(int j=line;j>=i;j--)//j=5 5>=1
			{
				System.out.print("*"); //*
			}
			System.out.println();
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
		}
		
	}

}
