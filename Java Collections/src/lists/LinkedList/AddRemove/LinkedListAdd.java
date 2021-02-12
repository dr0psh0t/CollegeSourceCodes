package lists.LinkedList.AddRemove;
import java.util.LinkedList;

public class LinkedListAdd {

	// public boolean add(E e): Appends the specified element to the end of this list.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a LinkedList
	     LinkedList<String> list = new LinkedList<String>();

	     // Adding elements to the LinkedList
	     list.add("Harry");
	     list.add("Ajeet");
	     list.add("Tom");
	     list.add("Steve");

	     // Displaying LinkedList elements
	     System.out.println("LinkedList elements: "+list);
	 
	     // Adding another element
	     list.add("Kate");
	 
	     // Displaying LinkedList elements after add(E e)
	     System.out.println("LinkedList elements: "+list);
	}

}
