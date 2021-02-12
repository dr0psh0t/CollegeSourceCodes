import java.util.*;

public class BinaryTreeTest 
{
	static Scanner console = new Scanner(System.in);
	static BinarySearchTree tree = new BinarySearchTree();
	
	public static void main(String[] args) 
	{
		char choice;
		do
		{
			choices();
			selection();
			
			System.out.print("\nContinue? Y/N: ");
			choice = console.next().charAt(0);
		}
		while(!(choice == 'N' || choice == 'n'));
	}
	
	public static void choices()
	{
		System.out.print("****** CHOICES ******\n");
		System.out.print("1. Insert\n2. Search\n3. Verify Tree\n4. Verify node\n5. Traverse\n6. Exit\n\n");
		System.out.print("Choice: ");
	}
	
	public static void selection()
	{
		int choice = console.nextInt();
		if(choice == 1)
		{
			int node = 0;
			System.out.print("Input nodes ending with -99 to stop: \n");
			
			while(node != -99)
			{
				node = console.nextInt();
				if(node != -99)
					tree.insert(node);
			}
		}
		else if(choice == 2)
		{
			if(tree.isEmptyTree())
				System.out.print("Cannot search empty tree.");
			else
			{
				System.out.print("\nInput node to search: ");
				int item = console.nextInt();
				if(tree.search(item))
					System.out.print("\nNode found");
				else
					System.out.print("\nNode not found!");
			}	
		}
		else if(choice == 3)
		{
			if(tree.isEmptyTree())
				System.out.print("Cannot verify empty tree.");
			else
			{
				System.out.print("\nTree height: "+tree.getHeight()+"\nTree level: "+(tree.getHeight()-1));
				System.out.print("\nTree AVL?: "+tree.verifyTree());
				System.out.print("\nTree BFactor: "+tree.bFactor());
			}
		}
		else if(choice == 4)
		{
			if(tree.isEmptyTree())
				System.out.print("Cannot verify empty tree.");
			else
			{
				System.out.print("\nInput node to verify: ");
				int item = console.nextInt();
				System.out.print("\nNode "+item+" AVL?: "+tree.verifyNode(item));
				System.out.print("\nNode "+item+" BFactor: "+tree.nodeBFactor(item));
			}
		}
		else if(choice == 5)
			tree.traverse();
		else if(choice == 6)
			System.exit(0);
	}
}