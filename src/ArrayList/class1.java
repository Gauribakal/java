package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class class1 {


	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("rahul");
		al.add(100);
		al.add('A');
		al.add('B');
		al.add(null);
		
		System.out.println(al);
		
		
		
//		System.out.println("_______________");
//		System.out.println(al.size());
//		System.out.println(al.isEmpty());
//		System.out.println(al.contains(200));
//		System.out.println(al.get(3));
//		System.out.println("________________");
		
	    Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("_______list_________");
		  
		   ListIterator litr = al.listIterator();
		   while(litr.hasNext())
		   {
			   System.out.println(litr.next());
		   }
		   
		   while(litr.hasPrevious())
		   {
			   System.out.println(litr.previous());
		   }
		   System.out.println("-----------------------");
		   
		          for(int i=0; i<=al.size()-1; i++)
		        	  System.out.println(al.get(i));
		   
		          System.out.println("---------------------");
		   
		          for(Object s1:al)
		  		{
		  			System.out.println(s1);
		  		}

		          for(Object s1:al)
		          {
		        	  System.out.println(s1);
		          }
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	}
}
