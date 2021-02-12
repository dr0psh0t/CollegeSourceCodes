package stacks;

public class StackException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public StackException()
	{
	}
	
	public StackException(String msg){
		super(msg);
	}
}
