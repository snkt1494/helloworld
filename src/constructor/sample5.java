package constructor;

public class sample5 
{
	// user defined constructor with parameter
	
	int num1; 
	int num2;
	sample5(int a,int b)
	{
		num1=a;
		num2=b;	
	}

	   public void add()
	   {
		   System.out.println(num1+num2);
	   }
	   
	   public void mul()
	   {
		   System.out.println(num1*num2);
	   }
	   
	   public static void main(String[] args)
	   {
		sample5 s5=new sample5(10,20);
		
		s5.add();
		s5.mul();
		System.out.println("-----------");
		
		sample5 s6=new sample5(8,7);
		s6.add();
		s6.mul();
		System.out.println("-------------");
		
		sample5 s7=new sample5(5,3);
		s7.add();
		s7.mul();
		System.out.println("---------------------");
		
		sample6 s8=new sample6(20,15);
		
		s8.sub();
	}
	
}
