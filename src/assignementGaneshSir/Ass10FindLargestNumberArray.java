package assignementGaneshSir;

public class Ass10FindLargestNumberArray 
{
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		a[0]=45;
		a[1]=95;
		a[2]=145;
		a[3]=65;
		a[4]=105;
		int total=a.length-1;
		//Array Sorting in ascending Order
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			
		}
		System.out.println("largest Number from array is: "+a[total]);
		
		
	}

}
