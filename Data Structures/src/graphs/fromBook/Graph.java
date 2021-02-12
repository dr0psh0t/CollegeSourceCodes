package graphs.fromBook;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import linkedLists.derivedQueue.LinkedQueueClass;

public class Graph
{
	protected final int infinity = 10000000;
	
	protected int maxSize;
	protected int gSize;
	protected LinkedListGraph[] graph;
	
	public Graph()
	{
		maxSize = 100;
		gSize = 0;
		graph = new LinkedListGraph[maxSize];
		
		for(int g = 0; g < maxSize; g++)
			graph[g] = new LinkedListGraph();
	}
	
	public Graph(int size)
	{
		gSize = 0;
		maxSize = size;
		graph = new LinkedListGraph[maxSize];
		
		for(int g = 0; g < maxSize; g++)
			graph[g] = new LinkedListGraph();
	}
	
	public boolean isEmpty(){
		return gSize == 0;
	}
	
	public void createGraph() throws IOException, FileNotFoundException
	{
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		
		String fileName;
		StringTokenizer tokenizer;
		
		int index, vertex, adjacentVertex;
		
		if(gSize != 0)
			clearGraph();
		
		System.out.print("Enter file name: ");
		fileName = keyboard.readLine();
		System.out.println();
		
		@SuppressWarnings("resource")
		BufferedReader infile = new BufferedReader(new FileReader(fileName));
		
		gSize = Integer.parseInt(infile.readLine());
		
		for(index = 0; index < gSize; index++)
		{
			tokenizer = new StringTokenizer(infile.readLine());
			vertex = Integer.parseInt(tokenizer.nextToken());
			adjacentVertex = Integer.parseInt(tokenizer.nextToken());
			
			while(adjacentVertex != -9)
			{
				graph[vertex].insertLast(adjacentVertex);
				adjacentVertex = Integer.parseInt(tokenizer.nextToken());
			}
		}
	}
	
	public void breadthFirstTraversal()
	{
		LinkedQueueClass queue = new LinkedQueueClass();
		
		boolean[] visited = new boolean[gSize];
		int[] adjacencyList = new int[gSize];
		
		for(int t = 0; t < gSize; t++)
			visited[t] = false;
		
		int alLength, u;
		
		System.out.print("Breadth-first traversal: ");
		for(int index = 0; index < gSize; index++)
		{
			if(!visited[index])
			{
				queue.addQueue(index);
				visited[index] = true;
				System.out.print(index+" ");
				
				while(!queue.isEmptyQueue())
				{
					u = queue.front();
					queue.deleteQueue();
					alLength = graph[u].getAdjacentVertices(adjacencyList);
					
					for(int w = 0; w < alLength; w++)
					{
						int y = adjacencyList[w];
						if(!visited[y])
						{
							queue.addQueue(y);
							visited[y] = true;
							System.out.print(y+" ");
						}
					}
				}//	end while-loop
			}//	end if
		}//	end for-loovp
	}//	end breadthFirstTraversal
	
	private void dft(int vertex, boolean[] visited)
	{
		//	array to retrieve the adjacent vertices
		int[] adjacencyList = new int[gSize];
		
		//	retrieve the adjacent into adjacencyList and get the number of adjacent vertices
		int alLength = graph[vertex].getAdjacentVertices(adjacencyList);
		
		visited[vertex] = true;	//	marked true as visited
		System.out.print(" "+vertex+"");
		
		int w;
		for(int index = 0; index < alLength; index++)
		{
			w = adjacencyList[index];
			
			if(!visited[w])
				dft(w, visited);
		}
	}
	
	public void depthFirstTraversal()
	{
		System.out.print("Depth-first traversal: ");
		
		boolean[] visited = new boolean[gSize];
		int index;
		
		for(index = 0; index < gSize; index++)
			visited[index] = false;				//	initialize the boolean to false as default values
		
		for(index = 0; index < gSize; index++)	//	for each vertex,
		{
			if(!visited[index])					//	that is not visited
				dft(index, visited);			//	do a depth first traversal
		}
	}
	
	public void dftAtVertex(int vertex)
	{
		System.out.print("Depth-first traversal at vertex "+vertex+": ");
		
		boolean[] visited = new boolean[gSize];
		int index;
		
		for(index = 0; index < gSize; index++)
			visited[index] = false;
		dft(vertex, visited);
	}
	
	public void clearGraph()
	{
		int index;
		
		for(index = 0; index < gSize; index++)
			graph[index] = null;
		gSize = 0;
	}
	
	public void printGraph()
	{
		int index;
		for(index = 0; index < gSize; index++)
		{
			System.out.print(index+" ");
			graph[index].print();
			System.out.println();
		}
		System.out.println();
	}
}