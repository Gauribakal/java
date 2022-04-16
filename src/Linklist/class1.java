package Linklist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class class1 {

	public static void main(String[] args)
	{
		LinkedList al=new LinkedList();
		al.add("I Luv u");
		al.add("u too");
		al.add("gud mrng");
		al.add("gud nyt");
		al.add("gud aftnoon");
		al.add(100);
		al.add(500);
		al.add(50.36);
		al.add(null);
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains(200));
		System.out.println(al.get(5));
		
		
		System.out.println("-------------------");
		al.set(9, "may be");
		System.out.println(al);
		
		System.out.println("_-------------------");
		al.remove(8);
		System.out.println(al);
		
		System.out.println("_------------------");
		al.add(500);
		System.out.println(al);
		
		System.out.println("----------------");
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("----------------");
		ListIterator litr = al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("---------------");
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("--------");
		for(Object s1:al)
		{
			System.out.println(s1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
