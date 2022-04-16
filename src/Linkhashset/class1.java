package Linkhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class class1 {
	
	public static void main(String[] args)
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Namaste");
		lhs.add("Welcome");
		lhs.add("Paylagu");
		lhs.add(null);
		lhs.add(null);
		lhs.add(100);
		lhs.add(100);
		lhs.add(800);
		System.out.println(lhs);
		System.out.println("____________________-");
		
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains(900));
		System.out.println(lhs.contains(null));
		
		System.out.println("_______________________");
		Iterator itr = lhs.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    
	    System.out.println("______________________________");
	    for(Object s1:lhs)
	    {
	    	System.out.println(s1);
	    }
	    lhs.clear();
	    System.out.println(lhs);
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	}

}
