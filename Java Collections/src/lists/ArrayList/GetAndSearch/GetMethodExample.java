package lists.ArrayList.GetAndSearch;
import java.util.ArrayList;

public class GetMethodExample {
	/*
	 * public Element get(int index)
	 * method is used for fetching an element from the list
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("pen");
       	al.add("pencil");
       	al.add("ink");
       	al.add("notebook");
       	al.add("book");
       	al.add("books");
       	al.add("paper");
       	al.add("white board");
       	
       	System.out.println(al+"\n");
       	System.out.println("First element of the ArrayList: "+al.get(0));
       	System.out.println("Third element of the ArrayList: "+al.get(2));
       	System.out.println("Sixth element of the ArrayList: "+al.get(5));
       	System.out.println("Fourth element of the ArrayList: "+al.get(3));
	}

}