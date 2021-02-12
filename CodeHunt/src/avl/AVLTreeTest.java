package avl;
import java.util.Scanner;

public class AVLTreeTest 
{
	static Scanner console = new Scanner(System.in);
	static AVLTree tree = new AVLTree();
	
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
		System.out.print("1. Insert avl\n2. Search\n3. Delete node\n4. Traverse \n5. Other options\n6. Exit\n\n");
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
			tree.traverse();
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
				System.out.print("Cannot delete empty tree.");
			else
			{
				System.out.print("\nInput node to delete: ");
				int item = console.nextInt();
				tree.deleteNode(item);
			}
		}
		else if(choice == 4)
		{
			if(tree.isEmptyTree())
				System.out.print("Cannot traverse empty tree");
			else
				tree.traverse();
		}
		else if(choice == 5)
		{	
			System.out.print("Other choices:\n\n");
			System.out.print("     1. Verify tree\n     2. Verify node\n     3. Destroy tree\n\n");
			System.out.print("     Choice: ");
			int numChoice = console.nextInt();
			if(numChoice == 1)
			{
				if(tree.isEmptyTree())
					System.out.print("     Cannot verify empty tree.");
				else
				{
					System.out.print("\n     Tree height: "+tree.getHeight()+"\n     Tree level: "+(tree.getHeight()-1));
					System.out.print("\n     Tree AVL?: "+tree.verifyTree());
					System.out.print("\n     Tree BFactor: "+tree.treeBFactor()+"\n");
				}
			}
			else if(numChoice == 2)
			{
				if(tree.isEmptyTree())
					System.out.print("     Cannot verify empty tree.");
				else
				{
					System.out.print("     Input node to verify: ");
					int item = console.nextInt();
					System.out.print("\n     Tree "+item+" height: "+(tree.levelOfNode(item)+1)+"\n     Tree "+item+" level: "+(tree.levelOfNode(item)));
					System.out.print("\n     Tree "+item+" AVL?: "+tree.verifyNode(item));
					System.out.print("\n     Tree "+item+" BFactor: "+tree.nodeBFactor(item)+"\n");
				}
			}
			else if(numChoice == 3)
				tree.destroyTree();
		}
		else if(choice == 6)
			System.exit(0);
	}
}