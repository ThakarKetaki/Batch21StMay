package assignementGaneshSir;

import java.util.Scanner;

public class Ass12LargestNumberFrom3No 
{
	/*
	 *       a,b,c
	 *       \/
	 *       a>b
	 *       /\
	 *      /  \
	 *     /    \ 
	 *    a       b
	 *    |       |
	 *   a>c     b>c
	 *   /\       /\
	 *  /  \     /  \
	 * a    c   b    c
	 *       
	 */     
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number: ");
		int num2=sc.nextInt();
		System.out.println("Enter Third Number: ");
		int num3=sc.nextInt();
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println(num1+" is a Greater Number");
			}
			else
			{
				System.out.println(num3+" is a Greater Number");
			}
			
		}
		else 
		{
			if(num2>num3)
			{
				System.out.println(num2+" is a Greater Number");
			}
			else
			{
				System.out.println(num3+" is a Greater Number");
			}
			
		}
	}

}
