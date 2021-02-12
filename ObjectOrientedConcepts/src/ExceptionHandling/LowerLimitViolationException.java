package ExceptionHandling;

@SuppressWarnings("serial")
//Sample3.java
public class LowerLimitViolationException extends Exception
{
	public LowerLimitViolationException(){
		super("Lower limit violation.");
	}
	
	public LowerLimitViolationException(String strMessage){
		super(strMessage);
	}
}