package static_nonstatic_method;

public class empinfo 
{
   public static void main(String[] args)
   {
	
	   Emp e1=new Emp();
	   e1.empName="Amol";
	   e1.empID=101;
	   Emp.empCEOName="ABC";
			   
		Emp e2=new Emp();
	    e2.empName="Rahul";
	    e2.empID= 102;
	    Emp.empCEOName="XYZ";
	    		
	   Emp e3=new Emp();
	    e3.empName="ganesh";
	    e3.empID = 103;
	    Emp.empCEOName="LHS";
	    		
	    		e1.empinfo();
	            e2.empinfo();
	            e3.empinfo();
			   
}
	
}
