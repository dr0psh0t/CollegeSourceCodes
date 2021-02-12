public class BinaryTreeNode 
{
	public int info;
	public BinaryTreeNode llink;
	public BinaryTreeNode rlink;
	   
	public BinaryTreeNode()
	{
		info = 0;
	    llink = null;
	    rlink = null;
	}//end BinaryTreeNode
	   
	public BinaryTreeNode(int info)
	{
		this.info = info;
      	llink = null;
      	rlink = null;
	}//end BinaryTreeNode
	   
	public String toString() 
	{
		String str = "";
		str = " "+info;
		return str;	
	}//end toString
}//end class BinaryTreeNode