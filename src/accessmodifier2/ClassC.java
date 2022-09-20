package accessmodifier2;

import accessmodifier1.ClassA;

public class ClassC extends ClassA 
{
	public static void main(String[] args) 
	{
		System.out.println(ClassA.a);
		//System.out.println(ClassA.b);//Default Data member
		//System.out.println(ClassA.c);//Private Data Member
		System.out.println(ClassA.d);
		
	}

}
