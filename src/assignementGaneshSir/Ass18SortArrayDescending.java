package assignementGaneshSir;

public class Ass18SortArrayDescending 
{
	public static void main(String[] args) 
	{
		int [] a= {45,89,42,65,95};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println("The Array Elements in Descending Order");
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		
	} 

}
