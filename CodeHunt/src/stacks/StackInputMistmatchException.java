package stacks;

public class StackInputMistmatchException extends StackException
{
	private static final long serialVersionUID = 1L;

	public StackInputMistmatchException(){
		super("Input Mismatched");
	}
	
	public StackInputMistmatchException(String msg){
		super(msg);
	}
}
