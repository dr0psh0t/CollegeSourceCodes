package set.HashSet;

import java.util.HashSet;
import java.util.ArrayList;

public class HashSetToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("Steve");
		hset.add("Mat");
		hset.add("Govinda");
		hset.add("John");
		hset.add("Tommy");
		
		//	displaying HashSet elements
		System.out.println("HashSet contains: "+hset);
		
		//	creating a List of HashSet elements
		ArrayList<String> list = new ArrayList<String>(hset);
		
		//	displaying ArrayList elements
		System.out.println("ArrayList contains: "+list);
	}

}
