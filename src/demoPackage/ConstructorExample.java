package demoPackage;

public class ConstructorExample 
{
	static byte a;
	static float b;
	static char c;
	static boolean d;
	static  String e;
	
	/*ConstructorExample()   //zero Argument Constructor 
	{
		a=10;
		b=30.50f;
		c='s';
		d=true;
		e="Velocity";
		
	}
	
	ConstructorExample(int r)   //zero Argument Constructor 
	{
		a=20;
		b=40.50f;
		c='q';
		d=false;
		e="Testing";
		
	}*/
	public static void main(String[] args) 
	{
		new ConstructorExample();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		/*System.out.println("-------------------");
		
		new ConstructorExample(20);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);*/
	}

}
