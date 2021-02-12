package lists.LinkedList.OtherTutorials;
import java.util.LinkedList;

public class CheckExisting {

	/*
		public boolean contains(Object o): Returns true if this list contains the specified element. 
		More formally, returns true if and only if this list contains at least one element e such 
		that (o==null ? e==null : o.equals(e)).
	*/
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

	    // contains() method checks whether the element exists
	    if (linkedlist.contains("CC"))
	    	System.out.println("Element CC is present in List");
	    else
	    	System.out.println("List doesn't have element CC");
	    
	    //Checking for element FF
	    if (linkedlist.contains("FF"))
	      	System.out.println("Element FF is present in List");
	    else
	        System.out.println("List doesn't have element FF");
	}

}
