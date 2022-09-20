package accessmodifier2;

import accessmodifier1.ClassA;

public class ClassD 
{
	public static void main(String[] args) 
	{
		System.out.println(ClassA.a);
		//System.out.println(ClassA.b);//Default Data member
		//System.out.println(ClassA.c);//Private Data member
		//System.out.println(ClassA.d);//Protected Data member
	}

}
