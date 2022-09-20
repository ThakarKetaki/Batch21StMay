package assignementGaneshSir;

import java.util.Scanner;

public class Ass15FindPalindromNumber 
{
	public static void main(String[] args) 
	{
		int rem;
		int sum=0;
		int temp;
		int num;
		
		System.out.println("Enter a Number to check Palindrome");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		System.out.println("Reverse of entered number is: "+ sum);
		if(temp==sum)
		{
			System.out.println(temp+" is a palindrome number");
		}
		else
		{
			System.out.println(temp+" is not a palindrome number");
		}
				
		
	}

}
