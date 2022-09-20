package accessmodifier1;

public class ClassM
{
	public static void main(String[] args) 
	{
		ClassL l=new ClassL();
		System.out.println(l.a);
    	System.out.println(l.b);
    	///System.out.println(l.c);//Private Data Member
    	System.out.println(l.d);
		
	}

}
