package assignementGaneshSir;

public class Ass20ReverseTheString 
{
	public static void main(String[] args) 
	{
		String str="ket";
		String revStr="";
		
		int len=str.length();
		//System.out.println(len);
		
		
		for(int i=(len-1);i>=0;i--)
		{
			revStr=revStr+str.charAt(i);
			
		}
		
		System.out.println("Original String: "+str);
		System.out.println("Reverse String: "+revStr);
		
	}

}
