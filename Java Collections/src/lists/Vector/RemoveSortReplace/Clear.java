package lists.Vector.RemoveSortReplace;
import java.util.Vector;

/*
public void clear()
Removes all of the elements from this Vector. The Vector will be empty after this call returns (unless it throws an exception).
 */
public class Clear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		
		vector.add("C++");
		vector.add("Java");
		vector.add("Cobol");
		vector.add("C");
		vector.add("Oracle");
		
		System.out.println("Current size of Vector: "+vector.size());
		
		//	calling clear() method pf Vector API
		vector.clear();
		
		System.out.println("Size of Vector after clear(): "+vector.size());
	}
}