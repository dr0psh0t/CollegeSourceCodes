package legacyDataStructures;

import java.util.*;

public class Map 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		HashMap m1 = new HashMap();
		
		m1.put("Zara", "8");
		m1.put("Mahnaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		
		System.out.println("Map Elements");
		System.out.print(m1);
	}
}