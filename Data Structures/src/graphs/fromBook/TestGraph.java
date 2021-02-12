package graphs.fromBook;

import java.io.FileNotFoundException;
import java.io.IOException;

//	shortest path algorithm not done yet. erase this comment if solved
public class TestGraph
{
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		MSTree g = new MSTree(7);
		
		g.createSpanningGraph();
		
		g.minimalSpanning(0);
		g.printTreeAndWeight();
	}
}