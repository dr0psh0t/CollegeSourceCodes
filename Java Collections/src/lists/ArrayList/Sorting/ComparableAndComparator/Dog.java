package lists.ArrayList.Sorting.ComparableAndComparator;
import java.util.Comparator;

/*
java.util
Interface Comparator<T>

Type Parameters:
	T - the type of objects that may be compared by this comparator
	
java.lang
Interface Comparable<T>

Type Parameters:
	T - the type of objects that this object may be compared to
 */

public class Dog implements Comparator<Dog>, Comparable<Dog>
{
	private String name;
	private int age;
	
	Dog(){
	}
	
	public Dog(String n, int a)
	{
		name = n;
		age = a;
	}
	
	public String getDogname(){
		return name;
	}
	
	public int getDogAge(){
		return age;
	}
	
	public int compareTo(Dog d) {
		return (this.name).compareTo(d.name);
	}

	public int compare(Dog d, Dog d1) {
		return d.age - d1.age;
	}
}
