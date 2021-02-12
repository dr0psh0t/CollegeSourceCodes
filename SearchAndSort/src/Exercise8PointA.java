import java.util.*;

public class Exercise8PointA 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
	//	try
	//	{
			HashStateOperations state = new HashStateOperations(101);
			int choice, cont;
			String name, capital;
			int yearOfAdmission, orderOfAdmission, area;
			do
			{
				System.out.print("******** State Operations ********\n\n");
				System.out.print("[1] Add state [2] Print state [3] Remove state\n[4] Hash address [5] Search state [6] Exit\n");
				System.out.print("choice = ");
				choice = console.nextInt();
				
				if(choice == 1)
				{
					System.out.print("\nState name: ");
					name = console.next();
					System.out.print("Capital: ");
					capital = console.next();
					System.out.print("Year of admission: ");
					yearOfAdmission = console.nextInt();
					System.out.print("Order of admission: ");
					orderOfAdmission = console.nextInt();
					System.out.print("Area: ");
					area = console.nextInt();
					
					if(name.length() <= 15)
						state.addState(name, capital, yearOfAdmission, orderOfAdmission, area);
					else
						System.out.print("Name is more than 15 characters!.\n");
				}
				else if(choice == 2)
					state.printState();
				else if(choice == 3)
				{
					System.out.print("Input state name to remove: ");
					String stateName = console.next();
					state.removeState(stateName);
				}
				else if(choice == 4)
					state.hashAdd();
				else if(choice == 5)
					state.search();
				else if(choice == 6)
					System.exit(0);
					
				System.out.print("\nPress any number other than 6 to continue: ");
				cont = console.nextInt();
				System.out.println();
			}
			while(cont != 6);
	/*	}
		catch(Exception e)
		{
			System.out.print("\nInput error");
		}*/
	}
}
