import java.util.*;

public class TestPerson 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		PersonOperations me = new PersonOperations();
		int choice, cont;
		
		System.out.print("***** Person Operations *****\n\n");
		do
		{
			System.out.print("1. Add person 2. Display person 3. Delete person 4. Exit\n\n");
			System.out.print("Choice = ");
			choice = console.nextInt();
			System.out.println();
			
			if(choice == 1)
				me.addToMenu();
			else if(choice == 2)
				me.print();
			else if(choice == 3)
			{
				if(me.isEmpty())
					System.out.print("Cannot delete empty list");
				else
				{
					System.out.print("Input person's lastname to delete: ");
					String lastname = console.next();
					me.deletePerson(lastname);
				}
			}
			else if(choice == 4)
				System.exit(0);
			
			System.out.print("\n");
			System.out.print("Press any number other than 4 to exit: ");
			cont = console.nextInt();
		}
		while(cont != 4);
	}
}
