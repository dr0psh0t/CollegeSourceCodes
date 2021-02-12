package linkedLists;

public class UnorderedLinkedList extends LinkedListClass
{
	public UnorderedLinkedList(){
		super();
	}
	
	public UnorderedLinkedList(UnorderedLinkedList otherList){
		super(otherList);
	}
	
	public boolean search(int searchItem)
	{
		LinkedListNode current = first;
		boolean found = false;
		
		while(current != null && !found)
		{
			if(current.info == searchItem)
				found = true;
			else
				current = current.link;
		}
		return found;
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
				
				if(first == null)
					last = null;
				count--;
			}
			else
			{
				found = false;
				trailCurrent = first;
				current = first.link;
				
				while(current != null && !found)
				{
					if(current.info == deleteItem)
						found = true;
					else
					{
						trailCurrent = current;
						current = current.link;
					}
				} // end while
				
				if(found)
				{
					count--;
					trailCurrent.link = current.link;
					
					if(last == current)
						last = trailCurrent;
				}
				else
					System.out.println("Item to be deleted is not in the list.");
			} // end else
		} // end else
	} // end deleteNode
}
