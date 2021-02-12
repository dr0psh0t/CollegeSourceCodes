package bst;
import java.util.ArrayList;

public class BinarySearchTree 
{
	BinaryTreeNode root;
	ArrayList<BinaryTreeNode> array = new ArrayList<BinaryTreeNode>(10);
	
	public BinarySearchTree(){
		root = null;
	}
	
	// add
	public void add(String word, String meaning, String form,
			String classification, String sentence){
		
		BinaryTreeNode newNode = new BinaryTreeNode(word, meaning, form, classification, sentence);
		
		if(isEmptyTree())
		{
			root = newNode;
			array.add(newNode);
			System.out.print("1 item added.");
		}
		else
		{
			BinaryTreeNode current = root, trail = null;
			
			while(current != null)
			{
				trail = current;
				
				if(current.getWord().equals(newNode.getWord()))
				{
					System.out.print("Insert word is already in the tree");
					return;
				}
				else if(current.getWord().compareTo(newNode.getWord()) > 0)
					current = current.llink;
				else
					current = current.rlink;
			}
			
			if(trail.getWord().compareTo(newNode.getWord()) > 0)
				trail.llink = newNode;
			else
				trail.rlink = newNode;
			
			array.add(newNode);
			System.out.print("1 item added.");
		}
	} // end add
	
	// edit
	public boolean edit(String word, String meaning, String form,
			String classification, String sentence, String toEditWord){
		
		BinaryTreeNode current = root;
		boolean edit = false;
		
		while(current != null && !edit)
		{
			if(current.getWord().equals(toEditWord))
			{
				current.setWord(word);
				current.setMeaning(meaning);
				current.setForm(form);
				current.setClassification(classification);
				current.setSentence(sentence);
				
				edit = true;
			}
			if(current.getWord().compareTo(word) > 0)
				current = current.llink;
			else
				current = current.rlink;
		}
		return edit;
	} // end edit
	
	// delete
	public void delete(String deleteItem)
	{
		BinaryTreeNode current, trail;
		boolean found = false;
		
		if(isEmptyTree())
			System.out.println("Cannot delete from an empty tree.");
		else
		{
			current = trail = root;
			
			while(current != null && !found)
			{
				if(current.getWord().equals(deleteItem))
					found = true;
				else
				{
					trail = current;
					
					if(current.getWord().compareTo(deleteItem) > 0)
						current = current.llink;
					else
						current = current.rlink;
				}
			}
			
			if(current == null)
				System.out.println("The delete item is not in the list.");
			else if(found)
			{
				if(current == root)
					root = deleteFromTree(root);
				else if(trail.getWord().compareTo(deleteItem) > 0)
					trail.llink = deleteFromTree(trail.llink);
				else
					trail.rlink = deleteFromTree(trail.rlink);
				
				System.out.println("Delete Successful.");
			}
		}
	}
	
	private BinaryTreeNode deleteFromTree(BinaryTreeNode p)
	{
		BinaryTreeNode current, trail;
		
		if(p == null)
			System.out.println("Error: Null!");
		else if(p.llink == null && p.rlink == null)
			p = null;
		else if(p.llink == null)
			p = p.rlink;
		else if(p.rlink == null)
			p = p.llink;
		else
		{
			current = p.llink;
			trail = null;
			
			while(current.rlink != null)
			{
				trail = current;
				current = current.rlink;
			}
			
			p.setWord(current.getWord());
			
			if(trail == null)
				p.llink = current.llink;
			else
				trail.rlink = current.llink;
		}
		return p;
	}
	
	public void display(int order)
	{
		if(order == 1)
			preOrderTraversal();
		else if(order == 2)
			inOrderTraversal();
		else if(order == 3)
			postOrderTraversal();
		else
		{
			int num = (int)(Math.random() * 3);
			
			if(num == 1)
				preOrderTraversal();
			else if(num == 2)
				inOrderTraversal();
			else
				postOrderTraversal();
		}
	}
	
	private void inorder(BinaryTreeNode p)
	{
		if(p != null)
		{
			inorder(p.llink);
			System.out.println(p+"\n");
			inorder(p.rlink);
		}
	}
	
	private void preorder(BinaryTreeNode p)
	{
		if(p != null)
		{
			System.out.println(p+"\n");
			preorder(p.llink);
			preorder(p.rlink);
		}
	}
	
	private void postorder(BinaryTreeNode p)
	{
		if(p != null)
		{
			postorder(p.llink);
			postorder(p.rlink);
			System.out.println(p+"\n");
		}
	}
	
	public void preOrderTraversal()
	{
		System.out.print("Preorder traversal:\n");
		preorder(root);
	}
	
	public void inOrderTraversal()
	{
		System.out.print("Inorder traversal:\n");
		inorder(root);
	}
	
	public void postOrderTraversal()
	{
		System.out.print("Postorder traversal:\n");
		postorder(root);
	}
	
	// search
	public boolean search(String word)
	{
		boolean found = false;
		BinaryTreeNode current = root;
		
		if(isEmptyTree())
			System.out.println("Cannot search an empty tree");
		else
		{
			while(!found && current != null)
			{
				if(current.getWord().equals(word))
					found = true;
				else if(current.getWord().compareTo(word) > 0)
					current = current.llink;
				else
					current = current.rlink;
			}
		}
		
		return found;
	} // end search
	
	public boolean isEmptyTree(){
		return root == null;
	}
	
	public ArrayList<BinaryTreeNode> getDictionary(){
		return array;
	}
	
	public int getArraySize()
	{
		array.trimToSize();
		return array.size();
	}
}
