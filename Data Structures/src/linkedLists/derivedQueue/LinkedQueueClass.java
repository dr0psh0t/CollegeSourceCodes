package linkedLists.derivedQueue;
import linkedLists.UnorderedLinkedList;

public class LinkedQueueClass extends UnorderedLinkedList
{
	public LinkedQueueClass(){
		super();
	}
	
	public LinkedQueueClass(LinkedQueueClass otherQueue){
		super(otherQueue);
	}
	
	public void initializeQueue(){
		initializeList();
	}
	
	public boolean isEmptyQueue(){
		return super.isEmptyList();
	}
	
	public boolean isFullQueue(){
		return false;
	}
	
	public void addQueue(int newElement){
		insertLast(newElement);
	}
	
	public int front(){
		return super.front(); 	// using super keyword to overriden methods in the parent class
	}
	
	public double back(){
		return super.back();	// using super keyword to overriden methods in the parent class
	}
	
	public void deleteQueue() throws QueueUnderflowException
	{
		if(isEmptyQueue())
			throw new QueueUnderflowException();
		
		first = first.link;
		count--;
		
		if(first == null)
			last = null;
	}
}
