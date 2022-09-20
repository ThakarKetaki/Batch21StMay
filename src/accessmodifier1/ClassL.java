package accessmodifier1;

public class ClassL 
{
	public int a=50;
		   int b=60;
    private int c=70;
    protected int d=80;
    
    public static void main(String[] args) 
    {
    	ClassL l=new ClassL();
    	System.out.println(l.a);
    	System.out.println(l.b);
    	System.out.println(l.c);
    	System.out.println(l.d);
    	
		
	}

}
