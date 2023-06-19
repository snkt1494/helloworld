package mock;

public class Reversenumber 
{
    public static void main(String[] args)
    {
		 int orgNum= 253517 ;
		int revNum=0;
		
		for(int i=orgNum; i>0; i=i/10)
		{
			int rem =i%10;
			revNum=revNum*10 +rem;
		}		
		 
		System.out.println("orignal number:-"+ orgNum);
		 System.out.println("reverse number:-"+ revNum);
		 
		 
		 
		 
		 
		 // logic1: -get last digit from org number
		 
		 //int rem = orgNum %10;
		// System.out.println(rem);
		 
		 // logic2: remove last digit from org number
		 
		// orgNum=orgNum/10;
		// System.out.println(orgNum);
		 
	}
}
