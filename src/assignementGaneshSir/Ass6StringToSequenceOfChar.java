package assignementGaneshSir;

public class Ass6StringToSequenceOfChar
{
	public static void main(String[] args) 
	{
		String str="Velocity";
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			System.out.println("Character at "+i+" index:"+c);
		}
	}

}
