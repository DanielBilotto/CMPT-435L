
public class Edge {
	
	NodeBilotto mySource;
	NodeBilotto myDest;
	int myWeight;
	
	
	public Edge()
	{
		mySource = null;
		myDest = null;
		myWeight = 0;
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
