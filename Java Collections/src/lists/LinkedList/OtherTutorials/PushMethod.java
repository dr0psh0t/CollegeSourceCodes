package lists.LinkedList.OtherTutorials;
import java.util.LinkedList;

public class PushMethod {

	// public void push(E e): Inserts the element at the front of the list.
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
	    System.out.println("LinkedList contains: "+list);
     
	    // push Element the list
	    list.push("NEW ELEMENT");

	    // Display after push operation
	    System.out.println("LinkedList contains: "+list);
	}

}
