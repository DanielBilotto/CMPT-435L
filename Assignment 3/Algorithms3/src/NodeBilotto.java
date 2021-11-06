
public class NodeBilotto 
{
	private String myData;
	private NodeBilotto myNext;
	
	public NodeBilotto ()
	{
		myData = null;
		myNext = null;
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

	
}//node
