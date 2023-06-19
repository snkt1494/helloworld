package mock;

public class reverseString
{

	 public static void main(String[] args)
	 {
		
		 String org ="my name is ravsaheb";
			String rev	=""; 
			
			for(int i=org.length()-1; i>=0; i--)
			{
		       rev=rev+org.charAt(i);
			}
			
			
			System.out.println("Orignal name:-"+org);
			System.out.println("reverse name:-"+  rev);
	}
	
}

