package set.HashSet.HashSetvsHashMap;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1, "AA");
		hmap.put(2, "BB");
		hmap.put(3, "CC");
		hmap.put(4, "DD");
		
		//	displaying HashMap elements
		System.out.println("HashMap contains: "+hmap);
	}

}
