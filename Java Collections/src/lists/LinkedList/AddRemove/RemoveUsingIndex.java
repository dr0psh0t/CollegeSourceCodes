package lists.LinkedList.AddRemove;
import java.util.LinkedList;

public class RemoveUsingIndex {

	/*
	 * public E remove(int index): Removes the element at the specified position in this list.
	 * Shifts any subsequent elements to the left (subtracts one from their indices).
	 * Returns the element that was removed from the list.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a LinkedList
	    LinkedList<String> linkedlist = new LinkedList<String>();
	 
	    // Add elements to LinkedList
	    linkedlist.add("Cobol");
	    linkedlist.add("JCL");
	    linkedlist.add("C++");
	    linkedlist.add("C#");
	    linkedlist.add("Java");
	 
	    // Displaying Elements before replace
	    System.out.println("LinkedList Elements:");
	    for(String str: linkedlist)
	    	System.out.println(str);
	 
	    // Removing 3rd element
	    String e1 = linkedlist.remove(2);
	    System.out.println("\nElement "+ e1+ " removed from the list\n");

	    // LinkedList elements after remove
	    System.out.println("After removal:");
	    for(String str2: linkedlist)
	    	System.out.println(str2);
	}

}
