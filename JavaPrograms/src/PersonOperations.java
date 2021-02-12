import java.util.*;

public class PersonOperations 
{
	int max, length, index;
	Person[] list;
	Scanner console = new Scanner(System.in);
	
	public PersonOperations()
	{
		max = 5;
		index = 0;
		list = new Person[max];
	}
	
	public boolean isEmpty(){
		return length == 0;
	}
	
	public void addPerson(String fname, String lname, int ages)
	{
		Person myPerson = new Person(fname, lname, ages);
		list[index] = myPerson;
		index++;
		length++;
	}
	
	public void deletePerson(String lname)
	{
		boolean isDeleted = false;
		for(int i = 0; i <= (max - 1) && !isDeleted; i++)
		{
			if((list[i].lastname).equals(lname))
			{
				list[i] = null;
				isDeleted = true;
			}
		}
	}
	
	public void addToMenu()
	{
		String fname, lname;
		int age;
		System.out.print("Input lastname: ");
		lname = console.next();
		System.out.print("Input firstname: ");
		fname = console.next();
		System.out.print("Input age: ");
		age = console.nextInt();
		
		addPerson(fname, lname, age);
	}
	
	public void print()
	{
		for(int i = 0; i <= max - 1; i++)
		{
			if(list[i] != null)
				System.out.println(list[i]);
		}
	}
}
