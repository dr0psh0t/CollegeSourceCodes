package lists.Vector.IterationEnumeration;

import java.util.Vector;
import java.util.Enumeration;

public class VectorEnumerationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		
		vector.add("Chaitanya");
		vector.add("Shubham");
		vector.add("Apoorv");
		vector.add("Jin");
		vector.add("Jacob");
		
		//	get enumeration of Vector elements
		Enumeration<String> en = vector.elements();
		
		/*	display Vector elements using hasMoreElements()
		 * 	and nextElement() methods
		 */
		System.out.println("Vector elements are:");
		while(en.hasMoreElements())
			System.out.println(en.nextElement());
	}

}
