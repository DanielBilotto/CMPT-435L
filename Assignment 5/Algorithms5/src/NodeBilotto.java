import java.util.ArrayList;

public class NodeBilotto 
{
	public NodeBilotto myData;
	public NodeBilotto myNext;
	public NodeBilotto prev;
	int distance;
	NodeBilotto prevVertex;
	ArrayList<Edge> edge = new ArrayList<Edge>();
	public int ver;
	
	public NodeBilotto ()
	{
		myData = null;
		myNext = null;
		prev = null;
	}//NodeBilotto
	
	public NodeBilotto (NodeBilotto newData)
	{
		myData = newData;
		myNext = null;
	}//NodeBilotto
	
	public NodeBilotto getData()
	{
		return myData;
	}//getData
	
	public void setData (NodeBilotto newData)
	{
		myData = newData;
	}//setData
	
	public NodeBilotto getNext()
	{
		return myNext;
	}//getNext
	
	public void setNext(NodeBilotto newNext)
	{
		myNext = newNext;
	}//setNext
	
	
	

	
}//node
