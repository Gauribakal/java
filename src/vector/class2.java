package vector;

import java.util.Enumeration;
import java.util.Vector;

public class class2 {

	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add("Mayanka");
		v.add("Patil");
		v.add(100);
		v.add(600);
		v.add(null);
		v.add(null);
		v.add(99.025);
		
		  Enumeration enu = v.elements();
		  while(enu.hasMoreElements())
		  {
			  System.out.println(enu.nextElement());
		  }
	}
}
