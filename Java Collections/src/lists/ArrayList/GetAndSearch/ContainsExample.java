package lists.ArrayList.GetAndSearch;
import java.util.ArrayList;

public class ContainsExample {
	/*
	 * public boolean contains(Object element)
	 * method is used for checking the specified element
	 * existence in the given list
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("pen");
		al.add("pencil");
		al.add("ink");
		al.add("notebook");

		System.out.println(al+"\n");
		System.out.println("ArrayList contains the string 'ink pen': "
	                                           +al.contains("ink pen"));
		System.out.println("ArrayList contains the string 'pen': "
	                                             +al.contains("pen"));
		System.out.println("ArrayList contains the string 'pencil': "
	                                          +al.contains("pencil"));
		System.out.println("ArrayList contains the string 'book': "
	                                           +al.contains("book"));

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(1);
		al2.add(99);
		al2.add(56);
		al2.add(13);
		al2.add(44);
		al2.add(6);
		
		System.out.println("\n"+al2+"\n");
		System.out.println("'1' is present in arraylist: "+al2.contains(1));
		System.out.println("'55' is present in arraylist: "+al2.contains(55));
		System.out.println("'44' is there in arraylist: "+al2.contains(44));
      	System.out.println("'7' is there in arraylist: "+al2.contains(7));
	}

}
