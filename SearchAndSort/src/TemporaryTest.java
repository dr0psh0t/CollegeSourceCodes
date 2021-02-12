import java.util.*;

public class TemporaryTest 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
	//	try
	//	{
		//	HashStateOperations state = new HashStateOperations(50);
			HashState state[] = new HashState[50];
			int index = 0;
			int choice, cont;
			String name, capital;
			int yearOfAdmission, orderOfAdmission, area;
			do
			{
				System.out.print("******** State Operations ********\n\n");
				System.out.print("[1] Add state [2] Print state [3] Remove state [4] Exit\n");
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
					
			//		state.addState(name, capital, yearOfAdmission, orderOfAdmission, area);
					state[index] = new HashState();
					state[index].setState(name, capital, yearOfAdmission, orderOfAdmission, area);
					index++;
				}
				else if(choice == 2)
				{
					for(int i = 0; i <= state.length - 1; i++)
						state[i].printState();
				}
				else if(choice == 3)
				{
					System.out.print("Input state name to remove: ");
					String stateName = console.next();
					for(int i = 0; i <= state.length - 1; i++)
					{
						if(stateName.equals(state[i].getStateName()))
						{
							System.out.print("Lastname found!");
							state[i].setState("", "", 0, 0, 0);
						}
					}
				}
				else if(choice == 4)
					System.exit(0);
				
				System.out.print("\nPress any number other than 4 to continue: ");
				cont = console.nextInt();
				System.out.println();
			}
			while(cont != 4);
	/*	}
		catch(Exception e)
		{
			System.out.print("\nInput error");
		}*/
	}
}
