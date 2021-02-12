package lists.Vector.VectorBasics;
import java.util.Vector;
/*
	1) public int indexOf(Object o): It returns the index of first occurrence of Object o in Vector.
	2) public int indexOf(Object o, int startIndex): It returns the index of the first occurrence of the
		Object o in this vector, searching forwards from startIndex (inclusive).
	3) public int lastIndexOf(Object o): It returns the index of last occurrence of Object o in Vector.
	4) public int lastIndexOf(Object o, int startIndex): It returns the index of the last occurrence of
		the specified element in this vector, searching backwards from startIndex(inclusive).
 */
public class SearchVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> vector = new Vector<String>();
		
		// add elements to vector
		vector.add("Kate");
		vector.add("Patt");
		vector.add("Kluuge");
		vector.add("Karon");
		vector.add("Patt");
		vector.add("Monica");
		vector.add("Patt");
		
		// return the index of first occurence
		int firstIndex = vector.indexOf("Patt");
		System.out.println("First Occurence of Patt is at index "+firstIndex);
		
		// start the searching from index 2(inclusive)
		int afterIndex = vector.indexOf("Patt", 6);
		System.out.println("Occurence after index 2: "+afterIndex);
		
		// search the element backward starting from index 6(inclusive)
		int beforeIndex = vector.lastIndexOf("Patt", 6);
		System.out.println("Occurence before index 6: "+beforeIndex);
	}

}
