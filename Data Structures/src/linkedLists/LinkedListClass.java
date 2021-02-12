package linkedLists;

public abstract class LinkedListClass 
{
	protected LinkedListNode first;
	protected LinkedListNode last;
	protected int count;
	
	public LinkedListClass()
	{
		first = last = null;
		count = 0;
	}
	
	public LinkedListClass(LinkedListClass otherList){
		copy(otherList);
	}
	
	public int length(){
		return count;
	}
	
	public boolean isEmptyList(){
		return first == null;
	}
	
	public void initializeList()
	{
		first = last = null;
		count = 0;
	}
	
	public void print()
	{
		LinkedListNode current = first;
		while(current != null)
		{
			System.out.print(current.info+" ");
			current = current.link;
		}
	}
	
	public int front()
	{
		int temp = first.info;
		return temp;
	}
	
	public double back()
	{
		double temp = last.info;
		return temp;
	}
	
	public void insertFirst(int num)
	{
		LinkedListNode newNode = new LinkedListNode(num);
		
		newNode.link = first;
		first = newNode;
		
		if(last == null)
			last = newNode;
		count++;
	}
	
	public void insertLast(int newItem)
	{
		LinkedListNode newNode = new LinkedListNode(newItem);
		
		if(first == null)
			first = last = newNode;
		else
		{
			last.link = newNode;
			last = newNode;
		}
		
		count++;
	}
	
	private void copy(LinkedListClass otherList)
	{
		LinkedListNode newNode, current;		
		first = null;
		
		if(otherList.first == null)
		{
			first = last = null;
			count = 0;
		}
		else
		{
			count = otherList.count;
			current = otherList.first;
			
			first = new LinkedListNode();
			first.info = current.info;
			first.link = null;
			
			last = first;
			current = current.link;
			
			while(current != null)
			{
				newNode = new LinkedListNode();
				newNode.info = current.info;
				newNode.link = null;
				last.link = newNode;
				last = newNode;
				current = current.link;
			}
		}
	}
	
	public void copyList(LinkedListClass otherList)
	{
		if(this != otherList)
			copy(otherList);
	}
}
