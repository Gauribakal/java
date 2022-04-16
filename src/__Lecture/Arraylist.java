package __Lecture;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist {

	public static void main(String[] args) {
		
		//ArrayList al=new ArrayList(20);      resizable
		ArrayList al=new ArrayList();      //by default capacity=10
		al.add("rahul");
		al.add(100);
		al.add('A');     //2
		al.add(76.5f);
		al.add(100);
		al.add(null);
		al.add(null);
		
			
		System.out.println(al);
		System.out.println(al.size());     //7
		System.out.println(al.isEmpty());     // false
		System.out.println(al.contains(100));   //true
		System.out.println(al.get(2));    //A
		
		//add/insert info in between arraylist --> right shift operation
		System.out.println(al);
		al.add(4, 200);
		System.out.println(al);
		
		//remove/delete info in between arraylist  --> left shift operation
		al.remove(4);
		System.out.println(al);
		
		
		//update info 
		al.set(5, "xyz");
		System.out.println(al);
		
		System.out.println("----------print arraylist data using  iterator cursor-----------");
		
		Iterator itr = al.iterator();		
		while(itr.hasNext())    //true true  false
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("----------print arraylist data using  Listiterator cursor-----------");
				
		 ListIterator litr = al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		
		System.out.println("----------print arraylist data using  for loop-----------");
		for(int i=0; i<=al.size()-1; i++) 
		{
			System.out.println(al.get(i));
		}
		
		
		System.out.println("----------print arraylist data using  for each loop-----------");
		
		for(Object s1:al)
		{
			System.out.println(s1);
		}

	}

}
