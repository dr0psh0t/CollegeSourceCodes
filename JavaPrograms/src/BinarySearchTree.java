public class BinarySearchTree 
{
	public BinaryTreeNode root;
	   
  	public BinarySearchTree(){
    	root = null;
   	}//end BinarySearchTree

//======================================================================================================= 	
  	/*
  	 * THESE METHODS ARE USED FOR AVL TREES
  	 */
  	public int treeLeftHeight()
  	{
  		BinaryTreeNode current = root;
  		return 1 + height(current.llink);
  	}//public method to return the height of the Tree to the left subtree
  	
  	public int treeRightHeight()
  	{
  		BinaryTreeNode current = root;
  		return 1 + height(current.rlink);
  	}//public method to return the height of the Tree to the right subtree
  	
  	private int privateTreeRightHeight(BinaryTreeNode p){
  		return 1 + height(p.rlink);
  	}//private method to return the height of the Tree to the right subtree
  	
  	private int privateTreeLeftHeight(BinaryTreeNode p){
  		return 1 + height(p.llink);
  	}//private method to return the height of the Tree to the left subtree
  	
  	private boolean privateIsAVL(BinaryTreeNode p)
  	{
  		boolean temp;
  		if(p != null)
  		{
  			if(nodeCount(p) == 1)
  				return true;
  			else if((privateTreeRightHeight(p) - privateTreeLeftHeight(p) > 1)||(privateTreeLeftHeight(p) - privateTreeRightHeight(p) > 1))
  	  			return false;
  	  		else
  	  		{
  	  			temp = privateIsAVL(p.llink) && privateIsAVL(p.rlink);
  	  			return temp;
  	  		}
  		}
		return true;
  	}//private method return boolean value to be used by method isAVL
  	
  	public boolean verifyTree(){
  		return privateIsAVL(root);
  	}//public method to return boolean value to the main method
  	
  	private boolean searchAVL(int node)
  	{
  		BinaryTreeNode current;
  		if(root == null)
  			return false;
  		else
  		{
  			current = root;
  			while(current != null)
  			{
  				if(current.info == node)
  					return privateIsAVL(current);
  				else
  				{
	            	if((current.info - node) > 0)
	            		current = current.llink;
	            	else
	            		current = current.rlink;
  				}
  			}
  		}
  		return false;
  	}//private method to return a boolean value to the method isRootAVL
  	
  	public boolean verifyNode(int node){
  		return searchAVL(node);
  	}//method to return a boolean value whether the node is AVL to the main method
  	
  	public int bFactor()
  	{
  		int leftDiff, rightDiff;
  		leftDiff = treeLeftHeight() - treeRightHeight();
  		rightDiff = treeRightHeight() - treeLeftHeight();
  		
  		if(leftDiff > rightDiff)
  			return leftDiff;
  		else if(rightDiff > leftDiff)
  			return rightDiff;
  		else
  			return 0;
  	}//method to return the BFactor of the tree
  	
  	private int nodeBFactorPrivate(BinaryTreeNode p)
  	{
  		int leftDiff, rightDiff;
  		leftDiff = privateTreeLeftHeight(p) - privateTreeRightHeight(p);
  		rightDiff = privateTreeRightHeight(p) - privateTreeLeftHeight(p);
  		
  		if(leftDiff > rightDiff)
  			return leftDiff;
  		else if(rightDiff > leftDiff)
  			return rightDiff;
  		else
  			return 0;
  	}//private method to return the BFactor of the certain node
  	
  	public int nodeBFactor(int node)
  	{
  		BinaryTreeNode current;
  		int returnedBFactor = 0;
  		boolean found = false;
  		if(root == null)
  			return 0;
  		else
  		{
  			current = root;
  			while(current != null && !found)
  			{
  				if(current.info == node)
  				{
  					found = true;
  					returnedBFactor = nodeBFactorPrivate(current);
  				}
  				else
  				{
  					if((current.info - node) > 0)
  						current = current.llink;
  					else
  						current = current.rlink;
  				}
  			}
  			if(found)
  				return returnedBFactor;
  			else
  				return 0;
  		}
  	}//method to return the BFactor of the certain to the main method 
  	
  	private BinaryTreeNode rotateToRight(BinaryTreeNode root)
  	{
  		BinaryTreeNode p;
  		if(root == null)
  			System.out.print("Error in the tree.");
  		else if(root.llink == null)
  			System.out.print("No right subtree to rotate.");
  		else
  		{
  			p = root.llink;
  			root.llink = p.rlink;
  			p.rlink = root;
  			root = p;
  		}
  		return root;
  	}
  	
  	private BinaryTreeNode rotateToLeft(BinaryTreeNode root)
  	{
  		BinaryTreeNode p;
  		if(root == null)
  			System.out.print("Error in the tree.");
  		else if(root.rlink == null)
  			System.out.print("No right subtree to rotate.");
  		else
  		{
  			p = root.rlink;
  			root.rlink = p.llink;
  			p.llink = root;
  			root = p;
  		}
  		return root;
  	}
  	
  	private BinaryTreeNode balanceFromLeft(BinaryTreeNode root)
  	{
  		BinaryTreeNode p;
  		p = root.llink;
  		
/*  	switch(bFactor(p))
  		case 0:		System.out.print("Cannot balance from the left");
*/	
  		if(bFactor2(p) == -1)
  			root = rotateToRight(root);
  		else if(bFactor2(p) == 1)
  		{
  			p = rotateToLeft(p);
			root.llink = p;
			root = rotateToRight(root);
  		}
  		return root;
  	}
  	
	private BinaryTreeNode balanceFromRight(BinaryTreeNode root)
  	{
  		BinaryTreeNode p;
  		p = root.rlink;
  		
/*  	switch(bFactor(p))
  		{
  		case 0:		System.out.print("Cannot balance from the left");
  					break;
 */
  		if(bFactor2(p) == -1)
  		{
  			p = rotateToRight(p);
			root.rlink = p;
			root = rotateToLeft(root);
  		}
  		else if(bFactor2(p) == 1)
  			root = rotateToLeft(root);
  		return root;
  	}
	
	private BinaryTreeNode insertIntoAVL(BinaryTreeNode root, BinaryTreeNode newNode)
	{
		if(root == null)
			root = newNode;
		else if(root.info == newNode.info)
			System.out.print("No duplicates allowed.");
		else if((root.info - newNode.info) > 0)
		{
			root.llink = insertIntoAVL(root.llink, newNode);
			
			if(bFactor2(root.llink) > 1)
			{	
				if(bFactor(root) > 1)
				root = balanceFromLeft(root);
			}
		}
		else
		{
			root.rlink = insertIntoAVL(root.rlink, newNode);
			
			if(bFactor(root.rlink) > 1)
			{
				if(bFactor(root) > 1)
					root = balanceFromRight(root);
			}
		}
		return root;
	}
	
	public void add(int newItem)
	{
		BinaryTreeNode newNode = new BinaryTreeNode(newItem);
		root = insertIntoAVL(root, newNode);
	}
	
  	private int bFactor(BinaryTreeNode p)
  	{
  		int leftDiff, rightDiff;
  		leftDiff = privateTreeLeftHeight(p) - privateTreeRightHeight(p);
  		rightDiff = privateTreeRightHeight(p) - privateTreeLeftHeight(p);
  		
  		if(leftDiff > rightDiff)
  			return leftDiff;
  		else if(rightDiff > leftDiff)
  			return rightDiff;
  		else
  			return 0;
  	}
  	
  	private int bFactor2(BinaryTreeNode p)
  	{
  		int leftDiff, rightDiff;
  		leftDiff = privateTreeLeftHeight(p) - privateTreeRightHeight(p);
  		rightDiff = privateTreeRightHeight(p) - privateTreeLeftHeight(p);
  		
  		if(leftDiff > rightDiff)
  			return -1;
  		else if(rightDiff > leftDiff)
  			return 1;
  		else
  			return 0;
  	}
 	
  	/*
  	 * END METHODS FOR AVL TREES
  	 */
//===========================================================================================  	
  	private int nodeCount(BinaryTreeNode p)
  	{
  		int nodeCount = 0, temp = 0;
  		if(p == null)
  			return nodeCount;
  		else
  		{
  			temp = 1 + nodeCount(p.llink) + nodeCount(p.rlink);
  			nodeCount = nodeCount + temp;
  			return nodeCount;
  		}
  	}//private method to return a number of nodes to be used by method treeNodeCount
  	
  	private int leaves(BinaryTreeNode p)
  	{
  		int count = 0, temp = 0;
  		if(p == null)
  			return count;
  		else if(p.llink == null && p.rlink == null)
  			return 1;
  		else
  		{
  			temp = leaves(p.llink) + leaves(p.rlink);
  			count = count + temp;
  			return count;
  		}
  	}//private method to return a number of leaf nodes
  	
  	public int leaf(){
  		return leaves(root);
  	}
  	
  	public int treeNodeCount(){
  		return nodeCount(root);
  	}//end treeNodeCount
  	
  	public int getHeight(){
  		return height(root);
  	}//end getHeight

  	private int height(BinaryTreeNode p)
  	{
  		if(p == null)
  			return 0;
  		else
  			return 1 + max(height(p.llink), height(p.rlink));
  	}//end height
  	
  	private int max(int x, int y)
  	{
  		if(x >= y)
  			return x;
  		else
  			return y;
  	}//end max
  	
  	public boolean isEmptyTree(){
  		return root == null;
  	}//end isEmptyTree
  	
	public boolean search(int searchItem) 
	{
		BinaryTreeNode current;
	    boolean found = false;
     
	    if(root == null)
	    	System.out.print("Cannot search an empty tree.");
	    else
	    {
	    	current = root;
	        while(current != null && !found)
	        {
	        	if(current.info == searchItem)
	        		found = true;
	            else
	            {
	            	if((current.info - searchItem) > 0)
	            		current = current.llink;
	            	else
	            		current = current.rlink;
	            }//end else
	         }//end while
	    }//end else
	    return found;
	}//end search
	
	public int levelOfNode(int item)
	{
		BinaryTreeNode current;
		int level = 0;
		boolean found = false;
		
		if(item == root.info)
			return level;
		else
		{
			current = root;
			while(current != null && !found)
			{
				if(current.info == item)
				{
					found = true;
					return level;
				}
				else
				{
					if((current.info - item) > 0)
						current = current.llink;
					else
						current = current.rlink;
					level++;
				}//end else
			}//end while
		}//end else
		return level;
	}//end levelOfNode
	
	public void insert(int insertItem)
	{
		BinaryTreeNode current, trailCurrent = null;
	    BinaryTreeNode newNode = new BinaryTreeNode();
	      
	    newNode.info = insertItem;
	    newNode.llink = null;
	    newNode.rlink = null;
	      
	    if(root == null)
	    	root = newNode;
	    else
	    {
	    	current = root;
	        while(current != null)
	        {
	        	trailCurrent = current;
	            if(current.info == insertItem)
	            {
	            	System.out.print("No duplicates allowed.");
	            	return;
	            }//end if
	            else
	            {
	            	if((current.info - insertItem) > 0)
	            		current = current.llink;
	            	else
	            		current = current.rlink;
	            }//end else
	        }//end while
	        if((trailCurrent.info - insertItem) > 0)
	        	trailCurrent.llink = newNode;
	        else
	        	trailCurrent.rlink = newNode;
	    }//end else
	}// end insert
	   
	private BinaryTreeNode deleteFromTree(BinaryTreeNode p)
	{
		BinaryTreeNode current, trailCurrent;
	      
	    if(p == null)
	    	System.out.print("Node to be deleted is null.");
	    else if(p.llink == null && p.rlink == null)
	        p = null;
	    else if(p.llink == null)
	        p = p.rlink;
	    else if(p.rlink == null)
	        p = p.llink;
	    else
	    {
	    	current = p.llink;
	        trailCurrent = null;
	        while(current.rlink != null)
	        {
	            trailCurrent = current;
	            current = current.llink;
	        }//end while
	        p.info = current.info;
	         
	        if(trailCurrent == null) //current did not move;
	                                    //current == p.llink; adjust p
	        	p.llink = current.llink;
	        else
	            trailCurrent.rlink = current.llink;                                  
	    }//end else
	    return p;
	}//end deleteFromTree
	   
	public void deleteNode(int deleteItem)
	{
		BinaryTreeNode current, trailCurrent;
		boolean found = false;
	      
	    if(root == null)
	    	System.out.print("Cannot delete from an empty tree.");
	    else
	    {
	    	current = root;
	        trailCurrent = root;
	         
	        while(current != null && !found)
	        {
	        	if(current.info == deleteItem)
	        		found = true;
	            else
	            {
	            	trailCurrent = current;
	            	if((current.info - deleteItem) > 0)
	            		current = current.llink;
	            	else
	            		current = current.rlink;
	            }
	        }//end while
	        if(current == null)
	        	System.out.print("Delete item is not in the list.");
	        else
	        {
	        	if(found)
	            {
	        		if(current == root)
	        			root = deleteFromTree(root);
	        		else
	        		{
	        			if((trailCurrent.info - deleteItem) > 0)
	        				trailCurrent.llink = deleteFromTree(trailCurrent.llink);
	        			else
	        				trailCurrent.rlink = deleteFromTree(trailCurrent.rlink);
	        		}//end else
	            }//end if
	        }//end else
	    }//end else
	}//end delete node
		
	private void inorder(BinaryTreeNode p)
	{
		if(p != null)
		{
			inorder(p.llink);
			System.out.print(p.info+" ");
			inorder(p.rlink);
		}
	}//end inorder
		
	private void preorder(BinaryTreeNode p)
	{
		if(p != null)
		{
			System.out.print(p.info+" ");
			preorder(p.llink);
			preorder(p.rlink);
		}
	}//end preorder
		
	private void postorder(BinaryTreeNode p)
	{
		if(p != null)
		{
			postorder(p.llink);
			postorder(p.rlink);
			System.out.print(p.info+" ");
		}
	}//end postorder
	
	public void traverse()
	{
		System.out.print("\nInorder traversal: ");
	    inorder(root);
		System.out.print("\nPreorder traversal: ");
	    preorder(root);
		System.out.print("\nPostorder traversal: ");
	    postorder(root);
	    System.out.print("\nRoot: "+root+"\nLeaves: "+leaf());
		System.out.println(" ");
	}//end traverse
}//end BinarySearchTree