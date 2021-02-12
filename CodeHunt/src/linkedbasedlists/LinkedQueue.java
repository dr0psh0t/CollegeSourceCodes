package linkedbasedlists;
public class LinkedQueue extends LinkedListOperations
{
	public LinkedQueue(){
		super();
	}
	
	public boolean isEmptyQueue(){
		return super.isEmpty();
	}
	
	public int QueueLength(){
		return super.length();
	}
	
	public void enQueue(int item){
		super.addToTail(item);
	}
	
	public void deQueue(){
		super.deleteHead();
	}
	
	public void print(){
		super.display();
	}
}
