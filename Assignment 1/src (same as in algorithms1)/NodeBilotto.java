
public class NodeBilotto 
{
	private char myData;
	private NodeBilotto myNext;
	
	public NodeBilotto ()
	{
		myData = '\0';
		myNext = null;
	}//NodeBilotto
	
	public NodeBilotto (char newData)
	{
		myData = newData;
		myNext = null;
	}//NodeBilotto
	
	public char getData()
	{
		return myData;
	}//getData
	
	public void setData (char newData)
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
