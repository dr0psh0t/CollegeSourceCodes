package bst;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	static Scanner console = new Scanner(System.in);
	static BinarySearchTree tree = new BinarySearchTree();
	static ArrayList<BinaryTreeNode> al = new ArrayList<BinaryTreeNode>(tree.getArraySize());
	
	public static void main(String[] args) 
	{
		int choice;
		char again;
		System.out.print("=== B S T ===\n");
		
		do
		{
			choices();
			choice = console.nextInt();
			
			operations(choice);
			
			System.out.print("\nContinue (y/n): ");
			again = console.next().charAt(0);
		}
		while(!(again == 'N' || again == 'n'));
		
		saveToFile();
	}
	
	private static void saveToFile()
	{
		al.addAll(tree.getDictionary());
			
		try 
		{
			PrintWriter outFile = new PrintWriter("Dictionary.txt");
			int count = 0;
			outFile.print("Dictionary:\n\n");
			
			while(count <= tree.getArraySize() - 1)
			{
				outFile.println(al.get(count));
				outFile.println();
				count++;
			}
			outFile.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static void operations(int choice)
	{
		String word, meaning, form;
		String classification, sentence;
		String editWord , search;
		int order;
		
		if(choice == 1)
		{
			System.out.print("Add word: ");
			console.nextLine();
			word = console.nextLine();
			
			System.out.print("Add meaning: ");
			meaning = console.nextLine();
			
			System.out.print("Add form: ");
			form = console.nextLine();
			
			System.out.print("Add classification: ");
			classification = console.nextLine();
			
			System.out.print("Add sentence: ");
			sentence = console.nextLine();
			
			tree.add(word, meaning, form, classification, sentence);
		}
		else if(choice == 2)
		{
			System.out.print("Enter word to edit: ");
			console.nextLine();
			editWord = console.nextLine();
			
			if(tree.search(editWord))
			{
				System.out.print("Edit word: ");
				word = console.nextLine();
				
				System.out.print("Edit meaning: ");
				meaning = console.nextLine();
				
				System.out.print("Edit form: ");
				form = console.nextLine();
				
				System.out.print("Edit classification: ");
				classification = console.nextLine();
				
				System.out.print("Edit sentence: ");
				sentence = console.nextLine();
				
				if(tree.edit(word, meaning, form, classification, sentence, editWord))
					System.out.print("Successfully edited.\n");
			}
			else
				System.out.print("Edit did not succeed.\n");
		}
		else if(choice == 3)
		{
			System.out.print("Enter word to remove: ");
			console.nextLine();
			word = console.nextLine();
			
			tree.delete(word);
		}
		else if(choice == 4)
		{
			System.out.print("Enter word to search: ");
			console.nextLine();
			search = console.nextLine();
			
			if(tree.search(search))
				System.out.print("Word found!");
			else
				System.out.print("Word not found!");
		}
		else if(choice == 5)
		{
			System.out.print("Enter:\n\n");
			System.out.print("1. Preorder\n2. Inorder\n3. Postorder\n\n");
			System.out.print("Order: ");
			order = console.nextInt();
			
			tree.display(order);
		}
		else if(choice == 6)
		{
			saveToFile();
			System.exit(0);
		}
		else
			;
	}
	
	private static void choices()
	{
		System.out.print("=== Menu ===\n\n");
		System.out.print("1. Add\n2. Edit\n3. Delete\n4. Search\n5. Display\n6. Exit\n\n");
		System.out.print("Choice: ");
	}
}