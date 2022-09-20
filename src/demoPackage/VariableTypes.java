package demoPackage;

public class VariableTypes
{
	static int a=10;
	       int b=20;
	       
	VariableTypes() 
	{
		int p=40;
		System.out.println(p);
	}
	static void demo(int m)
	{
		int j=90;
		System.out.println(j);
		m=50;
		System.out.println(m);
	}
	public static void main(String[] args) 
	{
		System.out.println(VariableTypes.a);
		VariableTypes v=new VariableTypes();
		System.out.println(v.b);
		new VariableTypes();
		demo(1);
		
		
	}

}
