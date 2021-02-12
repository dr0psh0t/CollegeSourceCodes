package lists.LinkedList.GetSearch;
import java.util.LinkedList;

public class GetElementIndex {

	// public E get(int index): Returns the element at the specified position in this list.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating LinkedList of String Elements
	    LinkedList<String> linkedlist = new LinkedList<String>();
	 
	    // Populating it with String values
	    linkedlist.add("AA");
	    linkedlist.add("BB");
	    linkedlist.add("CC");
	    linkedlist.add("DD");
	    linkedlist.add("EE");

	    System.out.println("LinkedList Elements : ");
	    //get(i) returns element present at index i
	    for(int i=0; i < linkedlist.size(); i++)
	    	System.out.println("Element at index "+i+" is: "+linkedlist.get(i));
	}

}
