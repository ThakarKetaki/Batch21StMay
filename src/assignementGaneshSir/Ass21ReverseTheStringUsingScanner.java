package assignementGaneshSir;

import java.util.Scanner;

public class Ass21ReverseTheStringUsingScanner 
{
	public static void main(String[] args) 
	{
		/* next() can read the input only till the space.It can't read two words separated by space.
		 * 
		 * nextLine()reads input including space between the words.
		 * 
		 * */
		
		System.out.println("Enter a String to reverse: ");
		Scanner sc = new Scanner(System.in);
		String inputString=sc.nextLine();
		
		String reverse="";
		
		int len=inputString.length();
		
		for(int i=(len-1);i>=0;i--)
		{
			reverse=reverse+inputString.charAt(i);
		}
		
		System.out.println("Reversed String: "+ reverse);
		
		
		
		
	}

}
