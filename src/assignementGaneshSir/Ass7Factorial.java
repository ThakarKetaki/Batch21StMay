package assignementGaneshSir;

import java.util.Scanner;

public class Ass7Factorial 
{
	public static void main(String[] args) 
	{
		/*Factorial Logic
		 * 5!=5*4*3*2*1
		 * 
		 * */
		   
		int number;
		int fact=1;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Number to find factorial: ");
		number=sc.nextInt();
		
		for(int i=1;i<=number;i++)     // i=1 i<=5 i=2  2<=5 3<=5
		{
			fact=fact*i;            // fact=1*1  fact=1 fact=1*2 fact=2 fact=2*3
		}
		System.out.println("Factorial of given number is: "+fact);
		
	}

}
