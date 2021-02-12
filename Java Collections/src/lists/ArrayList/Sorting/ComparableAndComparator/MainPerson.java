package lists.ArrayList.Sorting.ComparableAndComparator;
import java.util.*;

public class MainPerson {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> p = new ArrayList<Person>();
		
		p.add(new Person("Dagondon", 20));
		p.add(new Person("Andales", 21));
		p.add(new Person("Minoza", 19));
		p.add(new Person("Galinea", 20));
		
		// using Iterator class to loop ArrayList
		Iterator itr = p.iterator();
		
		System.out.println("Unsorted persons:\n");
		while(itr.hasNext())
			System.out.println(itr.next());
		
		// sort using lastnames
		Collections.sort(p);
		itr = p.iterator();
		
		System.out.println("\nSorting using lastname:\n");
		while(itr.hasNext())
			System.out.println(itr.next());
		
		// sort using age
		Collections.sort(p, new Person());
		itr = p.iterator();
		
		System.out.println("\nSorting using age:\n");
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
