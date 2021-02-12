package lists.Vector.RemoveSortReplace;
import java.util.Vector;

/*
public E set(int index, E element): Replaces the element at the specified position in this Vector with the specified element.
 */
public class ReplaceElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		
		vector.add("Harry");
		vector.add("Steve");
		vector.add("Vince");
		vector.add("David");
		vector.add("Matt");
		
		System.out.println("Vector element before replacement: ");
		for(int g = 0; g < vector.size(); g++)
			System.out.println(vector.get(g));
		
		//	replacing index 1 element
		vector.set(1, "Mark");
		
		//	replacing index 2 element
		vector.set(2, "Jack");
		
		System.out.println("Vector elements after replacement:");
		for(String j : vector)
			System.out.println(j);
	}

}
