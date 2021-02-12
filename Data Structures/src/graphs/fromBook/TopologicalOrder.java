package graphs.fromBook;

import linkedLists.derivedQueue.LinkedQueueClass;

public class TopologicalOrder extends Graph
{
	public TopologicalOrder(){}
	
	public TopologicalOrder(int size){
		super(size);
	}
	
	public void bfTopOrder()
	{
		LinkedQueueClass queue = new LinkedQueueClass();
		
		int u,
			ind,
			j;
		
		int[] topologicalOrder = new int[gSize];
		
		for(ind = 0; ind < gSize; ind++)
			topologicalOrder[ind] = -1;
		
		int topIndex = 0;
		
		int[] adjacencyList = new int[gSize];
		
		int alLength = 0;
		
		int[] predCount = new int[gSize];
		
		for(ind = 0; ind < gSize; ind++)
		{
			alLength = graph[ind].getAdjacentVertices(adjacencyList);
			
			for(j = 0; j < alLength; j++)
				predCount[adjacencyList[j]]++;
		}
		
		for(ind = 0; ind < gSize; ind++)
		{
			if(predCount[ind] == 0)
				queue.addQueue(ind);
		}
		
		while(!queue.isEmptyQueue())
		{
			int temp = queue.front();
			u = temp;
			queue.deleteQueue();
			topologicalOrder[topIndex++] = u;
			
			alLength = graph[u].getAdjacentVertices(adjacencyList);
			
			for(int w = 0; w < alLength; w++)
			{
				int w1 = adjacencyList[w];
				predCount[w1]--;
				
				if(predCount[w1] == 0)
					queue.addQueue(w1);
			}
		}
		
		for(ind = 0; ind < gSize; ind++)
			System.out.print(topologicalOrder[ind]+" ");
		
		System.out.println();
	}
}