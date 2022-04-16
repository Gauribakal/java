package vector;

import java.util.Enumeration;
import java.util.Vector;

public class class1 {

	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add("Mayank");
		v.add("Patil");
		v.add(100);
		v.add(200);
		v.add(null);
		v.add(null);
		v.add(93.025);
		
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
	}
}
