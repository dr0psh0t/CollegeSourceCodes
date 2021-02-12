package lists.ArrayList.AddAndRemove;
import java.util.ArrayList;

public class RemoveExample {
	// public boolean remove(Object obj) removes the specified object from the list

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String ArrayList
		ArrayList<String> al = new ArrayList<String>();
		al.add("AA");
		al.add("BB");
		al.add("CC");
		al.add("DD");
		al.add("EE");
		al.add("FF");
		
		System.out.println("ArrayList before remove:");
		for(String var: al)
			System.out.println(var);
		
		// removing element AA from the arraylist
		al.remove("AA");
		// removing element FF from the arraylist
		al.remove("FF");
		// removing element CC from the arraylist
		al.remove("CC");
		
		/*
		 * this element is not present in the list
		 * so it should return false
		 */
		boolean b = al.remove("GG");
		System.out.println("Element GG removed: "+b);
		System.out.println("ArrayList after remove:");
		for(String var2: al)
			System.out.println(var2);
	}

}
