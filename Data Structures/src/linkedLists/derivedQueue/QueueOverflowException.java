package linkedLists.derivedQueue;

@SuppressWarnings("serial")
public class QueueOverflowException extends QueueException
{
	public QueueOverflowException(){
		super("Queue Overflow Exception");
	}
	
	public QueueOverflowException(String msg){
		super(msg);
	}
}
