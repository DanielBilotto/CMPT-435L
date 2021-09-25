
public class StackBilotto 
{
	private NodeBilotto myTop;
	
	public StackBilotto()
	{
		myTop = null;
	}//constructor
	
	public void push (char letter)
	{
		NodeBilotto oldTop = myTop;
		myTop = new NodeBilotto();
		myTop.setData(letter);
		myTop.setNext(oldTop);
		
	}//push
	
	public boolean isEmpty()
	{
		return (myTop == null);
	}//is empty
	
	public char pop ()
	{
		char retreve = '\0';
		if (!isEmpty())
		{
			retreve = myTop.getData();
			myTop = myTop.getNext();
		}//if
		return retreve;
	}//pop

}//stack

