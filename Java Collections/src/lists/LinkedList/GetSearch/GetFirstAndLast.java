package lists.LinkedList.GetSearch;
import java.util.LinkedList;

public class GetFirstAndLast {

	// public E getFirst(): Returns the first element in this list.
	// public E getLast(): Returns the last element in this list.
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
	    linkedlist.add("Item6");
	 
	    // Getting First element of the List
	    String firstElement = linkedlist.getFirst();
	    System.out.println("First Element is: "+firstElement);
	 
	    // Getting Last element of the List
	    String lastElement = linkedlist.getLast();
	    System.out.println("Last Element is: "+lastElement);
	}

}
