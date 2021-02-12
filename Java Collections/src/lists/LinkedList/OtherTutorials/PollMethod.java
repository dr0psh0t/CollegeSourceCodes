package lists.LinkedList.OtherTutorials;
import java.util.LinkedList;

public class PollMethod {

	/* poll(): Retrieves and removes the head (first element)
     * of this list.
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a LinkedList of Strings
		LinkedList<String> list = new LinkedList<String>();

	    // Add few Elements
	    list.add("Element1");
	    list.add("Element2");
	    list.add("Element3");
	    list.add("Element4");

	    // Display LinkList elements
	    System.out.println("LinkedList before: "+list);

	    System.out.println("Element removed and retrieved: "+list.poll());

	    // Displaying list elements after poll() operation
	    System.out.println("LinkedList after: "+list);
	}

}
