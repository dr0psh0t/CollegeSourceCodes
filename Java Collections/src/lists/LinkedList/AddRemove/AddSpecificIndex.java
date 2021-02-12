package lists.LinkedList.AddRemove;
import java.util.LinkedList;
import java.util.Iterator;

public class AddSpecificIndex {
	/*
	 * public void add(int index, E element): Inserts the specified element at the specified
	 * position in this list. Shifts the element currently at that position (if any) and any subsequent
	 * elements to the right (adds one to their indices).
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a LinkedList
	    LinkedList<String> linkedlist = new LinkedList<String>();
	 
	    // Add elements to LinkedList
	    linkedlist.add("Delhi");
	    linkedlist.add("Agra");
	    linkedlist.add("Mysore");
	    linkedlist.add("Chennai");
	    linkedlist.add("Pune");
	 
	    // Adding new Element at 5th Position 
	    linkedlist.add(4, "NEW ELEMENT");

	    // Iterating the list in forward direction
	    System.out.println("LinkedList elements After Addition:");
	    Iterator<String> it= linkedlist.iterator();
	    
	    while(it.hasNext())
	       System.out.println(it.next());
	}
}