import java.util.*;

public class QueueTest 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		QueueClass node = new QueueClass();
		int choice, cont;
		
		System.out.print("***** Queue Operations *****\n\n");
		do
		{
			System.out.print("1. Add Queue 2. Delete Queue 3. Print Queue 4. Exit\n\n");
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
					node.addQueue(value);
				}
			}
			else if(choice == 2)
				node.deleteQueue(); 
			else if(choice == 3)
				node.print();
			else if(choice == 4)
				System.exit(0);
			
			System.out.print("\nPress any number other than 4 to continue: ");
			cont = console.nextInt();
		}
		while(cont != 4);
		System.out.print("\nFront: "+node.peekFront()+" Back: "+node.peekBack());
	}
}
