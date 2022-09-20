package accessmodifier2;

import accessmodifier1.ClassL;

public class ClassN extends ClassL 
{
	public static void main(String[] args) 
	{
		//ClassL l=new ClassL();
		ClassN n=new ClassN();
		System.out.println(n.a);
    	//System.out.println(n.b);//Default Data Member
    	//System.out.println(n.c);//Private Data Member
    	System.out.println(n.d);
		
		
	}

}
