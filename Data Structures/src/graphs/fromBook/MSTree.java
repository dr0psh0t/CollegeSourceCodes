package graphs.fromBook;

import java.io.IOException;
import java.text.DecimalFormat;

public class MSTree extends Graph
{
	protected int source;
	protected double[][] weights;
	protected int[] edges;
	protected double[] edgeWeights;
	
	public MSTree(){}
	
	public MSTree(int size)
	{
		super(size);
		weights = new double[size][size];
		edgeWeights = new double[size];
		edges = new int[size];
	}
	
	public void createSpanningGraph()
	{
		try{
			createGraph();
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		
		weights[0][1] = 4;
		weights[0][2] = 5;
		weights[1][0] = 4;
		weights[1][2] = 3;
		weights[2][0] = 5;
		weights[2][1] = 3;
	}
	
	public void minimalSpanning(int sVertex)
	{
		int i,
			j,
			k,
			startVertex = 0,
			endVertex = 0;
		
		double minWeight;
		
		source = sVertex;
		
		boolean[] mstv = new boolean[maxSize];
		
		for(j = 0; j < gSize; j++)
		{
			mstv[j] = false;
			edges[j] = source;
			edgeWeights[j] = weights[source][j];
		}
		
		mstv[source] = true;
		edgeWeights[source] = 0;
		
		for(i = 0; i < gSize - 1; i++)
		{
			minWeight = infinity;
			
			for(j = 0; j < gSize; j++)
			{
				if(mstv[j])
				{
					for(k = 0; k < gSize; k++)
					{
						if(!mstv[k] && weights[j][k] < minWeight)
						{
							endVertex = k;
							startVertex = j;
							minWeight = weights[j][k];
						}
					}
					
					mstv[endVertex] = true;
					edges[endVertex] = startVertex;
					edgeWeights[endVertex] = minWeight;
				}
			}
		}
	}
	
	public void printTreeAndWeight()
	{
		double treeWeight = 0;
		DecimalFormat twoDigits = new DecimalFormat("0.00");
		
		System.out.println("Source Vertex: "+source);
		System.out.println("Edges  Weight");
		
		for(int j = 0; j < gSize; j++)
		{
			if(edges[j] != j)
			{
				treeWeight = treeWeight + edgeWeights[j];
				System.out.println("("+edges[j]+", "+j+")"
						+twoDigits.format(edgeWeights[j]));
			}
		}
		
		System.out.println();
		System.out.println("Minimal Spanning Tree Weight: "+twoDigits.format(treeWeight));
	}
}