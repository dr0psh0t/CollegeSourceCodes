package lists.Vector.Conversions;

import java.util.Vector;
import java.util.List;
import java.util.Collections;

public class VectorToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		
		vector.add("Tim");
		vector.add("Rock");
		vector.add("Hulk");
		vector.add("Rick");
		vector.add("James");
		
		System.out.println("Vector elements:");
		for(String t : vector)
			System.out.println(t);
		
		List<String> list = Collections.list(vector.elements());
		
		System.out.println("\nList elements:");
		for(int y = 0; y < list.size(); y++)
			System.out.println(list.get(y));
	}

}
