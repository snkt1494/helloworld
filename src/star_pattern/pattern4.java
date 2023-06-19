package star_pattern;

public class pattern4
{
	public static void main(String[] args) 
	{
		
	
   
	int star = 1;int space =6;	
	
	   for( int i=1; i<=6; i++)
	   {
	   for(int j=1; j<=space ;j++)
		   { System.out.print(" ");}
		   
		   for(int s=1; s<=star; s++)
		   { System.out.print("* ");} 
	   
	   
	   star++;
	   space--;
	   System.out.println("  ");
	   }
	   
	//   System.out.println("---------------");
	    
	     m1();
	    
	   }
	   public static void m1()
	   {
		   int star= 6;
		   int space= 1;
		   
		   for( int i=1; i<=6; i++)
		   {
		   for(int j=1; j<=space ;j++)
			   { System.out.print(" ");}
			   
			   for(int s=1; s<=star; s++)
			   { System.out.print("* ");} 
		   
		   
		   star--;
		   space++;
		   System.out.println("  ");
		   }  
	   
	   
	 
		   
		   
		   
		   
		      
		   
}
}

