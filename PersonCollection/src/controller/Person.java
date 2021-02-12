package controller;
import java.util.Comparator;

public class Person implements Comparable<Person>, Comparator<Person>
{
	String lastName;
	int age;
	
	public Person(){
	}
	
	public Person(String lastName, int age)
	{
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public int getAge(){
		return age;
	}
	
	public int compareTo(Person p) // method from the interface Comparable<T> to sort
	{
		int remainder = this.lastName.compareTo(p.lastName);
		return remainder;
	}
	
	public int compare(Person p1, Person p2) // method from the interface Comparator<T> to sort
	{
		int remainder = p1.age - p2.age;
		return remainder;
	}
	
	public String toString()
	{
		String str = "";
		str = lastName +" "+age;
		return str;
	}
}