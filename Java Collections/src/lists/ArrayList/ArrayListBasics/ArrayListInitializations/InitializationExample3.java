package lists.ArrayList.ArrayListBasics.ArrayListInitializations;

import java.util.ArrayList;

public class InitializationExample3 
{
	/*
	 Method3: Normal way of ArrayList initialization

	Syntax:

	ArrayList<T> obj = new ArrayList<T>();
	   		obj.add("Object o1");
	   		obj.add("Object o2");
	   		obj.add("Object o3");
                        ...
                        ...
	 */
	public static void main(String[] args) 
	{
		ArrayList<String> books = new ArrayList<String>();
		books.add("Java Book1");
		books.add("Java Book2");
		books.add("Java Book3");
		
		System.out.println("Books stored in array List are: "+books);
	}
}