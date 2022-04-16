package Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
 
	
	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		hs.add("Niketan");
		hs.add("Narayan");
		hs.add(200);
		hs.add(800);
		hs.add('A');
		hs.add('B');
		hs.add(100);
		hs.add(null);
		System.out.println(hs);

		System.out.println("____________-----");
		
		hs.remove(800);
		System.out.println(hs);
		
		System.out.println("________________-");
		hs.add("Vayu");
		System.out.println(hs);
		
		System.out.println("___________-");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("______________---");
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
		
		System.out.println("_______________");
		hs.clear();
		System.out.println(hs.size());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
