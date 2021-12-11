import java.util.ArrayList;

public class SSP {
	public void initSS(QueueBilotto graph, NodeBilotto source, int verCount)
	{
		for (int i = 1; i < verCount; i++)
		{
			NodeBilotto vertex = graph.search(i); //come back to this
			vertex.distance = Integer.MAX_VALUE;
			vertex.prevVertex = null;
			//source.distance = 0;
		}
	}//init
	
	public void bellman(QueueBilotto graph, NodeBilotto sour, int verCount, int edgeCount)
	{
		this.initSS(graph, sour, verCount);
		
		NodeBilotto source = sour;
		NodeBilotto destination = sour;
		
		
		for (int i = 0; i < (verCount - 1); i++)
		{
			for (int k = 1; k < verCount; k++)
			{	
				source = graph.search(k);//come back to this
				System.out.println(source.getData());
				
				for (int j = 0; j < source.edge.size(); j++)
				{
					destination = source.edge.get(j).getDest();
					int weight = source.edge.get(j).getWeight();
					
					this.relax(graph, source, destination, weight);
				}
			}
		}
		
		/*
		for (int i = 0; i < (verCount - 1); i++)
		{
			for (int j = 0; j < source.edge.size(); j++)
			{
				int weight = source.edge.get(j).getWeight();
				//System.out.println(weight);
				relax(graph, source, destination, weight);
				
			}
			
			for (int k = 0; k < source.edge.size(); k++)
			{
				int weight = source.edge.get(k).getWeight();
				if (destination.distance > source.distance + weight)
				{
					
					System.out.println(destination.distance);
					System.out.println(source.distance);
					return false;
				}
			}
		}
		return true;
		*/
		
		
		
		
		
		//System.out.println(verCount);
		//System.out.println(edgeCount);
		//System.out.println(sour.edge.get(0).getSource().getData());
		//System.out.println(sour.edge.get(0).getDest().getData());
		
	}
	
	public boolean relax(QueueBilotto graph, NodeBilotto start, NodeBilotto end, int weight)
	{
		
		if (end.distance > start.distance + weight)
		{
			end.distance = start.distance + weight;
			end.prevVertex = start;
			return false;
			
		}
		
		return true;
	}
	
	
	public void print (QueueBilotto graph, NodeBilotto sourceVert, int verCount)
	{
		NodeBilotto dest = null;
		int cost = 0;
		
		for (int g = (sourceVert.ver + 1); g < verCount; g++)
		{
			dest = graph.search(g);
			cost = dest.distance;
			System.out.print(sourceVert.getData() + " -> " + (g) + " cost is " + cost + "; path is " + sourceVert.getData());
			
			NodeBilotto tempDest = dest;
			ArrayList<NodeBilotto> tempArray = new ArrayList<>();
			while(tempDest.prevVertex != null) {
				tempArray.add(tempDest);
				tempDest = tempDest.prevVertex;
			}//end while
			
			for(int p = tempArray.size()-1; p > -1; p--) {
				System.out.print(" -> " + tempArray.get(p).getData());
			}//end for p
			System.out.print(".");
			System.out.println();
		}
	}
}
