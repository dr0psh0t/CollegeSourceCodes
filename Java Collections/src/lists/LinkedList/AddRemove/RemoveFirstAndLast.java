package lists.LinkedList.AddRemove;
import java.util.LinkedList;

public class RemoveFirstAndLast {

	/*
	 * public E removeFirst(): Removes and returns the first element from this list.
	 * public E removeLast(): Removes and returns the last element from this list.
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
	    System.out.println("LinkedList Elements are:");
	    for(String str: linkedlist)
	    	System.out.println(str);
	 
	    // Removing First element
	    String firstElement = linkedlist.removeFirst();
	    System.out.println("\nElement removed: "+ firstElement);
	 
	    // Removing last Element
	    String lastElement = linkedlist.removeLast();
	    System.out.println("Element removed: "+ lastElement);
	 
	    // LinkedList elements after remove
	    System.out.println("\nList Elements after Remove:");
	    for(String str2: linkedlist)
	    	System.out.println(str2);
	}

}
