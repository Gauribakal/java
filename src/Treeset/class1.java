package Treeset;

import java.util.TreeSet;

public class class1 {

	public static void main(String[] args)
	{
		TreeSet ts=new TreeSet();
		ts.add("dsjng");
		ts.add("sdjgn");
		ts.add("iuhr");
		ts.add("lisrf");
		ts.add("peh");
		ts.add("peh");
		System.out.println(ts);
		
		System.out.println("__________________");
		ts.pollFirst();
		System.out.println(ts);
		
		System.out.println("____________________-");
		ts.pollLast();
		System.out.println(ts);
		
		System.out.println("_________________________-");
		System.out.println(ts.first());
		
		System.out.println("_____________________");
		System.out.println(ts.last());
		
	}
}
