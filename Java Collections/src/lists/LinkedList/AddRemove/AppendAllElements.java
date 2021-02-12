package lists.LinkedList.AddRemove;
import java.util.ArrayList;
import java.util.LinkedList;

public class AppendAllElements {

	/*
	 * public boolean addAll(Collection<? extends E> c): Appends all of the elements in the specified
	 * collection to the end of this list, in the order that they are returned by the specified collection’s iterator.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a LinkedList
	     LinkedList<String> llist = new LinkedList<String>();

	     // Add elements to the LinkedList
	     llist.add("AA");
	     llist.add("BB");
	     llist.add("CC");
	     llist.add("DD");

	     // Displaying linked list before add
	     System.out.println("Before: LinkedList: " + llist);

	     // create a new list having few elements
	     ArrayList<String> aList = new ArrayList<String>();
	     aList.add("Item1");
	     aList.add("Item2");
	     aList.add("Item3");

	     // Append the list elements to LinkedList
	     llist.addAll(aList);

	     // Displaying the LinkedList after addAll
	     System.out.println("After: LinkedList: " + llist);
	}

}
