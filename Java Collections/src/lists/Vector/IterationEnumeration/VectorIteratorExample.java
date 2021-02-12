package lists.Vector.IterationEnumeration;

import java.util.Vector;
import java.util.Iterator;

public class VectorIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		
		vector.add("Mango");
		vector.add("Orance");
		vector.add("Apple");
		vector.add("Grapes");
		vector.add("Kiwi");
		
		//	obtaining an iterator
		Iterator<String> it = vector.iterator();
		
		System.out.println("Vector elements are:");
		while(it.hasNext())
			System.out.println(it.next());
	}

}
