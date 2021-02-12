package lists.LinkedList.OtherTutorials;
import java.util.LinkedList;

public class PopMethod {

	// public E pop(): Removes and returns the first element of the list.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a LinkedList of Strings
	     LinkedList<String> list = new LinkedList<String>();

	     // Add few Elements
	     list.add("Jack");
	     list.add("Robert");
	     list.add("Chaitanya");
	     list.add("kate");

	     // Display LinkList elements
	     System.out.println("LinkedList before: "+list);

	     // pop Element from list and display it
	     System.out.println("Element removed: "+list.pop());

	     // Display after pop operation
	     System.out.println("LinkedList after: "+list);
	}

}
