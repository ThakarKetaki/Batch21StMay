package demoPackage;

public class Test 
{
public static void main(String[] args) 
{
	String[] my_array = {"omkar","Omkar","ketaki","ketaki","pratiksha"};
	
	
	for (int i = 0; i < my_array.length; i++)
    {
        for (int j = i+1; j < my_array.length; j++)
        {
        	if( my_array[i].equalsIgnoreCase(my_array[j]))         
        	{
                System.out.println("Duplicate Element is : "+my_array[j]);
            }
        }
    }
	
}

}
