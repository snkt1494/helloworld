package ARRAY;

public class Eexmple1_useString
{
    public static void main(String[] args)
    {
		
    	String ar[]=new String[5];
    	
    	ar[0] ="rahul";
    	ar[1]= "baban";
    	ar[2]="kalu";
    	ar[3]= "ravi";
    	ar[4]="babalu";	
    			
    			
    			System.out.println(ar.length);
    	System.out.println(ar[2]);
    	System.out.println(ar[3]);
    	
    	System.out.println("print all information from String array---------"); 
    	
    	    for(int  i=0; i<=ar.length-1; i++)
    	    {
    	    	System.out.println(ar[i]);
    	    }
	}
}
