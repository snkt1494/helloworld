package static_nonstatic_method;



public class studentinfo_2 
{

	public static void main(String[] args)
	{
		
		studentinfo_1 a1=new studentinfo_1();
		   a1.studentname="name-kalpesh";
		   a1.rollno=52;
		   studentinfo_1.HOD="babasaheb";
		  
		studentinfo_1 a2=new studentinfo_1();
		     a2.studentname="sandip";
		     a2.rollno=67;
		     studentinfo_1.HOD="ravsaheb";
		    		 
		 studentinfo_1 a3=new studentinfo_1();
		     a3.studentname="dilip";
		     a3.rollno=23;
		     studentinfo_1.HOD="HOD name-sir don mustafa ";
		    		 
		    		 
		    	a1.data();
		    	a2.data();
		    	a3.data();
		   

	}
}
