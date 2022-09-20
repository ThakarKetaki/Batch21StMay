package assignementGaneshSir;

public class Ass9DuplicateStringFromArray 
{
	public static void main(String[] args) 
	{
		String[] inputArray= {"ketaki","Anil","omkar","ketaki","Pratiksha","Anil"};
		
		for(int i=0;i<inputArray.length;i++)
		{
			for(int j=i+1;j<inputArray.length;j++)
			{
				if(inputArray[i].equals(inputArray[j]))
				{
					System.out.println("Duplicate Element is:"+inputArray[j]);
				}
			}
			
		}
		
	}

}
