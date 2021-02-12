package bst.genericBST;

/*
 * implements Comparable<T>: making only T objects comparable with each other
 * 
 * implements Comparable<BinaryTreeNode<T>>: making the BinaryTreeNode objects comparable
 */
class BinaryTreeNode<T extends Comparable<T>> implements Comparable<T>
{
	public T data;
	public BinaryTreeNode<T> leftLink;
	public BinaryTreeNode<T> rightLink;
	
	public BinaryTreeNode(T data)
	{
		this.data = data;
		leftLink = null;
		rightLink = null;
	}
	
	@Override
	public String toString(){
		return data+"";
	}

	@Override
	public int compareTo(T o){
		return data.compareTo(o);
	}
}

public class BinarySearchTree<T extends Comparable<T>>
{
	private BinaryTreeNode<T> root;
	private final String name;
	
	public BinarySearchTree()
	{
		root = null;
		name = "Binary Search Tree";
	}
	
	public boolean search(T searchItem) throws EmptyTreeException
	{
		BinaryTreeNode<T> current;
		if(root == null)
			throw new EmptyTreeException(name);
		else
		{
			current = root;
			while(current != null)
			{
				if(current.data.equals(searchItem))
					return true;
				else
				{
					if(current.data.compareTo(searchItem) > 0)
						current = current.leftLink;
					else
						current = current.rightLink;
				}
			}
		}
		return false;
	}
	
	public void insert(T insertItem)
	{
		BinaryTreeNode<T> current;
		BinaryTreeNode<T> trailCurrent = null;
		BinaryTreeNode<T> newNode = new BinaryTreeNode<>(insertItem);
		
		if(root == null)
			root = newNode;
		else
		{
			current = root;
			while(current != null)
			{
				trailCurrent = current;
				if(current.data.equals(insertItem))
					System.err.print("No duplicates allowed.");
				else
				{
					if(current.data.compareTo(insertItem) > 0)
						current = current.leftLink;
					else
						current = current.rightLink;
				}
			}
			
			if(trailCurrent.data.compareTo(insertItem) > 0)
				trailCurrent.leftLink = newNode;
			else
				trailCurrent.rightLink = newNode;
		}
	}
	
	public void deleteNode(T deleteItem) throws EmptyTreeException
	{
		BinaryTreeNode<T> current, trailCurrent;
		boolean found = false;
		
		if(root == null)
			throw new EmptyTreeException(name);
		else	// else block; searching if the node to delete exists
		{
			current = trailCurrent = root;
			while(current != null && !found)
			{
				if(current.data.equals(deleteItem))
					found = true;
				else
				{
					trailCurrent = current;
					if(current.data.compareTo(deleteItem) > 0)
						current = current.leftLink;
					else
						current = current.rightLink;
				}
			}
		}
		
		if(current == null)
			System.out.println("The delete item is not in the list.");
		else if(found)
		{
			if(current == root)
				root = deleteFromTree(root);
			else if(trailCurrent.data.compareTo(deleteItem) > 0)
				trailCurrent.leftLink = deleteFromTree(trailCurrent.leftLink);
			else
				trailCurrent.rightLink = deleteFromTree(trailCurrent.rightLink);
		}
	}
	
	private BinaryTreeNode<T> deleteFromTree(BinaryTreeNode<T> p)
	{
		if(p == null)
			System.err.println("Error: The node to be deleted is null");
		else if(p.leftLink == null && p.rightLink == null)	// case 1
			p = null;
		else if(p.leftLink == null)	// case 2
			p = p.rightLink;
		else if(p.rightLink == null)	// case 3
			p = p.leftLink;
		else
		{
			BinaryTreeNode<T> current = p.leftLink,
					trailCurrent = null;
			
			while(current.rightLink != null)
			{
				trailCurrent = current;
				current = current.rightLink;
			}
			
			p.data = current.data;
			if(trailCurrent == null)
				p.leftLink = current.leftLink;
			else
				trailCurrent.rightLink = current.leftLink;
		}
		return p;
	}
	
	public int treeHeight(){return height(root);}
	
	public int treeNodeCount(){return nodeCount(root);}
	
	public int treeLeavesCount(){return leavesCount(root);}
	
	private int height(BinaryTreeNode<T> p){
		return (p == null) ? 0 : 1 + Math.max(height(p.leftLink), height(p.rightLink));
	}
	
	private int nodeCount(BinaryTreeNode<T> p){
		return (p == null) ? 0 : 1 + nodeCount(p.leftLink) + nodeCount(p.rightLink);
	}
	
	private int leavesCount(BinaryTreeNode<T> p)
	{
		if(p == null)
			return 0;
		else if(p.leftLink == null && p.rightLink == null)
			return 1 + leavesCount(p.leftLink) + leavesCount(p.rightLink);
		else
			return leavesCount(p.leftLink) + leavesCount(p.rightLink);
	}
	
	public void preorder(){preorderHelper(root);}
	
	public void inorder(){inorderHelper(root);}
	
	public void postorder(){postorderHelper(root);}
	
	private void preorderHelper(BinaryTreeNode<T> p)
	{
		if(p != null)
		{
			System.out.print(p.data+" ");
			preorderHelper(p.leftLink);
			preorderHelper(p.rightLink);
		}
	}
	
	private void inorderHelper(BinaryTreeNode<T> p)
	{
		if(p != null)
		{
			inorderHelper(p.leftLink);
			System.out.print(p.data+" ");
			inorderHelper(p.rightLink);
		}
	}
	
	private void postorderHelper(BinaryTreeNode<T> p)
	{
		if(p != null)
		{
			postorderHelper(p.leftLink);
			postorderHelper(p.rightLink);
			System.out.print(p.data+" ");
		}
	}
}