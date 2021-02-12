package lists.Vector.VectorBasics;

import java.util.Collections;
import java.util.Vector;

public class VectorCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// first vector
		Vector<String> va = new Vector<String>();
		
		// adding elements to the first vector
		va.add("AB");
		va.add("BC");
		va.add("CD");
		va.add("DE");
		
		// second vector
		Vector<String> vb = new Vector<String>();
		
		// adding elements to the second vector
		vb.add("1st");
		vb.add("2nd");
		vb.add("3rd");
		vb.add("4th");
		vb.add("5th");
		vb.add("6th");
		
		/*
		 * displaying the elements of second vector before
		 * performing the copy operation
		 */
		System.out.println("Vector vb before copy: "+vb);
		
		/* copying all the elements of vector va to vector vb
		 * public static <T> void copy(List<? super T> dest, List<? extends T> src)
		 */
		Collections.copy(vb, va);
		
		// displaying elements after copy
		System.out.println("Vector vb after copy: "+vb);
	}

}
