
public class StackBilotto 
{
	private NodeBilotto myTop;
	
	public void push (String letter)
	{
		NodeBilotto oldTop = myTop;
		myTop = new NodeBilotto();
		myTop.setData(letter);
		myTop.setNext(oldTop);
		
	}//push
	
	public boolean isEmpty()
	{
		return (myTop == null);
	}
	
	public NodeBilotto pop (NodeBilotto value)
	{
		if (!isEmpty())
		{
			NodeBilotto retreve = myTop;
			myTop = myTop.getNext();
			return retreve;
		}
		
	}//pop
}
