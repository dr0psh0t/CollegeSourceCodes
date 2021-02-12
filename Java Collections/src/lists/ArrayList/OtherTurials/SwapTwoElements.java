package lists.ArrayList.OtherTurials;
import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElements {

	// public static void swap(List list, int i1, int i2)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
	    al.add("Sachin");
	    al.add("Rahul");
	    al.add("Saurav");
	    al.add("Sunil");
	    al.add("Kapil");
	    al.add("Vinod");

	    System.out.println("ArrayList before Swap:");
	    for(String temp: al){
	        System.out.println(temp);
	    }

	    //Swapping 2nd(index 1) element with the 5th(index 4) element
	    Collections.swap(al, 1, 4);

	    System.out.println("ArrayList after swap:");
	    for(String temp: al){
	       System.out.println(temp);
	    }
	}

}
