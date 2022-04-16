package Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class hasset1 
{

	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		hs.add("asd");
		hs.add(250);
		hs.add(250);
		hs.add(null);
		hs.add(null);
		hs.add("BCD");
		hs.add(100);
		System.out.println(hs);
		
		System.out.println("________________________________");
		System.out.println(hs.size());
		System.out.println(hs.contains(250));
		System.out.println(hs.isEmpty());
		
		
		System.out.println("_________________");
		hs.remove("asd");
		System.out.println(hs);
		
		System.out.println("_______________________");
	    hs.add(600);
	    System.out.println(hs);
	    
	    System.out.println("_______________________");
	    Iterator itr = hs.iterator();
	    while (itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    	    
	    System.out.println("_________________________");
	    for(Object s1:hs)
	    {
	    	System.out.println(s1);
	    }
	hs.clear();
	System.out.println(hs);
	}
}
