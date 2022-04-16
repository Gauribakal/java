package __Lecture;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class hashset1 {

	public static void main(String[] args) {
		
		
		ArrayList al=new ArrayList();      
		al.add("rahul");
		al.add(100);
		al.add('A');     //2
		al.add(76.5f);
		al.add(100);
		al.add(100);
		al.add(100);
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		
		HashSet hs=new HashSet(al);
		System.out.println(hs);
			


	}

}
