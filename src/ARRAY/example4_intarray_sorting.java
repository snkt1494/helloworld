package ARRAY;

import java.util.Arrays;

public class example4_intarray_sorting 
{
    public static void main(String[] args)
    {
    	 int ar[]=new int[4];
   	  
 	    
 	    ar[0]= 30;
 	    ar[1]= 20;
 	    ar[2]= 40;
 	    ar[3]= 10;	 	
 	    
	
 	    System.out.println("-----print orignal info-----");
 	    
 	    for( int i=0; i<=ar.length-1; i++)
    	  
 	    {
 	    	System.out.println(ar[i]);
 	    	
 	    }
 	    Arrays.sort(ar);
 	    
 	    System.out.println("----print array info in assending order");
 	    
 	    for(int i=0;i<=ar.length-1;i++)
 	    
 	    {
 	    	System.out.println(ar[i]);
 	    }
 	    
 	    System.out.println("-----print array in dessending order");
 	    
    	   for (int i=ar.length-1; i>=0; i--)
    	   {
    		   System.out.println(ar[i]);
    	   }
    	
    	
    	
    	
    	
		
	}
	 
}
