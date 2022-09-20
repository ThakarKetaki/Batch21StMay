package accessmodifier1;

public class ClassB 
{
	public static void main(String[] args) 
	{
		System.out.println(ClassA.a);
		System.out.println(ClassA.b);
		//System.out.println(ClassA.c);//Private Data Member
		System.out.println(ClassA.d);
		
	}

}
