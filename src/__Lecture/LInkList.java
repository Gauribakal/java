package __Lecture;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LInkList {

	public static void main(String[] args)
	{		
		
		
		LinkedList ll=new LinkedList();	
		ll.add("rahul");
		ll.add(100);
		ll.add('A');
		ll.add(55.6f);
		ll.add(100);
		ll.add(null);
		ll.add(null);
				
		System.out.println(ll);
		System.out.println(ll.size());  
		System.out.println(ll.contains('A'));
		System.out.println(ll.get(0));
		System.out.println(ll.isEmpty());
		
		
		System.out.println(ll);
		//add/insert info in between linkedlist
		ll.add(4,300);
		System.out.println(ll);
		
		//remove/delete info in between linkedlist
		ll.remove(4);
		System.out.println(ll);
		
		//update/modify		
		ll.set(0, "ganesh");
		System.out.println(ll);
		
		System.out.println("------print ll info using iterator cursor-------");
		 Iterator itr = ll.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());			
		}
		
		System.out.println("------print ll info using Listiterator cursor-------");
		ListIterator lit = ll.listIterator();
		while (lit.hasNext())
		{
			System.out.println(lit.next());			
		}
		
		
		System.out.println("------print ll info using for loop-------");		
		for(int i=0; i<=ll.size()-1; i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("------print ll info using for each loop-------");
		for(Object s1:ll) 
		{
			System.out.println(s1);
		}
		
		
	}
}
