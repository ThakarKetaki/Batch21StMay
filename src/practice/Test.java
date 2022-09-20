package practice;

import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) {
		 Scanner s= new Scanner (System.in);
		 System.out.println("user name");
		 String input=s.next();
		
		 String output="";
		 int a=input.length();
		 for(int i=a-1; i>=0; i--) 
		 {
			 output=output+input.charAt(i);
		 }
		 System.out.println("Orignal string ="+input);
		 System.out.println("Reverse string ="+output);

	}
	
	

}
