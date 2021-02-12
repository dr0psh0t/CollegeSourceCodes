package set.HashSet;
import java.util.HashSet;

/* public void clear(): It removes all the elements
 * from HashSet. The set becomes empty after this
 * method gets called.
 */
public class EmptyHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hset = new HashSet<String>();
		
		//	add elements to HashSet
		hset.add("Element1");
		hset.add("Element2");
		hset.add("Element3");
		hset.add("Element4");
		hset.add("Element5");
		
		//	display HashSet elements
		System.out.println("Before: HashSet contains: "+hset);
		
		hset.clear();
		
		//	display HashSet content again
		System.out.println("After: HashSet contains: "+hset);
	}

}
