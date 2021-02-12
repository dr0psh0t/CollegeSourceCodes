package lists.ArrayList.Sorting;
import java.util.*;

public class SortIntegerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(11);
		arrayList.add(2);
		arrayList.add(7);
		arrayList.add(3);
		
		// ArrayList before the sorting
		System.out.println("Before Sorting: ");
		for(int counter: arrayList)
			System.out.println(counter);
		
		// Sorting of arrayList using Collections.sort
		Collections.sort(arrayList);
		
		// ArrayList after sorting
		System.out.println("\nAfter Sorting: ");
		for(int counter: arrayList)
			System.out.println(counter);
	}

}
