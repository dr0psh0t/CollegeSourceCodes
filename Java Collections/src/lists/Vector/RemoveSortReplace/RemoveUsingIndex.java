package lists.Vector.RemoveSortReplace;
import java.util.Arrays;
import java.util.Vector;

/*
public E remove(int index): Removes the element at the specified position in this Vector. 
Shifts any subsequent elements to the left (subtracts one from their indices). 
Returns the element that was removed from the Vector.
 */
public class RemoveUsingIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strr = {"As", "long", "you", "love", "me"};
//		Vector<String> vector = new Vector<String>(Arrays.asList("As", "long", "you", "love", "me"));
		Vector<String> vector = new Vector<String>(Arrays.asList(strr));
		
/*		vector.add("C++");
		vector.add("Java");
		vector.add("Cobol");
		vector.add("C");
		vector.add("Oracle");
		*/
		System.out.println("Vector elements before remove():");
		for(int i = 0; i < vector.size(); i++)
			System.out.println(vector.get(i));
		
		//	removing 3rd element from vector
		String str = vector.remove(2);
		
		System.out.println("\nElement removed from vector is: "+str);
		
		System.out.println("\nVector elements after remove():");
		for(int i = 0; i < vector.size(); i++)
			System.out.println(vector.get(i));
	}

}
