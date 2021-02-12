package lists.LinkedList.Conversion;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedlist = new LinkedList<String>();
	    linkedlist.add("Harry");
	    linkedlist.add("Jack");
	    linkedlist.add("Tim");
	    linkedlist.add("Rick");
	    linkedlist.add("Rock");

	    ArrayList<String> list = new ArrayList<String>(linkedlist);
	    System.out.print("LinkedList to ArrayList:\n");
	    for (String str : list)
	    	System.out.println(str);
	}

}
