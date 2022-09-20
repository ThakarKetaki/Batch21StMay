package practice;

public interface TestInter 
{
	int r=50;
	void test();
	
	public static void demo()
	{
		System.out.println("Static method of interface");
	}
	
	public default void defaultMethod()
	{
		System.out.println("Default Method of Interface");
	}

}
