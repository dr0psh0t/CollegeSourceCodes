package lists.ArrayList.Sorting.ComparableAndComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 Interface List<E>

Type Parameters:
	E - the type of elements in this list.

All Superinterfaces:
	Collection<E>, Iterable<E>.

All Known Implementing Classes:
	AbstractList, AbstractSequentialList, ArrayList, AttributeList, CopyOnWriteArrayList, 
	LinkedList, RoleList, RoleUnresolvedList, Stack, Vector.
 */

public class DogMain 
{
	public static void main(String[] args) 
	{
		// Takes a list of Dog objects
		List<Dog> list = new ArrayList<Dog>();
		
		list.add(new Dog("Shaggy", 3));
		list.add(new Dog("Lacy", 2));
		list.add(new Dog("Roger", 10));
		list.add(new Dog("Tommy", 4));
		list.add(new Dog("Tammy", 1));
		
		Collections.sort(list); // sorts the array list
		
		for(Dog a: list) // printing the sorted list of names
			System.out.print(a.getDogname()+", ");
		
		// Sorts the array list using comparator
		Collections.sort(list, new Dog());
		System.out.println("\n");
		
		for(Dog a: list) // printing the sorted list of names
			System.out.print(a.getDogname()+", ");
		
		System.out.println();
		for(Dog a: list) // printing the sorted list of ages
			System.out.print(a.getDogname()+"  : "+a.getDogAge()+", ");
	}
}