import java.util.ArrayList;

public class SSP {
	public void initSS(QueueBilotto graph, NodeBilotto source, int verCount)
	{
		NodeBilotto vertex = new NodeBilotto();
		for (int i = 1; i < verCount + 1; i++)
		{
			vertex = graph.search(i); //come back to this, i think this is correct now
			vertex.distance = Integer.MAX_VALUE;
			vertex.prevVertex = null;
			//System.out.println(vertex.getData());
		}
		vertex = graph.search(1);
		vertex.distance = 0;
	}//init
	
	public void bellman(QueueBilotto graph, NodeBilotto sour, int verCount, int edgeCount)
	//this is broken!!! why is edge.size 0?
	{
		this.initSS(graph, sour, verCount);
		
		
		for (int i = 1; i < (verCount); i++)
		{
			for (int k = 0; k < edgeCount; k++)
			{	
				
				NodeBilotto source = sour.edge.get(k).getSource();
				NodeBilotto destination = sour.edge.get(k).getDest();
				int weight = sour.edge.get(k).getWeight();
				//source = graph.search(k + 1);//come back to this, this is setting it to 0
				//System.out.println(source.getData());
				for (int j = 0; j < sour.edge.size(); j++)
				{
					//System.out.println("hi");
					this.relax(graph, source, destination, weight);
				}
			}
		}
		
		
	}
	
	public boolean relax(QueueBilotto graph, NodeBilotto start, NodeBilotto end, int weight)
	{
		
		if (end.distance > start.distance + weight)
		{
			end.distance = start.distance + weight;
			//System.out.println(end.distance); //is changing both more and less
			end.prevVertex = start;
			return false;
			
		}
		
		return true;
	}
	
	
	public void print (QueueBilotto graph, NodeBilotto sourceVert, int verCount)
	{
		NodeBilotto dest = null;
		int cost = 0;
		
		for (int g = (sourceVert.getData() + 1); g < verCount; g++)
		{
			dest = graph.search(g);
			cost = dest.distance;
			System.out.print(sourceVert.getData() + " -> " + (g) + " cost is " + cost + "; path is " + sourceVert.getData());
			
			NodeBilotto tempDest = dest;
			ArrayList<NodeBilotto> tempArray = new ArrayList<>();
			while(tempDest.prevVertex != null) {
				tempArray.add(tempDest);
				tempDest = tempDest.prevVertex;
			}
			
			for(int p = tempArray.size()-1; p > -1; p--) {
				System.out.print(" -> " + tempArray.get(p).getData());
			}
			System.out.print(".");
			System.out.println();
		}
	}
}
