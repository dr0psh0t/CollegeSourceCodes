package set.HashSet;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetToLinkedList {

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
		LinkedList<String> list = new LinkedList<String>(hset);
		
		//	displaying LinkedList elements
		System.out.println("LinkedList contains: "+list);
	}

}
