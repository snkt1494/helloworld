package mock;

public class palindrome_sting

{
	{
	    String org="madam";
	    String rev = "";
	    
	    	
	    
	    for (int i=org.length()-1; i>=0; i--)
	    {
	    	rev=rev+org.charAt(i);
	    }
	    
	       System.out.println(rev);
			
	       if (org.equals(rev))
	    {
	    	System.out.println(org+"is palindrome String");
	    }
	    
	    else
	    	
	    {
	    	System.out.println(org+"is not palindrome string");
	    }
	            
	   }

	}
	   
	
	

