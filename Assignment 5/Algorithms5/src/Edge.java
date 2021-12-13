
public class Edge {
	
	NodeBilotto mySource;
	NodeBilotto myDest;
	int myWeight;
	
	
	public Edge(NodeBilotto source, NodeBilotto dest, int weight)
	{
		mySource = source;
		myDest = dest;
		myWeight = weight;
	}
	
	 

	public void setSource(NodeBilotto newSource)
	{
		mySource = newSource;
	}
	
	public void setDest(NodeBilotto newDest)
	{
		myDest = newDest;
	}
	
	public void setweight(int newWeight)
	{
		myWeight = newWeight;
	}
	
	
	public NodeBilotto getSource()
	{
		return mySource;
	}
	
	public NodeBilotto getDest()
	{
		return myDest;
	}
	
	public int getWeight()
	{
		return myWeight;
	}
	

}//edge
