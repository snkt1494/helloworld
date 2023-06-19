package ARRAY;

public class example_3printarrayinreverse_order 
{
      public static void main(String[] args)
      {
    	  int ar[] = new int[4];
    	  
    	    
    	    ar[0]= 30;
    	    ar[1]= 20;
    	    ar[2]= 40;
    	    ar[3]= 10;	 	
    	    
	
    	    System.out.println("-----print orignal info-----");
    	    
    	    for(  int i=0; i<=ar.length-1; i++)
    	    	
    	    {
    	    	System.out.println(ar[i]);
    	    }
    	    System.out.println("----print array info reverse order----");
    	    
    	    for (int  i=ar.length-1;i>=0;  i--)
    	    {
    	    	System.out.println(ar[i]);
    	    }
    	    
	}
	
	
}
