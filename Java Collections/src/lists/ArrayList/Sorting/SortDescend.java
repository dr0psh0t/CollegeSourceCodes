package lists.ArrayList.Sorting;
import java.util.*;

public class SortDescend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("AA");
		arrayList.add("ZZ");
		arrayList.add("CC");
		arrayList.add("FF");
		
		// unsorted list: ArrayList content before sorting
		System.out.println("Before Sorting: ");
		for(String str: arrayList)
			System.out.println(str);
		
		// sorting in decreasing order
		Collections.sort(arrayList, Collections.reverseOrder());
		
		// sorted list in reverse order
		System.out.println("ArrayList in descending order:");
		for(String str: arrayList)
			System.out.println(str);
	}

}
