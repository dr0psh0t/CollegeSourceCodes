package linkedbasedlists;
public class LinkedStack extends LinkedListOperations
{
	public LinkedStack(){
		super();
	}
	
	public boolean isEmptyStack(){
		return super.isEmpty();
	}
	
	public int stackLength(){
		return super.length();
	}
	
	public void push(int item){
		super.addBeforeHead(item);
	}
	
	public void pop(){
		super.deleteHead();
	}
	
	public int peek(){
		return super.first();
	}
	
	public void print(){
		super.display();
	}
}
