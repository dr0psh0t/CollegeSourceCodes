public class QueueClass 
{
	QueueNode front, rear;
	
	public QueueClass(){
		front = rear = null;
	}
	
	public void initializeQueue(){
		front = rear = null;
	}
	
	public void addQueue(int value)
	{
		QueueNode newNode = new QueueNode(value);
		newNode.link = null;
		
		if(isEmptyQueue())
			front = rear = newNode;
		else
		{	
			rear.link = newNode;
			rear = rear.link;
		}
	}
	
	public void deleteQueue()
	{
		if(isEmptyQueue())
			System.out.print("Cannot delete empty queue");
		else			
			front = front.link;
		
		if(front == null)
			rear = null;
	}
	
	public void print()
	{
		if(isEmptyQueue())
			System.out.print("Cannot display empty queue");
		else
		{
			QueueNode temp = front;
			
			while(temp != null)
			{
				System.out.print(temp.info+" ");
				temp = temp.link;
			}
		}
	}
	
	public boolean isEmptyQueue(){
		return (front == null);
	}
	
	public int peekFront(){
			return front.info;
	}
	
	public int peekBack(){
		return rear.info;
	}
}
