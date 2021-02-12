package graphs.fromBook;

import java.io.IOException;

//shortest path algorithm not done yet. erase this comment if solved
public class WeightedGraph extends Graph
{
	protected double[][] weights;
	protected double[] smallestWeights;
	
	public WeightedGraph(){
		super();
	}
	
	public WeightedGraph(int size){
		super(size);
	}
	
	public void createWeightedGraph()
	{
		try{
			super.createGraph();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		//	after invoking the super.createGraph() method, the gSize is determined to be used as the size of
		//	our instance array variables below:
		smallestWeights = new double[gSize];
		weights = new double[gSize][gSize];
		
		//	manual initalization of adjacency matrix of a graph for test purposes.
		weights[0][1] = 16;
		weights[0][3] = 2;
		weights[0][4] = 3;
		weights[1][2] = 5;
		weights[2][1] = 3;
		weights[3][1] = 12;
		weights[3][4] = 7;
		weights[4][1] = 10;
		weights[4][2] = 4;
		weights[4][3] = 5;
	}
	
	public void shortestPath(int vertex)
	{
		int i, j, v = 0;
		double minWeight;
		
		for(j = 0; j < gSize; j++)
			smallestWeights[j] = weights[vertex][j];
		
		boolean[] weightFound = new boolean[maxSize];
		for(j = 0; j < gSize; j++)
			weightFound[j] = false;
		
		weightFound[vertex] = true;
		smallestWeights[vertex] = 0;
		
		for(i = 0; i < gSize; i++)
		{
			minWeight = infinity;
			
			for(j = 0; j < gSize; j++)
			{
				if(!weightFound[j])
				{
					if(smallestWeights[j] < minWeight)
					{
						v = j;
						minWeight = smallestWeights[v];
					}
				}
			}
			
			weightFound[v] = true;
			
			for(j = 0; j < gSize; j++)
			{
				if(!weightFound[j])
				{
					if(minWeight + weights[v][j] < smallestWeights[j])
						smallestWeights[j] = minWeight + weights[v][j];
				}
			}
		}
	}
	
	public void printSmallestWeightsArray()
	{
		for(int t = 0; t < gSize; t++)
			System.out.print(smallestWeights[t]+" ");
	}
	
	public void printInstanceArrayVariables()
	{
		for(int g = 0; g < gSize; g++)
		{
			for(int t = 0; t < gSize; t++)
				System.out.print(weights[g][t]+" ");
			System.out.println();
		}
	}
}