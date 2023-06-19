package constructor;

public class sample7 
{
	int num1;
	int num2;
	String name;



sample7()
{num1=10;
 num2=20;		
}

sample7(int a,int b)

{ 
	num1=a;
	num2=b;
}
	
sample7 (String s1)

{
	name =s1;
	}
       
              public void studentname ()
              
              {
            	  System.out.println(name);
              }

              public void add()
              {
            	  System.out.println(num1+num2);
              }
              
              public static void main(String[] args) 
              {
				
            	  sample7 s7=new sample7();
            	      s7.add();
            	      System.out.println("-------------------------");
            	      
            	 sample7 s8=new sample7(5,6);   
            	       s8.add();
            	       System.out.println("------------------------");
            	      sample7 s9=new sample7("salman");
            	      
            	        s9.studentname();
		      }
              
              } 
              
              
              
              
              
              
              
              
