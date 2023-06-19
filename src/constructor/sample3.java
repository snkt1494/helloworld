package constructor;

public class sample3
{
                         // userdefined constructor
	
	int num1;
	int num2;
	
	sample3()
	{
		num1=10;
	    num2=20;
	    
	}
	
	public void additioin ()
	{
		System.out.println(num1+num2);

	}
	public void multiplication ()
	
	{
	
	    
	    System.out.println(num1*num2);   // print karaych asel tarach semicln use kartatat
	}

	public static void main(String[] args)
	{
		
		sample3 s3=new sample3();
		
		s3.additioin();
		s3.multiplication();
		System.out.println("------------------");
		
		sample4 s4=new sample4();
		
		s4.subtraction();
	}
	
}
	

