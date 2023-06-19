package Acess_specifier;

public class sample3 

{
	int b;
	
	sample3()
	{
		b=20;
	}
	
	void printcubeofNum()
	{
		System.out.println(b*b*b);
	}
      public static void main(String[] args)
      {
		
    	  sample3 s3=new sample3();
    	  s3.printcubeofNum();
    	  System.out.println(s3.b);
    	  
	}
}
