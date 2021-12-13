import java.util.ArrayList;

public class NodeBilotto 
{
	public int myData;
	public NodeBilotto myNext;
	public NodeBilotto prev;
	int distance;
	NodeBilotto prevVertex;
	ArrayList<Edge> edge = new ArrayList<Edge>();
	
	public NodeBilotto ()
	{
		myData = 0;
		myNext = null;
		prev = null;
	}//NodeBilotto
	
	public NodeBilotto (int newData)
	{
		myData = newData;
		myNext = null;
	}//NodeBilotto
	
	public int getData()
	{
		return myData;
	}//getData
	
	public void setData (int newData)
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
