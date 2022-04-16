package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class class3 {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("Rahu");
		al.add(100);
		al.add(200);
		al.add(null);
		al.add(20.36f);
		al.add("lkdv;l");
		al.add("nice");
		
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		System.out.println(al.contains(600));
		System.out.println(al.get(4));
		
		al.remove(3);
		System.out.println(al);
		
		al.add(5, "Patil");
		System.out.println(al);
		
		System.out.println("----------------");
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			
		System.out.println("---------------------");
		ListIterator litr = al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("-----------------");
		for(int i=0; i<=al.size()-1; i++)
			System.out.println(al.get(i));
		
		System.out.println("------------------");
		for(Object s1:al)
		{
			System.out.println(s1);
		}
	}
}







