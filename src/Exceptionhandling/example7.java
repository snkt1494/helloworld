package Exceptionhandling;

public class example7
{
	public static void main(String[] args)
	{
		
		  String s1 ="abcd";
		 int [] ar= {40,20,10,30}; 
		  
		
		  
		 try 
		  {
			  System.out.println(s1.charAt(5));  //risky code
		  }
		  
		  catch (StringIndexOutOfBoundsException e3)
		  {
			  System.out.println("StringIndexOutOffBoundsException handled");
		  }
		  
		 try 
		   
		 {
			 System.out.println(ar[9]);  //risky code 2
		 }
	
		  catch(ArrayIndexOutOfBoundsException e1)
		  {
			  System.out.println("ArrayIndexOutOfBoundsException handled");
		  }
		  
		     System.out.println("hi");
             System.out.println("hellow");		  
		}

}	 
		 
		 
		 
		 
		 
		 
		
		
		 
		 
		  

	


