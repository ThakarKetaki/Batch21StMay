package demoPackage;

public class ExampleIfElse {

	public static void main(String[] args) 
	{
		int a=190;
		int b=110;
		int c=200;
		int d=500;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A Greater");
			}
			else if(a>d)
			{
				System.out.println("A Greater");
			}
	
			else
			{
				System.out.println("D Greater");
			}
		}
		else if(b>c)
		{
			if(b>d)
			{
				System.out.println("B Greater");
			}
			else
			{
				System.out.println("D Greater");
			}
		}
		else if(c>d)
		{
			System.out.println("C Greater");
		}
		else
		{
			System.out.println("D Greater");
		}
		
		
		/*
		 * a b c d
		 *  a>b a>c  a>d
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
	}
}
