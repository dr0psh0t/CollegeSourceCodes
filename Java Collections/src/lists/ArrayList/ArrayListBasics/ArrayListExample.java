package lists.ArrayList.ArrayListBasics;
import java.util.*;

public class ArrayListExample 
{
	public static void main(String[] args) 
	{
		// creation of ArrayList: I'm going to add String
		// elements so I made it of string type
		
		ArrayList<String> obj = new ArrayList<String>();
		
		// adding of string elements
		obj.add("Ajeet");
		obj.add("Harry");
		obj.add("Chaitanya");
		obj.add("Steve");
		obj.add("Anuj");
		
		// display array list elements
		System.out.println("Currently the array list has following elements: "+obj);
		
		// add element at the given index
		obj.add(0, "Rahul");
		obj.add(1, "Justin");
		
		// remove elements from ArrayList
		obj.remove("Chaitanya");
		obj.remove("Harry");
		
		System.out.println("Current array list is: "+obj);
		
		// remove element from the given index
		obj.remove(1);
		
		System.out.println("Current array list is: "+obj);
	}
}