package Hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class class1 {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("Naydu");
		al.add("Birds");
		al.add(null);
		al.add(100);
		al.add(200);
		al.add("Soft");
		al.add(100);
		al.add(null);
		
		HashSet hs=new HashSet(al);
		System.out.println(hs);
		
		
		
	}
}
