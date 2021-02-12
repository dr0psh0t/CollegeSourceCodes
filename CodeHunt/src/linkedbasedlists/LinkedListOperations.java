package linkedbasedlists;
public class LinkedListOperations
{
	Node head, tail;
	int count;
	   
	public LinkedListOperations()
	{
		head = null;
		tail = null;
		count = 0;
	}
	
	public int first(){
		return head.info;
	}
	
	public boolean isEmpty(){
		return head == null && tail == null;
	}
	   
	public int length(){
		return count;
	}
	
	private void recPrivatePrint(Node temp)
	{
		if(temp != null)
		{
			System.out.print(" "+temp.info);
			recPrivatePrint(temp.link);
		}
	}
	
	public void recPublicPrint(){
		recPrivatePrint(head);
	}
	
	public void deleteHead()
	{
		if(isEmpty())
			System.out.print("Cannot delete an empty list.");
		else
		{
			head = head.link;
			
			if(head == null)
				tail = null;
			count--;
		}
	}
	
	public void deleteNode(int node)
	{
		if(isEmpty())
			System.out.print("Cannot delete an empty list.");
		else if(head.info == node){
			deleteHead();
		}
		else if(tail.info == node)
			deleteTail();
		else
		{
			Node connect = head, current = head, temp = head;
			temp = temp.link;
			boolean found = false;
				
			while(temp != null && !found)
			{
				if(temp.info == node)
				{
					found = true;
					current = temp.link;
					temp.link = null;
					connect.link = current;
				}
				temp = temp.link;
				connect = connect.link;
				current = connect; // issues
				//current = current.link;
			}
			if(!found)
				System.out.print("Node not found");
		}
	}

	public void deleteTail()
	{
		Node temp = head, current = head;
		temp = temp.link;
		boolean match = false;
		
		while(temp != null && !match)
		{
			if(temp.info == tail.info)
			{
				match = true;
				tail = current;
				tail.link = null;
			}
			temp = temp.link;
			current = current.link;
		}
		if(tail == null)
			head = null;
		count--;
	}
	
	public void insertAfter(int node, int nodeInsert)
	{
		if(tail.info == node)
			addToTail(nodeInsert);
		else if(head.info == node)
		{
			Node temp = head, current = head;
			temp = head.link;
			
			Node newNode = new Node(nodeInsert);
			
			current.link = newNode;
			newNode.link = temp;
		}
		else
		{
			Node temp = head, current = head;
			temp = head.link;
			boolean found = false;
			
			while(current != null && !found)
			{
				if(current.info == node)
				{
					found = true;
					Node newNode = new Node(nodeInsert);
					current.link = newNode;
					newNode.link = temp;
				}
				temp = temp.link;
				current = current.link;
			}
			if(!found)
				System.out.print("Node not found.");
		}
	}
	
	public void insertBefore(int node, int nodeInsert)
	{
		if(head.info == node)
			addBeforeHead(nodeInsert);
		else
		{
			Node temp = head, current = head;
			temp = temp.link;
			boolean found = false;
			
			while(temp != null && !found)
			{
				if(temp.info == node)
				{
					found = true;
					Node newNode = new Node(nodeInsert);
					current.link = newNode;
					newNode.link = temp;
				}
				temp = temp.link;
				current = current.link;
			}
			if(!found)
				System.out.print("Node not found");
		}
	}
	
	public void addToTail(int info)
	{
		Node newNode = new Node(info);
	      
		if(isEmpty())
			head = tail = newNode;
		else
		{
			tail.link = newNode;
			tail = newNode;
		}   
		count++;
	}
	   
	public void addBeforeHead(int info)
	{
		Node newNode = new Node(info);
	      
		if(isEmpty())
			head = tail = newNode;
		else
		{
			newNode.link = head;
			head = newNode;
		}   
	}
	
	public void printAddress()
	{
		if(isEmpty())
			System.out.print("Cannot display an empty list");
		else
		{
			Node temp;
			temp = head;
		    
			System.out.print("List: ");
			while(temp != null)
			{
				System.out.print(temp.link+" ");
				temp = temp.link;
			}
		}
	}
	
	public void display()
	{
		if(isEmpty())
			System.out.print("Cannot display an empty list");
		else
		{
			Node temp;
			temp = head;
		    
			System.out.print("List: ");
			while(temp != null)
			{
				System.out.print(temp.info+" ");
				temp = temp.link;
			}
		}
	}
}
