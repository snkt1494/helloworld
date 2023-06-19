package stringclass;

public class sample5 
{

	  public static void main(String[] args)
	  {
		
		  String s1="velocity";
		  String s2= "";
		  String s3= "abcd";
		  String s4= "ABCD";
		  String s5= "my name is abc";
		  String s6= "abcabcab";
		  
		  
		  System.out.println(s5.replace("abc", "khan"));
		  System.out.println(s5);
		  System.out.println(s3.concat(s4));
		  System.out.println(s3+s4);
		  System.out.println("-----------------------------------");
		  System.out.println(s1.substring(1,5));
		  System.out.println(s1.substring(4));
		  System.out.println(s5.endsWith("abc"));
		  System.out.println(s5.startsWith("my"));
		  System.out.println("-----------------------------------------");
		  System.out.println(s6.lastIndexOf('b'));
		  System.out.println(s6.indexOf('b') );
		  System.out.println(s1.charAt(4));
		  System.out.println("---------------------------------------");
		  System.out.println(s1.toUpperCase());
		  System.out.println(s4.toLowerCase());
		  System.out.println("--------------------------------------");
		  System.out.println(s3.equals(s4));
		  System.out.println(s3.equalsIgnoreCase(s4));
		  System.out.println(s5.contains("name"));
		  System.out.println(s1.length());
		  System.out.println(s1.isEmpty());
		  System.out.println(s2.isEmpty());
		  
		  
		  
		  

	  
	  
	  
	  
	  
	  
	  }
}
