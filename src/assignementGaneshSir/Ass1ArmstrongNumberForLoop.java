package assignementGaneshSir;

public class Ass1ArmstrongNumberForLoop 
{
	public static void main(String[] args) 
	{
		for(int num=1;num<7000;num++)
		{
			int rem=0;
			double result=0; //to store the result
			int num2=num;
			int temp=num;         //to check Armstrong number
			int counter=num;      //to check power of entered digit
			int power=0;          //to check power of entered digit
			
			while(counter>0)
			{
				power++;
				counter=counter/10;
			}
			
			while(num2!=0)
			{
				rem=num2%10;                        //153%10  rem=3   2. 15%10 rem=5 3.1%10=1
				num2=num2/10;                       //153/10 quotient=15 2.15/0 qotient=1  3. 1/10=0
				result=result+(Math.pow(rem, power)); //result=0+(3*3*3) 27 2.result=27+(5*5*5) 27+125= 152  
					                                      // 3. result=152+(1*1*1)=153  
			}
			if(result==temp)
			{
				System.out.println(temp+" Armstrong Number");
			}
			
		}
	}
}
