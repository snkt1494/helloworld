package ARRAY;

public class example_9
{
	public static void main(String[] args)
	{
	
		int ar[] [] = { {10,20,30},{40,50,60}};
		
		System.out.println(ar[1][2]);
		
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=2;j++)
			{
			  System.out.println(ar[i][j]+" ");	
			}
			System.out.println();
			}
		}
	

}
