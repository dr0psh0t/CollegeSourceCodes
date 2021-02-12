package avl;
/*
 * the class AVLTree
 */
public class AVLTree
{
	//instance variable root of AVLNode
	AVLNode root;
	
	//default constructor
	public AVLTree(){
		root = null;
	}
	
	//method to destroy tree
	public void destroyTree()
	{
		root = null;
		System.out.print("     The tree has been destroyed.");
	}
	
	//method to determine whether the tree is empty or not
	public boolean isEmptyTree(){
		return root == null;
	}
	
	//private method height
	private int height(AVLNode p)
	{
		if(p == null)
			return 0;
		else
			return max(height(p.llink), height(p.rlink)) + 1;
	}
	
	//private method max
	private int max(int x, int y)
	{
		if(x >= y)
			return x;
		else
			return y;
	}
	
  	private int nodeCount(AVLNode p)
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
  	
  	public int treeNodeCount(){
  		return nodeCount(root);
  	}//end treeNodeCount
  	
  	public int getHeight(){
  		return height(root);
  	}//end getHeight
  	
  	//AVL insertion
	public void insert(int data){
		root = insertInto(data, root);
	}
	
	//private method to be used by insert(int data)
	private AVLNode insertInto(int x, AVLNode p)
	{
        if (p == null)
            p = new AVLNode(x);
        else if (x < p.info)
        {
            p.llink = insertInto(x, p.llink);
            if(height(p.llink) - height(p.rlink) == 2)
            {
                if( x < p.llink.info )
                    p = rotateWithLeftChild(p);
                else
                    p = doubleWithLeftChild(p);
            }
        }
        else if( x > p.info )
        {
            p.rlink = insertInto( x, p.rlink );
            if(height(p.rlink) - height(p.llink) == 2)
            {
                if(x > p.rlink.info)
                    p = rotateWithRightChild(p);
                else
                    p = doubleWithRightChild(p);
            }         
        }
        else
          ;  // Duplicate; do nothing
        p.height = max(height(p.llink), height(p.rlink)) + 1;
        return p;
    }
	
	//single left rotation
	private AVLNode rotateWithLeftChild(AVLNode k2)
    {
        AVLNode k1 = k2.llink;
        k2.llink = k1.rlink;
        k1.rlink = k2;
        k2.height = max(height(k2.llink), height(k2.rlink)) + 1;
        k1.height = max(height(k1.llink), k2.height) + 1;
        return k1;
    }
	
	//single right rotation
    private AVLNode rotateWithRightChild(AVLNode k1)
    {
        AVLNode k2 = k1.rlink;
        k1.rlink = k2.llink;
        k2.llink = k1;
        k1.height = max(height(k1.llink), height(k1.rlink)) + 1;
        k2.height = max(height(k2.rlink), k1.height) + 1;
        return k2;
    }
    
    //double left rotation
    private AVLNode doubleWithLeftChild(AVLNode k3)
    {
        k3.llink = rotateWithRightChild(k3.llink);
        return rotateWithLeftChild(k3);
    }
    
    //double right rotation
    private AVLNode doubleWithRightChild(AVLNode k1)
    {
        k1.rlink = rotateWithLeftChild(k1.rlink);
        return rotateWithRightChild(k1);
    }
    
    //private method to delete a node to be used by deleteNode(int deleteItem)
	private AVLNode deleteFromTree(AVLNode p)
	{
		AVLNode current, trailCurrent;
	      
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
	
	//method to delete a node invoked from the main method
	public void deleteNode(int deleteItem)
	{
		AVLNode current, trailCurrent;
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
	        	System.out.print("Node has been deleted.");
	        }//end else
	    }//end else
	}//end delete node
	
	public int levelOfNode(int item)
	{
		AVLNode current;
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
	
	//returns true when the item is found, else false
	public boolean search(int item)	{
		return searchTo(item, root);
	}
	
	//private method to return a boolean value to be used by search(int item)
	private boolean searchTo(int item, AVLNode p)
	{
		if(p == null)
			return false;
		else if(item == p.info)
			return true;
		else if((p.info - item) > 0)
			return searchTo(item, p.llink);
		else
			return searchTo(item, p.rlink);
	}
	
	public int treeLeftHeight()
  	{
		AVLNode current = root;
  		return 1 + height(current.llink);
  	}//public method to return the height of the Tree to the left subtree
  	
  	public int treeRightHeight()
  	{
  		AVLNode current = root;
  		return 1 + height(current.rlink);
  	}//public method to return the height of the Tree to the right subtree
  	
  	private int privateTreeRightHeight(AVLNode p){
  		return 1 + height(p.rlink);
  	}//private method to return the height of the Tree to the right subtree
  	
  	private int privateTreeLeftHeight(AVLNode p){
  		return 1 + height(p.llink);
  	}//private method to return the height of the Tree to the left subtree
  	
  	private boolean privateIsAVL(AVLNode p)
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
  		AVLNode current;
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
  	
  	public int treeBFactor()
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
  	
  	private int nodeBFactorPrivate(AVLNode p)
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
  		AVLNode current;
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
	
	private void inorder(AVLNode p)
	{
		if(p != null)
		{
			inorder(p.llink);
			System.out.print(p.info+" ");
			inorder(p.rlink);
		}
	}//end inorder
		
	private void preorder(AVLNode p)
	{
		if(p != null)
		{
			System.out.print(p.info+" ");
			preorder(p.llink);
			preorder(p.rlink);
		}
	}//end preorder
		
	private void postorder(AVLNode p)
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
	    System.out.print("\nRoot: "+root+"\nNode count: "+treeNodeCount());
		System.out.println(" ");
	}//end traverse
}//end class AVLTree
