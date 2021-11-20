import java.util.ArrayList;

public class NodeBilotto 
{
	public String myData;
	public NodeBilotto myNext;
	public NodeBilotto prev;
	
	public NodeBilotto ()
	{
		myData = null;
		myNext = null;
		prev = null;
	}//NodeBilotto
	
	public NodeBilotto (String newData)
	{
		myData = newData;
		myNext = null;
	}//NodeBilotto
	
	public String getData()
	{
		return myData;
	}//getData
	
	public void setData (String newData)
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
	
	//graph stuff
	
	public int num;
	public boolean isProccessed;
	public boolean needsProccessed;
	public ArrayList<NodeBilotto> neighbors = new ArrayList<NodeBilotto>();

	
}//node
