package Exceptionhandling;

public class example6 
{
	public static void main(String[] args)
	{
		
		  String s1 ="abcd";
		  
		  
		  try 
		  {
			  System.out.println(s1.charAt(5));  //risky code
		  }
		  
		  catch(ArrayIndexOutOfBoundsException e1)
		  {
			  System.out.println("ArrayIndexOutOfBoundsException handled");
		  }
		  

		  catch (StringIndexOutOfBoundsException e3)
		  {
			  System.out.println("StringIndexOutOffBoundsException handled");
		  }
		  
		  catch (Exception e)
		  {
			  System.out.println("generic Exception handlid");
		  }
		  
		  System.out.println("hi");
		  System.out.println("hellow");
	}

}

	

