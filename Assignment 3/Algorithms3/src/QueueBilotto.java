
public class QueueBilotto {
	
	public NodeBilotto head;
	
	private NodeBilotto tail;
	
	public QueueBilotto()
	{
		head = null;
		tail = null;
	}//Queue
	
	public boolean isEmpty()
	{
		return (head == null);
	}//is empty
	
	
	public void enqueue(String item)
	{
		NodeBilotto oldTail = tail;
		tail = new NodeBilotto();
		tail.setData(item);
		tail.setNext(null);
		if (isEmpty())
		{
			head = tail;
		}//if
		else
		{
			oldTail.setNext(tail);
		}//else
		
	}//enqueue
	
	
	public String dequeue()
	{
		String item = null;
		if (!isEmpty())
		{
			item = head.getData();
			head = head.getNext();
		}//if
		
		return item;
	}//dequeue

}//queue
