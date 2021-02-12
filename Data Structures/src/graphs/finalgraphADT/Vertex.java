package graphs.finalgraphADT;

import java.util.ArrayList;

//http://en.literateprograms.org/Dijkstra's_algorithm_(Java)?oldid=15444
public class Vertex implements Comparable<Vertex>
{
	private final String name;
	private ArrayList<Edge> adjacencies;
	private double distance = Double.POSITIVE_INFINITY;
	private Vertex previous;

	//	constructor with only one parameter
	public Vertex(String name)
	{
		this.name = name;
		adjacencies = new ArrayList<>(10);
	}
	
	//	accessor method to return name
	public String getName(){
		return name;
	}
	
	//	mutator method set adjancencies array
	public void setAdjacencies(Edge[] edges)
	{
		adjacencies.clear();
		
		for(Edge edge : edges)
			adjacencies.add(edge);
	}
	
	//	mutator method to add adjacency to this vertex
	public void addAdjacency(Edge edge){
		adjacencies.add(edge);
	}
	
	//	accessor method to return adjacencies arrays
	public ArrayList<Edge> getAdjacencies(){
		return adjacencies;
	}
	
	//	mutator method to set distance
	public void setDistance(double distance){
		this.distance = distance;
	}
	
	//	accessor method to return distance
	public double getDistance(){
		return distance;
	}
	
	//	mutator method to set previous
	public void setPrevious(Vertex previous){
		this.previous = previous;
	}
	
	//	accessor method to return previous
	public Vertex getPrevious(){
		return previous;
	}
	
	/*
	 * we override compareTo from the implemented interface Comparable
	 * which is used for PriorityQueue
	 */
	@Override
	public int compareTo(Vertex other){
		return Double.compare(distance, other.distance);
	}
	
	@Override
	public String toString(){
		//return "("+name+" "+distance+")";
		return name;
	}
}//	end class Vertex