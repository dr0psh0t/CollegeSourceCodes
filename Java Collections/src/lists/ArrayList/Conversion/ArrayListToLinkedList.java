package lists.ArrayList.Conversion;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListToLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Harry");
		al.add("Jack");
		al.add("Tim");
		al.add("Rack");
		al.add("Rock");
		
		// conversion to LinkedList
		LinkedList<String> linkedList = new LinkedList<String>(al);
		System.out.print("LinkedList elements:\n");
		for(String str : linkedList)
			System.out.println(str);
	}

}
