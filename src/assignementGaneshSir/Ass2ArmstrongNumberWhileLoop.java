package assignementGaneshSir;

import java.util.Scanner;

public class Ass2ArmstrongNumberWhileLoop 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		
		double result=0;      //to store the result
		int temp=num;         //to check Armstrong number
		int counter=num;      //to check power of entered digit
		int power=0;          //to check power of entered digit
		
		while(counter>0)
		{
			power++;
			counter=counter/10;
		}
		
		while(num!=0)
		{
			int rem=num%10;                   //153%10  rem=3   2. 15%10 rem=5 3.1%10=1
			num=num/10;                       //153/10 quotient=15 2.15/0 qotient=1  3. 1/10=0
			result=result+(Math.pow(rem, power)); //result=0+(3*3*3) 27 2.result=27+(5*5*5) 27+125= 152  
				                                      // 3. result=152+(1*1*1)=153  
		}
		if(temp==result)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
		
	}

}
