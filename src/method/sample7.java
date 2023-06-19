package method;

public class sample7
{
	
	public static void main(String[] args) 
	{
		studentname("sanket");
		studentname("samrudhhi");
		
		System.out.println("----------"); 
		
		studentfullname("sanket","jagtap");
		studentfullname("samrudhhi","jagtap");
		studentfullname("jayshree","sonawane");
		
		System.out.println("------------");
		
		sample8.studentinfo("golu",101,68.8f,'B');
		sample8.studentinfo("dholu",105,56.89f,'A');
		
	}
	
	     public static void studentname(String s1 )
	     {
	    	 System.out.println(s1);
	     }
	     
	    public static void studentfullname(String fname,String lname)
	    
	    {
	    	System.out.println(fname+ lname);
	    }

	 
	   }
	

				
         
     
      

     
