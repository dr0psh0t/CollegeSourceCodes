package graphs.finalgraphADT;

//http://en.literateprograms.org/Dijkstra's_algorithm_(Java)?oldid=15444
public class Edge
{
	private final Vertex target;
	private final double weight;
	
	public Edge(Vertex argTarget, double argWeight)
	{
		target = argTarget;
		weight = argWeight;
	}
	
	//	only accessor methods since instance variables are declared as final
	public Vertex getTarget(){
		return target;
	}
	
	public double getWeight(){
		return weight;
	}
	
	@Override
	public String toString(){
		//return target+" "+weight;
		return target.toString();
	}
}//	end class Edge