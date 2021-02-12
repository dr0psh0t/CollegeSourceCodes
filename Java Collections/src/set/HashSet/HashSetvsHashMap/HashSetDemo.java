package set.HashSet.HashSetvsHashMap;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("AA");
		hset.add("BB");
		hset.add("CC");
		hset.add("DD");
		
		//	displaying HashSet elements
		System.out.println("HashSet contains:");
		for(String fgh : hset)
			System.out.println(fgh);
	}

}
