
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
	
	
	public void enqueue(NodeBilotto item)
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
	
	
	public NodeBilotto dequeue()
	{
		NodeBilotto item = null;
		if (!isEmpty())
		{
			item = head.getData();
			head = head.getNext();
		}//if
		
		return item;
	}//dequeue
	
	
	public NodeBilotto search(int num)
	{
		NodeBilotto curr = this.head;
		while (curr != null && curr.ver != num)
		{
			curr = curr.getNext();
		}
		
		return curr;
	}

}//queue
