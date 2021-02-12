package lists.ArrayList.ArrayListBasics.ArrayListInitializations;
import java.util.*;

public class InitializationExample2 
{
	/*
	Method 2: Anonymous inner class method to initialize ArrayList
	Syntax:

	ArrayList<T> obj = new ArrayList<T>(){{
		   				add(Object o1);
		   				add(Object o2);
		   				add(Object o3);
                   		...
                   		...
		   				}};
	 */
	@SuppressWarnings("serial")
	public static void main(String[] args) 
	{
		ArrayList<String> cities = new ArrayList<String>(){{
			add("Delhi");
			add("Agra");
			add("Chennai");
		}};
		
		System.out.println("Content of Array list cities: "+cities);
	}
}