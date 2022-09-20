package practice;

public class ClassB extends ClassA
{
	public static void demo()
	{
		System.out.println("demo method classB");
	}
	public void method2()
	{
		System.out.println("Tesing");
	}
	
	public static void main(String[] args) 
	{
		ClassB b1=new ClassB();
		b1.demo();
		b1.method2();
		
		ClassA b2=new ClassB();
		b2.demo();
		b2.method2();
		
	}

}
