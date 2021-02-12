package lists.Vector.VectorBasics;

import java.util.Vector;
import java.util.List;

public class Sublist {
	/*
	 * public List subList(int fromIndex, int toIndex): It returns a view of the portion of this List between fromIndex,
	 * inclusive, and toIndex, exclusive. (If fromIndex and toIndex are equal, the returned List is empty.) The returned List 
	 * is backed by this List, so changes in the returned List are reflected in this List, and vice-versa. The returned List
	 * supports all of the optional List operations supported by this List.
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Step 1: Create a Vector
	    Vector<String> vector = new Vector<String>();
	    
	    // Step 2: Add elements
	    vector.add("Item1");
	    vector.add("Item2");
	    vector.add("Item3");
	    vector.add("Item4");
	    vector.add("Item5");
	    vector.add("Item6");
	    /* The method subList(int fromIndex, int toIndex) 
	     * returns a List having elements of Vector 
	     * starting from index fromIndex 
	     * to (toIndex - 1).
	     */
	    List<String> subList = vector.subList(2,5);
	 
	    System.out.println("Sub list elements :");
	    for(int i=0; i < subList.size() ; i++){
	       System.out.println(subList.get(i));
	    }
	}
}