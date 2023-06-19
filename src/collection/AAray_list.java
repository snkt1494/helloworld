package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AAray_list {
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add("Rshul");
		a1.add(101);
		a1.add(67.9f);
		a1.add('A');
		a1.add(101);
		a1.add(null);
		a1.add(null);
		
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		System.out.println(a1.get(3));
		
		
		a1.add(4, 800);
		System.out.println(a1);
		a1.remove(4);
		System.out.println(a1);
		System.out.println("-------print all data by itertor cursar----------");
		
		 Iterator itr = a1.iterator();
		System.out.println(itr);
		
		while(itr.hasNext())
				
		{
			System.out.println(itr.next());
		}
		
		System.out.println("----------print all data by list itarator corsor--------");
		
		ListIterator list = a1.listIterator();
		System.out.println(list);
		
		while(list.hasNext())
		{
			System.out.println(list.next());
		}

		System.out.println("----------print all data byfor loop list itarator corsor--------");
		
		for(int i=0; i<=a1.size()-1; i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println("----------print all data by for each loop--------");
		
		
		for(Object s1:a1)
		
		{
			System.out.println(s1);
		}
	}
	
	

}
