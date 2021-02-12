package set.HashSet;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class HashSetToTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("Element1");
		hset.add("Element2");
		hset.add("Element3");
		hset.add("Element4");
		
		System.out.println("HashSet contains: "+hset);
		
		//	creating a TreeSet of HashSet elements
		Set<String> tset = new TreeSet<String>(hset);
		
		//	displaying TreeSet elements
		System.out.println("TreeSet contains:");
		for(String fgh : tset)
			System.out.println(fgh);
	}

}
