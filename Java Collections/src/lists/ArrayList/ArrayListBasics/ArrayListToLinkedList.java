package lists.ArrayList.ArrayListBasics;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListToLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Harry");
	    al.add("Maddy");
	    al.add("Chetan");
	    al.add("Chauhan");
	    al.add("Singh");
	    
	    LinkedList<String> list = new LinkedList<String>(al);
	    
	    // conversion from ArrayList to LinkedList
	    System.out.print("Conversion from ArrayList to LinkedList:\n");
	    for(String str : list)
	    	System.out.println(str);
	}

}
