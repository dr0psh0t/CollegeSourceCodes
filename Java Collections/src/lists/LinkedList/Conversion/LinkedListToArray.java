package lists.LinkedList.Conversion;
import java.util.LinkedList;

public class LinkedListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating and populating LinkedList
	    LinkedList<String> linkedlist = new LinkedList<String>();
	    linkedlist.add("Harry");
	    linkedlist.add("Maddy");
	    linkedlist.add("Chetan");
	    linkedlist.add("Chauhan");
	    linkedlist.add("Singh");

	    //Converting LinkedList to Array
	    String[] array = linkedlist.toArray(new String[linkedlist.size()]);

	    //Displaying Array content
	    System.out.println("Array Elements:");
	    for (int i = 0; i < array.length; i++)
	    	System.out.println(array[i]);
	}

}

/*
public <T> T[] toArray(T[] a): It returns an array containing all of the elements in this list 
in proper sequence (from first to last element); the runtime type of the returned array is 
that of the specified array. If the list fits in the specified array, it is returned therein. 
Otherwise, a new array is allocated with the runtime type of the specified array and the 
size of this list.
*/
