package ARRAY;

public class ex6_intarrayin_singlestep

{

	   public static void main(String[] args)
	   {
		
		   int ar []= {30,20,40,10};
		   
		   System.out.println(ar.length);
		   System.out.println(ar[2]);
		   
		   System.out.println("-----print all area-----");
		   
		   for(int i=ar.length-1; i>=0; i--)
		   {
			   System.out.println(ar[i]);
		   }
	}
}
