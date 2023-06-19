package ARRAY;

import java.util.Arrays;

public class ex5_stringarraysorting
{

	  public static void main(String[] args) 
	
	  {
		
			String ar[]=new String[5];
	    	
	    	ar[0] ="rahul";
	    	ar[1]= "baban";
	    	ar[2]="kalu";
	    	ar[3]= "ravi";
	    	ar[4]="babalu";	
	    	
	    	Arrays.sort(ar);

	    	for(int i=0; i<=ar.length-1; i++)
	    	{
	    		System.out.println(ar[i]);
	    	}
	  }
	
}
