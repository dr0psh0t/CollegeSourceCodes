package lists.ArrayList.ArrayListBasics.LoopArrayList;
import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Collections;

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an ArrayList object
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// add elements to ArrayList
		arrayList.add("C");
		arrayList.add("C++");
		arrayList.add("Java");
		arrayList.add("DotNet");
		arrayList.add("Perl");
		
		// get the Enumeration object
		Enumeration<String> e = Collections.enumeration(arrayList);
								// Returns an enumeration over the specified collection.
		
		// Enumerate through the ArrayList elements
		System.out.println("ArrayList elements: ");
		
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
	}

}
