package lists.ArrayList.OtherTurials;
import java.util.ArrayList;

public class TrimTheSize {

	/*
	 * public void trimToSize()
	 * trimToSize() method is used for memory optimization
	 * It trims the capacity of ArrayList to the current list size
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arraylist = new ArrayList<Integer>(50);
	    arraylist.add(1);
	    arraylist.add(2);
	    arraylist.add(3);
	    arraylist.add(4);
	    arraylist.add(5);
	    arraylist.add(6);
	    arraylist.add(7);
	    arraylist.add(1);
	    arraylist.add(1);
	    arraylist.add(1);
	    
	    arraylist.trimToSize();
	    System.out.println(arraylist);
	}

}
