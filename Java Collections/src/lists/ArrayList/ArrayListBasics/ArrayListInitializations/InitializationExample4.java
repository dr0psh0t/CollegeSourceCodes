package lists.ArrayList.ArrayListBasics.ArrayListInitializations;
import java.util.*;

public class InitializationExample4 
{
	/*
	Method 4: Use Collections.ncopies

	Collections.ncopies method can be used when we need to initialize 
	the ArrayList with the same value for all of its elements. 
	Syntax: count is number of elements and element is the item value

	ArrayList<T> obj = new ArrayList<T>(Collections.nCopies(count, element));
	 */
	public static void main(String[] args) 
	{
		ArrayList<Integer> intList = new ArrayList<Integer>(Collections.nCopies(10, 5));
		System.out.println("ArrayList items: "+intList);
	}
}