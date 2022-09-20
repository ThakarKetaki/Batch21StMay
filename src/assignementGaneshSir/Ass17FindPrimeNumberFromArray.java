package assignementGaneshSir;

public class Ass17FindPrimeNumberFromArray 
{
	public static void main(String[] args) 	
	{
		int arr[]= {4,3,5,7,9,10,12,11,48,71};
		boolean flag=true;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			flag=true;
			if(arr[i]>1)
			{
				for(int j=2;j<arr[i];j++)
				{
					if(arr[i]%j==0)
					{
						
						flag=false;
						break;
					}
				}
				if(flag==true)
				{
					System.out.print("Prime Numbers From Array: ");
					System.out.println(+arr[i]+" ");
				}
			}
		}

	}
	
}
