package lists.ArrayList.ArrayListBasics.ArrayListInitializations;
import java.util.*;

public class InitializationExample1 
{
	public static void main(String[] args) 
	{
		/*
		 Method 1: Initialization using Arrays.asList
		 Syntax:
		 
		 ArrayList<Type> obj = new ArrayList<Type>(
		 			Arrays.asList(Object o1, Object o2, Object o3, ....son on));
		 */
		
		ArrayList<String> obj = new ArrayList<String>(Arrays.asList("Pratrap", "Peter", "Harsh"));
		System.out.println("Elements are: "+obj);
	}
}