package lists.ArrayList.GetAndSearch;
import java.util.ArrayList;
import java.util.List;

public class SublistExample {
	// get a sublist from an existing ArrayList
	// List subList(int fromIndex, int toIndex)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		
		// addition of elements in ArrayList
		al.add("Steve");
		al.add("Justin");
		al.add("Ajeet");
		al.add("John");
		al.add("Arnold");
		al.add("Chaitanya");
		
		System.out.println("Original ArrayList content: "+al);
		
		// sublist to ArrayList
		ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 4));
		System.out.println("Sublist stored in ArrayList: "+al2);
		
		// sublist to List
		List<String> list =  al.subList(1, 4);
		System.out.println("Sublist stored in List: "+list);
	}

}
