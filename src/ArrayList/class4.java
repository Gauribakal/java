package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class class4 {
	

	public static void main(String[] args) {
	
	ArrayList al=new ArrayList();
	al.add("Nayna");
	al.add(100);
	al.add(null);
	al.add(null);
	al.add(200);
	al.add("Misha");
	al.add(59.20f);
	al.add('A');
	System.out.println(al);
	
	System.out.println("___________------");
	al.remove(1);
	System.out.println(al);
	
	System.out.println("_________________---");
	al.add(3, "aalu");
	System.out.println(al);
	
	System.out.println("__________----------");
	Iterator itr = al.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
	System.out.println("_______________--");
	 ListIterator litr = al.listIterator();
			 while(litr.hasNext())
			 {
				 System.out.println(litr.next());
			 }
	 System.out.println("__________----------");		
	 for(int i=0; i<=al.size()-1; i++)
	 {
		 System.out.println(al.get(i));
	 }
	 System.out.println("-----------------------");
	 for(Object s1:al)
	 {
		 System.out.println(s1);
	 }
			
			
			
				
	
	
	
}
}
