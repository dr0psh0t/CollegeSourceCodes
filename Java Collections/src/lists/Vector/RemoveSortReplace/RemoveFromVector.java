package lists.Vector.RemoveSortReplace;
import java.util.Vector;

/*
public boolean remove(Object o): Removes the first occurrence of the specified
element from Vector If the Vector does not contain the element, it is unchanged.
 */
public class RemoveFromVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		
		// adding elements
		vector.add("Harry");
		vector.add("Steve");
		vector.add("Vince");
		vector.add("David");
		vector.add("Matt");
		
		System.out.println("Vector elements before remove():");
		for(int i = 0; i < vector.size(); i++)
			System.out.println(vector.get(i));
		
		// removing Harry
		vector.remove("Harry");
		
		// removing Matt
		vector.remove("Matt");
		
		System.out.println("\nVector elements after remove():");
		for(int i = 0; i < vector.size(); i++)
			System.out.println(vector.get(i));
	}

}
