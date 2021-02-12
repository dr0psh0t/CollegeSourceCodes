package lists.ArrayList.Sorting;
import java.util.*;

public class SortStringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> listOfCountries = new ArrayList<String>();
		listOfCountries.add("India");
		listOfCountries.add("US");
		listOfCountries.add("China");
		listOfCountries.add("Denmark");
		
		// unsorted list
		System.out.println("Before Sorting: ");
		for(String counter: listOfCountries)
			System.out.println(counter);
		
		// sort statement
		Collections.sort(listOfCountries);
		
		// sorted list
		System.out.println("\nAfter Sorting: ");
		for(String counter: listOfCountries)
			System.out.println(counter);
	}

}
