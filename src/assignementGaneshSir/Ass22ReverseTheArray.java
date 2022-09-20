package assignementGaneshSir;

public class Ass22ReverseTheArray 
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50};
		
		System.out.println("The give array is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("-------------------");
		System.out.println("Reverse array is: ");
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
	}

}
