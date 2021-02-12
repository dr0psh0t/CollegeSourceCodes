package graphs.fromBook;

import linkedLists.LinkedListNode;
import linkedLists.UnorderedLinkedList;

public class LinkedListGraph extends UnorderedLinkedList
{
	//	default constructor
	public LinkedListGraph(){}
	
	//	copy constructor
	public LinkedListGraph(LinkedListGraph otherGraph){
		super(otherGraph);
	}
	
	public int getAdjacentVertices(int[] adjacencyList)
	{
		LinkedListNode current = first;
		int length = 0;
		
		while(current != null)
		{
			adjacencyList[length++] = current.info;
			current = current.link;
		}
		return length;
	}
}