package bst.genericBST;

public class EmptyTreeException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public EmptyTreeException(){
		super("Tree is empty.");
	}
	
	public EmptyTreeException(String name){
		super(name+" is empty.");
	}
}