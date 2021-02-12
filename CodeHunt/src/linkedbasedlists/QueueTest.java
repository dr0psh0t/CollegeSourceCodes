package linkedbasedlists;
import java.util.*;

public class QueueTest 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		LinkedQueue node = new LinkedQueue();
		int choice;
		char cont;
		
		System.out.print("***** Queue Operations *****\n\n");
		do
		{
			System.out.print("1. Add queue 2. Delete queue 3. Print queue 4. Exit\n\n");
			System.out.print("choice = ");
			choice = console.nextInt();
			
			if(choice == 1)
			{
				int num, value;
				System.out.print("Number of list to inputted: ");
				num = console.nextInt();
				
				System.out.print("Add queue: \n");
				for(int i = 0; i <= num - 1; i++)
				{
					value = console.nextInt();
					node.enQueue(value);
				}
			}
			else if(choice == 2)
				node.deQueue(); 
			else if(choice == 3)
				node.print();
			else if(choice == 4)
				System.exit(0);
			
			System.out.print("\nContinue? Y/N: ");
			cont = console.next().charAt(0);
		}
		while(!(cont == 'n' || cont == 'N'));
	}
}
