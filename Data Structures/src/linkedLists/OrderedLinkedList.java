package linkedLists;

public class OrderedLinkedList extends LinkedListClass
{
	public OrderedLinkedList(){
		super();
	}
	
	public OrderedLinkedList(OrderedLinkedList otherList){
		super(otherList);
	}
	
	public boolean search(int searchItem)
	{
		LinkedListNode current = first;
		boolean found = false;
		
		while(current != null && !found)
		{
			if((current.info - searchItem) >= 0)
				found = true;
			else
				current = current.link;
		}
		
		if(found)
			found = (current.info == searchItem);
		return found;
	}
	
	public void insertNode(int insertItem)
	{
		LinkedListNode current, trailCurrent;
		LinkedListNode newNode = new LinkedListNode(insertItem);
		boolean found;
		
		if(first == null)
		{
			first = newNode;
			count++;
		}
		else
		{
			trailCurrent = first;
			current = first;
			found = false;
			
			while(current != null && !found)
			{
				if((current.info - insertItem) >= 0)
					found = true;
				else
				{
					trailCurrent = current;
					current = current.link;
				}
			}
			
			if(current == first)
			{
				newNode.link = first;
				first = newNode;
				count++;
			}
			else
			{
				trailCurrent.link = newNode;
				newNode.link = current;
				count++;
			}
		}
	}
	
	public void deleteNode(int deleteItem)
	{
		LinkedListNode current, trailCurrent;
		boolean found;
		
		if(first == null)
			System.err.println("Cannot delete from an empty list.");
		else
		{
			if(first.info == deleteItem)
			{
				first = first.link;
				count--;
			}
			else
			{
				found = false;
				trailCurrent = first;
				current = first.link;
				
				while(current != null && !found)
				{
					if((current.info - deleteItem) >= 0)
						found = true;
					else
					{
						trailCurrent = current;
						current = current.link;
					}
				} // end while
				
				if(current == null)
					System.out.println("Item to be deleted is not in the list.");
				else if(current.info == deleteItem)
				{
					if(first == current)
					{
						first = first.link;
						count--;
					}
					else
					{
						trailCurrent.link = current.link;
						count--;
					}
				}
				else
					System.out.println("Item to be deleted is not in the list.");
			} // end else
		} // end deleteNode
	}
}
