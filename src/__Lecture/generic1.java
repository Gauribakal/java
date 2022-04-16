package __Lecture;

import java.util.Iterator;
import java.util.TreeSet;

public class generic1 {
	public static void main(String[] args) {
		
		
		TreeSet<Integer> tr=new TreeSet<Integer>();     //generic
		tr.add(400);
		tr.add(100);
		tr.add(200);
		tr.add(500);
		tr.add(300);
		tr.add(300);
		tr.add(700);
		tr.add(600);
		
		
		for(Integer s1:tr) 
		{
			System.out.println(s1);
		}
		
		
		
	}

}
