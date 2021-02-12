package problemTwo;

public class LinkedStack 
{
	@SuppressWarnings("unused")
	private Node head, tail;
	private int count;
	
	public LinkedStack()
	{
		head = null;
		tail = null;
		count = 0;
	}
	
	public void push(int newItem)
	{
		Node newNode = new Node(newItem);
		
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			newNode.link = head;
			head = newNode;
		}		
		count++;
	}
	
	public void pop()
	{
		if(count != 0)
		{
			Node temp = head;
			
			temp = temp.link;
			head = temp;
			count--;
		}
		else
			System.out.print("Stack underflow.");
	}
	
	public void display()
	{
		Node temp = head;		
		
		System.out.print("Items in stack: \n");
		while(temp != null)
		{
			System.out.print(temp.info+"\n");
			temp = temp.link;
		}
	}
}
