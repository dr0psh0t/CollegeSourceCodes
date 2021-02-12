package lists.LinkedList.OtherTutorials;
import java.util.LinkedList;

public class PeekMethods {
	
/*
	public E peek(): Retrieves, but does not remove, the head (first element) of this list.
	 
	public E peekFirst(): Retrieves, but does not remove, the first element of this list, 
	or returns null if this list is empty.

	public E peekLast(): Retrieves, but does not remove, the last element of this list, 
	or returns null if this list is empty.
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

	     //peek()
	     System.out.println(list.peek());
	 
	     //peekFirst()
	     System.out.println(list.peekFirst());
	 
	     //peekLast()
	     System.out.println(list.peekLast());

	     // Should be same as peek methods does not remove
	     System.out.println("LinkedList after: "+list);
	}

}
