package lists.Vector.IterationEnumeration;

import java.util.Vector;
import java.util.ListIterator;

public class VectorListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		
		vector.add("Item1");
		vector.add("Item2");
		vector.add("Item3");
		vector.add("Item4");
		vector.add("Item5");
		
		ListIterator<String> litr = vector.listIterator();
		
		System.out.println("Traversing in forward direction:");
		while(litr.hasNext())
			System.out.println(litr.next());
		
		System.out.println("\nTraversing in backward direction:");
		while(litr.hasPrevious())
			System.out.println(litr.previous());
	}

}
