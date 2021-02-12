package lists.Vector.Conversions;

import java.util.Vector;
import java.util.ArrayList;

public class VectorToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		
		vector.add("Rahul");
		vector.add("Steve");
		vector.add("Jude");
		vector.add("Locke");
		vector.add("Mike");
		vector.add("Robert");
		
		//	displaying Vector elements
		for(String j : vector)
			System.out.println(j);
		
		//	converting Vector to ArrayList
		ArrayList<String> arrayList = new ArrayList<String>(vector);
		
		//	displaying ArrayList elements
		System.out.println("\nArrayList Elements: ");
		for(int h = 0; h < arrayList.size(); h++)
			System.out.println(arrayList.get(h));
	}

}
