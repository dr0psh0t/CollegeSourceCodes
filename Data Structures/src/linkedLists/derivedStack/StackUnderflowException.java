package linkedLists.derivedStack;

public class StackUnderflowException extends StackException
{
	private static final long serialVersionUID = 1L;

	public StackUnderflowException(){
		super("Stack Underflow");
	}
	
	public StackUnderflowException(String msg){
		super(msg);
	}
}
