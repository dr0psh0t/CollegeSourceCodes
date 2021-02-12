package linkedbasedlists;
import java.util.*;

public class StackTest 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		LinkedStack node = new LinkedStack();
		int choice, cont;
		
		System.out.print("***** Stack Operations *****\n\n");
		do
		{
			System.out.print("1. Add stack 2. Delete stack 3. Print stack 4. Exit\n\n");
			System.out.print("choice = ");
			choice = console.nextInt();
			
			if(choice == 1)
			{
				int num, value;
				System.out.print("Number of list to inputted: ");
				num = console.nextInt();
				
				System.out.print("Add stack: \n");
				for(int i = 0; i <= num - 1; i++)
				{
					value = console.nextInt();
					node.push(value);
				}
			}
			else if(choice == 2)
				node.pop(); 
			else if(choice == 3)
				node.print();
			else if(choice == 4)
				System.exit(0);
			
			System.out.print("\nPress any number other than 4 to continue: ");
			cont = console.nextInt();
		}
		while(cont != 4);
		if(node.isEmptyStack())
			System.out.print("\nTop: null");
		else
			System.out.print("\nTop: "+node.peek());
	}
}
