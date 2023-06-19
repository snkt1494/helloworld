package Exceptionhandling;

public class example2
{
	public static void main(String[] args) 
	{
		
		int[] ar= {40,20,10,30};
		
		try
		{
			System.out.println(ar[9]);
		}
		
		catch (ArrayIndexOutOfBoundsException s1)
		
		{
			System.out.println(ar[0]);
			System.out.println(" ArrayIndexOutofBoundsException handled");
		}
		
		System.out.println("good night");
	}

}
