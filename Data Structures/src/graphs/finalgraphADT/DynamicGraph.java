package graphs.finalgraphADT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

//http://en.literateprograms.org/Dijkstra's_algorithm_(Java)?oldid=15444
public class DynamicGraph
{
	//	computes the shortest distance from the source to other vertices
	public static void shortestPath(Vertex source)
	{
		source.setDistance(0);	// set the source's distance to 0
		
		PriorityQueue<Vertex> vertexQueue = new PriorityQueue<>(10);
		vertexQueue.add(source);
		System.out.println(vertexQueue);
		
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
				System.out.println(vertexQueue);
			}//	end for loop
		}//	end while
	}//	end computePaths
	
	public static void depthFirst(LinkedList<Vertex> vertices)
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
	
	public static void breadthFirst(LinkedList<Vertex> vertices)
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
		System.out.println();
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
	

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		LinkedList<Vertex> vertices = new LinkedList<>();
		String vertexName, targetVertex;
		
		int choice, numOfVertices, limit;
		int weight;
		char end = ' ';
		
		do
		{
			try
			{
				System.out.println("1. Add vertex\n2. Add adjancencies\n3. Breadth-first and Depth-first"
						+ "\n4. Shortest path\n5. Find shortest path\n6. Exit");
				System.out.print("Choice = ");
				choice = console.nextInt();
				System.out.println();
				
				if(choice == 1)
				{
					System.out.print("How many vertices would add?: ");
					numOfVertices = console.nextInt();
					console.nextLine();
					
					for(int g = 0; g < numOfVertices; g++)
					{
						System.out.print("Add "+(g + 1)+" vertex: ");
						vertexName = console.nextLine();
						vertices.add(new Vertex(vertexName));
					}
				}
				else if(choice == 2)
				{
					if(vertices.isEmpty())
						throw new Exception("Cannot set adjacencies on empty graph.");
					else
					{
						for(Vertex v : vertices)
						{
							System.out.print("Set limit of adjacencies of vertex "+v.getName()+": ");
							limit = console.nextInt();
							LinkedList<Edge> edges00 = new LinkedList<>();
							
							for(int g = 0; g < limit; g++)
							{
								System.out.print("Input weight: ");
								weight = console.nextInt();
								
								console.nextLine();
								System.out.print("Input target: ");
								targetVertex = console.nextLine();
								
								if(searchTarget(vertices, targetVertex))
								{
									Vertex vertex = getVertex(vertices, targetVertex);
									edges00.add(new Edge(vertex, weight));
								}
								else
								{
									System.out.println("Operation failed. Closing.");
									System.exit(0);
								}
							}
							
							Edge[] edges01 = edges00.toArray(new Edge[edges00.size()]);
							v.setAdjacencies(edges01);
							edges00.clear();
						}
					}
				}
				else if(choice == 3)
				{
					depthFirst(vertices);
					System.out.println();
					breadthFirst(vertices);
				}
				else if(choice == 4)
				{
					System.out.println("Shortest Paths:");
					shortestPath(vertices.getFirst());
					
					for(Vertex v : vertices)
					{
						System.out.println("Distance from "+vertices.getFirst().getName()+" to "+v+": "+v.getDistance());
						
						List<Vertex> path = getShortestPathTo(v);
						System.out.println("Path: "+path);
						System.out.println();
					}//	end forloop
				}
				else if(choice == 5)
				{
					System.out.print("Enter source: ");
					String source = console.nextLine();
					console.next();
					System.out.print("Enter destination: ");
					String dest = console.nextLine();
					console.next();
					
					if(searchTarget(vertices, source) && searchTarget(vertices, dest))
					{
						Vertex[] vs = new Vertex[2];
						vs[0] = getVertex(vertices, source);
						vs[1] = getVertex(vertices, dest);
						
						shortestPath(vs[0]);
						System.out.println("\nShortest distance from "+vs[0].getName()+" to "+vs[1].getName()+": "+vs[1].getDistance());
						 
						if(vs[1].getDistance() == Double.POSITIVE_INFINITY)
							System.out.printf("There is no path existing from %s to %s\n", vs[0].getName(), vs[1].getName());
						 
						List<Vertex> path = getShortestPathTo(vs[1]);
						System.out.println("Shortest path: "+path);
					}
				}
				else if(choice == 6)
					System.exit(0);
				else
					System.out.println("Invalid choices. Try again");
				
				System.out.print("\nDo you want to continue? Y/N: ");
				end = console.next().charAt(0);
				System.out.println();
			}
			catch(Exception exc)
			{
				System.out.println(exc.toString());
				System.exit(0);
			}
		}
		while(end == 'Y' || end == 'y');
	}//	end main
	
	public static boolean searchTarget(LinkedList<Vertex> v0, String nameTarget)
	{
		for(Vertex v : v0)
		{
			if(v.getName().equals(nameTarget))
				return true;
		}
		return false;
	}
	
	public static Vertex getVertex(LinkedList<Vertex> v0, String nameTarget)
	{
		for(Vertex v : v0)
		{
			if(v.getName().equals(nameTarget))
				return v;
		}
		return null;
	}
}