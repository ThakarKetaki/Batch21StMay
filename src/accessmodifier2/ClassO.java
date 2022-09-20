package accessmodifier2;

import accessmodifier1.ClassL;

public class ClassO 
{
	public static void main(String[] args) 
	{
		ClassL l=new ClassL();
		System.out.println(l.a);
    	//System.out.println(l.b);//Default Data Member
    	///System.out.println(l.c);//Private Data Member
    	//System.out.println(l.d);//Protected Data Member
		
	}

}
