package lists.ArrayList.Conversion;
import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Harry");
		al.add("Jack");
		al.add("Tim");
		al.add("Rack");
		al.add("Rock");
		
		String[] strList = al.toArray(new String[al.size()]);
		//Displaying Array content
	    System.out.println("Array Elements:");
	    for (int i = 0; i < strList.length; i++)
	    	System.out.println(strList[i]);
	}

}
