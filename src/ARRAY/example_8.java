package ARRAY;

public class example_8 
{

	   public static void main(String[] args)
	   {
		int ar [] [] =new int [2][3];
		
		     ar[0] [0]=10;
		     ar[0] [1]=20;		  
		     ar[0]	[2]	=30;  
		     ar[1]	[0]	=40;   
	         ar[1] [1] =50;
             ar[1] [2] =60;
            
            System.out.println(ar.length);
            System.out.println(ar[1][2]);
            System.out.println("------print all data");
            
            for(int i=0; i<=2; i++)
            {
            	for(int j=0; j<=2; j++)
            	{
            	System.out.println(ar[i][j]);
            }
            	System.out.println();
            }
            
	   }
}
		       








































































































































































