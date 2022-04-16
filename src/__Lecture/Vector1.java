package __Lecture;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {
public static void main(String[] args) {
		
		Vector v=new Vector();      //by default capacity=10
		v.add("rahul");
		v.add(100);
		v.add('A');     //2
		v.add(76.5f);
		v.add(100);
		v.add(null);
		v.add(null);
			
		System.out.println(v);
		System.out.println(v.size());     //7
		System.out.println(v.isEmpty());     // fvse
		System.out.println(v.contains(100));   //true
		System.out.println(v.get(2));    //A
		
		//add/insert info in between Vector --> right shift operation
		System.out.println(v);
		v.add(4, 200);
		System.out.println(v);
		
		//remove/delete info in between Vector  --> left shift operation
		v.remove(4);
		System.out.println(v);
		
		
		//update/modify info 
		v.set(5, "xyz");
		System.out.println(v);
		
		System.out.println("----------print Vector data using  iterator cursor-----------");
		
		Iterator itr = v.iterator();		
		while(itr.hasNext())    //true true  fvse
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("----------print Vector data using  Listiterator cursor-----------");
				
		ListIterator litr = v.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		
		System.out.println("----------print Vector data using  for loop-----------");
		for(int i=0; i<=v.size()-1; i++) 
		{
			System.out.println(v.get(i));
		}
		
		
		System.out.println("----------print Vector data using  for each loop-----------");
		
		for(Object s1:v)
		{
			System.out.println(s1);
		}
		
		
		System.out.println("----------print Vector data using  enumeration cursor-----------");
		
		Enumeration enu = v.elements();
		
		while(enu.hasMoreElements()) 
		{
			System.out.println(enu.nextElement());
		}

	}
}
