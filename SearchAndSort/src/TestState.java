import java.util.*;

public class TestState 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		try
		{
			int cont, choice;
			StateData theState = new StateData();
			
			System.out.print("***** Person Operations *****\n\n");
			do
			{
				System.out.print("[1] Set state info [2] Print state info [3] Get state name [4] Get state capital\n\n[5] Get order of admission [6] Get year of admission [7] Get state are [8] Exit\n\n");
				System.out.print("Choice = ");
				choice = console.nextInt();
				System.out.println();
				
				if(choice == 1)
				{
					theState.setState();
				}
				else if(choice == 2)
					theState.printStateInfo();
				else if(choice == 3)
					System.out.print("State name: "+theState.getStateName());
				else if(choice == 4)
					System.out.print("State capital: "+theState.getStateCapital());
				else if(choice == 5)
					System.out.print("Order of admission: "+theState.getOrderOfAdmission());
				else if(choice == 6)
					System.out.print("Year of admission: "+theState.getYearOfAdmission());
				else if(choice == 7)
					System.out.print("State area: "+theState.getArea());
				else if(choice == 8)
					System.exit(0);
				
				System.out.print("\nPress any number other than 8 to exit: ");
				cont = console.nextInt();
				System.out.println();
			}
			while(cont != 8);
		}
		catch(Exception e)
		{
			System.out.print("\nInput error");
		}
	}
}
