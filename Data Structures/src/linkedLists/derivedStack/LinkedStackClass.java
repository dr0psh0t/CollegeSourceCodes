package linkedLists.derivedStack;
import linkedLists.UnorderedLinkedList;

public class LinkedStackClass extends UnorderedLinkedList
{
	public LinkedStackClass(){
	}
	
	public LinkedStackClass(LinkedStackClass otherStack){
		super(otherStack);
	}
	
	public void initializeStack(){
		initializeList();
	}
	
	public boolean isEmptyStack(){
		return isEmptyList();
	}
	
	public boolean isFullStack(){
		return false;
	}
	
	public void push(int num){
		insertFirst(num);
	}
	
	public int top() throws StackUnderflowException
	{
		if(first == null)
			throw new StackUnderflowException();
		return front();
	}
	
	public void pop() throws StackUnderflowException
	{
		if(first == null)
			throw new StackUnderflowException();
		
		first = first.link;
		count--;
		
		if(first == null)
			last = null;
	} // end pop
	
	public void copyStack(LinkedStackClass otherStack){
		copyList(otherStack);
	}
}
