package ARRAY;

public class example2_useint
{
	
	public static void main(String[] args)
	{
		
		int ar[]= new int[4];
		
		
		ar[0]=30;
		ar[1]=20;
		ar[2]=40;	
		ar[3]=10;
		
		System.out.println(ar.length);
		System.out.println(ar[2]);
		
		System.out.println("print all information from string array-------");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
				
	}

}

