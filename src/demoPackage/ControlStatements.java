package demoPackage;

public class ControlStatements {
	public static void main(String[] args) 
	{
		/*if(condition)
		{
			Body
		}
		else
		{
		    Body
		}
		
		
		*/
		/*
		 * if(Condition)
		 * {
		 *   Body
		 * }
		 *   else if(Condition)
		 *   {
		 *     Body
		 *   }
		 *   else if(Condition)
		 *     {
		 *       Body
		 *     }
		 *   else
		 *   {
		 *   }    
		 *     
		 * 
		 * */
		
		/* if(condition)
		 * {
		 *    if(condition)
		 *    {
		 *      Body
		 *    }
		 *    else
		 *    {
		 *      Body
		 *    }    
		 * }
		 * else
		 * {
		 *   if(condition)
		 *    {
		 *      Body
		 *    }
		 *    else
		 *    {
		 *      Body
		 *    }    
		 * }
		 * 
		 * */
		
		
		int a[]= {1,2,3,4,5,6};
		int b= a.length;
		System.out.println(b);
		int c= a.length-1;
		System.out.println(c);
		
		System.out.println("------------------------");
		for (int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
