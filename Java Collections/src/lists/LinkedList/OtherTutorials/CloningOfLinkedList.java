package lists.LinkedList.OtherTutorials;
import java.util.LinkedList;

public class CloningOfLinkedList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a LinkedList
	     LinkedList<String> list = new LinkedList<String>();

	     // Adding elements to the LinkedList
	     list.add("Element1");
	     list.add("Element2");
	     list.add("Element3");
	     list.add("Element4");

	     // Displaying LinkedList elements
	     System.out.println("LinkedList elements: "+list);
	 	 
	     // Clone list to list2
	     /* public Object clone(): Returns a shallow copy of this
	      * LinkedList. (The elements themselves are not cloned.)
	      */
	     
	     // Creating another list
	     LinkedList<String> list2 = (LinkedList<String>) list.clone();
	 
	     // Displaying elements of second LinkedList
	     System.out.println("List 2 Elements: "+list2);
	}

}
