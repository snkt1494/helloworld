package Typesofvariables;

public class demo4 {
	
	int c=30;
	
	public static void main(String[] args)
	{
         demo4 d4 = new demo4();
		System.out.println(d4.c);
		
		System.out.println("---------------");
		
		demo5 d6= new demo5();
		
		System.out.println(d6.d);
		

	}
		
		
	
	
	public static void m1()
	{
		demo4 d5=new demo4();
		System.out.println(d5.c);
	}
	
	public void m2()
	{
		System.out.println(c);
	}
}
