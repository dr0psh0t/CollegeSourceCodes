package graphs.finalgraphADT;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

//	http://en.literateprograms.org/Dijkstra's_algorithm_(Java)?oldid=15444
public class GraphMain
{
	//	computes the shortest distance from the source to other vertices
	public static void shortestPath(Vertex source)
	{
		source.setDistance(0);	// set the source's distance to 0
		
		PriorityQueue<Vertex> vertexQueue = new PriorityQueue<>(10);
		vertexQueue.add(source);
		//System.out.println(vertexQueue);
		
		while(!vertexQueue.isEmpty())
		{
			Vertex polledVertex = vertexQueue.poll();
			
			for(Edge edge : polledVertex.getAdjacencies())
			{
				Vertex vertex = edge.getTarget();
				double weight = edge.getWeight();
				double distanceThroughU = polledVertex.getDistance() + weight;
				
				if(distanceThroughU < vertex.getDistance())
				{
					vertex.setDistance(distanceThroughU);
					vertex.setPrevious(polledVertex);
					vertexQueue.add(vertex);
				}
				//System.out.println(vertexQueue);
				//System.out.println("Vertex: "+vertex.getName()+"\nDistance: "+vertex.getDistance()+"\n");
			}//	end for loop
		}//	end while
	}//	end computePaths
	
/*	=============================================================================================================================================
	 * In depth-first topological sorting, we use a temporary stack. We don’t print the vertex immediately,
	 * we first recursively call topological sorting for all its adjacent vertices, then push
	 * it to a stack. Finally, print contents of stack. Note that a vertex is pushed to stack
	 * only when all of its adjacent vertices (and their adjacent vertices and so on) are already in stack.
	 */
	
	public static Stack<Vertex> getDepthFirstTopologicalSort(Vertex[] vertices)
	{
		Stack<Vertex> stack = new Stack<>();
		LinkedList<Vertex> visited = new LinkedList<>();
		
		for(Vertex vertex : vertices)
		{
			if(!visited.contains(vertex))
				topologicalHelper(visited, stack, vertex);
		}
		
		Collections.reverse(stack);
		return stack;
	}
	
	public static void topologicalHelper(LinkedList<Vertex> visited, Stack<Vertex> stack, Vertex vertex)
	{
		visited.add(vertex);
		for(Edge edge : vertex.getAdjacencies())
		{
			Vertex node = edge.getTarget();
			if(!visited.contains(node))
				topologicalHelper(visited, stack, node);
		}
		stack.push(vertex);
	}
//	=============================================================================================================================================
	
	public static LinkedList<Vertex> getBreadthFirstTopologicalOrder(Vertex[] vertices)
	{
		//LinkedList<Vertex> queueTP = new LinkedList<>();
		LinkedList<Vertex> queue = new LinkedList<>();
		LinkedList<Vertex> visited = new LinkedList<>();
		Vertex u;
		
		for (Vertex vertex : vertices)
		{
			if (!visited.contains(vertex))
			{
				queue.add(vertex);
				visited.add(vertex);
				
				while(!queue.isEmpty())
				{
					u = queue.pollFirst();
					
					for (Edge edge : u.getAdjacencies())
					{
						Vertex node = edge.getTarget();
						
						if(!visited.contains(node))
						{
							queue.add(node);
							visited.add(node);
						}
					}
				}
			}
		}
		
		return visited;
	}
	
	public static void depthFirstTraversal(Vertex[] vertices)
	{
		System.out.print("Depth-first traversal: ");		
		LinkedList<Vertex> visited = new LinkedList<>();
		
		for(Vertex vertex : vertices)
		{
			if(!visited.contains(vertex))
				depthFirstRec(vertex, visited);
		}
	}
	
	private static void depthFirstRec(Vertex vertex, LinkedList<Vertex> visited)
	{
		visited.add(vertex);
		System.out.print(vertex.getName()+" ");
		
		for(Edge edge : vertex.getAdjacencies())
		{
			Vertex node = edge.getTarget();			
			if(!visited.contains(node))
				depthFirstRec(node, visited);
		}
	}
	
	public static void breadthFirstTraversal(Vertex[] vertices)
	{
		LinkedList<Vertex> queue = new LinkedList<>();
		LinkedList<Vertex> visited = new LinkedList<>();
		Vertex u;
		
		System.out.print("Breadth-first Traversal: ");
		
		for (Vertex vertex : vertices)
		{
			if (!visited.contains(vertex))
			{
				queue.add(vertex);
				visited.add(vertex);
				System.out.print(vertex.getName()+" ");
				
				while(!queue.isEmpty())
				{
					u = queue.pollFirst();
					
					for (Edge edge : u.getAdjacencies())
					{
						Vertex node = edge.getTarget();
						
						if(!visited.contains(node))
						{
							queue.add(node);
							visited.add(node);
							System.out.print(node.getName()+" ");
						}
					}
				}//	end while-loop
			}//	end if
		}//	end foreach
	}// end breadthFirstTraversal
	
	//	returns a list from the source until the specified target
	public static List<Vertex> getShortestPathTo(Vertex target)
	{
		List<Vertex> path = new ArrayList<>(10);
		
		for(Vertex vertex = target; vertex != null; vertex = vertex.getPrevious())
			path.add(vertex);
		
		Collections.reverse(path);
		return path;
	}//	end getShortestPathTo
	

	public static void main(String[] args)
	{
		/*Vertex v0 = new Vertex("v0");
		Vertex v1 = new Vertex("v1");
		Vertex v2 = new Vertex("v2");
		Vertex v3 = new Vertex("v3");
		Vertex v4 = new Vertex("v4");
		Vertex v5 = new Vertex("v5");
		
		/*v0.setAdjacencies(new Edge[]{
							new Edge(v1, 16), 
							new Edge(v3, 2),
							new Edge(v4, 3)});
		
		v1.setAdjacencies(new Edge[]{
							new Edge(v2, 5)});
		
		v2.setAdjacencies(new Edge[]{
							new Edge(v1, 3)});
		
		v3.setAdjacencies(new Edge[]{
							new Edge(v1, 12),
							new Edge(v4, 7)});
		
		v4.setAdjacencies(new Edge[]{
							new Edge(v1, 10),
							new Edge(v2, 4),
							new Edge(v3, 5)});
		
		Vertex[] vertices = {v0, v1, v2, v3, v4};

		v2.setAdjacencies(new Edge[]{new Edge(v3, 0)});

		v3.setAdjacencies(new Edge[]{new Edge(v1, 0)});

		v4.setAdjacencies(new Edge[]{new Edge(v1, 0), new Edge(v0, 0)});
		
		v5.setAdjacencies(new Edge[]{new Edge(v2, 0), new Edge(v0, 0)});

		Vertex[] vertices = {v0, v1, v2, v3, v4, v5};*/
		
		Vertex a = new Vertex("a");
		Vertex b = new Vertex("b");
		Vertex c = new Vertex("c");
		Vertex d = new Vertex("d");
		Vertex e = new Vertex("e");
		
		a.setAdjacencies(new Edge[]{new Edge(c, 0), new Edge(d, 0)});
		b.setAdjacencies(new Edge[]{new Edge(a, 0), new Edge(d, 0)});
		c.setAdjacencies(new Edge[]{new Edge(e, 0)});
		d.setAdjacencies(new Edge[]{new Edge(c, 0), new Edge(e, 0)});
		
		Vertex[] vertices = {a, b, c, d, e};
		
		System.out.println(getDepthFirstTopologicalSort(vertices));
		System.out.println(getBreadthFirstTopologicalOrder(vertices));
		
		System.out.println();
		
		for(Vertex vertex : vertices)
			System.out.println(vertex);
		
		System.out.println();
		
		try
		{
			PrintWriter outFile = new PrintWriter("src/graphs/finalgraphADT/adjacencies");
			
			for(Vertex vertex : vertices)
			{
				for(Edge edge : vertex.getAdjacencies())
				{
					double weight = edge.getWeight();
					Vertex target = edge.getTarget();
					
					System.out.print(vertex);
					System.out.print(" "+target);
					System.out.print(" "+weight);
					
					outFile.print(vertex);
					outFile.print(" "+target);
					outFile.print(" "+weight);
					
					System.out.println();
					outFile.println();
				}
			}
			
			outFile.close();
		}
		catch (FileNotFoundException e1){
			e1.printStackTrace();
		}
		
		
		/*shortestPath(v0);
		
		for (Vertex vertex : vertices) {
			System.out.println(vertex);
		}
		
		for(Vertex v : vertices)
		{
			System.out.println("Distance from "+v0.getName()+" "
					+ "to "+v+": "+v.getDistance());
			List<Vertex> path = getShortestPathTo(v);
			System.out.println("Path: "+path);
		}*/
		
		
	}//	end main
}