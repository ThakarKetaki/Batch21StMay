package assignementGaneshSir;

import java.util.Scanner;

public class Ass4EvenOdd 
{
	public static void main(String[] args) 
	{
		//Even Odd Using Single User Input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to fine even or odd");
		int number=sc.nextInt();
		if(number%2==0)
		{
			System.out.println("Entered Number is Even Number");
		}
		else
		{
			System.out.println("Entered Number is Odd Number");
		}
		System.out.println("*********************************************");
		
		//Even Odd Using Range from user input(Using For Loop)

		for(int i=2;i<=number;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Numbers:"+i);
			}
			
		}
		System.out.println("*********************************************");
		for(int i=2;i<=number;i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd Numbers:"+i);
			}
			
		}
		
		//Even Odd by Using While Loop
		System.out.println("*********************************************");
		while(number%2==0)
		{
			System.out.println("Even Numbers: "+number);
			
		}
		
				
		
	}

}
