package generic_int;

import java.util.TreeSet;

public class class1 {

	public static void main(String[] args)
	{
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(100);
		ts.add(50);
		ts.add(985);
		ts.add(235);
		ts.add(100);
		System.out.println(ts);
		
		for( Integer s1:ts)
		{
			System.out.println(s1);
		}
	}
}