package composition;
import java.util.*;

public class PersonalInformation 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String firstname, lastname;
		int age, month, day, year, ID;
		
		PersonalInfo person = new PersonalInfo("Daryll David", "Dagondon", 20, 7, 32, 1994, 11551298);
		System.out.print(person);
		
		System.out.print("\n\nSet personal info");
		
		System.out.print("\nInput firstname, lastname, age, month, day, year, ID:\n");
		firstname = console.nextLine();
		lastname = console.nextLine();
		age = console.nextInt();
		month = console.nextInt();
		day = console.nextInt();
		year = console.nextInt();
		ID = console.nextInt();
		
		person.setPersonalInfo(firstname, lastname, age, month, day, year, ID);
		System.out.print(person);
	}
}
