package lists.LinkedList.AddRemove;
import java.util.LinkedList;

public class RemoveSpecificElement {

	/*
	 * public boolean remove(Object o): Removes the first occurrence of the specified element from
	 * this list, if it is present. If this list does not contain the element, it is unchanged.
	 * Returns true if this list contained the specified element (or equivalently, if this list
	 * changed as a result of the call). 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a LinkedList
	    LinkedList<String> linkedlist = new LinkedList<String>();
	 
	    // Add elements to LinkedList
	    linkedlist.add("Item1");
	    linkedlist.add("Item2");
	    linkedlist.add("Item3");
	    linkedlist.add("Item4");
	    linkedlist.add("Item5");
	 
	    // Displaying Elements before remove
	    System.out.println("Before Remove:");
	    for(String str: linkedlist)
	    	System.out.println(str);
	 
	    // Removing "Item4" from the list
	    linkedlist.remove("Item4");

	    // LinkedList elements after remove
	    System.out.println("\nAfter Remove:");
	    for(String str2: linkedlist)
	    	System.out.println(str2);
	}

}
