package demoPackage;

public class DemoExample 
{
	public static void main(String[] args)
	{
		int a=190; // a b c d
		int b=555;
		int c=245;
		int d=165;
		
		if(a>b)
		{
			if(a>d) 
			{
				System.out.println("a is greater = " + a);
			}
			  if (a>c) 
			   {
			     System.out.println("a is greater = " + a);
			   }		
			     else 
			     {
				   System.out.println("d is greater = " + d);
			     }		
		}
		else
		{
			if(b>d) 
			{
				System.out.println("B greater No"+b);
			}
				
			else if (b>c) 
			   {
				 System.out.println("b is greater"+b);
			   }
			  else
			  {
				  System.out.println("c is greater="+c);
			  }
		
	}



}
}