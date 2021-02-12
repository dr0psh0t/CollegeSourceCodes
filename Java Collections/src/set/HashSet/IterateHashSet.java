package set.HashSet;
import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("Chaitanya");
		hset.add("Rahul");
		hset.add("Tim");
		hset.add("Rick");
		hset.add("Harry");
		
		//	iteration using Iterator class
		Iterator<String> it = hset.iterator();
		System.out.println("Iteration using Iterator class:");
		while(it.hasNext())
			System.out.println(it.next());
		
		//	iteration just using for loop
		System.out.println("\nIteration just using for loop:");
		for(String ghj : hset)
			System.out.println(ghj);
	}

}
