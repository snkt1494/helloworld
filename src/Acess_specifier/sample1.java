package Acess_specifier;

public class sample1 
{ 
	 int a;
	
	{
		a=10;
	}
	
	 void printsquareofnumber()
	{
		System.out.println(a*a);
	}

	   public static void main(String[] args) 
	   {
		sample1 s1=new sample1();
		System.out.println(s1.a);
		s1.printsquareofnumber();
	}
}
