package linkedbasedlists;
import java.util.*;

public class SinglyLinkedList 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		LinkedListOperations node = new LinkedListOperations();
		int choice, cont;
		
		System.out.print("***** List Operations *****\n\n");
		do
		{
			System.out.print("0. Print address\n1. Add before head\n2. Add to tail\n3. Insert before\n4. Insert after\n5. Delete node\n6. Print\n7. Exit\n\n");
			System.out.print("choice = ");
			choice = console.nextInt();
			
			if(choice == 0)
				node.printAddress();
			else if(choice == 1)
			{
				System.out.print("Add node: ");
				int value = console.nextInt();
				node.addBeforeHead(value);
			}
			else if(choice == 2)
			{
				System.out.print("Add node: ");
				int value = console.nextInt();
				node.addToTail(value);
			}
			else if(choice == 3)
			{
				System.out.print("Node to be inputted before: ");
				int nodeBefore = console.nextInt();
				System.out.print("Node to be inserted: ");
				int nodeInsert = console.nextInt();
				node.insertBefore(nodeBefore, nodeInsert);
			}	
			else if(choice == 4)
			{
				System.out.print("Node to be inputted after: ");
				int nodeAfter = console.nextInt();
				System.out.print("Node to be inserted: ");
				int nodeInsert = console.nextInt();
				node.insertAfter(nodeAfter, nodeInsert);
			}	
			else if(choice == 5)
			{
				System.out.print("Input node to be deleted: ");
				int value = console.nextInt();
				node.deleteNode(value);
			}
			else if(choice == 6)
				node.recPublicPrint();
			else if(choice == 7)
				System.exit(0);
			System.out.print("\nPress any number other than 7 to continue: ");
			cont = console.nextInt();
			System.out.println();
		}
		while(cont != 7);
	}
}
