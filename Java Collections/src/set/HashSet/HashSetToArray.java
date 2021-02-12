package set.HashSet;
import java.util.HashSet;

public class HashSetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("Element1");
		hset.add("Element2");
		hset.add("Element3");
		hset.add("Element4");
		
		//	displaying HashSet elements
		System.out.println("HashSet contains: "+hset);
		
		//	creating an Array
		String[] array = new String[hset.size()];
		hset.toArray(array);
		
		//	displaying Array elements
		System.out.println("Array elements: ");
		for(String fgh : array)
			System.out.println(fgh);
	}

}
