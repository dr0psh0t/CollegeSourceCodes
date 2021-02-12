package lists.LinkedList.IteratorAndListIterator;
import java.util.LinkedList;
import java.util.Iterator;

public class UsingIteratorLoop {

	@SuppressWarnings("rawtypes")
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
	 
	    // Obtaining Iterator
	    Iterator it = linkedlist.iterator();
	 
	    // Iterating the list in forward direction
	    System.out.println("LinkedList elements:");
	    while(it.hasNext()){
	       System.out.println(it.next());
	    }
	}

}
