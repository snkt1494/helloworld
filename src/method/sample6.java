package method;

// non static method with parameter.

public class sample6
{
	public static void main(String[] args) {
		
		sample6 sj =new sample6();
		sj.multiplication(9,7);
		sj.addition (8,9);
		sj.substraction (8,2);
		
	}

	public  void multiplication(int n1,int n2)
	{ 
	
		System.out.println(n1*n2);
	
	}
	public  void addition (int n2,int n3)
	{ System.out.println(n2+n3);
}
	public  void substraction (int n4,int n5)
	{ System.out.println(n4-n5);
	
	}
	}
