package star_pattern;

public class pattern3
{

	public static void main(String[] args)
	{
		   int star=5;
		   int space= 1;
		   
		   for( int i=1; i<=5; i++)
		   {
			   for(int j=1; j<=space;j++)
			   { System.out.print(" ");}
			   
			   for(int s=1; s<=star; s++)
			   { System.out.print("* ");} 
		   
		   
		   star--;
		   space++;
		   System.out.println("  ");
	}
	}
}
