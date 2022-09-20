package demoPackage;

public class LogicalOperators {
	
	public static void main(String[] args)
	{
		/*int a=30;
		int b=40;
		
		if(a<b || b<a)
		{
			System.out.println("Condition True");
		
		}
		else
		{
			System.out.println("False Condition");
			
		}
		if(a!=b)
		{
			
		}*/
		
		int a=70;
		int b=85;
		int c=95;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greater number");
			}
			else
			{
				System.out.println("C is greater number");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("B is greater number");
			}
			else
			{
				System.out.println("C is Greater Number");
			}
		}
	}
	

}
