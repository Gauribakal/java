package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class class2 {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("Komal");
		al.add("Nayar");
		al.add(100);
		al.add(23.025);
		al.add('A');
		al.add('a');
		
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		
		al.add(2, "fd;jvn");
		System.out.println(al);
		
		    Iterator itr = al.iterator();
		    		while(itr.hasNext())
		    		{
		    			System.out.println(itr.next());
		    		}
		    		
		     ListIterator litr = al.listIterator();
		     while(litr.hasNext())
		     {
		    	 System.out.println(litr.next());
		     }
		     
		     for(int i=0; i<=al.size()-1; i++)
		     {
		    	 System.out.println(al.get(i));
		    	 
		     }
		    		
		}
}
