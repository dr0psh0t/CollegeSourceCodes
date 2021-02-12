package set.HashSet;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hset = new HashSet<String>();
		
		//	adding elements to the HashSet
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");
		
		//	addition of duplicate elements
		hset.add("Apple");
		hset.add("Mango");
		
		//	addition of null values
		hset.add(null);
		hset.add(null);
		
		//	displaying HashSet elements
		System.out.println(hset);
	}

}
