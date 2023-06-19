package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HasSet {
            public static void main(String[] args) {
				
            	HashSet hs=new HashSet();
            	hs.add("Rahul");
            	hs.add(101);
            	hs.add(65.56);
            	hs.add('A');
            	hs.add('A');
            	hs.add(null);
            	hs.add(null);
            	
            	
            	
            	
            	System.out.println(hs);
            	System.out.println(hs.size());
            	System.out.println(hs.isEmpty());
            	
            	
            	hs.remove(101);
            	System.out.println(hs);
            	System.out.println("----------print data using iterator----------");
            	
            	Iterator itr=hs.iterator();
            	while(itr.hasNext())
            	{
            		System.out.println(itr.next());
            	}
            	
            	
            	
			}
            
}
