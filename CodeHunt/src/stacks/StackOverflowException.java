package stacks;

public class StackOverflowException extends StackException
{
	private static final long serialVersionUID = 1L;

	public StackOverflowException(){
		super("Stack Overflow");
	}
	
	public StackOverflowException(String msg){
		super(msg);
	}
}
