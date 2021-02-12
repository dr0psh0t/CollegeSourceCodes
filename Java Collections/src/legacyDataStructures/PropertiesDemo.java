package legacyDataStructures;

import java.util.*;

public class PropertiesDemo
{
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		Properties capitals = new Properties();
		
		Set states; // A collection that contains no duplicate elements. More formally, 
		// sets contain no pair of elements e1 and e2 such that e1.equals(e2), and at most 
		// one null element. As implied by its name, this interface models the mathematical set abstraction.
		
		String str;
		
		capitals.put("Illinois", "Springfield");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Washington", "Olympia");
		capitals.put("California", "Sacramento");
		capitals.put("Indiana", "Indianapolis");
		
		// show all states and capitals in hashtable.
		states = capitals.keySet(); // get set-view of keys
		Iterator itr = states.iterator();
		
		while(itr.hasNext()) // Returns true if the iteration has more elements.
		{
			str = (String)itr.next();
																//  .getProperty(String key);
			System.out.println("The capital of "+str+" is "+capitals.getProperty(str)+".");
		}
		System.out.println();
		
		// look for state not in list -- specify default
					//.getProperty(String key, String defaultProperty);
		str = capitals.getProperty("Florida", "Not Found");
		System.out.println("The capital of Florida is "+str+".");
	}
}