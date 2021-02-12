package linkedLists.derivedQueue;

@SuppressWarnings("serial")
public class QueueUnderflowException extends QueueException
{
	public QueueUnderflowException(){
		super("Queue Underflow Exception");
	}
	
	public QueueUnderflowException(String msg){
		super(msg);
	}
}
