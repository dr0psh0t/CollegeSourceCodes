package lists.LinkedList.AddRemove;
import java.util.LinkedList;

public class AddBeginningAndEnd {

	/*
	 * public void addFirst(E e): Inserts the specified element at the beginning of this list.
	 * public void addLast(E e): Appends the specified element to the end of this list.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating LinkedList of String Elements
	    LinkedList<String> linkedlist = new LinkedList<String>();
	 
	    //Populating it with String values
	    linkedlist.add("AA");
	    linkedlist.add("BB");
	    linkedlist.add("CC");
	    linkedlist.add("DD");
	    linkedlist.add("EE");

	    //Displaying LinkedList elements
	    System.out.println(linkedlist);
	 
	    //Adding an element at the beginning 
	    linkedlist.addFirst("FIRST");
	 
	    //Displaying the List after addition
	    System.out.println(linkedlist);
	 
	    //Adding an element at the end of list 
	    linkedlist.addLast("LAST");
	 
	    //Displaying the final list
	    System.out.println(linkedlist);
	}

}
