package Exceptionhandling;

public class example3
{

	   public static void main(String[] args)
	   {
		   
		   int num1=10;
		   int num2=0;
		   int div=0;
		
		   
		   try
		   {
			   div=num1/num2;
		   }
		   
		   catch (ArithmeticException s2)
		   {
			   System.out.println("ArithmeticException handled");
		   }
		 
		   System.out.println(div);
		   System.out.println("hi");
		   
		   
	}
	   
}
